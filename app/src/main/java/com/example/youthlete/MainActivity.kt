package com.example.youthlete

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.youthlete.login.loginActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    lateinit var auth: FirebaseAuth
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()
        sharedPreferences = getSharedPreferences("LOGIN_STATUS", Context.MODE_PRIVATE)
    }

    override fun onStart() {
        super.onStart()

        // Cek status login pengguna saat aplikasi dibuka kembali
        if (!sharedPreferences.getBoolean("LOGGED_IN", false)) {
            logout() // Jika tidak dalam status login, maka logout
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_logout -> {
                // Tambahkan kode logout di sini
                logout()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun logout() {
        FirebaseAuth.getInstance().signOut()

        // Set status login pengguna ke false menggunakan Shared Preferences
        val editor = sharedPreferences.edit()
        editor.putBoolean("LOGGED_IN", false)
        editor.apply()

        val intent = Intent(this, loginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }
}
