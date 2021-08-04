package com.example.emotiondiary.Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.emotiondiary.R
import com.example.emotiondiary.databinding.ActivityMainBinding
import com.example.emotiondiary.databinding.FragmentWriteBinding

class WriteFragment : Fragment() {

    lateinit var navController : NavController
    private lateinit var binding: FragmentWriteBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_write, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = findNavController(view)

        binding = DataBindingUtil.setContentView(requireActivity(), R.layout.fragment_write)

        binding.nextBtn.setOnClickListener {
            findNavController().navigate(R.id.action_emotionFragment_to_diaryFragment)
        }

    }
}