package com.xiaogu.bean

/**
 * Created by xiaogu on 2017/5/19.
 */
data class ResponseWrapper<T>(val error: Boolean, val results: List<T>)