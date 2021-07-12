package com.anta40.app.diwithkoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anta40.app.diwithkoin.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val session: SessionManager by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Should print "Hello world 12345"
        binding.txtValue.text = session.getStringValue()
    }
}