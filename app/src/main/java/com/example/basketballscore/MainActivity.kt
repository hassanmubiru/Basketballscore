package com.example.basketballscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.basketballscore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var scoreViewModel: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Initialize the ViewModel
        scoreViewModel = ScoreViewModel()

        // Set the ViewModel on the binding
        binding.viewModel = scoreViewModel
        binding.lifecycleOwner = this // Set lifecycle owner for data binding

        // Set click listeners for the buttons
        binding.teamAAddThreeButton.setOnClickListener { scoreViewModel.addThreeForTeamA() }
        binding.teamAAddTwoButton.setOnClickListener { scoreViewModel.addTwoForTeamA() }
        binding.teamAAddOneButton.setOnClickListener { scoreViewModel.addOneForTeamA() }

        binding.teamBAddThreeButton.setOnClickListener { scoreViewModel.addThreeForTeamB() }
        binding.teamBAddTwoButton.setOnClickListener { scoreViewModel.addTwoForTeamB() }
        binding.teamBAddOneButton.setOnClickListener { scoreViewModel.addOneForTeamB() }

        // Set click listener for the Reset button
        binding.resetButton.setOnClickListener { scoreViewModel.reset() }
    }
}
