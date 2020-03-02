package com.southsystem.kobecodechallenge.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.southsystem.kobecodechallenge.R
import com.southsystem.kobecodechallenge.databinding.MovieListItemBinding
import com.southsystem.kobecodechallenge.movie.model.Movie

class MoviesAdapter(
    private var moviesList: List<Movie>,
    private val listener: (Movie) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>(), Filterable {

    override fun getItemCount(): Int = moviesList.size

    var filteredMovies = mutableListOf<Movie>()

    init {
        filteredMovies.addAll(moviesList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding: MovieListItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.movie_list_item, parent, false
        )

        return MovieItemViewHolder(binding, listener)
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): FilterResults {
                val charString = charSequence.toString()
                val newMoviesList = mutableListOf<Movie>()

                if (charString.isNotEmpty() && charSequence.length >= 3) {
                    moviesList.forEach {
                        if (it.name?.contains(charString, true)!!) {
                            newMoviesList.add(it)
                        }
                    }
                } else {
                    newMoviesList.addAll(moviesList)
                }

                val filterResults = FilterResults()

                filterResults.run {
                    values = newMoviesList
                    count = newMoviesList.size
                }
                return filterResults
            }

            override fun publishResults(charSequence: CharSequence, filterResults: FilterResults) {
                filteredMovies = filterResults.values as MutableList<Movie>
                notifyDataSetChanged()
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as MovieItemViewHolder
        holder.onBind(moviesList[position])
    }

    class MovieItemViewHolder(
        private val binding: MovieListItemBinding,
        private val listener: (Movie) -> Unit
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: Movie) {
            binding.movie = item
            itemView.setOnClickListener { listener(item) }
            binding.executePendingBindings()
        }
    }
}