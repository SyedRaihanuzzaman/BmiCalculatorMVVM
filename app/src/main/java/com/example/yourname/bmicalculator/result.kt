package com.example.yourname.bmicalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class result : Fragment() {

    private lateinit var bmiScoreTV:TextView
    private lateinit var categoryTV:TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result, container, false)

        bmiScoreTV = view.findViewById(R.id.biscoreTV)
        categoryTV = view.findViewById(R.id.categoryTV)
        return view
    }

}