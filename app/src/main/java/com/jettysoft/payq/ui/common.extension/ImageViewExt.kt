package com.ddisglobal.android.loomaresident.ui.common.extension

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Loads URL into an ImageView using Picasso
 *
 * @param url URL to be loaded
 */
fun ImageView.loadFromUrl(url: String) {
//    Picasso.get().load(url).into(this)
}

/**
 * Loads URL into an ImageView using Glide
 *
 * @param url URL to be loaded
 */
fun ImageView.loadFromUrl(url: String, context: Context) {
    Glide.with(context).load(url).into(this)
}