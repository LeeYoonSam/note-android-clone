package com.ys.note.data.lcoal

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ys.note.data.lcoal.converters.DateConverter
import com.ys.note.data.lcoal.model.Note

@TypeConverters(value = [DateConverter::class])
@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDatabase: RoomDatabase() {
    abstract val noteDao: NoteDao
}