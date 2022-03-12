package com.skyoo.keepthetime_weeked_20220312.api

import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.POST

interface APIList {

    @POST("/user")
    fun postRequestLogin(
        @Field("Email") id: String,
        @Field("password") pw: String,
    ) : Call<JSONObject>
}