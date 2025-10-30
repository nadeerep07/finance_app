package com.nidtech.kotlinbasics.acitivities.dashboardactivity.components
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nidtech.kotlinbasics.R

@Composable
@Preview
fun ActionButtonRow() {
    Row (
        modifier = Modifier
            .padding(vertical = 16.dp)
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ){
        ActionButton(R.drawable.btn_1,"Deposit")
        ActionButton(R.drawable.btn_2,"Withdraw")
        ActionButton(R.drawable.btn_3,"Add Card")
        ActionButton(R.drawable.btn_4,"View All")
    }
}

@Composable
fun RowScope.ActionButton(icon:Int, text:String) {
    Column(
  modifier = Modifier
      .height(78.dp)
      .clip(RoundedCornerShape(10.dp))
      .weight(weight = 1f)
      .background( color = colorResource(R.color.lightBlue)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){
        Image(
            painter = painterResource(icon),
            contentDescription = null,
            modifier = Modifier.size(32.dp)
        )

        Text(text =text,
color = colorResource(R.color.darkBlue),
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
            )
    }
}