package com.example.basicscodelab.ui

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.basicscodelab.ui.theme.BasicsCodelabTheme

@Composable
fun Main() {
    var shouldShowOnBoarding by rememberSaveable { mutableStateOf(true) }

    if (shouldShowOnBoarding) {
        OnboardingScreen {
            shouldShowOnBoarding = false
        }
    } else {
        Greetings()
    }
}

@Preview(showBackground = true, widthDp = 320, name = "DefaultPreviewLight")
@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "DefaultPreviewDark"
)
@Composable
fun DefaultPreview() {
    BasicsCodelabTheme {
        Greetings()
    }
}
