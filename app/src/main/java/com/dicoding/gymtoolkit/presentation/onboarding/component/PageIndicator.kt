package com.dicoding.gymtoolkit.presentation.onboarding.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.gymtoolkit.presentation.Dimens.IndicatorSize
import com.dicoding.gymtoolkit.ui.theme.BlueGray
import com.dicoding.gymtoolkit.ui.theme.GymToolKitTheme

@Composable
fun PageIndicator(
    modifier: Modifier = Modifier,
    pageSize: Int,
    selectedPage: Int,
    selectedColor: Color = MaterialTheme.colorScheme.primary,
    unselectedColor: Color = BlueGray

) {
    Row(modifier = modifier, horizontalArrangement = Arrangement.SpaceBetween) {

        // Mengulangi blok kode sebanyak pageSize kali untuk membuat indikator
        // halaman sesuai dengan jumlah halaman yang ditentukan.
        repeat(pageSize) { page ->
            Box(
                modifier = Modifier
                    .size(IndicatorSize)
                    .padding(3.dp)
                    .clip(CircleShape)
                    .background(color = if (page == selectedPage) selectedColor else unselectedColor)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PageIndicatorPreview(){
    GymToolKitTheme {
        PageIndicator(pageSize = 3, selectedPage = 2)
    }
}