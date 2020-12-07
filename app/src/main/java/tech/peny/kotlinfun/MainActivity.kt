package tech.peny.kotlinfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
//    var textView: TextView;
    var count: Int = 0
    fun increase(view: View){
        count++
        textView.text = count.toString()

    }

    fun decrease(view: View){
        if(count != 0){
            count--
            textView.text = count.toString()
        }
    }

    fun reset(view: View){
        count = 0
        textView.text = "0"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    var textView = findViewById<TextView>(R.id.textView)
        textView.setText("Heya!");
    }
}