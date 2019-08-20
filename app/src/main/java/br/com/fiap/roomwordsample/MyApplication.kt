package br.com.fiap.roomwordsample

import android.app.Application
import br.com.fiap.roomwordsample.di.dbModule
import br.com.fiap.roomwordsample.di.repositoryModule
import br.com.fiap.roomwordsample.di.uiModule
import br.com.fiap.roomwordsample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate(){
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            modules(
                listOf(
                    viewModelModule,
                    uiModule,
                    dbModule,
                    repositoryModule
                )
            )
        }
    }
}