package com.github.aakumykov.qwerty_local

import android.util.Log
import com.github.aakumykov.qwerty.Qwerty

class QwertyLocal : Qwerty {
    override fun makeFun() {
        Log.d(TAG, "QwertyLocal.makeFun()")
    }
    companion object {
        val TAG: String = QwertyLocal::class.java.simpleName
    }
}