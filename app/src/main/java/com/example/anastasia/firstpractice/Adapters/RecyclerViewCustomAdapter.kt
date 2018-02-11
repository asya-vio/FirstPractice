package com.example.anastasia.firstpractice.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Anastasia on 11.02.2018.
 */
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import com.example.anastasia.firstpractice.R
import com.example.anastasia.firstpractice.Models.Project


class RecyclerViewCustomAdapter(private val listData : List<Project>) :
        RecyclerView.Adapter<RecyclerViewCustomAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(listData[position])
    }

    override fun getItemCount() = listData.size

    class ViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {

        fun bindData(userProject: Project) {

            val projectNameTextView = itemView.findViewById<TextView>(R.id.project_name)
            projectNameTextView.text = userProject.getProjectName()

        }
    }

}