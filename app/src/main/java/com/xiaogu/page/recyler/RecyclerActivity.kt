package com.xiaogu.page.recyler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.demo.R
import com.xiaogu.adapter.SimpleTextAdapter
import com.xiaogu.bean.Meizi
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity(), RecyclerView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        initView()
        initData()
    }

    fun initView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun initData() {
        var recyclerPress = RecyclerPress(this)
        recyclerPress?.getData()
    }

    override fun setData(meizis: List<Meizi>) {
        recyclerView.adapter = SimpleTextAdapter(meizis)
    }
}
