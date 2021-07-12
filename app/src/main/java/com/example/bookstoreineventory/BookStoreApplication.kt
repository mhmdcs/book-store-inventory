package com.example.bookstoreineventory

import android.app.Application
import timber.log.Timber

class BookStoreApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())


    }
}