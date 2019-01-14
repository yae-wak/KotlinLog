package jp.techacademy.yae.wakahara.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {

    // コンストラクタ
    constructor(name: String, age: Int) : super(name, age) {
    }

    // メソッド
    override fun say() {
        Log.d("kotlintest", this.name  + "(" + this.age + "歳)" + "「ワンワン」")
    }
    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}