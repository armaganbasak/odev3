package com.example.odev3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.odev3.ui.theme.Odev3Theme
import com.example.odev3.ui.theme.mainColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
         Odev3Theme {
             Anasayfa()
         }
        }
    }
}

@Composable
fun Anasayfa() {
    // Dark mode kontrolü
    val isDarkTheme = isSystemInDarkTheme()


    val backgroundColor = if (isDarkTheme) Color.Black else Color.White
    val textColor = if (isDarkTheme) Color.White else Color.Black
    val buttonColor = if (isDarkTheme) Color.Gray else mainColor
    val buttonTextColor = if (isDarkTheme) Color.White else Color.Black


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(start = 50.dp, top = 100.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier.size(100.dp)
        )
        Text(
            text = stringResource(id = R.string.anasayfabaslik1),
            color = textColor, // Tema durumuna göre yazı rengi
            fontWeight = FontWeight.W900,
            fontSize = 50.sp,
            modifier = Modifier.padding(start = 10.dp)
        )
        Text(
            text = stringResource(id = R.string.anasayfabaslik2),
            color = mainColor,
            fontWeight = FontWeight.W900,
            fontSize = 50.sp,
            modifier = Modifier.padding(start = 10.dp)
        )
        Spacer(modifier = Modifier.padding(top = 20.dp))
        Text(
            text = stringResource(id = R.string.content),
            color = textColor,
            fontWeight = FontWeight.W400,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 10.dp)
        )
        Spacer(modifier = Modifier.padding(top = 100.dp))

        Image(
            painter = painterResource(id = R.drawable.icon),
            contentDescription = "icon",
            modifier = Modifier.padding(start = 130.dp).size(30.dp)
        )

        Text(
            text = stringResource(id = R.string.content2),
            color = textColor,
            fontWeight = FontWeight.W300,
            fontSize = 10.sp,
            modifier = Modifier.padding(start = 10.dp)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(start = 20.dp, top = 10.dp)
                .fillMaxWidth(0.8f)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = buttonColor,
                contentColor = buttonTextColor
            )
        ) {
            Text(
                text = "Continue",
                fontSize = 16.sp,
                modifier = Modifier.padding(horizontal = 16.dp),
            )
        }
    }
}




@Preview(showBackground = true, locale = "tr")
@Composable
fun GreetingPreview() {
    Odev3Theme {

    }
}