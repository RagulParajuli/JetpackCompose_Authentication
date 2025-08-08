package com.ragul.authentication

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ragul.authentication.Preview.PreviewLightDark


@Composable
fun HomeScreen(navController: NavController){

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "Welcome to HomeScreen",
            modifier = Modifier
                .align(Alignment.Center),
            color = Color.Blue,
            fontSize = 24.sp
                )
    }
}

@PreviewLightDark
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController = NavController(LocalContext.current))
}