package br.com.marvel.extensions

import android.widget.ImageView
import androidx.databinding.BindingAdapter
//import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.southsystem.kobecodechallenge.BuildConfig
import com.southsystem.kobecodechallenge.R

@BindingAdapter("imageUrl")
fun ImageView.setImageUrl(url: String?) {

    Glide.with(context)
        .load("${BuildConfig.IMAGES_URL}$url")
        .placeholder(R.color.colorAccent)
        .into(this)
}