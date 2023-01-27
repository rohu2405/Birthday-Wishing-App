package com.somu.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun Create(view: View) {
    val intent = Intent(this, createBirthdayCard::class.java)
        val nameInput = findViewById(R.id.name) as EditText
        val name = nameInput.editableText.toString()
        intent.putExtra("name" , name)
        startActivity(intent)

    }
}


//
//Toast.makeText(this , "hello $name" , Toast.LENGTH_SHORT).show()