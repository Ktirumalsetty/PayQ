package com.jettysoft.payq.ui.main.tapandpay

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.jettysoft.payq.R
import com.jettysoft.payq.databinding.TapAndPayFragmentBinding
import com.jettysoft.payq.ui.common.base.BaseFragment

class TapAndPayFragment : BaseFragment<TapAndPayFragmentBinding>() {

    override fun inflateBinding(layoutInflater: LayoutInflater): TapAndPayFragmentBinding {
        return TapAndPayFragmentBinding.inflate(layoutInflater)
    }

    companion object {
        fun newInstance() = TapAndPayFragment()
    }

    private val viewModel: TapAndPayViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}