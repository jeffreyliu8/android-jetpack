package com.askjeffreyliu.myapplication.ui.fragmentviewmodel

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.askjeffreyliu.myapplication.R

class FragmentViewModelFragment : Fragment() {

    companion object {
        fun newInstance() = FragmentViewModelFragment()
    }

    private lateinit var viewModel: FragmentViewModelViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_view_model_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentViewModelViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
