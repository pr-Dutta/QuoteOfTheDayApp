package com.example.codsoft_task_2_quote_of_the_day_app.data

import kotlinx.serialization.Serializable

@Serializable
data class Quote(
    val id: Int,
    val quote: String?,
    val author: String
)
