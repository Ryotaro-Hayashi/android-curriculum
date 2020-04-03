package com.example.piano

import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // 白鍵・黒鍵と音楽ファイルを対応づけるためのKeyデータクラスを定義
    data class Key(val button: Button, val resource: Int)

    // ボタンが押された時に最大10個まで音楽ファイルを同時に再生できるようにインスタンスを生成
    private val soundPool = SoundPool.Builder().setMaxStreams(10).build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 作成したKeyクラスを使って、各ボタンと音楽ファイルを対応させたリストを作成
        val piano = listOf(
            Key(white_0, R.raw.piano_c),
            Key(black_0, R.raw.piano_c_sharp),
            Key(white_1, R.raw.piano_d),
            Key(black_1, R.raw.piano_d_sharp),
            Key(white_2, R.raw.piano_e),
            Key(white_3, R.raw.piano_f),
            Key(black_2, R.raw.piano_f_sharp),
            Key(white_4, R.raw.piano_g),
            Key(black_3, R.raw.piano_g_sharp),
            Key(white_5, R.raw.piano_a),
            Key(black_4, R.raw.piano_a_sharp),
            Key(white_6, R.raw.piano_b),
            Key(white_7, R.raw.piano_c_octave))

        // 各ボタンに音楽再生を配置
        piano.forEach{
            playSound(it)
            // タップ時の操作音をオフにする
            it.button.isSoundEffectsEnabled = false
        }
    }

    // 音が鳴るための関数
    private fun playSound(key: Key) {
        // ロード
        val soundId = soundPool.load(this, key.resource, 1)
        // 再生
        key.button.setOnClickListener {
            soundPool.play(soundId, 1.0f, 1.0f, 0, 0, 1.0f)
        }
    }
}
