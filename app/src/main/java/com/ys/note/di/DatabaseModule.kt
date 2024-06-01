package com.ys.note.di

import android.content.Context
import androidx.room.Room
import com.ys.note.data.lcoal.NoteDao
import com.ys.note.data.lcoal.NoteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideNoteDao(database: NoteDatabase): NoteDao =
        database.noteDao

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): NoteDatabase = Room.databaseBuilder(
        context = context,
        klass = NoteDatabase::class.java,
        name = "notes_db"
    ).build()
}