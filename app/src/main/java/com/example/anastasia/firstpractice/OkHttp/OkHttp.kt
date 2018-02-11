package com.example.anastasia.firstpractice.OkHttp

import android.os.AsyncTask.execute
import com.example.anastasia.firstpractice.Models.Repo
import com.example.anastasia.firstpractice.Models.RepoList
import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.Request
import com.google.gson.Gson



/**
 * Created by Anastasia on 11.02.2018.
 */
class OkHttp {
    private var client = OkHttpClient()
    private var repoList : MutableList<Repo> = arrayListOf()

    @Throws(IOException::class)

    fun run(url: String): List<Repo> {
        Thread(Runnable {
        val request = Request.Builder()
                .url(url)
                .build()

        val response = client.newCall(request).execute()
        val responseText = response.body()!!.string()

        repoList = Gson().fromJson(responseText, Repo.List::class.java)

        }).start()

        return repoList

        //return response.body().string()
    }
}