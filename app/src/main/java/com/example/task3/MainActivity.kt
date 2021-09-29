package com.example.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var rv:RecyclerView
    lateinit var names:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText=findViewById(R.id.editText)
        button=findViewById(R.id.button)
        rv=findViewById(R.id.rv)
        names= ArrayList()

        rv.adapter=myAdapter(names)
        rv.layoutManager=LinearLayoutManager(this)

        button.setOnClickListener(){
            val name=editText.text.toString()
            names.add(name)
            rv.adapter?.notifyDataSetChanged()
        }


    }
}