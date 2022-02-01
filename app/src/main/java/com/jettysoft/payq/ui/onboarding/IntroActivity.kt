package com.jettysoft.payq.ui.onboarding


import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.jettysoft.payq.databinding.ActivityIntroBinding
import com.jettysoft.payq.ui.onboarding.signup.LoginActivity

class IntroActivity : AppCompatActivity() {

    var introViewPagerAdapter: IntroViewPagerAdapter? = null

    private lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        hideStatusBar()

      //  makeStatusbarTransparent()

        introViewPagerAdapter = IntroViewPagerAdapter(this)
        binding.screenViewpager.adapter = introViewPagerAdapter

        //Setup tab indicator
        binding.tabIndicator.setupWithViewPager(binding.screenViewpager)

//        //Button Next
//        binding.btnNext.setOnClickListener {
//            binding.screenViewpager.setCurrentItem(binding.screenViewpager.currentItem + 1, true)
//        }
        //Button Get Started
        binding.btnStart.setOnClickListener {
            startActivity(LoginActivity.getInstance(this))
            finish()
        }

        binding.tabIndicator.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab?.position == introViewPagerAdapter!!.count -1){
                    loadLastScreen()
                } else
                {
                    loadBeforeScreen()
                }
            }
        })
    }

    private fun loadLastScreen() {
        binding.btnStart.visibility = View.VISIBLE

    }

    private fun loadBeforeScreen() {
        binding.btnStart.visibility = View.INVISIBLE

    }
}