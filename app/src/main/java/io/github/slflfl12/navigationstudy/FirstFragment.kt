package io.github.slflfl12.navigationstudy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import io.github.slflfl12.navigationstudy.databinding.FragmentFirstBinding
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnConfirm.setOnClickListener {
            if(binding.etAnswer.text.toString() == "네비게이션") {
                findNavController().navigate(R.id.action_firstFragment_to_correctFragment, bundleOf("bundleKey" to binding.etAnswer.text.toString()))
            } else {
                findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToIncorrectFragment(binding.etAnswer.text.toString()))
            }
        }

    }
}