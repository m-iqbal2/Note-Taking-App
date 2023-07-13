package com.notetakingapp.feature_note.presentation.notes

import com.notetakingapp.feature_note.domain.model.Note
import com.notetakingapp.feature_note.domain.utill.NoteOrder
import com.notetakingapp.feature_note.domain.utill.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
