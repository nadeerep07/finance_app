package com.nidtech.kotlinbasics.acitivities.dashboardactivity.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nidtech.kotlinbasics.acitivities.dashboardactivity.components.ActionButtonRow
import com.nidtech.kotlinbasics.acitivities.dashboardactivity.components.CardSection
import com.nidtech.kotlinbasics.acitivities.dashboardactivity.components.ExpenseItem
import com.nidtech.kotlinbasics.acitivities.dashboardactivity.components.HeaderSection
import com.nidtech.kotlinbasics.domain.ExpenseDomain

@Composable
fun MainScreen(
    onCardClick:() -> Unit ={},
    expense:List<ExpenseDomain>
){
Box(modifier = Modifier
    .fillMaxSize()
    .background(Color.White)
){
    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 70.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ){
        item{ HeaderSection() }
        item{ CardSection() }
        item{ ActionButtonRow() }
        items(expense){ item -> ExpenseItem(item = item) }

    }
}
}

@Composable
@Preview(showSystemUi = true)
fun MainScreenPreview(modifier: Modifier = Modifier) {
    val expenses = listOf(
        ExpenseDomain("Restaurant", price = 250.50, pic = "restaurant", time = "30 oct 2025 13:15"),
        ExpenseDomain("Mcdonalds", price = 650.50, pic = "mcdonald", time = "29 oct 2025 15:15"),
        ExpenseDomain("Movies", price = 354.50, pic = "cinema", time = "28 oct 2025 11:15"),
        ExpenseDomain("Restaurant", price = 1200.50, pic = "restaurant", time = "27 oct 2025 14:15"),
    )
    MainScreen(expense = expenses)
}