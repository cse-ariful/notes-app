package com.nightcoder.notesapplication.features.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nightcoder.notesapplication.R
import com.nightcoder.notesapplication.adapter.NotesListAdapter
import com.nightcoder.notesapplication.databinding.ActivityMainBinding
import com.nightcoder.notesapplication.domain.models.NotesModel
import com.nightcoder.notesapplication.features.createNote.NewNoteActivity

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private val adapter = NotesListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        initView()
    }

    private fun initView() {
        binding.recyclerView.adapter = adapter
        adapter.setItems((0..10).map {
            NotesModel(
                "This is Title",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum",
                1671728499,
                1671728499
            )
        })
        binding.fab.setOnClickListener {
            startActivity(Intent(this, NewNoteActivity::class.java))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}