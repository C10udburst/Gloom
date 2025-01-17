package com.materiapps.gloom.di.modules

import com.materiapps.gloom.domain.manager.AuthManager
import com.materiapps.gloom.domain.manager.PreferenceManager
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

fun managerModule() = module {

    singleOf(::PreferenceManager)

    singleOf(::AuthManager)

}