package com.dicoding.gymtoolkit.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.presentation.Dimens
import com.dicoding.gymtoolkit.presentation.Dimens.HighPadding3
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding1
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding2
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding3
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding4
import com.dicoding.gymtoolkit.presentation.common.HeadingTextComponent
import com.dicoding.gymtoolkit.presentation.common.ToolsCard

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
//            .padding(horizontal = MediumPadding2)
    ) {
        Spacer(modifier = Modifier.height(MediumPadding4))
        HeadingTextComponent(value = stringResource(id = R.string.title_home))
        Spacer(modifier = Modifier.height(MediumPadding1))

        // Memanggil HomeContent dengan implementasi navigasi
        HomeContent()
    }
}

@Composable
fun HomeContent(){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(
            start = MediumPadding1,
            end = MediumPadding1,
            bottom = MediumPadding1
        )
    ) {
        items(toolsGym) { dataTools ->
            ToolsCard(dataTools = dataTools)
        }
    }
}
