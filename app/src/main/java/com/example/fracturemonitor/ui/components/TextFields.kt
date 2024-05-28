package com.example.fracturemonitor.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UserTextField(modifier: Modifier=Modifier,value:String,onChangeValue:(String)->Unit,label:String){
    OutlinedTextField(
        value = value,
        onValueChange = onChangeValue,
        placeholder = { Text(text = value)},
        label = { Text(text = label) }
    )
    Spacer(modifier = Modifier.height(10.dp))
}
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun UserTextFieldPreview(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = MaterialTheme.colorScheme.background), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        UserTextField(value="Enter your name", onChangeValue ={} , label ="Name" )
        UserTextField(value="Enter your email or contact", onChangeValue ={} , label ="Email or Contact" )
        UserTextField(value="Enter your password", onChangeValue ={} , label ="Password" )
        UserTextField(value="Enter your fracture type", onChangeValue ={} , label ="FractureType" )
        UserTextField(value="Enter your caretaker's contact", onChangeValue ={} , label ="Caretaker's Contact" )
    }

    }
