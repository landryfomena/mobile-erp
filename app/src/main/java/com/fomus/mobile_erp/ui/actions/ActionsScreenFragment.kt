package com.fomus.mobile_erp.ui.actions

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fomus.mobile_erp.R

class ActionsScreenFragment : Fragment() {

    companion object {
        fun newInstance() = ActionsScreenFragment()
    }

    private lateinit var viewModel: ActionsScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.actions_screen_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ActionsScreenViewModel::class.java)
        // TODO: Use the ViewModel
    }

}