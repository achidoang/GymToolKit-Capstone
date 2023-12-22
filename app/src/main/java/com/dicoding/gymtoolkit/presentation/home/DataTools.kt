package com.dicoding.gymtoolkit.presentation.home

import androidx.annotation.DrawableRes
import com.dicoding.gymtoolkit.R

data class DataTools(
    val id: Int,
    @DrawableRes val image: Int,
    val title: String,
    val description: String
)

// Data Tools
val toolsGym = listOf(
    DataTools(
        id = 1,
        image = R.drawable.tools1, //image onboarding
        title = "Barbell",
        description = "Lorem ipsum is simply dummy text of"
    ),
    DataTools(
        id = 2,
        image = R.drawable.tools1, //image onboarding
        title = "Bench-Press",
        description = "Lorem ipsum is simply dummy text of"
    ),
    DataTools(
        id = 3,
        image = R.drawable.tools1, //image onboarding
        title = "Dip-Bar",
        description = "Lorem ipsum is simply dummy text of"
    ),
    DataTools(
        id = 4,
        image = R.drawable.tools1, //image onboarding
        title = "Dumbbell",
        description = "Lorem ipsum is simply dummy text of"
    ),
    DataTools(
        id = 5,
        image = R.drawable.tools1, //image onboarding
        title = "Elliptical-Machine",
        description = "Lorem ipsum is simply dummy text of"
    ),
    DataTools(
        id = 6,
        image = R.drawable.tools1, //image onboarding
        title = "Easy-Curl-Bar",
        description = "Lorem ipsum is simply dummy text of"
    ),
    DataTools(
        id = 7,
        image = R.drawable.tools1, //image onboarding
        title = "Leg Press Machine",
        description = "Lorem ipsum is simply dummy text of"
    ),
    DataTools(
        id = 8,
        image = R.drawable.tools1, //image onboarding
        title = "Roller Abs",
        description = "Lorem ipsum is simply dummy text of"
    ),
    DataTools(
        id = 9,
        image = R.drawable.tools1, //image onboarding
        title = "Seated Cable Row",
        description = "Lorem ipsum is simply dummy text of"
    ),
    DataTools(
        id = 10,
        image = R.drawable.tools1, //image onboarding
        title = "Stationary Bike",
        description = "Lorem ipsum is simply dummy text of"
    ),
    DataTools(
        id = 11,
        image = R.drawable.tools1, //image onboarding
        title = "Treadmill",
        description = "Lorem ipsum is simply dummy text of"
    ),
)