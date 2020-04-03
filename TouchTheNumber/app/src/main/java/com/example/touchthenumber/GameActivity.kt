package com.example.touchthenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_game.*
import com.example.touchthenumber.R.drawable.*
import com.example.touchthenumber.R.raw.*
import android.media.MediaPlayer
import android.view.View
import java.util.*
import android.widget.Button
import android.util.Log
import kotlin.random.Random
import android.content.Intent
import android.view.animation.*

class GameActivity : AppCompatActivity() {

    //ボタンの数 (Int)
    private val numberOfButtons = 9
    // 音ファイル
    private val soundNames = listOf(not_right, _do, _re, _mi, _fa, _so, _ra, _shi, _do_, _re_)
    // 赤のボタン画像
    private val redButtons = listOf(r1, r2, r3, r4, r5, r6, r7, r8, r9)
    // 緑のボタン画像
    private val greenButtons = listOf(g1, g2, g3, g4, g5, g6, g7, g8, g9)
    // 青のボタン画像
    private val blueButtons = listOf(b1, b2, b3, b4, b5, b6, b7, b8, b9)

    //次タッチする数字の番号を格納する変数 (Int型)
    private var targetNumber = 0
    //ゲーム開始時にカウントする数を格納する変数(3,2,1と変化する) (Int)
    private var countDownNumber = 0
    //ゲームを開始する時の日時を格納する変数 (NSDate)
    private var gameStartedDate = Date()
    //ゲームをクリアするのにかかった時間 (Double)
    private var clearTime: Double = 0.0
    //数字のボタンを格納する配列 ([Button])
    private var numberButtons = mutableListOf<Button>()
    //各音楽を再生するオブジェクトを格納する配列
    private var players = mutableListOf<MediaPlayer>()

    private val clearTimeKey = "CLEAR_TIME"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentViewをしないとimageViewが読み込まれないため
        setContentView(R.layout.activity_game)
    }
}

class GameViewController: UIViewController {

    //ボタンの数 (Int)
    private val numberOfButtons = 9
    // 音ファイル
    private val soundNames = listOf(not_right, _do, _re, _mi, _fa, _so, _ra, _shi, _do_, _re_)
    // 赤のボタン画像
    private val redButtons = listOf(r1, r2, r3, r4, r5, r6, r7, r8, r9)
    // 緑のボタン画像
    private val greenButtons = listOf(g1, g2, g3, g4, g5, g6, g7, g8, g9)
    // 青のボタン画像
    private val blueButtons = listOf(b1, b2, b3, b4, b5, b6, b7, b8, b9)
}
