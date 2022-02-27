package com.jettysoft.payq.ui.main.winners

import androidx.lifecycle.ViewModel
import com.jettysoft.payq.model.winners.TodayLeaderBoardWinner
import com.jettysoft.payq.ui.common.base.BaseViewModel

class TodayLeaderBoardViewModel : BaseViewModel() {

    fun getMockData(): MutableList<TodayLeaderBoardWinner>? {

        return mutableListOf<TodayLeaderBoardWinner>().apply {
            add(TodayLeaderBoardWinner("You","#15","230 points"))
            add(TodayLeaderBoardWinner("Naveen","#2","290 points"))
            add(TodayLeaderBoardWinner("Veerendra","#2","275 points"))
            add(TodayLeaderBoardWinner("Phani Surapaneni","#5","270 points"))
            add(TodayLeaderBoardWinner("Mahesh Babu","#6","260 points"))
            add(TodayLeaderBoardWinner("Chiranjeevi","#7","245 points"))
            add(TodayLeaderBoardWinner("Samantha","#5","200 points"))
        }

    }
    // TODO: Implement the ViewModel
}