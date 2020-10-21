package com.example.mpplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ThirdFragment : Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_third,container,false)

        view.findViewById<ImageView>(R.id.imageView2).setOnClickListener {
            findNavController().navigate(ThirdFragmentDirections.actionThirdFragmentToSecondFragment())
        }

        return view
    }




}