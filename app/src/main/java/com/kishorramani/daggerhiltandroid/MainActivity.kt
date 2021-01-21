package com.kishorramani.daggerhiltandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    @Inject
    @Named("MyAppString1")
    lateinit var testString: String

    @Inject
    @Named("MyActivityString1")
    lateinit var testString1: String

    @Inject
    @Named("MyActivityString2")
    lateinit var testString2: String

    private val viewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(TAG, "testString: $testString")
        Log.e(TAG, "testString1: $testString1")
        Log.e(TAG, "testString2: $testString2")

        viewModel
    }
}