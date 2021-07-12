package com.example.bookstoreineventory.screens.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.bookstoreineventory.R
import com.example.bookstoreineventory.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit  var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_login, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)


        return binding.root
    }
}