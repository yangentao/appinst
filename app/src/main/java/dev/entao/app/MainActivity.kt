package dev.entao.app

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentPage(ConstraintTestPage(this))
        Log.d("xlog", 10.dp.toString())
    }


}