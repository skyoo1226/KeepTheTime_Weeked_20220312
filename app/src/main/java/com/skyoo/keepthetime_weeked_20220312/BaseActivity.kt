package com.skyoo.keepthetime_weeked_20220312

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.skyoo.keepthetime_weeked_20220312.api.APIList
import com.skyoo.keepthetime_weeked_20220312.api.ServerAPI

// 모든 화면이 공통으로 사용하는 것들

abstract class BaseActivity : AppCompatActivity() {

//    멤버변수 - this
    lateinit var mContext: Context

    lateinit var apiList: APIList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mContext = this

        val retrofit = ServerAPI.getRetrofit()
        apiList = retrofit.
    }
//    셋업이벤트, 셋밸유
    abstract fun setupEvents()
    abstract fun setValues()
    }
}