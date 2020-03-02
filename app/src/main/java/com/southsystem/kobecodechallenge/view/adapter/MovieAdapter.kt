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
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int = moviesList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding: MovieListItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.movie_list_item, parent, false
        )

        return MovieItemViewHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as MovieItemViewHolder
        holder.onBind(moviesList[position])
    }

    fun filterList(filteredList: ArrayList<Movie>) {
        moviesList = filteredList
        notifyDataSetChanged()
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