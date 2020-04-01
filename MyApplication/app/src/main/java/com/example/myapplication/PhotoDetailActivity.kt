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

        // 前画面から渡された写真を取得して格納
        val photoResId = intent.getIntExtra(EXTRA_PHOTO_RES_ID, 0)
        // 前画面から渡された説明文を取得して格納
        val description = intent.getStringExtra(EXTRA_DESCRIPTION_STRING)

        // 前画面から渡された写真を表示
        detailPhotoImageView.setImageResource(photoResId)
        // 前画面から渡された説明文を表示
        descriptionTextView.setText(description)
    }
}
