package com.pk.phr.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pk.phr.R
import com.pk.phr.R.layout.toolbar
import kotlinx.android.synthetic.main.activity_base.*

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentViewId())
    }

    abstract fun getContentViewId() : Int
    abstract fun getNavigationItemId() : Int
}
