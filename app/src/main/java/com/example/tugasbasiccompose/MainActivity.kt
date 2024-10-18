package com.example.tugasbasiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasbasiccompose.ui.theme.TugasBasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TugasBasicComposeTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Red)
                ) { innerPadding ->
                    BasicColumn(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicColumn(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = modifier
            .fillMaxSize()
            .padding(top = 30.dp)
            .background(Color.Red)
    ) {
        Text(
            "Login",
            fontSize = 100.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(2.dp))
        Text(
            "ini adalah halaman login",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.padding(5.dp))

        Image(
            painter = painterResource(id = R.drawable.logoumy),
            contentDescription = "",
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.padding(2.dp))
        Text(
            "Nama",
            fontSize = 20.sp
        )

        Text(
            "Naufal Ichwan Bayazid",
            fontSize = 20.sp
        )
        Text(
            "20220140192",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.padding(5.dp))
        Image(
            painter = painterResource(id = R.drawable.fotoaye),
            contentDescription = "",
            modifier = Modifier
                .size(500.dp)
                .clip(CircleShape)
                .padding(4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TugasBasicComposeTheme {
        BasicColumn()
    }
}
































