package com.ys.note.domain.usecases

import com.ys.note.data.lcoal.model.Note
import com.ys.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(
    private val repository: NoteRepository
) {
    operator fun invoke(): Flow<List<Note>> = repository.getAllNotes()
}