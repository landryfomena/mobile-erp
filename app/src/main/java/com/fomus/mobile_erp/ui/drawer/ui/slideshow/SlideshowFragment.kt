package com.fomus.mobile_erp.ui.drawer.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.fomus.mobile_erp.R
import com.fomus.mobile_erp.databinding.FragmentSlideshowBinding

import com.fomus.mobile_erp.entities.local.Account
import com.fomus.mobile_erp.entities.local.Menu
import com.fomus.mobile_erp.ui.adaters.AccountAdapter
import com.fomus.mobile_erp.ui.adaters.GridItemAdapter
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Section
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_slideshow.*


class SlideshowFragment : Fragment() {

    private lateinit var slideshowViewModel: SlideshowViewModel
    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {

        })
        return root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAccountList()
    }
    var items= mutableListOf<AccountAdapter>()
    private fun initAccountList(){
        (0..8).forEach {
            items.add(AccountAdapter(Account("account"+it,"account"+it,"Company"+it,"serveur"+it)) { account ->
                // on below line we are creating a new bottom sheet dialog.
                val dialog = BottomSheetDialog(requireContext())
                val view = layoutInflater.inflate(R.layout.creaate_account_form, null)
                // below line is use to set cancelable to avoid
                // closing of dialog box when clicking on the screen.
                dialog.setCancelable(true)

                // on below line we are setting
                // content view to our view.
                dialog.setContentView(view)

                // on below line we are calling
                // a show method to display a dialog.
                dialog.show()

            })
        }
Toast.makeText(requireContext(),"accounts "+items.size,Toast.LENGTH_SHORT).show()
        account_list.apply {
            layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
            adapter = GroupAdapter<GroupieViewHolder>().apply {
                add(Section(items))
            }
        }
    }

    fun initBottomSheet(account: Account){

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}