package com.jettysoft.payq.ui.main.tapandpay

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.jettysoft.payq.R
import com.jettysoft.payq.databinding.BillPaymentSuccessFragmentBinding
import com.jettysoft.payq.ui.common.base.BaseFragment

class BillPaymentSuccessFragment : BaseFragment<BillPaymentSuccessFragmentBinding>() {

    override fun inflateBinding(layoutInflater: LayoutInflater): BillPaymentSuccessFragmentBinding {
        return BillPaymentSuccessFragmentBinding.inflate(layoutInflater)
    }

    companion object {
        fun newInstance() = BillPaymentSuccessFragment()
    }

    private val viewModel: BillPaymentSuccessViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }



}