package io.github.slflfl12.navigationstudy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import io.github.slflfl12.navigationstudy.databinding.FragmentIncorrectBinding

class IncorrectFragment: Fragment() {

    private lateinit var binding: FragmentIncorrectBinding
    private val args: IncorrectFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_incorrect, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvIncorrect.text = "오답입니다 입력한 값: ${args.itemAnswer}"
    }
}