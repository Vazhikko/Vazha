package com.example.myapplication.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R

class FirstFragment: Fragment(R.layout.fragment_first) {

    private lateinit var nameEditText: EditText
    private lateinit var sendButton: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameEditText = view.findViewById(R.id.nameEditText)
        sendButton = view.findViewById(R.id.sendButton)

        val controller = Navigation.findNavController(view)

        sendButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment22(name)
            controller.navigate(action)


        }


    }
}