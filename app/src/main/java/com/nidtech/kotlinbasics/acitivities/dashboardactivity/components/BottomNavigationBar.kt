package com.nidtech.kotlinbasics.acitivities.dashboardactivity.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nidtech.kotlinbasics.R

@Composable
fun BottomNavigationBar(onItemSelected:(Int) -> Unit,
    modifier: Modifier = Modifier) {
    NavigationBar(
        containerColor = colorResource(R.color.lightBlue),
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp)
    ){
NavigationBarItem(
    selected = true,
    onClick = {onItemSelected(R.id.wallet)},
    icon = {
        Icon( painter = painterResource(R.drawable.wallet), contentDescription = null)
    },
    label = { Text("Home") }
)
        NavigationBarItem(
            selected = true,
            onClick = {onItemSelected(R.id.market)},
            icon = {
                Icon( painter = painterResource(R.drawable.market), contentDescription = null)
            },
            label = { Text("Market") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {onItemSelected(R.id.trade)},
            icon = {
                Icon( painter = painterResource(R.drawable.trade), contentDescription = null)
            },
            label = { Text("Trade") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {onItemSelected(R.id.future)},
            icon = {
                Icon( painter = painterResource(R.drawable.futures), contentDescription = null)
            },
            label = { Text("Future") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {onItemSelected(R.id.profile)},
            icon = {
                Icon( painter = painterResource(R.drawable.profile), contentDescription = null)
            },
            label = { Text("Profile") }
        )
    }
}