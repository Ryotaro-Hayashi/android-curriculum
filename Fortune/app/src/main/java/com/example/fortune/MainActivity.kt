package com.example.fortune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// レイアウトをインポート
import kotlinx.android.synthetic.main.activity_main.*
//　クリック処理を書くために必要
import android.view.View
// Random()を使用するために必要
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // おみくじ結果画像の配列
    private val FORTUNE_IMAGES = intArrayOf(R.drawable.omikuji_daikichi,
        R.drawable.omikuji_chuukichi, R.drawable.omikuji_kichi,R.drawable.omikuji_syoukichi,
        R.drawable.omikuji_suekichi,  R.drawable.omikuji_kyou, R.drawable.omikuji_daikyou)

    // おみくじが引かれているかを表す状態
    private val isDrawn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val randomResult = Random().nextInt(FORTUNE_IMAGES.size)
        fortuneImageView.setImageResource(FORTUNE_IMAGES[randomResult])
    }
}
