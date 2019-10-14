package com.example.kotlin_play

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myToolbar = findViewById<View>(R.id.my_toolbar) as Toolbar
        setSupportActionBar(myToolbar)

        findViewById<Button>(R.id.button).setOnLongClickListener {
            val editable = findViewById<TextView>(R.id.editText)
            editable.text = "Long Click"
            true
        }

    }

    fun sendMessage(button: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    companion object {
        @kotlin.jvm.JvmField
        var EXTRA_MESSAGE = "EXTRA"
    }

    override fun onResume() {
        super.onResume()
        findViewById<TextView>(R.id.editText).text = ""
    }
}
