package com.xiaogu

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.demo.R
import com.xiaogu.util.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
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
    }

    fun initData() {

    }
}


