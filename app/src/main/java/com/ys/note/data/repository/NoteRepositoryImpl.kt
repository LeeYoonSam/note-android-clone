package com.ys.note.data.repository

import com.ys.note.data.lcoal.NoteDao
import com.ys.note.data.lcoal.model.Note
import com.ys.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
) : NoteRepository {
    override fun getAllNotes(): Flow<List<Note>> {
        return noteDao.getAllNotes()
    }

    override fun getNoteById(id: Long): Flow<Note> {
        return noteDao.getNoteById(id)
    }

    override suspend fun insert(note: Note) {
        noteDao.insertNote(note)
    }

    override suspend fun update(note: Note) {
        noteDao.update(note)
    }

    override suspend fun delete(id: Long) {
        noteDao.deleteNote(id)
    }

    override fun getBookmarkedNotes(): Flow<List<Note>> {
        return noteDao.getBookmarkedNotes()
    }
}