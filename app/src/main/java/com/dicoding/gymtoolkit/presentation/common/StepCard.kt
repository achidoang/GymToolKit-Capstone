package com.dicoding.gymtoolkit.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
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
import com.dicoding.gymtoolkit.presentation.Dimens.ExtraSmallPadding3
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
            .fillMaxWidth()
//            .background(color = colorResource(id = R.color.shimmer)) // Ganti dengan warna yang diinginkan
            .heightIn(min = 110.dp)
            .padding(ExtraSmallPadding)
            .clip(RoundedCornerShape(16.dp))
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(16.dp)
            )
            .border(
                1.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(16.dp)
            ) // Tambahkan border di sini
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(start = Dimens.ExtraSmallPadding2)

        ) {
            NumberTextComponent(step.number_tools)

        }

        Spacer(modifier = Modifier.width(ExtraSmallPadding3))

        Column(
            verticalArrangement = Arrangement.spacedBy(ExtraSmallPadding3),
            modifier = Modifier
                .weight(1f)
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
                number_tools = "1",
                step_headline = "Regangkann tangan Anda",
                tools_step = "Regangkanlah tangan anda hingga ke perut Regangkanlah tangan anda hingga ke perut Regangkanlah tangan anda hingga ke perut tangan anda hingga ke perut",
                image_url = ""
            )
        )
    }
}