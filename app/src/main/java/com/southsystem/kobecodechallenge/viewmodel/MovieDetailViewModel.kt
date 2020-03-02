package com.southsystem.kobecodechallenge.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.southsystem.kobecodechallenge.model.MovieDetail
import com.southsystem.kobecodechallenge.repository.MovieRepository
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class MovieDetailViewModel(
    private val repository: MovieRepository,
    private val coroutineContext: CoroutineContext
) : ViewModel() {

    private val _details = MutableLiveData<MovieDetail>()
    val details: LiveData<MovieDetail> get() = _details

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> get() = _error

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> get() = _isLoading

    //CHECAR TIPO DO ID
    fun getMovieDetails(movieId: Int) {
        viewModelScope.launch(coroutineContext) {
            _isLoading.postValue(true)

            try {
                val response = repository.getMovieDetails(movieId)
                _details.postValue(response)
                _isLoading.postValue(false)
            } catch (e: Exception) {
                _error.postValue(e.message)
            }
        }
    }

    fun getParsedGenres(): String {
        var parsedGenres = ""

        details.value?.genres?.forEachIndexed { index, genre ->
            if (index == 0) {
                parsedGenres = genre.name!!
            } else {
                parsedGenres = "$parsedGenres / ${genre.name}"
            }
        }

        return parsedGenres
    }
}