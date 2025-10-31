package com.nidtech.kotlinbasics.acitivities.dashboardactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nidtech.kotlinbasics.acitivities.dashboardactivity.screens.MainScreen
import com.nidtech.kotlinbasics.ui.theme.KotlinBasicsTheme
import com.nidtech.kotlinbasics.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsTheme {
                MainScreen(expense = mainViewModel.loadData(), onCardClick = {
                    mainViewModel.onCardClick()
                } )
            }
        }
    }
}
