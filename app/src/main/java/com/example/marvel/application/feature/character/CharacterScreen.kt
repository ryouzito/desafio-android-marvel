package com.example.marvel.application.feature.character

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.marvel.application.feature.main.MainActivity

@Composable
fun characterPage(viewModel: CharacterViewModel) {
    val activity = LocalContext.current as MainActivity
}

@Composable
@Preview
private fun characterScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

    }
}