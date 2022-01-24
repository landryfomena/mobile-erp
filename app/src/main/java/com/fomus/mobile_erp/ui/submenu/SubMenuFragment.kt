package com.fomus.mobile_erp.ui.submenu

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fomus.mobile_erp.R

class SubMenuFragment : Fragment() {

    companion object {
        fun newInstance() = SubMenuFragment()
    }

    private lateinit var viewModel: SubMenuViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sub_menu_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SubMenuViewModel::class.java)
        // TODO: Use the ViewModel
    }

}