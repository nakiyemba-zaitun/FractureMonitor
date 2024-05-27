package com.example.fracturemonitor.ui.components

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fracturemonitor.ui.theme.FractureMonitorTheme

@Composable
fun ApprovalButton(modifier: Modifier=Modifier,onClick: ()->Unit,label: String){
    Button(onClick = { onClick()}) {
        Text(text =label, )
        
    }
}
@Preview
@Preview(uiMode =UI_MODE_NIGHT_YES)
@Composable
fun ApprovalButtonPreview(){
  FractureMonitorTheme {
      Column(modifier =  Modifier.fillMaxSize().background(color=MaterialTheme.colorScheme.background), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
      ) {
          ApprovalButton(onClick = { /*TODO*/ }, label = "Login")
          ApprovalButton(onClick = { /*TODO*/ }, label = "Signup")
          ApprovalButton(onClick = { /*TODO*/ }, label = "Save")
      }
  }
}

