package com.example.bookstoreineventory.screens.book

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.bookstoreineventory.Book
import com.example.bookstoreineventory.R
import com.example.bookstoreineventory.databinding.FragmentBookListingBinding

class BookListingFragment : Fragment() {

    private lateinit var bookDetailViewModel: BookDetailViewModel
    private lateinit var binding: FragmentBookListingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_book_listing,container,false)

       // viewModel.books.

        binding.bookDetailFloatingButton.setOnClickListener(){
            it.findNavController().navigate(BookListingFragmentDirections.actionBookListingFragmentToBookDetailFragment())
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bookDetailViewModel = ViewModelProvider(requireActivity())
            .get(BookDetailViewModel::class.java)

        //telling Live Data to observe this Lifecycle Owner
        binding.lifecycleOwner = this

        bookDetailViewModel.books.observe(viewLifecycleOwner, Observer{ books->
            if(books.isNotEmpty()){
                insertBooks(books)
            }
        })

    }

    private fun insertBooks(books: List<Book>){
        context?.let{ context ->
            val bookContainer = binding.parentLayout
            books.forEach(){ book->
            val bookLayout = BookItem(context)
                bookLayout.loadBook(book)
                bookContainer.addView(bookLayout)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu, menu)
    }

    //when menu item is selected, the fragments onOptionItemSelected method will be called
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        //if the NavigationUI doesn't handle the selection, we will call super.onOptionsItemSelected
        //with the menu item to allow the app to directly handle the menu item without navigating
        return NavigationUI.onNavDestinationSelected(item!!, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
}