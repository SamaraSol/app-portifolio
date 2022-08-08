package com.sam.appportifolio

import android.app.Application
import com.sam.appportifolio.data.di.DataModule
import com.sam.appportifolio.domain.di.DomainModule
import com.sam.appportifolio.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}