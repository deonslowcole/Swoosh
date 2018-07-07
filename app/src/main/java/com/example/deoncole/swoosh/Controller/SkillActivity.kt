package com.example.deoncole.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.deoncole.swoosh.Model.Player
import com.example.deoncole.swoosh.Utilities.EXTRA_LEAGUE
import com.example.deoncole.swoosh.R
import com.example.deoncole.swoosh.Utilities.EXTRA_PLAYER
import com.example.deoncole.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    //Local variable used to capture the info passed from the intent in League Activity
    var league = ""

    var skill = ""

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        //set the variable to the passed intent
//        league = intent.getStringExtra(EXTRA_LEAGUE)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    //Create a instant state for when the device is rotated
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked = false

//        skill = "beginner"

        player.skill = "beginner"
    }

    fun onBallerClicked(view: View){
        beginnerSkillBtn.isChecked = false

//        skill = "baller"

        player.skill = "baller"
    }

    fun onSkillFinishedClicked(view: View){
        if (player.skill != ""){
            val finishedActivity = Intent (this, FinishedActivity::class.java)
//            finishedActivity.putExtra(EXTRA_LEAGUE, league)
//            finishedActivity.putExtra(EXTRA_SKILL, skill)
            finishedActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishedActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }
}
