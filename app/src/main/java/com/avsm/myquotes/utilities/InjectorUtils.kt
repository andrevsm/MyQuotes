package com.avsm.myquotes.utilities

import com.avsm.myquotes.data.FakeDatabase
import com.avsm.myquotes.data.QuoteRepository
import com.avsm.myquotes.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)

        return QuotesViewModelFactory(quoteRepository)
    }
}