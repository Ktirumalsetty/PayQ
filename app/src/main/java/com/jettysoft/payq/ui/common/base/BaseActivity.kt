package com.jettysoft.payq.ui.common.base

import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity:AppCompatActivity() {

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}