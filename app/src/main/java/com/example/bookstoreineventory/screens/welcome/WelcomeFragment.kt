package com.example.bookstoreineventory.screens.welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.bookstoreineventory.R
import com.example.bookstoreineventory.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_welcome, container, false)

        val  binding = DataBindingUtil.inflate<FragmentWelcomeBinding>(inflater,R.layout.fragment_welcome, container, false)


        return binding.root
    }
}