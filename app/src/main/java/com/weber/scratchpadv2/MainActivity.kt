package com.weber.scratchpadv2

import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.weber.scratchpadv2.screen.app.ApplicationScreen
import com.weber.scratchpadv2.screen.hint.HintScreen
import com.weber.scratchpadv2.screen.home.HomeScreen
import com.weber.scratchpadv2.screen.prepare.PrepareGameSessionScreen
import com.weber.scratchpadv2.screen.setting.SettingScreen
import com.weber.scratchpadv2.ui.theme.Scratchpadv2Theme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        fullScreenMode()
        super.onCreate(savedInstanceState)
        setContent {
            ApplicationScreen()
        }
    }

    private fun fullScreenMode() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
    }
}

