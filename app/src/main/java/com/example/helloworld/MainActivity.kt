package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var button: Button? = null
    private var textView: TextView? = null
    private var editText: EditText?=null //Plain text

    private var numTimesClicked=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput: EditText=findViewById<EditText>(R.id.editTextTextPersonName)
        val button: Button=findViewById<Button>(R.id.button)

        val button2: Button=findViewById<Button>(R.id.button2)

        editText=findViewById<EditText>(R.id.editTextTextPersonName)
        textView=findViewById<TextView>(R.id.textView)

        textView?.text=""
        textView?.movementMethod= ScrollingMovementMethod()

        button?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                textView?.append(userInput.text)
                textView?.append("\n")
                userInput.text.clear()

            }
        })

        button2?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?){
                textView?.text=""
                userInput.text.clear()

            }
        })
    }

}