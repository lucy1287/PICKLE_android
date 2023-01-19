package com.example.pickle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pickle.databinding.ActivityClothBinding
import com.example.pickle.databinding.ActivityPickupBinding

class PickupActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityPickupBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        viewBinding = ActivityPickupBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}