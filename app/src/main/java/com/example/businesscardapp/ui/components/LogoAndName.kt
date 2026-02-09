package com.example.businesscardapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.businesscardapp.R
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import androidx.compose.ui.unit.sp

@Composable
fun LogoAndName() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .size(dimensionResource(id = R.dimen.logo_size))
                .background(colorResource(id = R.color.logo_background_color))
                .padding(dimensionResource(id = R.dimen.logo_background_padding))
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(R.string.full_name),
            fontSize = dimensionResource(R.dimen.name_text_size).value.sp,
            modifier = Modifier.padding(dimensionResource(id = R.dimen.text_padding))
        )

        Text(
            text = stringResource(R.string.title),
            color = colorResource(R.color.text_color),
            fontWeight = FontWeight.Bold,
            fontSize = dimensionResource(R.dimen.title_text_size).value.sp
        )
    }
}