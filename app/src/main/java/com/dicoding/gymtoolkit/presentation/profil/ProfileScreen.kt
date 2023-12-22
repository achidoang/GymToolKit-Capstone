package com.dicoding.gymtoolkit.presentation.profil

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.gymtoolkit.domain.model.Step
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding1
import com.dicoding.gymtoolkit.presentation.common.Heading2LeftTextComponent
import com.dicoding.gymtoolkit.presentation.common.StepCard
import com.dicoding.gymtoolkit.presentation.details.YoutubePlayer
import com.dicoding.gymtoolkit.presentation.details.components.DetailsTopBar
import com.dicoding.gymtoolkit.ui.theme.GymToolKitTheme
import com.google.accompanist.permissions.ExperimentalPermissionsApi



@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun ProfileScreen(userId: String, username: String, email: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(MediumPadding1))

        // User ID
        ProfileItem(icon = Icons.Default.Person, label = "User ID", value = userId)

        // Username
        ProfileItem(icon = Icons.Default.Person, label = "Username", value = username)

        // Email
        ProfileItem(icon = Icons.Default.Mail, label = "Email", value = email)
    }
}

@Composable
fun ProfileItem(icon: ImageVector, label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = label, color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f))
            Text(text = value, fontWeight = FontWeight.Bold)
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewProfile() {
    GymToolKitTheme {
        ProfileScreen(
            userId = "123456",
            username = "john_doe",
            email = "john.doe@example.com"
        )
    }
}