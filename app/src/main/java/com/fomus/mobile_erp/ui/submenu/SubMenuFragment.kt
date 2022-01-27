package com.fomus.mobile_erp.ui.submenu

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.fomus.mobile_erp.R
import com.fomus.mobile_erp.entities.local.Menu
import com.fomus.mobile_erp.entities.local.SubMenu
import com.fomus.mobile_erp.ui.adaters.GridItemAdapter
import com.fomus.mobile_erp.ui.adaters.SubMenuAdapter
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Section
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.sub_menu_fragment.*

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
       initSubMenus()
    }
    var items= mutableListOf<SubMenuAdapter>()
    private fun initSubMenus(){
        items.clear()
        (0..8).forEach {
            items.add(
                SubMenuAdapter(SubMenu("12345","","sub menu "+it))
            )
        }

        sub_menu_list.apply {
            layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
            adapter = GroupAdapter<GroupieViewHolder>().apply {
                add(Section(items))
            }
        }

    }

}