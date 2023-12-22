package com.dicoding.gymtoolkit.presentation.nvgraph

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.dicoding.gymtoolkit.presentation.authentication.login.LoginScreen
import com.dicoding.gymtoolkit.presentation.navigation.Navigator
import com.dicoding.gymtoolkit.presentation.onboarding.OnBoardingScreen
import com.dicoding.gymtoolkit.presentation.onboarding.OnBoardingViewModel

@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ){
            composable(
                route = Route.OnBoardingScreen.route
            ){
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )
            }
        }

//        navigation(
//            route = Route.GymNavigation.route,
//            startDestination = Route.LoginScreen.route
//        ) {
//            composable(
//                route = Route.LoginScreen.route
//            ) {
//                LoginScreen()
//            }
//        }

        navigation(
            route = Route.GymNavigation.route,
            startDestination = Route.GymNavigatorScreen.route
        ){
            composable(route = Route.GymNavigatorScreen.route){
                Navigator()
            }
        }
    }
}