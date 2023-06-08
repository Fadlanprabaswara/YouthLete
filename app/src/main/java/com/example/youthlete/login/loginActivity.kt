package com.example.youthlete.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.youthlete.databinding.ActivityLoginBinding
import com.example.youthlete.register.RegisterActivity

class loginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvRegister.setOnClickListener{
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}