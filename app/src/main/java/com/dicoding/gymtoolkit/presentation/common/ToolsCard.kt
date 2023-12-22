package com.dicoding.gymtoolkit.presentation.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.dicoding.gymtoolkit.presentation.Dimens
import com.dicoding.gymtoolkit.presentation.home.DataTools

@Composable
fun ToolsCard(
    modifier: Modifier = Modifier,
    dataTools: DataTools
) {
    Column(
        modifier = Modifier
            .clickable {  } // Menambahkan aksi klik
            .padding(10.dp)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            painter = painterResource(id = dataTools.image),
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(Dimens.MediumPadding1))
        // Judul
        HeadingLeftTextComponent(value = dataTools.title)
        // Deskripsi
        NormalLeftTextComponent(value = dataTools.description)
    }
}

