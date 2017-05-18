package com.xiaogu

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.demo.R
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
            Toast.makeText(this, "这个代码给力", Toast.LENGTH_SHORT).show()
        }
    }

    fun initData() {

    }
}


