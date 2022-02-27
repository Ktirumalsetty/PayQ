package com.jettysoft.payq.ui.main.winners

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.viewModels
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.jettysoft.payq.databinding.FragmentWinnersBinding
import com.jettysoft.payq.ui.common.base.BaseFragment

class WinnersFragment : BaseFragment<FragmentWinnersBinding>() {
    override fun inflateBinding(layoutInflater: LayoutInflater): FragmentWinnersBinding {
        return FragmentWinnersBinding.inflate(layoutInflater)
    }

    private val viewModel:WinnersViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tabViewpager.adapter = ViewPagerAdapter(this)
        TabLayoutMediator(binding.tabLayoutWinners,binding.tabViewpager,false,true,object : TabLayoutMediator.TabConfigurationStrategy{
            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                when(position){
                    0 -> tab.text = "Today's LeaderBoards"
                    1 -> tab.text = "Winners"
                    else -> tab.text = "Invalid"
                }
            }
        }).attach()
    }

    class ViewPagerAdapter(fragmentActivity: Fragment) : FragmentStateAdapter(fragmentActivity) {
        override fun createFragment(position: Int): Fragment {
            return when(position){
                0 -> TodayLeaderBoardFragment.newInstance()
                1 -> WinnersListFragment.newInstance()
                else -> TodayLeaderBoardFragment.newInstance()
            }
        }
        override fun getItemCount() = 2
    }


}