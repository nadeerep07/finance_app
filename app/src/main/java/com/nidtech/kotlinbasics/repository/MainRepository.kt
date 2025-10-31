package com.nidtech.kotlinbasics.repository

import androidx.compose.runtime.mutableStateListOf
import com.nidtech.kotlinbasics.domain.ExpenseDomain

class  MainRepository{
    val items= mutableStateListOf(
        ExpenseDomain("Resturant", price = 250.50, pic = "restaurant", time = "30 oct 2025 13:15"),
        ExpenseDomain("Movies", price = 650.50, pic = "mcdonald", time = "29 oct 2025 15:15"),
        ExpenseDomain("Travel", price = 354.50, pic = "cinema", time = "28 oct 2025 11:15"),
        ExpenseDomain("Food", price = 1200.50, pic = "resturant", time = "27 oct 2025 14:15"),
    )
}