package com.dicoding.gymtoolkit.presentation.authentication.login

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.presentation.Dimens
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding2
import com.dicoding.gymtoolkit.presentation.common.ClickableTextComponent
import com.dicoding.gymtoolkit.presentation.common.DividerTextComponent
import com.dicoding.gymtoolkit.presentation.common.HeadingTextComponent
import com.dicoding.gymtoolkit.presentation.common.MyTextFieldComponent
import com.dicoding.gymtoolkit.presentation.common.NormalTextComponent
import com.dicoding.gymtoolkit.presentation.common.PasswordTextFieldComponent
import com.dicoding.gymtoolkit.presentation.common.UnderLinedTextComponent
import com.dicoding.gymtoolkit.presentation.common.ButtonComponent

@Composable
fun LoginScreen() {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(MediumPadding2)

    ) {
        Column(modifier = Modifier.fillMaxSize()) {

            NormalTextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))
            Spacer(modifier = Modifier.height(Dimens.MediumPadding1))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.username),
                painterResource(id = R.drawable.ic_profil)
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.ic_lock)
            )
            UnderLinedTextComponent(value = stringResource(id = R.string.forgot_password))
            ButtonComponent(value = stringResource(id = R.string.login))
            DividerTextComponent()

            ClickableTextComponent(tryingToLogin = false,onTextSelected = {

            })
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}

