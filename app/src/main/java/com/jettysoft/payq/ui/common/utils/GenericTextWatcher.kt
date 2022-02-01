package com.jettysoft.payq.ui.common.utils


import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.jettysoft.payq.R


class GenericTextWatcher internal constructor(private val currentView: View, private val nextView: View? , onChangeListener: OnChangeListener) : TextWatcher {

    private var onChangeListener: OnChangeListener? = null

    init {
        this.onChangeListener = onChangeListener
    }

    interface OnChangeListener{
        fun onTextChange()
    }

    override fun afterTextChanged(editable: Editable) {
        val text = editable.toString()
        when (currentView.id) {
            R.id.et1 ->
                if (text.length == 1) nextView!!.requestFocus()
            R.id.et2 ->
                if (text.length == 1) nextView!!.requestFocus()
            R.id.et3 ->
                if (text.length == 1) nextView!!.requestFocus()
        }
        onChangeListener?.onTextChange()
    }

    override fun beforeTextChanged(
            arg0: CharSequence,
            arg1: Int,
            arg2: Int,
            arg3: Int
    ) {
    // TODO Auto-generated method stub
    }

    override fun onTextChanged(
            arg0: CharSequence,
            arg1: Int,
            arg2: Int,
            arg3: Int
    ) {

    }
}