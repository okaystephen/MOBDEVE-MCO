package com.mobdeve.s12.salamante.cuasi.moodtracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobdeve.s12.salamante.cuasi.moodtracker.databinding.ActivityLogBinding
import com.mobdeve.s12.salamante.cuasi.moodtracker.databinding.ActivityWeekBinding

class WeekActivity : AppCompatActivity() {
    var binding: ActivityWeekBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeekBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        var bundle = intent.extras
        var reason = bundle!!.getString("reason")

        // Just to check if binding worked; delete after!
        binding!!.tvDate.text = reason
    }
}