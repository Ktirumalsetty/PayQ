package com.jettysoft.payq.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jettysoft.payq.model.home.RecentTransaction
import com.jettysoft.payq.ui.common.base.BaseViewModel

class HomeViewModel : BaseViewModel() {

    fun getRecentTransMockData(): MutableList<RecentTransaction>? {
        return mutableListOf<RecentTransaction>().apply {
            add(RecentTransaction(RecentTransaction.TYPE_INCOMING,"Jospeh Agbhemi","100.00","Today, 10:45AM"))
            add(RecentTransaction(RecentTransaction.TYPE_PAYMENT,"Invoice Id #6123","10.00","09 Jan, 2021"))
            add(RecentTransaction(RecentTransaction.TYPE_OUTGOING,"Ramesh Kona","150.00","09 Jan, 2021"))
            add(RecentTransaction(RecentTransaction.TYPE_INCOMING,"Verendra","35.00","10 Jan, 10:45AM"))
        }

    }


}