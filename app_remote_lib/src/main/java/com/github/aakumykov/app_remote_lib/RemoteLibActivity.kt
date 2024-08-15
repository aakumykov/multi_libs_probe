package com.github.aakumykov.app_remote_lib

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.github.aakumykov.qwerty.Qwerty
import com.github.aakumykov.qwerty_local.QwertyLocal
import com.github.aakumykov.qwerty_yandex.QwertyYandex

class RemoteLibActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_remote_lib)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val qwertyLocal = QwertyLocal().apply { makeFun() }
        val qwertyYandex = QwertyYandex().apply { makeFun() }
    }
}