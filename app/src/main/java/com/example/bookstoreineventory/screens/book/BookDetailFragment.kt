package com.example.bookstoreineventory.screens.book

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.bookstoreineventory.R
import com.example.bookstoreineventory.databinding.FragmentBookDetailBinding


class BookDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var binding: FragmentBookDetailBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_book_detail,container,false)
        return binding.root
    }

}