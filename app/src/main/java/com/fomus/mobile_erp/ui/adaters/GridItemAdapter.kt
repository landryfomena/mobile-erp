package com.fomus.mobile_erp.ui.adaters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import java.lang.Exception

/**
 * Grid item adapter
 *
 * @property agentList
 * @property onAgentSelected
 * @constructor Create empty Grid item adapter
 */
class GridItemAdapter(private val agentList: ArrayList<Agent>,var onAgentSelected:(agent:Agent)->Unit) :
    RecyclerView.Adapter<GridItemAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardImages: ImageView = itemView.findViewById(R.id.cardImages)
        val cardTitle: TextView = itemView.findViewById(R.id.cardTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.agent_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cardTitle.text = agentList[position].agentName
         try{
             Picasso.get().load(agentList[position].photoAgent).error(R.drawable.ic_baseline_broken_image_24).into(holder.cardImages)

        }catch (e:Exception){

        }
        

        // Navigation
        holder.itemView.setOnClickListener {
            onAgentSelected(agentList[position])
            Navigation.findNavController(it).navigate(R.id.action_navigation_dashboard_to_agentDetailsFragment)
        }

        holder.itemView
    }

    override fun getItemCount(): Int {
        return agentList.size

    }


}