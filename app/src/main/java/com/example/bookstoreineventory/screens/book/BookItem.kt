package com.example.bookstoreineventory.screens.book

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout

import androidx.databinding.DataBindingUtil
import com.example.bookstoreineventory.Book
import com.example.bookstoreineventory.R
import com.example.bookstoreineventory.databinding.ItemBookBinding
import kotlinx.android.synthetic.main.item_book.view.*

class BookItem: LinearLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    val binding: ItemBookBinding = DataBindingUtil.inflate(
        LayoutInflater.from(context), R.layout.item_book, this, false)

    fun loadBook(book: Book) {
        binding.apply {
            addView(this.root)
            binding.bookName.text = book.bookName
            binding.bookDescription.text = book.bookDescription
            binding.bookAuthor.text = book.bookAuthor
            binding.bookPrice.text = book.bookPrice
        }
    }
}