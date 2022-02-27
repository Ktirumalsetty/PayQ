package com.jettysoft.payq.ui.main.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jettysoft.payq.R
import com.jettysoft.payq.databinding.RecentTransactionsListItemBinding
import com.jettysoft.payq.model.home.RecentTransaction

class RecentTransactionsAdapter :
    ListAdapter<RecentTransaction, RecentTransactionsAdapter.TicketVH>(TicketDiffCallBack()) {

    var onItemClick: ((RecentTransaction) -> Unit?)? = null

    inner class TicketVH(val binding: RecentTransactionsListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: RecentTransaction) {
            binding.apply {
                tvUserName.text = item.name
                var imgRes: Int = 0
                var transDesc: String = ""
                var creditDebit: String = ""
                when (item.type) {
                    RecentTransaction.TYPE_INCOMING -> {
                        imgRes = R.drawable.ic_trans_incoming_arrow
                        transDesc = "Received From"
                        creditDebit ="+"
                        tvTrnxAmount.setTextColor(ContextCompat.getColor(root.context,R.color.green))

                    }
                    RecentTransaction.TYPE_PAYMENT -> {
                        imgRes = R.drawable.ic_trans_out_going_arrow
                        transDesc = "Paid"
                        creditDebit ="-"
                        tvTrnxAmount.setTextColor(ContextCompat.getColor(root.context,R.color.red))
                    }
                    RecentTransaction.TYPE_OUTGOING -> {
                        imgRes = R.drawable.ic_trans_out_going_arrow
                        transDesc = "Send to"
                        creditDebit ="-"
                        tvTrnxAmount.setTextColor(ContextCompat.getColor(root.context,R.color.red))

                    }
                    else -> {
                        R.drawable.ic_trans_incoming_arrow
                        transDesc = "unknown"
                    }

                }
                ivTransType.setImageResource(imgRes)
                tvUserName.text = item.name
                tvTrnxDesc.text = transDesc
                tvTrnxAmount.text = creditDebit +"$"+ item.amount
                tvTrnxDate.text = item.date
                root.setOnClickListener(View.OnClickListener { onItemClick?.invoke(item) })

            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketVH {
        val binding = RecentTransactionsListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TicketVH(binding)
    }

    override fun onBindViewHolder(holder: TicketVH, position: Int) {
        holder.bind(getItem(position))
    }

    private class TicketDiffCallBack : DiffUtil.ItemCallback<RecentTransaction>() {
        override fun areItemsTheSame(
            oldItem: RecentTransaction,
            newItem: RecentTransaction
        ): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(
            oldItem: RecentTransaction,
            newItem: RecentTransaction
        ): Boolean =
            oldItem == newItem
    }
}