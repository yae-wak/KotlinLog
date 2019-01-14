package jp.techacademy.yae.wakahara.kotlinlog

import android.hardware.usb.UsbInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("山田花子", 20, "音楽")
        human1.say()
        human1.think()

        val human2 = Human("佐藤太郎", 50, "骨董")
        human2.say()
        human2.think()
    }
}
