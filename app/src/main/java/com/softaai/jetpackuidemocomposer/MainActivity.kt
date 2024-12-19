package com.softaai.jetpackuidemocomposer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.softaai.jetpackuidemocomposer.ui.theme.JetpackUIDemoComposerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackUIDemoComposerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Jetpack UI Demo Composer",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

fun <T : @Composable () -> Unit> someFunction(composable: T) {
    composable()
}

@Composable
fun someFunction(content: @Composable () -> Unit) {
    content()
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackUIDemoComposerTheme {
        someFunction(){
            Greeting(name = "amol")
        }
        //Greeting("Jetpack UI Demo Composer in some function")
    }
}