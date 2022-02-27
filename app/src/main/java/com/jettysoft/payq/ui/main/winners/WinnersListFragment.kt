package com.jettysoft.payq.ui.main.winners

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.jettysoft.payq.R
import com.jettysoft.payq.databinding.WinnersListFragmentBinding
import com.jettysoft.payq.ui.common.base.BaseFragment

class WinnersListFragment : BaseFragment<WinnersListFragmentBinding>() {

    override fun inflateBinding(layoutInflater: LayoutInflater): WinnersListFragmentBinding {
        return WinnersListFragmentBinding.inflate(layoutInflater)
    }

    companion object {
        fun newInstance() = WinnersListFragment()
    }

    private val viewModel: WinnersListViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}