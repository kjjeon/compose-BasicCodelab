package com.example.basicscodelab

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.basicscodelab.ui.Greetings
import com.example.basicscodelab.ui.Main
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

    @Preview(
        showBackground = true,
        widthDp = 320,
        uiMode = Configuration.UI_MODE_NIGHT_YES,
        name = "onBoardingPreviewDark"
    )
    @Preview(showBackground = true, name = "onBoardingPreview", widthDp = 320)
    @Composable
    fun DefaultPreview() {
        BasicsCodelabTheme {
            Main()
        }
    }

    @Preview(
        showBackground = true,
        widthDp = 320,
        uiMode = Configuration.UI_MODE_NIGHT_YES,
        name = "DefaultPreviewDark"
    )
    @Preview(showBackground = true, name = "defaultPreview", widthDp = 320)
    @Composable
    fun GreetingPreview() {
        BasicsCodelabTheme {
            Greetings()
        }
    }
}
