package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //スライドショーで表示する画像の配列
    private val PHOTO_RES_IDS = intArrayOf(R.drawable.italy, R.drawable.london, R.drawable.paris)

    //今どの画像を表示しているかを管理するためのメンバ変数
    private var index = 0

    // 詳細画面で表示する写真の説明文の配列の定数
    private val PHOTO_DESCRIPTION = arrayOf("イタリア", "ロンドン", "パリ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //画像やボタンがタップされる
        photoImageView.setOnClickListener(this)
        openButton.setOnClickListener(this)
        backButton.setOnClickListener(this)
        nextButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            //開くボタン
            R.id.openButton -> {

            }

            //進むボタン
            R.id.nextButton -> {
                //配列がループされるように条件分岐
                if (index < PHOTO_RES_IDS.size - 1) {
                    index += 1
                } else {
                    index = 0
                }

                //photoImageViewに写真を表示する
                photoImageView.setImageResource(PHOTO_RES_IDS[index])
            }

            //戻るボタン
            R.id.backButton -> {
                if (index > 0) {
                    index -= 1
                } else {
                    index = PHOTO_RES_IDS.size - 1
                }

                //photoImageViewに写真を表示する
                photoImageView.setImageResource(PHOTO_RES_IDS[index])
            }
        }
    }
}
