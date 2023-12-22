package com.dicoding.gymtoolkit.presentation.onboarding

import androidx.annotation.DrawableRes
import com.dicoding.gymtoolkit.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

// Data Onboarding
val pages = listOf(
    Page(
        title = "Lorem ipsum is simply dummy",
        description = "Welcome to GymToolKit, the app that will guide you on a deep and inspiring fitness journey; get ready to achieve the healthy and strong body you've always dreamed of",
        image = R.drawable.onboarding4 //image onboarding
    ),
    Page(
        title = "Lorem ipsum is simply dummy",
        description = "In GymToolKit, we provide unlimited access to the best fitness resources, expert training, and a supportive community, making every step of your journey towards health and fitness easier and more meaningful",
        image = R.drawable.onboarding5 //image onboarding
    ),
    Page(
        title = "Lorem ipsum is simply dummy",
        description = "With our innovative features, you can track gym equipment usage, practice with proper techniques, and maintain consistency in your fitness journey. Embrace change, welcome health.",
        image = R.drawable.onboarding6 //image onboarding
    )
)