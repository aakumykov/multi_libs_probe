package com.github.aakumykov.qwerty_yandex

import android.util.Log
import com.github.aakumykov.qwerty.Qwerty

class QwertyYandex : Qwerty {
    override fun makeFun() {
        Log.d(TAG, "QwertyYandex.makeFun()")
    }
    companion object {
        val TAG: String = QwertyYandex::class.java.simpleName
    }
}