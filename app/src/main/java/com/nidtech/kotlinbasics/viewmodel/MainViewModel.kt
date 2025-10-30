package com.nidtech.kotlinbasics.viewmodel

import androidx.lifecycle.ViewModel
import com.nidtech.kotlinbasics.repository.MainRepository

class MainViewModel(val repository: MainRepository): ViewModel() {
    constructor():this(MainRepository())

    fun loadData() = repository.items
}