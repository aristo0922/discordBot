package com.example.helloandroid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var num1 = "0"
    var num2 = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnAdd.setOnTouchListener{ view, motionEvent->
            num1 = Edit1.text.toString()
            num2 = Edit2.text.toString()

            if(num1 == " " || num2 == " "){
                Toast.makeText(application, "")
            }else{
                TextResult.text = "계산 결과 >> ${num1 + num2}"
            }

            //TextResult.text = TextResult.text.toString()+"${num1 + num2}"
            false
        }
    }
}