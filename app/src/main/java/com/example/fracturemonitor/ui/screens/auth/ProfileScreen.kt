package com.example.fracturemonitor.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import com.example.fracturemonitor.R
import com.example.fracturemonitor.ui.components.ApprovalButton
import com.example.fracturemonitor.ui.components.UserTextField

@Composable
fun EditprofileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Upload your photo")
        Image(painter = painterResource(R.drawable.unsplash_jmurdhtm7ng), contentDescription = "picture")
        Text(text = "Remove")
        ApprovalButton(onClick = {}, label = "Choose photo", backgroundColor = Color.Blue,contentColor = Color.White,
//            borderColor = Color.Black,
            borderWidth = 2f,
            padding = 8f)
        UserTextField(value = "Enter your name", onChangeValue = {}, label = "Name")
        UserTextField(value = "Enter your email or contact", onChangeValue = {}, label = "Email or Contact")
        UserTextField(value = "Enter your fracture type", onChangeValue = {}, label = "FractureType")
        UserTextField(value = "Enter your caretaker's contact", onChangeValue = {}, label = "Caretaker's Contact")
//        ApprovalButton(onClick = {}, label = "Save", backgroundColor = Color.Blue)
//        ApprovalButton(onClick = {}, label = "Edit", backgroundColor = Color.Blue)
//

        ApprovalButton(
            onClick = {},
            label = "Save",
            backgroundColor = Color.Green,
            contentColor = Color.White,
//            borderColor = Color.Black,
            borderWidth = 2f,
            padding = 8f
        )
        ApprovalButton(
            onClick = {},
            label = "Edit",
            backgroundColor = Color.White,
            contentColor = Color.Blue,
            borderColor = Color.Blue,
            borderWidth = 2f,
            padding = 8f
        )
    }
}

@Preview
@Composable
fun EditprofileScreenPreview(modifier: Modifier=Modifier) {
    EditprofileScreen()
}