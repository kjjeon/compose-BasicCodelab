package com.example.basicscodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basicscodelab.ui.theme.BasicsCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
                Main()
            }
        }
    }

    @Composable
    private fun Main() {
        Surface(color = MaterialTheme.colors.background) {
            Column(
                modifier = Modifier.padding(vertical = 3.dp, horizontal = 6.dp)
            ) {
                for (name in listOf("android", "joel")) {
                    Greeting(name)
                }
            }
        }
    }

    @Composable
    private fun Greeting(name: String) {
        Surface(
            color = MaterialTheme.colors.primary,
            modifier = Modifier.padding(vertical = 3.dp)
        ) {
            Row(modifier = Modifier.padding(20.dp)) {
                Column(Modifier.weight(1f)) {
                    Text(text = "Hello,")
                    Text(text = "$name")
                }
                OutlinedButton(onClick = {}) {
                    Text(text = "Show more")
                }
            }
        }
    }

    @Preview(showBackground = true, name = "defaultPreview", widthDp = 320)
    @Composable
    fun DefaultPreview() {
        BasicsCodelabTheme {
            Main()
        }
    }
}
