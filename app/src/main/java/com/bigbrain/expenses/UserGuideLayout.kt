package com.bigbrain.expenses

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class UserGuideLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_guide_layout)
    }

    fun onMain(view: View) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}