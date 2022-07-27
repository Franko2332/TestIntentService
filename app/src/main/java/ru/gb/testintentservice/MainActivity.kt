package ru.gb.testintentservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent().apply {
            setAction("ru.gb.thegithubclient.service.CustomIntentService")
            setPackage("ru.gb.thegithubclient")
        }
        setContentView(R.layout.activity_main)
        startService(intent)
        }
    }
