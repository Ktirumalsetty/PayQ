package com.jettysoft.payq.ui.main.tapandpay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
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
        (activity as WirelessPaymentActivity?)!!.supportActionBar!!.hide()

        binding.apply {
            btnDone.setOnClickListener(View.OnClickListener {
                requireActivity().finish()
            })
        }

    }



}