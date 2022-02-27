package com.jettysoft.payq.model.home

data class RecentTransaction(
    val type:String,
    val name:String,
    val amount:String,
    val date:String
){
    companion object{
        const val TYPE_PAYMENT="payment"
        const val TYPE_INCOMING="incoming"
        const val TYPE_OUTGOING="outgoing"
    }
}
