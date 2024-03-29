package com.example.basekotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    var adapter: Customadapter? = null
    var arr = ArrayList<Phone>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initview()
        adapter?.itemclick={ phone->
            var inten:Intent= Intent(this,DetailPhoneActivity::class.java)
            inten.putExtra("NamePhone",phone.name)
            inten.putExtra("ImagePhone",phone.anh)
            startActivity(inten)

        }
    }

    private fun initview() {

        recycle.layoutManager = LinearLayoutManager(this)
        recycle.setHasFixedSize(true)
        adapter = Customadapter(this, addData())
        recycle.adapter = adapter

    }

    private fun addData(): ArrayList<Phone> {

        arr.add(Phone(R.drawable.anh1, "IPhone XSmax"))
        arr.add(Phone(R.drawable.anh2, "SamSung Galaxy S8"))
        arr.add(Phone(R.drawable.anh3, "IPhone 9"))
        arr.add(Phone(R.drawable.anh4, "Lenovo not 4"))
        arr.add(Phone(R.drawable.anh5, "Xiaomi Not 7"))
        arr.add(Phone(R.drawable.anh6, "SamSung S10 not"))
        arr.add(Phone(R.drawable.anh7, "Nokia Modern"))
        return arr
    }
}
