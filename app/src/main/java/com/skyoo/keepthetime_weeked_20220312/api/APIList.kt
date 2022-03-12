package com.skyoo.keepthetime_weeked_20220312.api

import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

// keepthetime.xyz  서버에 있는 기능에 접속하는 방법을 명시하는 인터페이스
interface APIList {

//    로그인 기능 : POST -  /user
    @FormUrlEncoded
    @POST("/user")
    fun postRequestLogin(
        @Field("Email") id: String,
        @Field("password") pw: String,
    ) : Call<JSONObject>

}