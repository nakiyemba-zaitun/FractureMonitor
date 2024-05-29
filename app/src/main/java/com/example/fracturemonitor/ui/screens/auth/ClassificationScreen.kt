package com.example.fracturemonitor.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.fracturemonitor.R
import org.w3c.dom.Text
import java.lang.reflect.Modifier
import androidx.compose.ui.tooling.preview.Preview as ComposeUiToolingPreviewPreview

@Composable
fun ClassificationScreen(){
    Column(verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally){
         Row(horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.Top) {
Column {
    Image(painter = painterResource(R.drawable.images_1), contentDescription = "picture")
}
             Column(verticalArrangement = Arrangement.Top) {
                 Text(text = "Tibia and Fibia")
             }
             Row(horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.Bottom) {
                 Column {
                     Text(text = "Recommended Exercises")
                 }
                 Column {
                     Text(text = "More")
                 }
         }
        Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.Top) {
            Column {
                Image(painter = painterResource(R.drawable._992036_1), contentDescription = "picture")
            }
            Column(verticalArrangement = Arrangement.Top) {
                Text(text = "Tibia and Fibia")
            }
        }
    }


}

@Preview
@Composable
        fun ClassificationScreenPreview(){
ClassificationScreen()

}        }
