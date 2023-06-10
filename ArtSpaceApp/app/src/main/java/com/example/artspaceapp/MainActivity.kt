package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}

@Composable
fun ArtImageWithTitle(imageResource: Int,  textResource: String, titleResource: String) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = imageResource), contentDescription = null,
            modifier = Modifier.padding(20.dp)
                .height(325.dp)
                .width(300.dp).shadow(elevation = 4.dp, shape = RectangleShape).padding(20.dp))
        Card(modifier = Modifier.padding(horizontal = 20.dp, vertical = 25.dp)) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = titleResource,
                    fontSize = 30.sp
                )
                Text(
                    text = textResource,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {
    var result by remember {
        mutableStateOf(0)
    }
    when (result) {
        1 -> ArtImageWithTitle(imageResource = R.drawable.parasol, textResource = stringResource(
            id = R.string.date1), titleResource = stringResource(id = R.string.monet1))

        2-> ArtImageWithTitle(imageResource = R.drawable.impression_sunrise, textResource = stringResource(
            id = R.string.date2), titleResource = stringResource(id = R.string.monet2))

        3 -> ArtImageWithTitle(imageResource = R.drawable.the_beach, textResource = stringResource(
            id = R.string.date3), titleResource = stringResource(id = R.string.monet3))

        else -> ArtImageWithTitle(imageResource = R.drawable.garden, textResource = stringResource(
            id = R.string.date4), titleResource = stringResource(id = R.string.monet4))
    }
    Row(horizontalArrangement = Arrangement.spacedBy(0.dp,alignment = Alignment.CenterHorizontally),
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.padding(bottom = 30.dp)) {
        Button(onClick = { result-- },
            modifier = Modifier.padding(start = 50.dp, end = 50.dp)) {
            Text(text = "Previous")
        }
        Button(onClick = { result++ },
            modifier = Modifier.padding(20.dp,0.dp,20.dp,0.dp)) {
            Text(text = "Next")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ArtSpaceAppTheme {
        ArtSpaceApp()
    }
}