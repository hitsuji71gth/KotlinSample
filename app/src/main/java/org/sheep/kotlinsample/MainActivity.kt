package org.sheep.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "PineAme is ..."
        button.text = "Awsome!!!"
        button.setOnClickListener { view ->
            Toast.makeText(this, "Year! I know!!", Toast.LENGTH_SHORT).show()
        }
    }
}
