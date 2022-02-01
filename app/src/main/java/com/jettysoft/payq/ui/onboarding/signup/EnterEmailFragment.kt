package com.jettysoft.payq.ui.onboarding.signup

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.jettysoft.payq.R
import com.jettysoft.payq.databinding.EnterEmailFragmentBinding
import com.jettysoft.payq.ui.common.base.BaseFragment

class EnterEmailFragment : BaseFragment<EnterEmailFragmentBinding>() {

    override fun inflateBinding(layoutInflater: LayoutInflater): EnterEmailFragmentBinding {
        return EnterEmailFragmentBinding.inflate(layoutInflater)
    }
    companion object {
        const val TAG ="EnterEmailFragment"
        fun newInstance() = EnterEmailFragment()
    }

    private val viewModel: EnterEmailViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnVerify.setOnClickListener(View.OnClickListener { navigateVerifyEmail() })
    }

    private fun navigateVerifyEmail() {
        findNavController().navigate(R.id.action_VerifyMobileNoFragment_to_EnterEmailFragment)
    }


}