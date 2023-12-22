package com.dicoding.gymtoolkit.presentation.profil

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import com.dicoding.gymtoolkit.domain.model.Step
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding1
import com.dicoding.gymtoolkit.presentation.common.Heading2LeftTextComponent
import com.dicoding.gymtoolkit.presentation.common.StepCard
import com.dicoding.gymtoolkit.presentation.details.YoutubePlayer
import com.dicoding.gymtoolkit.presentation.details.components.DetailsTopBar
import com.dicoding.gymtoolkit.ui.theme.GymToolKitTheme
import com.google.accompanist.permissions.ExperimentalPermissionsApi


@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        DetailsTopBar(

            onShareClick = {},
            onBackClick = {}
        )

        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(
                start = MediumPadding1,
                end = MediumPadding1,
                top = MediumPadding1
            )
        ) {
            item {
                // Judul
                Heading2LeftTextComponent("Judul Step")

                // YouTube video with ID
                Column {
                    YoutubePlayer(
                        youtubeVideoId = "CC3ybpzgm2M",
                        lifecycleOwner = LocalLifecycleOwner.current
                    )
                }

                Spacer(modifier = Modifier.height(MediumPadding1))

                StepCard(
                    step = Step(
                        tools_name = "",
                        video_url = "",
                        step_headline = "Regangkann tangan Anda",
                        tools_step = "Regangkanlah tangan anda hingga ke perut Regangkanlah tangan anda hingga ke perut Regangkanlah tangan anda hingga ke perut tangan anda hingga ke perut",
                        image_url = ""
                    )
                )

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
private fun PreviewProfile() {
    GymToolKitTheme {
        ProfileScreen()
    }
}