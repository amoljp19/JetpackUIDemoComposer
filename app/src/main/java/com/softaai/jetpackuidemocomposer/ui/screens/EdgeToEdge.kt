package com.softaai.jetpackuidemocomposer.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


/**
 * Created by amoljp19 on 12/13/2024.
 * softAai Apps.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyEdgeToEdgeApp() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Edge to Edge UI") })
        }
    ) { paddingValues ->
        paddingValues
        Box(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "This is a full-screen, edge-to-edge UI",
                modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxSize()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyEdgeToEdgeApp() {
    MyEdgeToEdgeApp()
}