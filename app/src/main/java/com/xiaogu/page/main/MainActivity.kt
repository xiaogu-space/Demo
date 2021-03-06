package com.xiaogu.page.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.demo.R
import com.xiaogu.page.recyler.RecyclerActivity
import com.xiaogu.page.recyler.RecyclerPress
import com.xiaogu.util.gotoActivity
import com.xiaogu.util.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initData()
    }

    fun initView() {
        textView.text = "天气不错"
        button.setOnClickListener {
            toast("这个代码很给力")
        }
        button2.setOnClickListener {
            gotoActivity<RecyclerActivity>()
        }
    }

    fun initData() {

    }
}


