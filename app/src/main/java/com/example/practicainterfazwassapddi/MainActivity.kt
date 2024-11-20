package com.example.practicainterfazwassapddi

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practicainterfazwassapddi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        insignias()
        floatButton()
    }

    private fun insignias(){
       val chats =  binding.bottomNavigation.getOrCreateBadge(R.id.chat)
        chats.isVisible = true
        chats.number = 38

        val news =  binding.bottomNavigation.getOrCreateBadge(R.id.news)
        news.isVisible = true
        news.text = ""

        val people =  binding.bottomNavigation.getOrCreateBadge(R.id.comunnity)
        people.isVisible = true
        people.text = ""

        val calls =  binding.bottomNavigation.getOrCreateBadge(R.id.calls)
        calls.isVisible = true
        calls.number = 2
    }

    private fun floatButton(){
        binding.floatingButton.setOnClickListener{
            Toast.makeText(this, "Se ha pulsado el boton flotante", Toast.LENGTH_LONG).show()
        }

        binding.bottomNavigation.setOnItemSelectedListener{ item ->
            when(item.itemId) {
                R.id.chat -> {
                    Toast.makeText(this, "Se ha pulsado en los chats", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.news -> {
                    Toast.makeText(this, "Se ha pulsado en las novedades", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.comunnity -> {
                    Toast.makeText(this, "Se ha pulsado en la comunidad", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.calls -> {
                    Toast.makeText(this, "Se ha pulsado en las llamadas", Toast.LENGTH_LONG).show()
                    true
                }
                else -> false
            }
        }
    }
}
