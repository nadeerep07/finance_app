package com.nidtech.kotlinbasics.repository

import androidx.compose.runtime.mutableStateListOf
import com.nidtech.kotlinbasics.domain.ExpenseDomain

class  MainRepository{
    val items= mutableStateListOf(
        ExpenseDomain("Resturant", price = 57.50, pic = "imag1", time = "30 oct 2025 13:15"),
        ExpenseDomain("Resturant", price = 57.50, pic = "imag2", time = "29 oct 2025 15:15"),
        ExpenseDomain("Resturant", price = 57.50, pic = "imag3", time = "28 oct 2025 11:15"),
        ExpenseDomain("Resturant", price = 57.50, pic = "image4", time = "27 oct 2025 14:15"),
    )
}