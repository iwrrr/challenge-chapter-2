package id.binar.challenge.modules.gojek.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import id.binar.challenge.R
import id.binar.challenge.databinding.FragmentGojekBinding

class GojekFragment : Fragment(R.layout.fragment_gojek) {

    private var _binding: FragmentGojekBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentGojekBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}