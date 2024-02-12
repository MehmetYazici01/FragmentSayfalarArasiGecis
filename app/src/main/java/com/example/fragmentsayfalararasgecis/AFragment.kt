package com.example.fragmentsayfalararasgecis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentsayfalararasgecis.databinding.FragmentABinding

class AFragment : Fragment() {
    private lateinit var tasarim:FragmentABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentABinding.inflate(inflater, container, false)
        tasarim.buttonGec.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_AFragment_to_BFragment)
        }
        return tasarim.root
    }
}