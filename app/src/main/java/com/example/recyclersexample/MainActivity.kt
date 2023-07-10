package com.example.recyclersexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting the recycler view by its id

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        //this creates a vertical layout manager

        recyclerview.layoutManager = LinearLayoutManager(this)

        //array list of class itemsviewmodel
        lateinit var  list: ArrayList<Info>

        //this loop will create views containing image and name

        list = ArrayList()
        list.add(Info(R.drawable.apache, "Apache"))
        list.add(Info(R.drawable.atom, "Atom"))
        list.add(Info(R.drawable.cakephp, "Cakephp"))
        list.add(Info(R.drawable.ceylon, "Ceylon"))
        list.add(Info(R.drawable.django, "Django"))
        list.add(Info(R.drawable.ionic, "Ionic"))
        list.add(Info(R.drawable.linux, "Linux"))
        list.add(Info(R.drawable.pycharm, "Pycharm"))
        list.add(Info(R.drawable.sequelize, "Sequelize"))
        list.add(Info(R.drawable.sketch, "Sketch"))

        //this will  pass the array list to our adapter
        val adapter = Adapter(list)

        //setting the adapter within the recyler view
        recyclerview.adapter = adapter
    }
}