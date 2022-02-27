package com.jettysoft.payq.ui.common.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {

//    val networkState = MutableLiveData(NetworkState.LOADED)
//    val deviceChangedState = MutableLiveData(BaseResp())

    private val messageLiveData = MutableLiveData<String>()
    private val errorMessageLiveData = MutableLiveData<String>()
//    private val navigateToScreen = MutableLiveData<Event<Int>>()





//    /**
//     * Navigate view screen
//     */
//    fun navigateScreen(viewId: Int) {
//        navigateToScreen.value = Event(viewId)
//    }
//
//    /**
//     * Show message
//     * @param message
//     */
//    fun showMessage(message: String) {
//        messageLiveData.value = message
//    }
//
//    /**
//     * Show error message
//     * @param message
//     */
//    fun showErrorMessage(message: String) {
//        errorMessageLiveData.value = message
//    }
//
//    fun handleErrorApiResp(apiResp:ApiResponse<Any>){
//        when(apiResp){
//            is ApiResponse.ApiError -> showErrorMessage("ApiError ${apiResp.body}")
//            is ApiResponse.NetworkError -> showErrorMessage("NetworkError ${apiResp.error}")
//            is ApiResponse.UnknownError -> showErrorMessage("UnknownError")
//            else -> {}
//        }
//    }
//
//    sealed class DeviceChangedState(){
//        data class Changed(val message: String):DeviceChangedState()
//        object NotChanged:DeviceChangedState()
//    }

}