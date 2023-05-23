package com.example.fibonacci_series

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvNumbers: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onResume(){
        super.onResume()
        rvNumbers=findViewById(R.id.rvNumbers)

        fun get_fibonacci(){
            var first = 0
            var second = 1
            for (i in 1..100)
                val nextNumber = first + second
            second = nextNumber

            val numbersAdapter = NumbersRvAdapter(get_fibonacci())
            rvNumbers.layoutManager = LinearLayoutManager(this)
            rvNumbers.adapter=numbersAdapter

        }
    }
}