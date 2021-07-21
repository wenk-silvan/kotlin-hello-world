package ch.wenksi.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var times = 0
        button.setOnClickListener {
            textView.text = times++.toString()
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_LONG).show()
        }
    }
}