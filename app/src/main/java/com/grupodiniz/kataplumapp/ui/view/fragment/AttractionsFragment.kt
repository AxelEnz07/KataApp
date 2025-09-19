package com.grupodiniz.kataplumapp.ui.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.grupodiniz.kataplumapp.R
import com.grupodiniz.kataplumapp.databinding.FragmentAttractionsBinding

class AttractionsFragment : Fragment() {

    private val tag = AttractionsFragment::class.simpleName

    private var _binding: FragmentAttractionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAttractionsBinding.inflate(layoutInflater, container, false)

        return binding.root
    }
}