package org.codebase.fragmenttransition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment: Fragment =  HomeFragment.newInstance()

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, homeFragment)
            .commit()

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            changeDetailFragment()
        }
    }

    private fun changeDetailFragment() {

        val detailFragment: Fragment = DetailFragment.newInstance()
        val image = findViewById<ImageView>(R.id.homeImageView)
        val text = findViewById<TextView>(R.id.homeTextView)

        if (image != null && text != null) {
            supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragmentContainer, detailFragment)
                .addSharedElement(image, image.transitionName)
                .addSharedElement(text, text.transitionName)
                .commit()
        }
    }
}