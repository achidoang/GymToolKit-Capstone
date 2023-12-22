package com.dicoding.gymtoolkit.presentation.onboarding.component

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.presentation.Dimens.HighPadding3
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding1
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding2
import com.dicoding.gymtoolkit.presentation.Dimens.highOnboarding
import com.dicoding.gymtoolkit.presentation.common.HeadingLeftTextComponent
import com.dicoding.gymtoolkit.presentation.common.HeadingTextComponent
import com.dicoding.gymtoolkit.presentation.common.NormalLeftTextComponent
import com.dicoding.gymtoolkit.presentation.common.NormalTextComponent
import com.dicoding.gymtoolkit.presentation.common.OnboardinglTextComponent
import com.dicoding.gymtoolkit.presentation.onboarding.Page
import com.dicoding.gymtoolkit.presentation.onboarding.pages
import com.dicoding.gymtoolkit.ui.theme.GymToolKitTheme


@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(
        modifier = modifier
            .height(highOnboarding)  // Tinggi 400.dp
    ) {
        // Image onboarding
        Image(
            modifier = Modifier
                .padding(top = HighPadding3)
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(MediumPadding1))

        // Judul
        // HeadingTextComponent(value = page.title)
        // Deskripsi
        OnboardinglTextComponent(value = page.description)
    }
}


@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun OnBoardingPagePreview() {
    GymToolKitTheme {
        OnBoardingPage(
            page = pages[1]
        )
    }
}