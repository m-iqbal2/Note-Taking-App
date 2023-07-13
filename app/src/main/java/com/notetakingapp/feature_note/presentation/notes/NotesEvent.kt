package com.notetakingapp.feature_note.presentation.notes

import com.notetakingapp.feature_note.domain.model.Note
import com.notetakingapp.feature_note.domain.utill.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
