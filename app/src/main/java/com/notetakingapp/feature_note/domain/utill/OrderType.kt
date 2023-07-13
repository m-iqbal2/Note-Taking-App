package com.notetakingapp.feature_note.domain.utill

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
