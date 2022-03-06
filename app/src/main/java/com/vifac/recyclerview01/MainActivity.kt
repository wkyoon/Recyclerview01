package com.vifac.recyclerview01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var profileAdapter: ProfileAdapter
    val datas = mutableListOf<ProfileData>()

    lateinit var rv_profile: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_profile= findViewById(R.id.rv_profile)

        initRecycler()
    }
    private fun initRecycler() {
        profileAdapter = ProfileAdapter(this)
        rv_profile.adapter = profileAdapter


        datas.apply {
            add(ProfileData(img = R.mipmap.ic_launcher_round, name = "mary", age = 24))
            add(ProfileData(img = R.mipmap.ic_launcher_round, name = "jenny", age = 26))
            add(ProfileData(img = R.mipmap.ic_launcher_round, name = "jhon", age = 27))
            add(ProfileData(img = R.mipmap.ic_launcher_round, name = "ruby", age = 21))
            add(ProfileData(img = R.mipmap.ic_launcher_round, name = "yuna", age = 23))

            profileAdapter.datas = datas
            profileAdapter.notifyDataSetChanged()

        }
    }
}