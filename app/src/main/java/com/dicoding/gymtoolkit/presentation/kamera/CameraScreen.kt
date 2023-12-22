package com.dicoding.gymtoolkit.presentation.kamera

import android.content.Context
import android.content.res.Configuration
import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.FileProvider
import coil.compose.rememberImagePainter
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.presentation.Dimens.ExtraSmallPadding2
import com.dicoding.gymtoolkit.presentation.Dimens.ExtraSmallPadding3
import com.dicoding.gymtoolkit.presentation.Dimens.ExtraSmallPadding4
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding3
import com.dicoding.gymtoolkit.presentation.common.AppButton
import com.dicoding.gymtoolkit.presentation.common.BoxShimmerEffect
import com.dicoding.gymtoolkit.ui.theme.GymToolKitTheme
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Objects

@Composable
fun CameraScreen() {

    val context = LocalContext.current
    val file = context.createImageFile()
    val uri = FileProvider.getUriForFile(
        Objects.requireNonNull(context),
        context.packageName + ".provider", file
    )

    var capturedImageUri by remember {
        mutableStateOf<Uri>(Uri.EMPTY)
    }

    val cameraLauncher =
        rememberLauncherForActivityResult(ActivityResultContracts.TakePicture()) {
            capturedImageUri = uri
        }

    val permissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) {
        if (it) {
            Toast.makeText(context, "Permission Granted", Toast.LENGTH_SHORT).show()
            cameraLauncher.launch(uri)
        } else {
            Toast.makeText(context, "Permission Denied", Toast.LENGTH_SHORT).show()
        }
    }

    Column(
        Modifier
            .fillMaxSize()
            .padding(ExtraSmallPadding3),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {

        // Menampilkan pratinjau ketika sesudah memfoto
        if (capturedImageUri.path?.isNotEmpty() == true) {
            Box(
                modifier = Modifier
                    .size(width = 355.dp, height = 455.dp)
                    .clip(MaterialTheme.shapes.large)
                    .background(colorResource(id = R.color.shimmer))
                    .padding(ExtraSmallPadding4, ExtraSmallPadding2),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    modifier = Modifier,
                    painter = rememberImagePainter(capturedImageUri),
                    contentDescription = null
                )
            }

        } else {
            BoxShimmerEffect(
                onClick = {
                    // Membuka kamera ketika diklik
                    cameraLauncher.launch(uri)
                }
            )
        }
        
        Spacer(modifier = Modifier.height(MediumPadding3))

        // Tombol Foto
        AppButton(
            text = stringResource(id = R.string.capture),
            onclick = { cameraLauncher.launch(uri) },
        )
        Spacer(modifier = Modifier.height(MediumPadding3))


    }
}

fun Context.createImageFile(): File {
    val timestamp = SimpleDateFormat("yyyy_MM_dd_HH:mm:ss").format(Date())
    val imageFileName = "JPEG_" + timestamp + "_"
    val image = File.createTempFile(
        imageFileName,
        ".jpg",
        externalCacheDir
    )
    return image
}


@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun CameraScreenPreview() {
    GymToolKitTheme {
        CameraScreen()
    }
}