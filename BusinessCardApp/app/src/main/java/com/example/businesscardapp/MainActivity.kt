package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard(name = "Intisar Osman",
                        title = "Mobile Developer",
                        phone = "206-123-4567",
                        email = "intisaro@email.com",
                        linkedIn = "IntisarOMB")
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, title: String, phone: String, email: String, linkedIn: String,
                 modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 5.dp, vertical = 5.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            val logo = painterResource(id = R.drawable.android_logo)
            Image(
                painter = logo,
                contentDescription = null,
                modifier = Modifier
                    .padding(horizontal = 5.dp, vertical = 5.dp)
                    .size(200.dp)
                )
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 5.dp, vertical = 5.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = name,
                fontSize = 35.sp,
                textAlign = TextAlign.Center
            )
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 5.dp, vertical = 5.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 75.dp)
                .padding(start = 115.dp)
                .padding(vertical = 2.dp),
        ) {
            val phoneIcon = painterResource(id = R.drawable.phone_icon)
            Image(
                painter = phoneIcon,
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(25.dp)
            )
            Text(
                text = phone,
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 115.dp)
                .padding(vertical = 2.dp)
        ) {
            val emailIcon = painterResource(id = R.drawable.email_icon)
            Image(
                painter = emailIcon,
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(25.dp)
            )
            Text(
                text = email,
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 115.dp)
                .padding(vertical = 2.dp),
        ) {
            val linkedInIcon = painterResource(id = R.drawable.linkedin_icon)
            Image(
                painter = linkedInIcon,
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(25.dp)
            )
            Text(
                text = linkedIn,
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardAppTheme {
        BusinessCard(name = "Intisar Osman",
            title = "Mobile Developer",
            phone = "206-123-4567",
            email = "intisaro@email.com",
            linkedIn = "IntisarOMB")
    }
}