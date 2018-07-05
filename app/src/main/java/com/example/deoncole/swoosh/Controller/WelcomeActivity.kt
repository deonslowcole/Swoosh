package com.example.deoncole.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.deoncole.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        //Don't need to set find by id; just use the id of the object and it will be imported
        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent (this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }



}
