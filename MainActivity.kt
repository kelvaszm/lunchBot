package com.example.lunchbot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.top_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.searchbar -> {
                // DO SOMETHING
                Toast.makeText(this, "Search was selected!", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.distance -> {
                // DO SOMETHING
                Toast.makeText(this, "Distance was selected!", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.rating -> {
                // DO SOMETHING
                Toast.makeText(this, "Rating was selected!", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.type -> {
                // DO SOMETHING
                Toast.makeText(this, "Type was selected!", Toast.LENGTH_SHORT).show()
                return true
            }

            else -> {
                return super.onOptionsItemSelected(item)
            }
        }

    }
}
