package com.ys.note.domain.usecases

import com.ys.note.domain.repository.NoteRepository
import javax.inject.Inject

class GetNoteByIdUseCase @Inject constructor(
    private val repository: NoteRepository
) {
    operator fun invoke(id: Long) = repository.getNoteById(id)
}