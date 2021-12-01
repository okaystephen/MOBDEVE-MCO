package com.mobdeve.s12.salamante.cuasi.moodtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class LogActivity : AppCompatActivity() {
    var btn_reason_proceed : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        btn_reason_proceed = findViewById(R.id.btn_reason_proceed)

        btn_reason_proceed!!.setOnClickListener {
            val gotoWeekActivity = Intent(applicationContext, WeekActivity::class.java)

            startActivity(gotoWeekActivity)
            finish()
        }
    }
}