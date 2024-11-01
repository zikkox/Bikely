package com.example.bikely

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bikely.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    public lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.signupButton.setOnClickListener(){
            val password = binding.passwordEdittext
            if(password.length() > 8){
                startActivity(Intent(this, PurchaseActivity::class.java))
            }
        }
    }
}