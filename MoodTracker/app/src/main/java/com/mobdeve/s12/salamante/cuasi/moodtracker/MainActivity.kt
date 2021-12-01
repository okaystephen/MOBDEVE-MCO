package com.mobdeve.s12.salamante.cuasi.moodtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.mobdeve.s12.salamante.cuasi.moodtracker.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    var iv_sad : ImageView? = null
    var iv_neutral : ImageView? = null
    var iv_happy : ImageView? = null
    var btn_logged_already : Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_sad = findViewById(R.id.iv_sad)
        iv_neutral = findViewById(R.id.iv_neutral)
        iv_happy = findViewById(R.id.iv_happy)
        btn_logged_already = findViewById(R.id.btn_logged_already)

        iv_sad!!.setOnClickListener {
            val gotoLogActivity = Intent(applicationContext, LogActivity::class.java)

            var bundle = Bundle()
            gotoLogActivity.putExtra("mood", "sad")
            startActivity(gotoLogActivity)
            finish()
        }

        iv_neutral!!.setOnClickListener {
            val gotoLogActivity = Intent(applicationContext, LogActivity::class.java)

            var bundle = Bundle()
            gotoLogActivity.putExtra("mood", "neutral")
            startActivity(gotoLogActivity)
            finish()
        }

        iv_happy!!.setOnClickListener {
            val gotoLogActivity = Intent(applicationContext, LogActivity::class.java)

            var bundle = Bundle()
            gotoLogActivity.putExtra("mood", "happy")
            startActivity(gotoLogActivity)
            finish()
        }

        btn_logged_already!!.setOnClickListener {
            val gotoWeekActivity = Intent(applicationContext, WeekActivity::class.java)
            
            startActivity(gotoWeekActivity)
            finish()
        }
    }
}