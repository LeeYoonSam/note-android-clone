package com.ys.note.domain.usecases

import com.ys.note.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Long) = repository.delete(id)
}