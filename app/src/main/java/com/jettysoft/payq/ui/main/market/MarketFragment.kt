package com.jettysoft.payq.ui.main.market

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.jettysoft.payq.databinding.FragmentMarketBinding
import com.jettysoft.payq.ui.common.base.BaseFragment

class MarketFragment : BaseFragment<FragmentMarketBinding>() {

    override fun inflateBinding(layoutInflater: LayoutInflater): FragmentMarketBinding {
       return FragmentMarketBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}