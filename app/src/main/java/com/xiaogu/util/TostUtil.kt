package com.xiaogu.util

import android.content.Context
import android.widget.Toast

/**
 * Created by xiaogu on 2017/5/18.
 */
fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}