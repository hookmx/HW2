package com.example.work21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val x = Toast.makeText(applicationContext,"Can't increase more than 9.", Toast.LENGTH_LONG)
        val y = Toast.makeText(applicationContext,"Can't decrease more than 0.", Toast.LENGTH_LONG)
        val z = Toast.makeText(applicationContext,"The number has been reset.", Toast.LENGTH_LONG)
        var count = 0

        btA.setOnClickListener(){
            if (count >= 0 && count < 9){
                count++
                text01.setText("$count")
            }else{
                x.show()
            }
        }


        btB.setOnClickListener(){
            if (count > 0 && count <= 9){
                count--
                text01.setText("$count")
            }else{
                y.show()
            }
        }


        btC.setOnClickListener(){
            count = 0
            text01.setText("$count")
            z.show()

        }
    }
}