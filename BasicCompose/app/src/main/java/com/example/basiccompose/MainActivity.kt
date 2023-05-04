package com.example.basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiccompose.ui.theme.BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BasicoComposeApp()
                }
            }
        }
    }
}

@Composable
fun BasicoComposeApp() {
    
}


@Composable
fun BasicComposeArticleCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    image: Painter,
    modifier: Modifier = Modifier
) {

}

@Preview(showBackground = true)
@Composable
fun BasicComposeArticlePreview() {
    BasicComposeTheme {
        BasicoComposeApp()
    }
}