package com.sugarscat.jump.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.blankj.utilcode.util.StringUtils.getString
import com.sugarscat.jump.R
import com.sugarscat.jump.ui.style.itemPadding
import com.sugarscat.jump.util.throttle

@Composable
fun AuthCard(
    title: String,
    desc: String,
    onAuthClick: () -> Unit,
) {
    Row(
        modifier = Modifier.itemPadding(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            MaterialTheme.typography.bodyLarge
            Text(
                text = title,
                style = MaterialTheme.typography.bodyLarge,
            )
            Text(
                text = desc,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        OutlinedButton(onClick = throttle(fn = onAuthClick)) {
            Text(text = getString(R.string.authorize))
        }
    }
}