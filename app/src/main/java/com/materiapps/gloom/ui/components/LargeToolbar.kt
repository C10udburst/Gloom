package com.materiapps.gloom.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun LargeToolbar(
    title: String,
    actions: @Composable RowScope.() -> Unit = {},
    scrollBehavior: TopAppBarScrollBehavior? = null
) {
    LargeTopAppBar(
        title = { Text(text = title) },
        navigationIcon = { BackButton() },
        actions = actions,
        scrollBehavior = scrollBehavior
    )
}