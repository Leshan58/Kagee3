package com.example.kagee.ui.theme.screens.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.R


@Composable
fun homescreen(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize()

    ){






        Text(text = "Kagee App",
            color = Color.Yellow,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Readily available car spare parts",
            color = Color.Yellow,
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive)
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "In our app we offer spare parts that you search and buy",
            color = Color.Yellow,
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive)
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = " Log in and if you don't have an account you can create one",
            color = Color.Yellow,
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive)
        Spacer(modifier = Modifier.height(30.dp))

        OutlinedButton(onClick = {

        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Login")

        }
        OutlinedButton(onClick = {

        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "create an account")

        }
    }
}

@Preview
@Composable
private fun homescreenprev() {
    homescreen()}
