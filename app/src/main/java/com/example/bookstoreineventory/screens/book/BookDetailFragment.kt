package com.example.bookstoreineventory.screens.book

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.bookstoreineventory.Book
import com.example.bookstoreineventory.R
import com.example.bookstoreineventory.databinding.FragmentBookDetailBinding


class BookDetailFragment : Fragment() {

    private lateinit var bookDetailViewModel: BookDetailViewModel
    private lateinit var binding: FragmentBookDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

         binding = DataBindingUtil.inflate(inflater,R.layout.fragment_book_detail,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bookDetailViewModel = ViewModelProvider(requireActivity())
            .get(BookDetailViewModel::class.java)

        //telling Live Data to observe this Lifecycle Owner
        binding.lifecycleOwner = this

        binding.book = Book("Book Name", "Book Description","Book Author","Book Price")

        binding.addBookButton.setOnClickListener(){

            val book = binding.book
            bookDetailViewModel.addBookDetail(book)

            view?.findNavController()?.navigate(BookDetailFragmentDirections.actionBookDetailFragmentToBookListingFragment())
        }

        binding.cancelBookButton.setOnClickListener(){
            view?.findNavController()?.navigate(BookDetailFragmentDirections.actionBookDetailFragmentToBookListingFragment())
        }

    }
}