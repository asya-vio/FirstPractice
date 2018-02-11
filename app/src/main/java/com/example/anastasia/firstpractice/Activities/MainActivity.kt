package com.example.anastasia.firstpractice.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.anastasia.firstpractice.Adapters.*
import com.example.anastasia.firstpractice.Models.Repo
import com.example.anastasia.firstpractice.OkHttp.OkHttp
import com.example.anastasia.firstpractice.R
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData()
    }

    private fun loadData() {

        var client = OkHttpClient()
        val request = Request.Builder()
                .url("https://api.github.com/users/square/repos")
                .build()

        val response = client.newCall(request).execute()
        val responseText = response.body()!!.string()
        var repoList = Gson().fromJson(responseText, Repo.List::class.java)
        updateUi(repoList)

    }

    private fun updateUi(listRepo: List<Repo>) {

        main_recyclerview.layoutManager = LinearLayoutManager(this)
        val adapter = RecyclerViewCustomAdapter(listRepo)
        main_recyclerview.adapter = adapter
    }
}
