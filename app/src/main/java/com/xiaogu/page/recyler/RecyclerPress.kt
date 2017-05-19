package com.xiaogu.page.recyler


import com.xiaogu.api.Apiservice
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by xiaogu on 2017/5/19.
 */
class RecyclerPress(val mView: RecyclerView) {
    fun getData() {
        Apiservice.api.getMeizi(50, 1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    mView!!.setData(it.results)
                })
    }
}