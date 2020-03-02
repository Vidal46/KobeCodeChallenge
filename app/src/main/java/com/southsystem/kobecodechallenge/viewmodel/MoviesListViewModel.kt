package com.southsystem.kobecodechallenge.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.southsystem.kobecodechallenge.model.Genre
import com.southsystem.kobecodechallenge.model.MoviesResponse
import com.southsystem.kobecodechallenge.movie.model.Movie
import com.southsystem.kobecodechallenge.repository.MovieRepository
import kotlinx.coroutines.launch
import java.lang.Exception
import kotlin.coroutines.CoroutineContext

class MoviesListViewModel(
    private val repository: MovieRepository,
    private val coroutineContext: CoroutineContext
) : ViewModel() {

    private val _movies = MutableLiveData<MoviesResponse>()
    val movies: LiveData<MoviesResponse> get() = _movies

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> get() = _error

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> get() = _isLoading

    private val _isUpdating = MutableLiveData<Boolean>()
    val isUpdating: LiveData<Boolean> get() = _isUpdating


    fun getMoviesList(page: Int = 1) {
        viewModelScope.launch(coroutineContext) {
            configureLoader(true, page)

            try {
                val response = repository.getUpcomingMovies(page)
                _movies.postValue(response)
                configureLoader(false, page)
            } catch (e: Exception) {
                _error.postValue(e.message)
            }
        }
    }

    private fun configureLoader(showLoader: Boolean, offset: Int) {
        if (offset > 1) {
            _isUpdating.postValue(showLoader)
        } else {
            _isLoading.postValue(showLoader)
        }
    }
}