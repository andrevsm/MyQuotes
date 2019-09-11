package com.avsm.myquotes.ui.quotes

import androidx.lifecycle.ViewModel
import com.avsm.myquotes.data.Quote
import com.avsm.myquotes.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}