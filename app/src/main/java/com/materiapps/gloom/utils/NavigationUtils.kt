package com.materiapps.gloom.utils

import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import com.materiapps.gloom.ui.screens.explore.ExploreScreen
import com.materiapps.gloom.ui.screens.home.HomeScreen
import com.materiapps.gloom.ui.screens.notifications.NotificationsScreen
import com.materiapps.gloom.ui.screens.profile.ProfileTab

enum class RootTab(val tab: Tab) {
    HOME(HomeScreen()),
    EXPLORE(ExploreScreen()),
    NOTIFICATIONS(NotificationsScreen()),
    PROFILE(ProfileTab())
}

tailrec fun Navigator.navigate(screen: Screen) {
    return if (parent == null && items.firstOrNull { it.key == screen.key } == null) try {
        push(screen)
    } catch (_: Throwable) {
    }
    else parent!!.navigate(screen)
}