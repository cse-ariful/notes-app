package com.nightcoder.notesapplication.domain.models

data class NotesModel(
    val title: String,
    val note: String,
    val createdAt: Long,
    val updatedAt: Long
) {
}