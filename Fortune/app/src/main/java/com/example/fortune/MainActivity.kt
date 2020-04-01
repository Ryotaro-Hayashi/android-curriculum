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

    // おみくじが引かれているかを表す変数
    private var isDrawn = false

    // 初期化するための関数
    private fun initialFortune() {
        // isDrawnがtrue=おみくじを引き終わった状態
        // おみくじを引いていない状態にする
        isDrawn = false
        // 初期画像に戻す
        fortuneImageView.setImageResource(R.drawable.omikuji)
        // ボタンテキストの変更
        drawButton.text = "おみくじを引く"
    }

    // 乱数を生成して画像を表示
    private fun createFortune() {
        // floatで乱数を生成して格納
        val randomResult = Random().nextFloat()
        setImage(randomResult)
    }

    // 確率を操作して画像を操作する
    private fun setImage(float: Float) {
        when {
            // isDrawnがfalse=おみくじを引いていない状態
            // isDrawn = true; // おみくじを引き終わった状態にする

            // 確率を操作して、画像を表示
            float < 0.1 -> fortuneImageView.setImageResource(FORTUNE_IMAGES[0])
            float < 0.4 -> fortuneImageView.setImageResource(FORTUNE_IMAGES[1])
            float < 0.6 -> fortuneImageView.setImageResource(FORTUNE_IMAGES[2])
            float < 0.7 -> fortuneImageView.setImageResource(FORTUNE_IMAGES[3])
            float < 0.8 -> fortuneImageView.setImageResource(FORTUNE_IMAGES[4])
            float < 0.9 -> fortuneImageView.setImageResource(FORTUNE_IMAGES[5])
            else -> fortuneImageView.setImageResource(FORTUNE_IMAGES[6])
        }

        // おみくじを引いた後の処理
        endProcess()
    }

    // おみくじを引いた後の処理
    private fun endProcess() {
        // おみくじを引き終わった状態にする
        isDrawn = true
        // ボタンテキストの変更
        drawButton.text = "もう一度引く"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        // 等確率でおみくじを引く
//        val randomResult = Random().nextInt(FORTUNE_IMAGES.size)
//        fortuneImageView.setImageResource(FORTUNE_IMAGES[randomResult])
//
//        if (isDrawn == true) {
//            fortuneImageView.setImageResource(R.drawable.omikuji)
//            drawButton.text = "おみくじを引く"
//            isDrawn = false
//        } else {
//            isDrawn = true
//            drawButton.text = "もう一度引く"
//        }

        // 平等ではない確率でおみくじを引く
        if (isDrawn == true) {
            initialFortune()
        } else {
            createFortune()
        }
    }
}
