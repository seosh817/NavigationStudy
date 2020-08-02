package io.github.slflfl12.navigationstudy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.github.slflfl12.navigationstudy.databinding.FragmentCorrectBinding

class CorrectFragment : Fragment() {

    private lateinit var binding: FragmentCorrectBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_correct, container, false)
        return binding.root

        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvCorrect.text = "정답입니다. 입력한 값:${arguments?.getString("bundleKey")}"

        binding.btnNext.setOnClickListener {
            findNavController().navigate(CorrectFragmentDirections.actionCorrectFragmentToCorrectNextFragment())
        }
    }
    }