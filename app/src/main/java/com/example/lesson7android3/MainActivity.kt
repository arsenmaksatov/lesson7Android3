package com.example.lesson7android3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson7android3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var usersAdapter: UsersAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupAdapter()

    }

    private fun setupAdapter() {
        val list: List<User> = arrayListOf(
            User("beka"),
            User("beka"),
            User("beka"),
            User("beka"),
            User("beka"),
            User("beka"),
            User("beka"),
            User("beka"),
            User("beka"),
            User("beka"),
            User("beka"),
            User("beka"),
            User("beka"),
            User("beka"),
        )
        usersAdapter = UsersAdapter(list)
        binding.recyclerView.adapter = usersAdapter
    }
}