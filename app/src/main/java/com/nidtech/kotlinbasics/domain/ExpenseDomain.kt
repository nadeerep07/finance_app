package com.nidtech.kotlinbasics.domain

import java.io.Serializable

data class ExpenseDomain(
    val title:String ="",
    val price: Double =0.0,
    val pic: String ="",
    val time: String =""
):  Serializable
