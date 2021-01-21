package com.kishorramani.daggerhiltandroid

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dagger.hilt.android.scopes.ViewScoped
import javax.inject.Named

class MyViewModel @ViewModelInject constructor(
    @Named("MyActivityString2") myAppString2: String
) : ViewModel() {
    init {
        Log.e("MyViewModel", "Test string from view model - $myAppString2")
    }
}