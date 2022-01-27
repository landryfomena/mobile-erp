package com.fomus.mobile_erp.ui.adaters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fomus.mobile_erp.R
import com.fomus.mobile_erp.entities.local.Menu
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.module_item.view.*
import java.lang.Exception

/**
 * Grid item adapter
 *
 * @property agentList
 * @property onAgentSelected
 * @constructor Create empty Grid item adapter
 */
class GridItemAdapter(var menu: Menu):Item(){
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.menu_title.text=menu.menuName
        Glide.with(viewHolder.itemView.context).load(menu.menuIcon).error(R.drawable.ic_baseline_broken_image_24).into(viewHolder.itemView.menu_image)
        viewHolder.itemView.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_nav_home_to_subMenuFragment2)
        }
    }

    override fun getLayout()=R.layout.module_item

}
