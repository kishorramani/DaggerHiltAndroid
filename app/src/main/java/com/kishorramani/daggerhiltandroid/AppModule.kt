package com.kishorramani.daggerhiltandroid

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("MyAppString1")
    fun provideMyAppString1() = "injected string 1 in AppModule"

    @Singleton
    @Provides
    @Named("MyAppString2")
    fun provideMyAppString2() = "injected string 2 in AppModule"

}