package com.dicoding.gymtoolkit.presentation.kamera

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding1
import com.dicoding.gymtoolkit.presentation.common.NormalTextComponent
import com.dicoding.gymtoolkit.presentation.common.AppButton

@Composable
fun NoPermissionScreen(
    onRequestPermission: () -> Unit
) {

    NoPermissionContent(
        onRequestPermission = onRequestPermission
    )
}

@Composable
private fun NoPermissionContent(
    onRequestPermission: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        NormalTextComponent(value = stringResource(id = R.string.permission))
        Spacer(modifier = Modifier.height(MediumPadding1))
        AppButton(
            text = stringResource(id = R.string.grant_permission),
            onclick = onRequestPermission,
        )


    }
}

@Preview(showBackground = true)
@Composable
private fun NoPermissionContentPreview() {
    NoPermissionContent(
        onRequestPermission = {}
    )
}