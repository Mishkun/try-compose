package dev.mishkun.trycompose

import androidx.compose.*
import androidx.ui.core.Text
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle

@Composable
fun SimpleComposable() {
    MaterialTheme {
        Text(text = "Hello World!", style = +themeTextStyle { h1 })
    }
}