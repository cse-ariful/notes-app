package com.nightcoder.notesapplication.features.notes

import android.support.test.espresso.intent.Intents
import android.support.test.espresso.intent.Intents.intended
import android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent
import android.support.test.espresso.intent.rule.IntentsTestRule
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.nightcoder.notesapplication.R
import com.nightcoder.notesapplication.features.createNote.NewNoteActivity
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    lateinit var scenario: ActivityScenario<MainActivity>
    @Rule
    lateinit var mainActivityRule: IntentsTestRule<MainActivity>
    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
        mainActivityRule = IntentsTestRule<MainActivity>(MainActivity::class.java)
        Intents.init()
    }

    @Test
    fun testFabButton() {
        onView(withId(R.id.fab)).perform(click())
        intended(hasComponent(NewNoteActivity::class.java.name))
    }
    @After
    fun release(){
//        Intents.release()
    }
}