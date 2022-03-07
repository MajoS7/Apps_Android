package com.majos7.androidactivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("Verbose: ", "Oncreate")
    }override fun onStart(){ super.onStart()
        Log.d("Debug: ", "OnStart")
    }
    override fun onResume(){ super.onResume()
        Log.i("Info: ", "OnResume")
    }override fun onPause(){ super.onPause()
        Log.w("Warn: ", "OnPause")
    }override fun onStop() { super.onStop()
        Log.e("Error: ", "OnStop")
    }override fun onDestroy() { super.onDestroy()
        Log.i("Info 2: ", "OnDestroy")
    }override fun onRestart() { super.onRestart()
        Log.e("Error 2: ", "OnRestart")
    }
}