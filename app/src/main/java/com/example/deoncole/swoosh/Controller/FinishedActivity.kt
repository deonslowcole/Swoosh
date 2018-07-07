package com.example.deoncole.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.deoncole.swoosh.Model.Player
import com.example.deoncole.swoosh.R
import com.example.deoncole.swoosh.Utilities.EXTRA_LEAGUE
import com.example.deoncole.swoosh.Utilities.EXTRA_PLAYER
import com.example.deoncole.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finished.*

class FinishedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finished)

//        val league = intent.getStringExtra(EXTRA_LEAGUE)
//        val skill = intent.getStringExtra(EXTRA_SKILL)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

//        searchLeagueText.text = "Looking for $league $skill league near you..."

        searchLeagueText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
