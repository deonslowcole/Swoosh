package com.example.deoncole.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.deoncole.swoosh.Model.Player
import com.example.deoncole.swoosh.Utilities.EXTRA_LEAGUE
import com.example.deoncole.swoosh.R
import com.example.deoncole.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    //create a object for the class
    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
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

    //Methods for on click when the toggle buttons are clicked. If one of the buttons are checked set the others to false. Set the selected league variable to the league chosen
    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

//        selectedLeague = "mens"

        player.league = "men's"
    }

    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

//        selectedLeague = "womens"

        player.league = "women's"
    }

    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

//        selectedLeague = "co-ed"

        player.league = "co-ed"
    }

    //Check if the selected league variable is empty if so make a toast. If not set an extra in teh intent to send the selected league to the skill activity. Set a constant that will hold the extra that is needed to be passed along
    fun leagueNextClicked (view: View){
        if (player.league != "") {
            val skillActivity = Intent (this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }

    }
}
