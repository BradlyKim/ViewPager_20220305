package com.neppplus.viewpager_20220305

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.viewpager_20220305.adpters.MainViewPagerAdpter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: MainViewPagerAdpter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents(){

    }

    fun setValues(){

        mAdapter = MainViewPagerAdpter( supportFragmentManager )
        mainViewPager.adapter = mAdapter

    }

}