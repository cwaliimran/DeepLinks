package com.cwaliimran.deeplinks

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uri: Uri? = intent.data
        if (uri != null) {
            val params = uri.pathSegments
            if (params.isNotEmpty()) {
                val id = params[params.size - 1]
                if (BuildConfig.DEBUG) {
                    //prints complete array
                    Log.d("PARAMS ARRAY->", params.toString())
                    //prints last id only
                    Log.d("PARAMS", id)
                }
            }
        }
    }
}