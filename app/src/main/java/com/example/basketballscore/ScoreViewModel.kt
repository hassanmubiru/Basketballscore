package com.example.basketballscore
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    var teamAScore = 0
        private set

    var teamBScore = 0
        private set

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA() {
        teamAScore += 3
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA() {
        teamAScore += 2
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA() {
        teamAScore++
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB() {
        teamBScore += 3
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB() {
        teamBScore += 2
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB() {
        teamBScore++
    }

    /**
     * Reset scores to 0
     */
    fun reset() {
        teamAScore = 0
        teamBScore = 0
    }
}
