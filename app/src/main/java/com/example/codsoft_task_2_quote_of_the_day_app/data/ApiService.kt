package com.example.codsoft_task_2_quote_of_the_day_app.data

import com.example.codsoft_task_2_quote_of_the_day_app.data.Quote
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("quotes/random")
    suspend fun getDate() : Response<Quote>
}