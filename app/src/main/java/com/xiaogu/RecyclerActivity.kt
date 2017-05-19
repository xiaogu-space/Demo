package com.xiaogu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.demo.R
import com.xiaogu.adapter.SimpleTextAdapter
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        var items = listOf<String>("1", "2", "3", "4")
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SimpleTextAdapter(items)
    }
}
