package com.xiaogu.api

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by xiaogu on 2017/5/19.
 */
class Apiservice {
    companion object {
        val API_HOST_URL = "http://gank.io/api/data/%E7%A6%8F%E5%88%A9/"
        val api: Apis

        init {
            val restAdapter = Retrofit.Builder()
                    .baseUrl(API_HOST_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()

            api = restAdapter.create(Apis::class.java)
        }
    }
}