package com.example.businesscardapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
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
import androidx.compose.ui.unit.dp
import com.example.businesscardapp.R

@Composable
fun ContactInfo() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = dimensionResource(R.dimen.contact_info_bottom_padding)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ContactRow(
            icon = painterResource(R.drawable.call),
            text = stringResource(R.string.phone_number)
        )
        ContactRow(
            icon = painterResource(R.drawable.share),
            text = stringResource(R.string.user_name)
        )
        ContactRow(
            icon = painterResource(R.drawable.mail),
            text = stringResource(R.string.mail)
        )
    }
}

@Composable
private fun ContactRow(
    icon: Painter,
    text: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(0.6f)
            .padding(vertical = dimensionResource(R.dimen.contact_row_padding)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = icon,
            contentDescription = null,
            tint = colorResource(R.color.contact_icon_color),
            modifier = Modifier.size(dimensionResource(R.dimen.icon_size))
        )

        Text(
            text = text,
            modifier = Modifier.padding(start = dimensionResource(R.dimen.contact_row_text_padding))
        )
    }
}