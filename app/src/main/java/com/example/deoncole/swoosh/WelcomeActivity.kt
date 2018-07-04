package com.example.deoncole.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
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
