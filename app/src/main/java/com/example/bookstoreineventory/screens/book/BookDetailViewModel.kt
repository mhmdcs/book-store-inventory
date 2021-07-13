package com.example.bookstoreineventory.screens.book

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bookstoreineventory.Book

class BookDetailViewModel: ViewModel() {

private val _books = MutableLiveData<MutableList<Book>>(mutableListOf())
    val books: LiveData<MutableList<Book>>
    get() = _books

    init{

    }

    fun addBookDetail(detail: Book?){
        detail?.let { book ->
            _books.value?.add(book)
        }
    }

}