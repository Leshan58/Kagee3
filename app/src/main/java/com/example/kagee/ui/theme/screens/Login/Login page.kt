package com.example.kagee.ui.theme.screens.Login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable

fun logscreen(){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("")
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize()

    ){
        Text(text = "WELCOME BACK",
            color = Color.Yellow,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif
        )
        OutlinedTextField(value = email, onValueChange = {email=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email") },
            label = { Text(text = "Username/Email address") }, modifier = Modifier
                .fillMaxWidth()
                .padding()
        )
        OutlinedTextField(value = password, onValueChange = {password=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Password") },
            label = { Text(text = "Password") }, modifier = Modifier
                .fillMaxWidth()
                .padding()
        )
        OutlinedButton(onClick = {

        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Log in")


        }
        Text(text = "Don't have an account?")

        OutlinedButton(onClick = {

        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Sign up")

        }

    }
}

@Preview
@Composable
private fun mainscreenpreview() {
    logscreen()}
