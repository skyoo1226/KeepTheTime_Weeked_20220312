package com.skyoo.keepthetime_weeked_20220312

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

//    멤버변수 - this
    lateinit var mContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mContext = this
    }
//    셋업이벤트, 셋밸유
    abstract fun setupEvents()
    abstract fun setValues()
    }
}