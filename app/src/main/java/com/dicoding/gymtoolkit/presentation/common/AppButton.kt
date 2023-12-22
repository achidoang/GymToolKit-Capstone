package com.dicoding.gymtoolkit.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.dicoding.gymtoolkit.presentation.Dimens.FontSmall2
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding1
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding4
import com.dicoding.gymtoolkit.ui.theme.WhiteGray

@Composable
fun AppButton(
    text: String,
    onclick: () -> Unit
) {

    Button(
        onClick = onclick, colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.White
        ),
        shape = CircleShape
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold)
        )

    }
}

@Composable
fun AppTextButton(
    text: String,
    enabled: Boolean = true,
    onclick: () -> Unit

) {
    TextButton(
        onClick = { if (enabled) onclick() }, // Hanya panggil onclick jika enabled=true
        enabled = enabled // Set enabled untuk TextButton
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
            color = WhiteGray
        )
    }
}

@Composable
fun ButtonComponent(value: String) {
    Spacer(modifier = Modifier.height(MediumPadding1))
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(MediumPadding4),
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(Color.Transparent)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(MediumPadding4)
                .background(
                    MaterialTheme.colorScheme.primary,
                    shape = CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = value,
                fontSize = FontSmall2,
                style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
                color = Color.White,
            )
        }

    }
    Spacer(modifier = Modifier.height(MediumPadding1))

}