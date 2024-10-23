package com.example.mylibraries

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibraries.databinding.ActivityMainBinding
import com.example.test.TestActivity
import com.example.test.Utils

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnClick.setOnClickListener {
            val testActivity = TestActivity()
            val msg = testActivity.getInfoMessage()
            Utils.showToast(this, msg)
            val i = Intent(this,com.example.test.TestActivity::class.java)
            startActivity(i)
        }
    }
}