package com.jettysoft.payq.ui.main.tapandpay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import com.jettysoft.payq.R
import com.jettysoft.payq.databinding.WirelessPaymentFragmentBinding
import com.jettysoft.payq.ui.common.base.BaseFragment

class WirelessPaymentFragment : BaseFragment<WirelessPaymentFragmentBinding>() {

    override fun inflateBinding(layoutInflater: LayoutInflater): WirelessPaymentFragmentBinding {
        return WirelessPaymentFragmentBinding.inflate(layoutInflater)
    }

    companion object {
        fun newInstance() = WirelessPaymentFragment()
    }

    private lateinit var viewModel: WirelessPaymentViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            ivBanner.setOnClickListener(View.OnClickListener {
                findNavController().navigate(R.id.action_wirelessPaymentFragment_to_tapAndPayFragment)
            })
        }
    }



}