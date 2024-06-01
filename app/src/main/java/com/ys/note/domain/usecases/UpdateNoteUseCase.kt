package com.ys.note.domain.usecases

import com.ys.note.data.lcoal.model.Note
import com.ys.note.domain.repository.NoteRepository
import javax.inject.Inject

class UpdateNoteUseCase @Inject constructor(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.update(note)
    }
}