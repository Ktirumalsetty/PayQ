package com.jettysoft.payq.ui.onboarding.signup

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import com.ddisglobal.android.loomaresident.ui.common.extension.hideKeyboard
import com.jettysoft.dailyapp.utilities.GenericKeyEvent
import com.jettysoft.payq.databinding.VerifyEmailFragmentBinding
import com.jettysoft.payq.ui.common.base.BaseFragment
import com.jettysoft.payq.ui.common.utils.GenericTextWatcher
import com.jettysoft.payq.ui.main.MainActivity

class VerifyEmailFragment : BaseFragment<VerifyEmailFragmentBinding>(),GenericTextWatcher.OnChangeListener {

    override fun inflateBinding(layoutInflater: LayoutInflater): VerifyEmailFragmentBinding {
        return VerifyEmailFragmentBinding.inflate(layoutInflater)
    }

    companion object {
        const val TAG = "VerifyEmailFragment"
        fun newInstance() = VerifyEmailFragment()
    }

    private lateinit var viewModel: VerifyEmailViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.et1.addTextChangedListener(GenericTextWatcher(binding.et1, binding.et2, this))
        binding.et2.addTextChangedListener(GenericTextWatcher(binding.et2, binding.et3, this))
        binding.et3.addTextChangedListener(GenericTextWatcher(binding.et3, binding.et4, this))
        binding.et4.addTextChangedListener(GenericTextWatcher(binding.et4, null, this))

        //GenericKeyEvent here works for deleting the element and to switch back to previous EditText  //first parameter is the current EditText and second parameter is previous EditText
        binding.et1.setOnKeyListener(GenericKeyEvent(binding.et1, null))
        binding.et2.setOnKeyListener(GenericKeyEvent(binding.et2, binding.et1))
        binding.et3.setOnKeyListener(GenericKeyEvent(binding.et3, binding.et2))
        binding.et4.setOnKeyListener(GenericKeyEvent(binding.et4, binding.et3))
    }

    override fun onTextChange() {
        val otpText =
            binding.et1.text.toString() + binding.et2.text.toString() + binding.et3.text.toString() + binding.et4.text.toString()
        Log.d(VerifyMobileNoFragment.TAG, "OTPText:: $otpText")
        if (otpText.length == 4) {
            requireActivity().hideKeyboard(binding.et4)
//            viewModel.verifyOTP(viewModel.enteredPhoneNo,otpText).observe(viewLifecycleOwner, Observer {
//                when (it) {
//                    is APIResult.Loading -> binding.progressBar.visibility = View.VISIBLE
//                    is APIResult.Success -> {
//                        binding.progressBar.visibility = View.GONE
//                        findNavController().navigate(R.id.action_EnterOTPFragment_to_CreatePasswordFragment)
//                    }
//                    is APIResult.Failure -> {
//                        clearOTP()
//                        binding.progressBar.visibility = View.GONE
//                        DialogUtils.displayDialog(requireContext(),it.data.message)
//                    }
//                    else -> {
//                        binding.progressBar.visibility = View.GONE
//                        DialogUtils.showErrorToast()
//                    }
//                }
//            })
//            findNavController().navigate(R.id.action_VerifyMobileNoFragment_to_EnterEmailFragment)
            startActivity(MainActivity.getInstance(requireContext()))
            requireActivity().finish()
        }

    }
}