package com.example.piano

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // 白鍵・黒鍵と音楽ファイルを対応づけるためのKeyデータクラスを定義
    data class Key(val button: Button, val resource: Int)

    // ボタンが押された時に最大10個まで音楽ファイルを同時に再生できるようにインスタンスを生成
    private val soundPool = SoundPool.Builder().setMaxStreams(10).build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
