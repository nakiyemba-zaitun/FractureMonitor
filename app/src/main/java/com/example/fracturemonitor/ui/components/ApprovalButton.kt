package com.example.fracturemonitor.ui.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fracturemonitor.ui.theme.FractureMonitorTheme

@Composable
fun ApprovalButton(
    onClick: () -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colorScheme.primary,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    borderColor: Color = Color.Transparent,
    borderWidth: Float = 0f,
    padding: Float = 8f
) {
    Button(
        onClick = onClick,
        modifier = modifier.padding(padding.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = contentColor
        ),
        border = BorderStroke(borderWidth.dp, borderColor)
    ) {
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
          ApprovalButton(
              onClick = { /*TODO*/ },
              label = "Login",
//              backgroundColor = android.graphics.Color.Blue
          )
          ApprovalButton(
              onClick = { /*TODO*/ },
              label = "Signup",
//              backgroundColor = android.graphics.Color.Blue
          )
          ApprovalButton(
              onClick = { /*TODO*/ },
              label = "Save",
//              backgroundColor = android.graphics.Color.Blue
          )
          ApprovalButton(
              onClick = { /*TODO*/ },
              label = "Cancel",
//              backgroundColor = android.graphics.Color.Blue
          )
          ApprovalButton(
              onClick = { /*TODO*/ },
              label = "Choose photo",
//              backgroundColor = android.graphics.Color.Blue
          )
      }
  }
}

