package com.gaurneev.hackathons

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import com.gaurneev.hackathons.databinding.ActivityHackWebBinding

class hackWeb : AppCompatActivity() {
    lateinit var hackWebBinding: ActivityHackWebBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        hackWebBinding = ActivityHackWebBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(hackWebBinding.root)

        supportActionBar?.hide()

        val url=intent.getStringExtra("URL")

        if (url !=null){
            hackWebBinding.hackWebview.settings.javaScriptEnabled = true
            hackWebBinding.hackWebview.settings.userAgentString = "Mozilla/5.0 (Linux; U; Android 2.2; en-us; Nexus One Build/FRF91) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"
            hackWebBinding.hackWebview.webViewClient = object :WebViewClient(){
                override fun onPageFinished(view: WebView?, url: String?) {
                    super.onPageFinished(view, url)
                    hackWebBinding.progressBar.visibility = View.GONE
                    hackWebBinding.hackWebview.visibility = View.VISIBLE
                }
            }
            hackWebBinding.hackWebview.loadUrl(url)
            Log.d("neevgaur","running")
        }
    }
}