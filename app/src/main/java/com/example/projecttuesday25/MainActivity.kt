package com.example.projecttuesday25

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.projecttuesday25.ui.theme.ProjectTuesday25Theme

class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectTuesday25Theme {
                MainScreen(mainViewModel = mainViewModel)
            }
        }
    }
}