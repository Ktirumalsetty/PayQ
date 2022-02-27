package com.jettysoft.payq.ui.main.winners.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jettysoft.payq.R
import com.jettysoft.payq.databinding.TodayLeaderBoardListItemBinding
import com.jettysoft.payq.model.winners.TodayLeaderBoardWinner

class TodayLeaderBoardsListAdapter:ListAdapter<TodayLeaderBoardWinner,TodayLeaderBoardsListAdapter.TicketVH>(TicketDiffCallBack()) {

//    var onReopenClickListener : ((TodayLeaderBoardWinner) -> Unit?)? = null
    var onItemClick : ((TodayLeaderBoardWinner) -> Unit?)? = null

    inner class TicketVH(val binding : TodayLeaderBoardListItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item:TodayLeaderBoardWinner){
            binding.apply{
                tvUserName.text= item.name
                tvPoints.text= item.points
                tvRank.text= item.rank
                if (item.name.equals("You")){
                    root.setBackgroundColor(ContextCompat.getColor(root.context,R.color.light_yellow))
                }else{
                    root.setBackgroundColor(ContextCompat.getColor(root.context,R.color.white))
                }
                root.setOnClickListener(View.OnClickListener { onItemClick?.invoke(item) })

            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketVH {
        val binding = TodayLeaderBoardListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TicketVH(binding)
    }

    override fun onBindViewHolder(holder: TicketVH, position: Int) {
        holder.bind(getItem(position))
    }

    private class TicketDiffCallBack : DiffUtil.ItemCallback<TodayLeaderBoardWinner>() {
        override fun areItemsTheSame(oldItem: TodayLeaderBoardWinner, newItem: TodayLeaderBoardWinner): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: TodayLeaderBoardWinner, newItem: TodayLeaderBoardWinner): Boolean =
            oldItem == newItem
    }
}