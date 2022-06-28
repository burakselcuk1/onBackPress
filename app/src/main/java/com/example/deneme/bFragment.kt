package com.example.deneme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.deneme.databinding.FragmentAragmentBinding
import com.example.deneme.databinding.FragmentBBinding


class bFragment : Fragment() {
    private var _binding : FragmentBBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        _binding = FragmentBBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.secondButton.setOnClickListener {
            findNavController().navigate(R.id.action_bFragment_to_cFragment)
        }

    }

}