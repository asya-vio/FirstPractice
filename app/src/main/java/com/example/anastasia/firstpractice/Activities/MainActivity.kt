package com.example.anastasia.firstpractice.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.anastasia.firstpractice.Adapters.*
import com.example.anastasia.firstpractice.Models.Project
import com.example.anastasia.firstpractice.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_recyclerview.layoutManager = LinearLayoutManager(this)


        val adapter = RecyclerViewCustomAdapter(loadData())
        main_recyclerview.adapter = adapter
    }

    private fun loadData() : List<Project>{

        val project1 = Project()
        project1.setProjectName("firstApp")

        val project2 = Project()
        project1.setProjectName("secondApp")

        val project3 = Project()
        project1.setProjectName("thirdApp")

        val listProjects : MutableList<Project> = arrayListOf()
        listProjects.add(project1)
        listProjects.add(project2)
        listProjects.add(project3)

        return listProjects
    }
}
