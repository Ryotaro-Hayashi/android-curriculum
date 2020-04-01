package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PhotoDetailActivity : AppCompatActivity() {

    //画面遷移の際に値を渡すための変数
    val EXTRA_PHOTO_RES_ID = "EXTRA_PHOTO_RES_ID"
    val EXTRA_DESCRIPTION_STRING = "EXTRA_DESCRIPTION_STRING"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_detail)
    }
}
