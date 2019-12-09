package de.logerbyte.jacocotest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.VisibleForTesting

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate()
    }

    @VisibleForTesting
    fun calculate() {
// TODO: 2019-11-11  
    }
}
