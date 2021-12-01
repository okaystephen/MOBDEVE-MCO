package com.mobdeve.s12.salamante.cuasi.moodtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mobdeve.s12.salamante.cuasi.moodtracker.databinding.ActivityLogBinding


class LogActivity : AppCompatActivity() {
    var binding: ActivityLogBinding? = null
    var btn_reason_proceed : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        var bundle = intent.extras
        var mood = bundle!!.getString("mood")

        binding!!.etLog.hint = "Why do you feel $mood?"

        btn_reason_proceed = findViewById(R.id.btn_reason_proceed)
        btn_reason_proceed!!.setOnClickListener {
            val gotoWeekActivity = Intent(applicationContext, WeekActivity::class.java)
            gotoWeekActivity.putExtra("reason", binding!!.etLog.text.toString())
            startActivity(gotoWeekActivity)
            finish()
        }
    }
}