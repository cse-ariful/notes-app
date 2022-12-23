package com.nightcoder.notesapplication

import android.support.test.espresso.intent.Intents
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.nightcoder.notesapplication.features.notes.MainActivity
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import   android.support.test.espresso.intent.Intents.intended
import   android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent
import android.support.test.espresso.intent.rule.IntentsTestRule
import com.nightcoder.notesapplication.features.createNote.NewNoteActivity
import org.junit.After
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class NotesListTest {
   
}