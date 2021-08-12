package com.bigbrain.expenses.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.bigbrain.expenses.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class DetailsFragment : Fragment() {

    private lateinit var buttonList : FloatingActionButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonList = view.findViewById(R.id.button_list)
        buttonList.setOnClickListener {
            val action = DetailsFragmentDirections.actionDetailsFragmentToListFragment()
            Navigation.findNavController(it).navigate(action)
        }

    }

}