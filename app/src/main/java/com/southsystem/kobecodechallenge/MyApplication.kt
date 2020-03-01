package com.southsystem.kobecodechallenge

import android.app.Application
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        setUpKoin()
    }

    private fun setUpKoin() {
        startKoin {
            modules(
                listOf(movieModule)
            )
        }
    }
}