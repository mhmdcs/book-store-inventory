package com.example.bookstoreineventory.screens.shoeListing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.bookstoreineventory.R
import com.example.bookstoreineventory.databinding.FragmentShoeListingBinding

class ShoeListingFragment : Fragment() {

    private lateinit var binding: FragmentShoeListingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_listing,container,false)

        return binding.root
    }
}