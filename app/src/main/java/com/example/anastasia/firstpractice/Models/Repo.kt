package com.example.anastasia.firstpractice.Models

/**
 * Created by Anastasia on 11.02.2018.
 */
data class Repo (val name : String){

    private var projectName : String = name

    class List : ArrayList<Repo>()

    fun getProjectName () : String? { return projectName}

    //fun setProjectName (name : String){projectName = name}
}