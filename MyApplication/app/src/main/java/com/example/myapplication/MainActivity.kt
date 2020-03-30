package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //スライドショーで表示する画像の配列
    private val PHOTO_RES_IDS = intArrayOf(R.drawable.italy, R.drawable.london, R.drawable.paris)

    //今どの画像を表示しているかを管理するためのメンバ変数
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //画像やボタンがタップされる
        photoImageView.setOnClickListener(this)
        openButton.setOnClickListener(this)
        backButton.setOnClickListener(this)
        nextButton.setOnClickListener(this)

    }
}
