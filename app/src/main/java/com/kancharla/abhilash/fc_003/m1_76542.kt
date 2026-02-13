package com.kancharla.abhilash.fc_003

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class m1_76542 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_m1_76542, container, false)
        view.findViewById<Button>(R.id.button5).setOnClickListener {
            findNavController().navigate(R.id.action_m1_76542_to_m1_23961)
        }
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_m1_76542_to_m1_39462)
        }
        view.findViewById<Button>(R.id.button4).setOnClickListener {
            findNavController().navigate(R.id.action_m1_76542_to_m1_97109)
        }
        return view
    }
}