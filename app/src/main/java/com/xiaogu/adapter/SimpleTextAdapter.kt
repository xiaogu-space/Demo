package com.xiaogu.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.demo.R
import com.xiaogu.bean.Meizi
import kotlinx.android.synthetic.main.item_text.view.*


/**
 * Created by xiaogu on 2017/5/18.
 */
class SimpleTextAdapter(val items: List<Meizi>) : RecyclerView.Adapter<SimpleTextAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(View.inflate(parent?.context, R.layout.item_text, null))
    }

    override fun onBindViewHolder(holder: SimpleTextAdapter.ViewHolder, position: Int) {
        with(holder?.itemView!!) {
            tv_title.text = items[position].who
        }
    }

    override fun getItemCount() = items.count()


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}