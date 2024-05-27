package com.example.fracturemonitor.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.fracturemonitor.R
import com.example.fracturemonitor.ui.components.ApprovalButton
import com.example.fracturemonitor.ui.components.UserTextField

@Composable
fun LoginScreen(modifier: Modifier=Modifier){
    Column(
        modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
        UserTextField(value="Enter your name", onChangeValue ={} , label ="Name" )
        UserTextField(value="Enter your email or contact", onChangeValue ={} , label ="Email or Contact" )
        ApprovalButton(onClick = { /*TODO*/ }, label = "Login")
        Image(painter = painterResource(id = R.drawable.google_removebg_preview), contentDescription = "logo")
    }
}
@Preview
@Composable
fun LoginScreenPreview(modifier: Modifier=Modifier){
LoginScreen()
}