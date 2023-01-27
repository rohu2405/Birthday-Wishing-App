package com.somu.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class createBirthdayCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_birthday_card)

        val name = intent.getStringExtra("name")
        val greeting = findViewById(R.id.greeting) as TextView
        greeting.text = "Happy Birthday $name"

    }
}