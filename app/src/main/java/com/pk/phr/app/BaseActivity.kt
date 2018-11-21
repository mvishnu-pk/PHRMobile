package com.pk.phr.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pk.phr.R

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}
