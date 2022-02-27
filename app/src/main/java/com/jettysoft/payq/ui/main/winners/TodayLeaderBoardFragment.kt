package com.jettysoft.payq.ui.main.winners

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import com.jettysoft.payq.R
import com.jettysoft.payq.databinding.TodayLeaderBoardFragmentBinding
import com.jettysoft.payq.ui.common.base.BaseFragment
import com.jettysoft.payq.ui.main.winners.adapter.TodayLeaderBoardsListAdapter

class TodayLeaderBoardFragment : BaseFragment<TodayLeaderBoardFragmentBinding>() {

    override fun inflateBinding(layoutInflater: LayoutInflater): TodayLeaderBoardFragmentBinding {
        return TodayLeaderBoardFragmentBinding.inflate(layoutInflater)
    }

    companion object {
        fun newInstance() = TodayLeaderBoardFragment()
    }

    private val viewModel: TodayLeaderBoardViewModel by viewModels()
    private val mAdapter:TodayLeaderBoardsListAdapter = TodayLeaderBoardsListAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        mAdapter.submitList(viewModel.getMockData())
    }

    private fun setupRecyclerView() {
        binding.rvTodayLeaderBoard.apply {
            this.adapter = mAdapter
            val itemDecoration = DividerItemDecoration(binding.root.context, DividerItemDecoration.VERTICAL)
            itemDecoration.setDrawable(binding.root.context.getDrawable(R.drawable.list_divider)!!)
            addItemDecoration(itemDecoration)

        }
    }


}