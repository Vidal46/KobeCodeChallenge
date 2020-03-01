package com.southsystem.kobecodechallenge.movie

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.southsystem.kobecodechallenge.R
import com.southsystem.kobecodechallenge.movie.model.Movie
import com.southsystem.kobecodechallenge.util.EndlessRecyclerOnScrollListener
import com.southsystem.kobecodechallenge.view.adapter.MoviesAdapter
import com.southsystem.kobecodechallenge.viewmodel.MoviesListViewModel
import kotlinx.android.synthetic.main.activity_movie.*
import kotlinx.android.synthetic.main.error_component.view.*
import org.koin.android.viewmodel.ext.android.viewModel
import java.util.*

class MovieActivity : AppCompatActivity() {

    private val activity = this@MovieActivity

    private val viewModel: MoviesListViewModel by viewModel()

    private val moviesList: ArrayList<Movie> = arrayListOf()

    private lateinit var adapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        getGenres()

        setObservers()

        configureListeners()

        setAdapter()

        getMovies()
    }

    private fun getGenres() {
        viewModel.getGenres()
    }

    private fun getMovies() {
        viewModel.getMoviesList()
    }

    private fun setObservers() {
        viewModel.run {
            movies.observe(activity, Observer {
                configureRecycler(it)
            })

            error.observe(activity, Observer {
                configureErrorLayout()
            })

            isLoading.observe(activity, Observer {
                onLoadingStatusChange(it)
            })

            isUpdating.observe(activity, Observer {
                checkUpdatingVisibility(it)
            })
        }
    }

    private fun configureListeners() {
        activity_movie_error_component.btnRetry.setOnClickListener {
            viewModel.getMoviesList()
        }
    }

    private fun openMovieDetail(movie: Movie) {

    }

    private fun configureRecycler(list: List<Movie>) {
        moviesList.addAll(list)
        adapter.notifyDataSetChanged()
        activity_movie_recycler.addOnScrollListener(object : EndlessRecyclerOnScrollListener() {
            override fun onLoadMore() {
                viewModel.getMoviesList(moviesList.size)
            }
        })
    }

    private fun clearMovieList() {
        moviesList.clear()
    }

    private fun setAdapter() {
        adapter = MoviesAdapter(moviesList) {
            openMovieDetail(it)
        }

        activity_movie_recycler.run {
            layoutManager = GridLayoutManager(activity, 2)
            adapter = activity.adapter
        }
    }

    private fun showErrorComponent() {
        activity_movie_loader.visibility = View.VISIBLE
    }

    private fun dismissErrorComponent() {
        activity_movie_loader.visibility = View.GONE
    }

    private fun checkUpdatingVisibility(state: Boolean) {
        activity_movie_updating.visibility = if (state) View.VISIBLE else View.GONE
    }

    private fun onLoadingStatusChange(isLoading: Boolean) {
        activity_movie_recycler.visibility = if (isLoading) View.GONE else View.VISIBLE
        activity_movie_loader.visibility = if (isLoading) View.VISIBLE else View.GONE
        dismissErrorComponent()
    }

    private fun configureErrorLayout() {
        clearMovieList()
        activity_movie_recycler.visibility = View.GONE
        activity_movie_loader.visibility = View.GONE
        activity_movie_updating.visibility = View.GONE
        showErrorComponent()
    }
}


