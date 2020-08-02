package io.github.slflfl12.navigationstudy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.github.slflfl12.navigationstudy.databinding.FragmentCorrectNextBinding

class CorrectNextFragment : Fragment() {

    private lateinit var binding: FragmentCorrectNextBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
          binding = DataBindingUtil.inflate(inflater, R.layout.fragment_correct_next, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGotoFirst.setOnClickListener {
            findNavController().navigate(CorrectNextFragmentDirections.actionCorrectNextFragmentToFirstFragment())
        }
    }
}