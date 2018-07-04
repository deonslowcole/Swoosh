package com.example.deoncole.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

    //Local variable used to capture the info passed from the intent in League Activity
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        //set the variable to the passed intent
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }
}
