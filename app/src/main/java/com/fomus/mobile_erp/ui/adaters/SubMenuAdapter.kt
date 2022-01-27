package com.fomus.mobile_erp.ui.adaters


import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.fomus.mobile_erp.R
import com.fomus.mobile_erp.entities.local.SubMenu
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.module_item.view.*
import kotlinx.android.synthetic.main.sub_menu_item_layout.view.*

class SubMenuAdapter(var subMenu: SubMenu) : Item() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.sub_menu_title.setText(subMenu.subMenuName)
        Glide.with(viewHolder.itemView.context).load(subMenu.subMenuIcon)
            .error(R.drawable.ic_baseline_broken_image_24).into(viewHolder.itemView.sub_menu_icon)
        viewHolder.itemView.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_subMenuFragment2_to_actionsScreenFragment2)

        }
    }

    override fun getLayout() = R.layout.sub_menu_item_layout
}