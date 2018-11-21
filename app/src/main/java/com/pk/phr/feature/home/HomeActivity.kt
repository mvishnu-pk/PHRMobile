package com.pk.phr.feature.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pk.phr.R
import com.pk.phr.app.BaseActivity

class HomeActivity : BaseActivity() {


    override fun getContentViewId(): Int {
        return R.layout.activity_home
    }

    override fun getNavigationItemId(): Int {
        return R.id.menu_home
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}
