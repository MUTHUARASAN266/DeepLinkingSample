package com.muthu.deeplinkingsample

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class NextScreen : AppCompatActivity() {
     private var uri:Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_screen)


        val result:TextView=findViewById(R.id.textView_result)
        uri=intent.data

        if (uri!=null){
            val value=uri!!.pathSegments

            val urlData = value[value.size - 1]
            Log.e("TAG", "onCreate: $urlData", )
        }

    }
}