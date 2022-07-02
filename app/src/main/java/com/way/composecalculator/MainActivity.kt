package com.way.composecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.way.composecalculator.ui.Calculator
import com.way.composecalculator.ui.CalculatorViewModel
import com.way.composecalculator.ui.theme.ComposeCalculatorTheme
import com.way.composecalculator.ui.theme.MediumGray

class MainActivity : ComponentActivity() {

    private lateinit var calculatorViewModel: CalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCalculatorTheme {
                calculatorViewModel = viewModel()
                val state = calculatorViewModel.state
                Calculator(
                    modifier = Modifier,
                    state = state,
                    onAction = calculatorViewModel::onAction,
                    buttonSpacing = BUTTON_SPACING
                )
            }
        }
    }

    companion object {
        val BUTTON_SPACING = 8.dp
    }
}