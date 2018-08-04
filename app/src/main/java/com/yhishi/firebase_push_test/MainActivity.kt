package com.yhishi.firebase_push_test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {

    private lateinit var mFirebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this)

        // Analytics用のイベントログ
        val fireLogBundle = Bundle()
        fireLogBundle.putString("TEST", "FireSample app MainActivity.onCreate() is called.")
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.APP_OPEN, fireLogBundle)

    }
}
