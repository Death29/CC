package com.example.cc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


//5 round game utk n pemain
// input nama
// 1,3,5 dapat poin 5
// 2,4,6 dapat poin -3
//player tertinggi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var player = ""
        player = et_username.text.toString()


        btn_login.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
            intent.putExtra("Nama", player)
        }

    }

}