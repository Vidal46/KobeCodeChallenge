package com.southsystem.kobecodechallenge.view.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.southsystem.kobecodechallenge.R
import com.southsystem.kobecodechallenge.databinding.ActivityMovieDetailBinding
import com.southsystem.kobecodechallenge.model.MovieDetail
import com.southsystem.kobecodechallenge.viewmodel.MovieDetailViewModel
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.error_component.view.*
import org.joda.time.DateTime
import org.koin.android.viewmodel.ext.android.viewModel

class MovieDetailActivity : AppCompatActivity() {

    private val activity = this@MovieDetailActivity

    private val viewModel: MovieDetailViewModel by viewModel()

    private lateinit var movieDetail: MovieDetail

    private var movieId: Int? = null

    private lateinit var binding: ActivityMovieDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            activity,
            R.layout.activity_movie_detail
        )

        getExtrasId()

        configureListeners()

        getMovieDetails()

        configureViewModelObservers()
    }

    private fun configureDataModel(movie: MovieDetail) {
        movie.releaseDate = DateTime.parse(movie.releaseDate).toString("dd MMM yyyy")
        binding.activityMovieDetailReleaseDate.text = viewModel.getParsedGenres()
        binding.movie = movie
    }

    private fun getExtrasId() {
        intent.run {
            movieId = getIntExtra("movieId", 0)
        }
    }

    private fun getMovieDetails() {
        movieId?.let {
            viewModel.getMovieDetails(it)
        }
    }

    private fun configureListeners() {
        activity_movie_detail_backarrow.setOnClickListener {
            onBackPressed()
        }
        activity_movie_detail_error_component.btnRetry.setOnClickListener {
            getMovieDetails()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    private fun configureErrorLayout() {
//        activity_movie_detail_loader.visibility = View.GONE
        activity_movie_detail_error_component.visibility = View.VISIBLE
    }

    private fun configureViewModelObservers() {
        viewModel.run {
            details.observe(activity, Observer {
                configureDataModel(it)

            })

            error.observe(activity, Observer {
                //                configureErrorLayout()
            })
            isLoading.observe(activity, Observer { isLoading ->
                //                onLoadingStatusChange(isLoading)
            })
        }
    }
}
