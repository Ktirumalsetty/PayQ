package com.jettysoft.payq.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.jettysoft.payq.R
import com.jettysoft.payq.databinding.ActivityMainBinding
import com.jettysoft.payq.ui.main.tapandpay.WirelessPaymentActivity

class MainActivity : AppCompatActivity() {

    companion object{
        fun getInstance(context: Context) = Intent(context,MainActivity::class.java)
    }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val navView: BottomNavigationView = binding.included.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_markets, R.id.navigation_winners,R.id.navigation_profile
            )
        )
        binding.included.fab.setOnClickListener(View.OnClickListener {
            startActivity(WirelessPaymentActivity.getInstance(this))
        })
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}