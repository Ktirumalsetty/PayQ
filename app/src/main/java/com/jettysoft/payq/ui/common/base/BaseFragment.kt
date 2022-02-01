package com.jettysoft.payq.ui.common.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding


abstract class BaseFragment<T : ViewBinding> : Fragment() {

    lateinit var binding: T
    abstract fun inflateBinding(layoutInflater: LayoutInflater): T


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = inflateBinding(inflater)
        return binding.root
    }

//    protected fun createAlertDailog(stringId:Int,drawableId:Int) : Dialog {
//        val customDialog = Dialog(requireActivity())
//        customDialog.setContentView(R.layout.layout_dailog)
//        customDialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
//        val tvDesc = customDialog.findViewById(R.id.tvDesc) as TextView
//        val icDailog = customDialog.findViewById(R.id.ivDailog) as ImageView
//        val doneBtn = customDialog.findViewById(R.id.btnContinue) as AppCompatButton
//        tvDesc.text = getString(stringId)
//        icDailog.setImageDrawable(resources.getDrawable(drawableId))
//        return customDialog
//    }
//
//    fun handleCommonObservers(viewModel:BaseViewModel){
//        viewModel.deviceChangedState.observe(viewLifecycleOwner, Observer {
//            if (it.message.isNotEmpty()) requireActivity().showDeviceChangedDialog(it.message)
//        })
//    }


}