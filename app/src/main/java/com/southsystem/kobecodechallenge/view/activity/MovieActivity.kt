package com.southsystem.kobecodechallenge.movie

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.southsystem.kobecodechallenge.R
import com.southsystem.kobecodechallenge.movie.model.Movie
import com.southsystem.kobecodechallenge.util.EndlessRecyclerOnScrollListener
import com.southsystem.kobecodechallenge.view.activity.MovieDetailActivity
import com.southsystem.kobecodechallenge.view.adapter.MoviesAdapter
import com.southsystem.kobecodechallenge.viewmodel.MoviesListViewModel
import kotlinx.android.synthetic.main.activity_movie.*
import kotlinx.android.synthetic.main.error_component.view.*
import org.koin.android.viewmodel.ext.android.viewModel


const val BOOTSTRAP_TIME_DELAY: Long = 2000

class MovieActivity : AppCompatActivity() {

    private val activity = this@MovieActivity

    private val viewModel: MoviesListViewModel by viewModel()

    private val moviesList: MutableList<Movie> = mutableListOf()

    private lateinit var adapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        bootStrapAnimation()

        setViewModelObservers()

        configureListeners()

        setAdapter()

        getMovies()

        setActivityObservers()
    }

    private fun bootStrapAnimation() {
        activity_movie_loader.visibility = View.VISIBLE
    }

    private fun getMovies() {
        Handler().postDelayed({ viewModel.getMoviesList() }, BOOTSTRAP_TIME_DELAY)
    }

    private fun setViewModelObservers() {
        viewModel.run {

            movies.observe(activity, Observer {
                configureRecycler(it.movies)
                activity_movie_search_container.visibility = View.VISIBLE
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

    private fun setActivityObservers() {

        activity_movie_search_container.editText?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                filter(p0.toString())

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
        })
    }

    private fun filter(text: String) {
        val filteredList = ArrayList<Movie>()

        for (item in moviesList) {
            if (item.name?.toLowerCase()?.contains(text.toLowerCase())!!) {
                filteredList.add(item)
            }
        }

        if (text.isEmpty()) setAdapter()

        adapter.filterList(filteredList)
    }


    private fun configureListeners() {
        activity_movie_error_component.btnRetry.setOnClickListener {
            viewModel.getMoviesList()
        }
    }

    private fun openMovieDetail(movie: Movie) {
        startActivity(
            Intent(
                activity, MovieDetailActivity::class.java
            )
                .putExtra("movieId", movie.id)
        )
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun configureRecycler(list: List<Movie>) {
        moviesList.addAll(list)
        adapter.notifyDataSetChanged()
        activity_movie_recycler.addOnScrollListener(object : EndlessRecyclerOnScrollListener() {
            override fun onLoadMore() {
                viewModel.getMoviesList(viewModel.movies.value?.currentPage!! + 1)
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

    private fun hideKeyboard() {
        val imm = this.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        var view = this.currentFocus
        if (view == null) {
            view = View(this)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}


