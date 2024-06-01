package com.ys.note.domain.repository

import com.ys.note.data.lcoal.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    fun getAllNotes(): Flow<List<Note>>
    fun getNoteById(id: Long): Flow<Note>
    suspend fun insert(note: Note)
    suspend fun update(note: Note)
    suspend fun delete(id: Long)
    fun getBookmarkedNotes(): Flow<List<Note>>
}