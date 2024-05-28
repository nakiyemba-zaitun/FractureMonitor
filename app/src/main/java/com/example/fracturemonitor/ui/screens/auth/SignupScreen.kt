package com.example.fracturemonitor.ui.screens.auth

import androidx.compose.ui.graphics.Color
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
fun SignupScreen(modifier: Modifier=Modifier){
    Column(modifier.fillMaxSize().background(color=MaterialTheme.colorScheme.background), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        UserTextField(value="Enter your name", onChangeValue ={} , label ="Name" )
        UserTextField(value="Enter your email or contact", onChangeValue ={} , label ="Email or Contact" )
        UserTextField(value="Enter your password", onChangeValue ={} , label ="Password" )
        UserTextField(value="Enter your fracture type", onChangeValue ={} , label ="FractureType" )
        UserTextField(value="Enter your caretaker's contact", onChangeValue ={} , label ="Caretaker's Contact" )
        ApprovalButton(onClick = { /*TODO*/ }, label = "Signup", backgroundColor = Color.Blue)
        Image(painter = painterResource(id = R.drawable.google_removebg_preview), contentDescription = "logo")
    }
}
@Preview
@Composable
fun SignupScreenPreview(modifier: Modifier=Modifier){
  SignupScreen()
}
