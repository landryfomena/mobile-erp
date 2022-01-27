package com.fomus.mobile_erp.ui.drawer.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.fomus.mobile_erp.databinding.FragmentHomeBinding
import com.fomus.mobile_erp.entities.local.Menu
import com.fomus.mobile_erp.ui.adaters.GridItemAdapter
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Section
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    var items= mutableListOf<GridItemAdapter>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initMenus()
    }
    private fun initMenus(){
        (0..8).forEach {
            items.add(GridItemAdapter(Menu("12345","menu "+it,"https://www.google.com/search?q=menu+icon&sxsrf=AOaemvLTzCbjCqgpKC7NsVwi81jjgliMFA:1643081578489&tbm=isch&source=iu&ictx=1&vet=1&fir=6YSXc9LKPxKSLM%252CQbwTHi7nB2t6LM%252C_%253BltwQk4CnKggt4M%252CCaZgvGustqy1GM%252C_%253BduK_uWi3MUKRrM%252CmD-6pQBi0vPxCM%252C_%253BMaKYT7FDMoErLM%252CPrcHsFtvcesSgM%252C_%253BiWtg0kHSxWpsAM%252Cp4GUBDTSrjKoZM%252C_%253Ba4uan7Wh7mur3M%252C3dWgTfyfRHzEeM%252C_%253BgdONx8Pv0YQffM%252C6OUAXpu_AdBz1M%252C_%253BzABUA1jHq5lqXM%252C75VQ-G4zjD9cYM%252C_%253B7YpXUKE50FHKsM%252CCruvhHwmlHVMbM%252C_%253BdsNaNPu_qwx9RM%252Cn5yq8-vgUsaNSM%252C_%253BH_G34tk2-ySLAM%252CJSobSrMOTWzBAM%252C_%253BxG3UTdTUbb2oSM%252CYu_IyrgyYg5xGM%252C_%253Bfei_OzBHSLC7JM%252CgdTd0KGrZKaYCM%252C_%253Bvq96K0iGVhnbGM%252Cj0Bqa6-P67OgFM%252C_%253BgCYssBQ0931O3M%252CCaZgvGustqy1GM%252C_%253BX5hg7nDbfNYyeM%252CLXXAonpHuKUuNM%252C_&usg=AI4_-kTU1GdxkZYbyicLADgeTNHKNKgBmg&sa=X&ved=2ahUKEwjs_Mnu-8v1AhWYQEEAHaP_AlkQ9QF6BAgHEAE#imgrc=6YSXc9LKPxKSLM")))
        }

        menus.apply {
            layoutManager = GridLayoutManager(requireContext(),2)
            adapter = GroupAdapter<GroupieViewHolder>().apply {
                add(Section(items))
            }
        }
        var groupAdapter=GroupAdapter<GroupieViewHolder>().apply {

        }
    }
}