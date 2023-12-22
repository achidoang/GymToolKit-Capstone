package com.dicoding.gymtoolkit.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.domain.model.Step
import com.dicoding.gymtoolkit.presentation.Dimens
import com.dicoding.gymtoolkit.presentation.Dimens.ArticleCardSize
import com.dicoding.gymtoolkit.presentation.Dimens.ExtraSmallPadding
import com.dicoding.gymtoolkit.presentation.Dimens.StepCardSize
import com.dicoding.gymtoolkit.ui.theme.GymToolKitTheme

@Composable
fun StepCard(
    modifier: Modifier = Modifier,
    step: Step,
) {
    val context = LocalContext.current

    Row(
        modifier = modifier
            .background(color = colorResource(id = R.color.shimmer)) // Ganti dengan warna yang diinginkan
            .graphicsLayer(
                shadowElevation = 1f, // Atur ketinggian bayangan sesuai kebutuhan
                clip = false
            )
            .clip(RoundedCornerShape(16.dp))
    ) {
        NumberTextComponent("1")

        Column(
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .padding(horizontal = ExtraSmallPadding)
                .height(StepCardSize)
        ) {
            HeadingLeftTextComponent(step.step_headline)
            NormalLeftTextComponent(step.tools_step)
        }
    }
}




@Preview(showBackground = true)
@Composable
fun StepCardPreview() {
    GymToolKitTheme {
        StepCard(
            step = Step(
                tools_name = "",
                video_url = "",
                step_headline = "Regangkann tangan Anda",
                tools_step = "Regangkanlah tangan anda hingga ke perut",
                image_url = ""
            )
        )
    }
}