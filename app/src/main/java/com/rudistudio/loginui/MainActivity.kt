package com.rudistudio.loginui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button clicks
            et_user_name.setText("")
            et_password.setText("")
        }

        //set on-click listener
        btn_submit.setOnClickListener {
            et_user_name.text;
            et_password.text;

            // Toast that show name 
            Toast.makeText(this@MainActivity, et_user_name.text.toString(),  Toast.LENGTH_LONG).show()

            // Toast that show the code
            // Toast.makeText(this@MainActivity, et_password.text.toString(),  Toast.LENGTH_LONG).show()
        }
    }
}
