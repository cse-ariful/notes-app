package com.nightcoder.notesapplication.features.createNote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nightcoder.notesapplication.R

class NewNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_note)
    }
}