package com.anilderinbay.retrofitkotlin.service

import android.telecom.Call
import com.anilderinbay.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import retrofit2.http.GET

interface CryptoAPI {


    //GET,POST,UPDATE,DELETE

    @GET("prices?key=63728f330f582c0ebef63b8ffd3ce38bb8c71719")

    fun getData() : Observable<List<CryptoModel>>


    //fun getData() : retrofit2.Call<List<CryptoModel>>




}