package com.ragul.authentication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ragul.authentication.Authentication.LoginScreen
import com.ragul.authentication.Authentication.SignupScreen
import com.ragul.authentication.ui.theme.AuthenticationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = Router.Signup) {
                composable(Router.Signup) {
                    SignupScreen(navController)
                }
                composable(Router.Login) {
                    LoginScreen(navController)
                }
                composable(Router.Login) {
                    LoginScreen(navController)
                }
                composable(Router.Home) {
                    HomeScreen(navController)
                }
            }
        }
    }
}
