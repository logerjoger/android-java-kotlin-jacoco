package de.logerbyte.jacocotest

import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ActivityTest {

    @Test
    fun isActivityLoaded() {
        Robolectric.setupActivity(MainActivity::class.java).apply {
            assertEquals(helloWorld.text,"Hello World!")
        }
    }
}