package com.example.businesscardapp.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import com.example.businesscardapp.R
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

@Composable
fun BusinessCardApp() {
    BusinessCardAppTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.background))
                .padding(dimensionResource(id = R.dimen.content_padding)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val orientation = LocalConfiguration.current.orientation
            val isLandscape = orientation == Configuration.ORIENTATION_LANDSCAPE

            if (isLandscape) {
                BusinessCardLandscape()
            } else {
                BusinessCardPortrait()
            }
        }
    }
}

@Composable
private fun BusinessCardPortrait() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            LogoAndName()
        }
        ContactInfo()
    }
}

@Composable
private fun BusinessCardLandscape() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(0.6f),
            contentAlignment = Alignment.Center
        ) {
            LogoAndName()
        }
        ContactInfo()
    }
}