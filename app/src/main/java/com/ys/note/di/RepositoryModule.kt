package com.ys.note.di

import com.ys.note.data.repository.NoteRepositoryImpl
import com.ys.note.domain.repository.NoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindNoteRepository(repositoryImpl: NoteRepositoryImpl): NoteRepository
}