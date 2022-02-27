package com.jettysoft.payq.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import com.jettysoft.payq.R
import com.jettysoft.payq.databinding.FragmentHomeBinding
import com.jettysoft.payq.ui.common.base.BaseFragment
import com.jettysoft.payq.ui.common.utils.SpacesItemDecoration
import com.jettysoft.payq.ui.main.home.adapter.RecentTransactionsAdapter

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun inflateBinding(layoutInflater: LayoutInflater): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    companion object {

    }
    private val viewModel:HomeViewModel by viewModels()
    private val mAdapter:RecentTransactionsAdapter= RecentTransactionsAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        mAdapter.submitList(viewModel.getRecentTransMockData())
    }

    private fun setupRecyclerView() {
        binding.rvRecentTrans.apply {
            this.adapter = mAdapter
            addItemDecoration(SpacesItemDecoration(5))
//            val itemDecoration = DividerItemDecoration(binding.root.context, DividerItemDecoration.VERTICAL)
//            itemDecoration.setDrawable(binding.root.context.getDrawable(R.drawable.list_divider)!!)
//            addItemDecoration(itemDecoration)
        }
    }
}