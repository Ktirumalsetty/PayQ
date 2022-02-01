package com.ddisglobal.android.loomaresident.ui.common.extension

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.annotation.StringRes
import com.google.android.material.snackbar.Snackbar

/**
 * Visibility modifiers and check functions
 */

fun View.gone(){
    visibility = View.GONE
}

fun View.visible(){
    visibility = View.VISIBLE
}

fun View.invisible(){
    visibility = View.INVISIBLE
}

fun View.makeVisible() {
    visibility = View.VISIBLE
}

fun View.makeGone() {
    visibility = View.GONE
}

fun View.makeInvisible() {
    visibility = View.INVISIBLE
}

/**
 * Shows the Snackbar inside an Activity or Fragment
 *
 * @param messageRes Text to be shown inside the Snackbar
 * @param length Duration of the Snackbar
 * @param f Action of the Snackbar
 */
fun View.showSnackbar(@StringRes messageRes: Int, length: Int = Snackbar.LENGTH_LONG, f: Snackbar.() -> Unit) {
    val snackBar = Snackbar.make(this, resources.getString(messageRes), length)
    snackBar.f()
    snackBar.show()
}

/**
 * Adds action to the Snackbar
 *
 * @param actionRes Action text to be shown inside the Snackbar
 * @param color Color of the action text
 * @param listener Onclick listener for the action
 */

fun Snackbar.action(@StringRes actionRes: Int, color: Int? = null, listener: (View) -> Unit) {
    setAction(actionRes, listener)
    color?.let { setActionTextColor(color) }
}

/**
 * Hides the soft input keyboard from the screen
 */
fun View.hideKeyboard(context: Context?) {
    val inputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(this.windowToken, 0)
}

//// Usage
//
//// Shows the Snackbar having text and long duration
//constraintLayout.showSnackbar(R.string.download_complete) {}
//
//// Shows the Snackbar having text and short duration
//constraintLayout.showSnackbar(R.string.download_complete, Snackbar.LENGTH_SHORT) {}
//
//// Shows the Snackbar with text and action
//constraintLayout.showSnackbar(R.string.download_complete) {
//    action(R.string.open) { Log.e("TAG", "Action item clicked") }
//}