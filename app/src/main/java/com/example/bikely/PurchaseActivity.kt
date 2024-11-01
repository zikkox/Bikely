package com.example.bikely

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bikely.databinding.ActivityMainBinding
import com.example.bikely.databinding.ActivityPurchaseBinding

class PurchaseActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPurchaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPurchaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener(){
            finish()
        }

        binding.buyButton.setOnClickListener(){
            finish()
        }


        //adding and subtracting items from your cart
        var amount: Int = 0
        val price = 200
        binding.priceTextview.text = "$ ${price.toString()}"

        binding.addButton.setOnClickListener(){
            amount++
            binding.amountTextview.text = amount.toString()

            binding.priceTextview.text = "$ ${(price*amount).toString()}"
        }
        binding.subtractButton.setOnClickListener(){
            if(binding.amountTextview.text != "1") {
                amount--
                binding.amountTextview.text = amount.toString()

                binding.priceTextview.text = "$ ${(price*amount).toString()}"
            }
        }

    }
}