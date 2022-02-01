package com.jettysoft.payq.ui.onboarding.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import com.jettysoft.payq.R
import com.jettysoft.payq.databinding.EnterMobileFragmentBinding
import com.jettysoft.payq.ui.common.base.BaseFragment

class EnterMobileFragment : BaseFragment<EnterMobileFragmentBinding>() {

    override fun inflateBinding(layoutInflater: LayoutInflater): EnterMobileFragmentBinding {
        return EnterMobileFragmentBinding.inflate(layoutInflater)
    }

    companion object {
        fun newInstance() = EnterMobileFragment()
    }

    private lateinit var viewModel: EnterMobileViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnVerify.setOnClickListener(View.OnClickListener { navigateVerifyMobileNo() })
    }

    private fun navigateVerifyMobileNo(){
        findNavController().navigate(R.id.action_EnterMobileFragment_to_VerifyMobileNoFragment)
    }

}