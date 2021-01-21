package com.kishorramani.daggerhiltandroid

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    @ActivityScoped
    @Provides
    @Named("MyActivityString1")
    fun provideMyActivityString1() = "injected string 1 in MainModule"

    @ActivityScoped
    @Provides
    @Named("MyActivityString2")
    fun provideMyActivityString2(
        @ApplicationContext context: Context,
        @Named("MyAppString2") myAppString2: String
    ) = "${context.getString(R.string.name)} - $myAppString2"

}