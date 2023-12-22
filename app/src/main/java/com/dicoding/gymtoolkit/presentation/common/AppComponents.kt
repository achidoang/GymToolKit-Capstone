package com.dicoding.gymtoolkit.presentation.common

import android.util.Log
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.presentation.Dimens.ExtraSmallPadding2
import com.dicoding.gymtoolkit.presentation.Dimens.ExtraSmallPadding4
import com.dicoding.gymtoolkit.presentation.Dimens.FontSize1
import com.dicoding.gymtoolkit.presentation.Dimens.FontSize2
import com.dicoding.gymtoolkit.presentation.Dimens.FontSmall1
import com.dicoding.gymtoolkit.presentation.Dimens.FontSmall2
import com.dicoding.gymtoolkit.presentation.Dimens.Ketebalan1
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding1
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding2
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding3
import com.dicoding.gymtoolkit.ui.theme.BlueGray
import com.dicoding.gymtoolkit.ui.theme.componentShapes

@Composable
fun NormalTextComponent(value: String) {
    Spacer(modifier = Modifier.height(MediumPadding2))
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = MediumPadding3),
        style = TextStyle(
            fontSize = FontSize1,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.text_title),
        textAlign = TextAlign.Center
    )
}

@Composable
fun OnboardinglTextComponent(value: String) {
    Spacer(modifier = Modifier.height(MediumPadding2))
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = MediumPadding1)
            .heightIn(min = MediumPadding3),
        style = TextStyle(
            fontSize = FontSmall2,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.text_title),
        textAlign = TextAlign.Justify
    )
}

@Composable
fun NormalLeftTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = MediumPadding3)
            .padding(start = ExtraSmallPadding2),
        style = TextStyle(
            fontSize = FontSmall1,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.text_medium),
        textAlign = TextAlign.Left,
        maxLines = 3,
        overflow = TextOverflow.Ellipsis
    )
}


@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = FontSize2,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.text_title),
        textAlign = TextAlign.Center
    )
}

@Composable
fun HeadingLeftTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn()
            .padding(start = ExtraSmallPadding2),
        style = TextStyle(
            fontSize = FontSmall2,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.text_title),
        textAlign = TextAlign.Left
    )
}

@Composable
fun Heading2LeftTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn()
            .padding(start = ExtraSmallPadding4),
        style = TextStyle(
            fontSize = FontSize2,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.text_title),
        textAlign = TextAlign.Left
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFieldComponent(labelValue: String, painterResource: Painter) {

    val textValue = remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(componentShapes.medium),
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = colorResource(id = R.color.text_medium),
            focusedLabelColor = colorResource(id = R.color.placeholder),
            cursorColor = colorResource(id = R.color.placeholder),


            ),
        keyboardOptions = KeyboardOptions.Default,
        value = textValue.value,
        onValueChange = {
            textValue.value = it
        },
        leadingIcon = {
            Icon(
                painter = painterResource,
                contentDescription = ""
            )
        }
    )
    Spacer(modifier = Modifier.height(ExtraSmallPadding2))
}

@Composable
fun NumberTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .heightIn()
            .padding(start = ExtraSmallPadding2),
        style = TextStyle(
            fontSize = FontSize2,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.text_title),
        textAlign = TextAlign.Left
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextFieldComponent(labelValue: String, painterResource: Painter) {

    val password = remember {
        mutableStateOf("")
    }

    val passwordVisible = remember {
        mutableStateOf(false)
    }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(componentShapes.medium),
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = colorResource(id = R.color.text_medium),
            focusedLabelColor = colorResource(id = R.color.placeholder),
            cursorColor = colorResource(id = R.color.placeholder),


            ),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        value = password.value,
        onValueChange = {
            password.value = it
        },
        leadingIcon = {
            Icon(
                painter = painterResource,
                contentDescription = ""
            )
        },
        trailingIcon = {

            val iconImage = if (passwordVisible.value) {
                Icons.Filled.Visibility
            } else {
                Icons.Filled.VisibilityOff
            }

            var description = if (passwordVisible.value) {
                stringResource(id = R.string.hide_password)
            } else {
                stringResource(id = R.string.show_password)
            }
            IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                Icon(imageVector = iconImage, contentDescription = description)
            }
        },
        visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation()
    )
    Spacer(modifier = Modifier.height(ExtraSmallPadding2))

}

@Composable
fun DividerTextComponent() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            color = BlueGray,
            thickness = Ketebalan1
        )

        Text(
            modifier = Modifier.padding(ExtraSmallPadding2),
            text = stringResource(id = R.string.or),
            color = colorResource(id = R.color.text_title),
            fontSize = FontSmall2
        )
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            color = BlueGray,
            thickness = Ketebalan1
        )


    }
}

@Composable
fun ClickableTextComponent(tryingToLogin:Boolean = true, onTextSelected: (String) -> Unit) {
    val initialText = if (tryingToLogin)"Already have an account? " else "Don't have an account yet? "
    val loginText = if (tryingToLogin) "Sign In" else "Sign Up"

    val annotatedString = buildAnnotatedString {
        withStyle(style = SpanStyle(color = colorResource(id = R.color.text_title))) {
            append(initialText)
        }
        withStyle(style = SpanStyle(color = MaterialTheme.colorScheme.primary)) {
            pushStringAnnotation(tag = loginText, annotation = loginText)
            append(loginText)
        }
    }

    ClickableText(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = MediumPadding3),
        style = TextStyle(
            fontSize = FontSmall2,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center
        ),
        text = annotatedString, onClick = { offset ->

            annotatedString.getStringAnnotations(offset, offset)
                .firstOrNull()?.also { span ->
                    Log.d("ClickableTextComponent", "{${span.item}}")

                    if (span.item == loginText) {
                        onTextSelected(span.item)
                    }
                }
        })
}

@Composable
fun UnderLinedTextComponent(value: String) {
    Spacer(modifier = Modifier.heightIn(MediumPadding2))
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = MediumPadding3),
        style = TextStyle(
            fontSize = FontSmall1,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.text_medium),
        textAlign = TextAlign.Center,
        textDecoration = TextDecoration.Underline
    )
}
