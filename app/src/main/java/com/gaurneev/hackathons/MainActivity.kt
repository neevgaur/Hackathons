package com.gaurneev.hackathons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gaurneev.hackathons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        val mlhURL = "https://mlh.io/seasons/2023/events"
        val dfUrl = "https://devfolio.co/hackathons"
        val dpUrl = "https://devpost.com/hackathons"
        val unUrl = "https://unstop.com/online-hackathon-festival"

        mainBinding.btnMlh.setOnClickListener {
            val intent = Intent(this,hackWeb::class.java)
            intent.putExtra("URL",mlhURL)
            startActivity(intent)
        }

        mainBinding.btnUnstop.setOnClickListener {
            val intent = Intent(this,hackWeb::class.java)
            intent.putExtra("URL",unUrl)
            startActivity(intent)
        }

        mainBinding.btnDf.setOnClickListener {
            val intent = Intent(this,hackWeb::class.java)
            intent.putExtra("URL",dfUrl)
            startActivity(intent)
        }

        mainBinding.btnDp.setOnClickListener {
            val intent = Intent(this,hackWeb::class.java)
            intent.putExtra("URL",dpUrl)
            startActivity(intent)
        }
    }
}