package dev.mishkun.trycompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.*
import androidx.ui.core.CraneWrapper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CraneWrapper { SimpleComposable() } }
    }
}
