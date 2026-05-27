package org.bitetheapple.canigetanapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var currentImage by remember {
                mutableStateOf(R.drawable.app)
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFC8F7C5)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Image(
                    painter = painterResource(id = currentImage),
                    contentDescription = null,
                    modifier = Modifier.size(500.dp)
                )

                Spacer(modifier = Modifier.height(48.dp))

                Row {

                    Button(
                        onClick = {
                            currentImage = R.drawable.appyes
                        },
                        modifier = Modifier.height(100.dp)
                    ) {
                        Text(
                            text = "Yes",
                            fontSize = 32.sp
                        )
                    }

                    Spacer(modifier = Modifier.width(40.dp))

                    Button(
                        onClick = {
                            currentImage = R.drawable.appno
                        },
                        modifier = Modifier.height(100.dp)
                    ) {
                        Text(
                            text = "No",
                            fontSize = 32.sp
                        )
                    }
                }

                Spacer(modifier = Modifier.height(80.dp))

                Text(
                    text = "bitetheapple",
                    fontSize = 36.sp
                )
            }
        }
    }
}