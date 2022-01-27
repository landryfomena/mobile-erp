package com.fomus.mobile_erp.ui.adaters

import com.fomus.mobile_erp.R
import com.fomus.mobile_erp.entities.local.Account
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.account_item.view.*

class AccountAdapter(var account:Account,var action:(account:Account) -> Unit): Item() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.login_account.setText(account.accountLogin)
        viewHolder.itemView.name_account.setText(account.accountName)
        viewHolder.itemView.company.setText(account.companyName)
        viewHolder.itemView.server.setText(account.serverUrl)
        viewHolder.itemView.setOnClickListener {
            action(account)
        }
    }

    override fun getLayout()= R.layout.account_item
}