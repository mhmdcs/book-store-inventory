package com.example.bookstoreineventory

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.bookstoreineventory.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var  appBarConfig: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  DataBindingUtil.setContentView(this,R.layout.activity_main)

        val navController = this.findNavController(R.id.myNavHostFragment)
        appBarConfig = AppBarConfiguration(navController.graph)


        //creating the Up button UI and linking it up with the Action Bar
        NavigationUI.setupActionBarWithNavController(this, navController)

    }

    // this is like setting an onClickListener to the Up button, without it, clicking it doesn't do anything
    override fun onSupportNavigateUp(): Boolean{
        val navController = this.findNavController(R.id.myNavHostFragment)
        return NavigationUI.navigateUp(navController, appBarConfig)
    }
}