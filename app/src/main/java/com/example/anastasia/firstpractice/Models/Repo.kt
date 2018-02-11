package com.example.anastasia.firstpractice.Models

/**
 * Created by Anastasia on 11.02.2018.
 */
class Repo{

    class List : ArrayList<Repo>()

    private var projectName : String ?= null

    fun getProjectName () : String? { return projectName}

    fun setProjectName (name : String){projectName = name}
}