package com.xiaogu.util

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * toast
 */
fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

/**
 * intent
 */
inline fun <reified T : Activity> Activity.gotoActivity() {
    var intent = Intent(this, T::class.java)
    this.startActivity(intent)
}

/**
 * intent(with things)
 */
inline fun <reified T : Activity> Activity.gotoActivity(intent: Intent) {
    intent.setClass(this, T::class.java)
    this.startActivity(intent)
}