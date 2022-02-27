package com.jettysoft.payq.ui.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import com.jettysoft.payq.databinding.ProfileFragmentBinding
import com.jettysoft.payq.ui.common.base.BaseFragment

class ProfileFragment : BaseFragment<ProfileFragmentBinding>() {

    override fun inflateBinding(layoutInflater: LayoutInflater): ProfileFragmentBinding {
        return ProfileFragmentBinding.inflate(layoutInflater)
    }

    companion object {
        fun newInstance() = ProfileFragment()
    }

    private val viewModel: ProfileViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}