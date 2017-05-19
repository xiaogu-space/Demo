package com.xiaogu.api

import com.xiaogu.bean.Meizi
import com.xiaogu.bean.ResponseWrapper
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path


/**
 * Created by xiaogu on 2017/5/19.
 */
interface Apis {
    @GET("{count}/{pageNum}")
    fun getMeizi(@Path("count") count: Int, @Path("pageNum") pageNum: Int): Observable<ResponseWrapper<Meizi>>
}