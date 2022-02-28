package com.jettysoft.payq.ui.main.tapandpay

import android.content.Context
import android.content.Intent
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.LayoutInflater
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.snackbar.Snackbar
import com.jettysoft.payq.R
import com.jettysoft.payq.databinding.ActivityWirelessPaymentBinding
import com.jettysoft.payq.ui.common.base.BaseActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.navigateUp


class WirelessPaymentActivity : BaseActivity<ActivityWirelessPaymentBinding>() {

    override fun inflateBinding(layoutInflater: LayoutInflater): ActivityWirelessPaymentBinding {
        return ActivityWirelessPaymentBinding.inflate(layoutInflater)
    }

    companion object{
        fun getInstance(context: Context)= Intent(context,WirelessPaymentActivity::class.java)
    }
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        binding.toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)
        binding.toolbar.navigationIcon?.setColorFilter(resources.getColor(R.color.black), PorterDuff.Mode.SRC_ATOP);
        val navController = findNavController(R.id.nav_host_fragment_content_wireless_payment)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
        appBarConfiguration = AppBarConfiguration(setOf())
        setupActionBarWithNavController(navController, appBarConfiguration)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_wireless_payment)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }


}