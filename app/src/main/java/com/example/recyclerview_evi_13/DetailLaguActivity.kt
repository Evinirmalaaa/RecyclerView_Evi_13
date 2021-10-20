package com.example.recyclerview_evi_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailLaguActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_lagu)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val lagu = intent.getParcelableExtra<Lagu>(MainActivity.INTENT_PARCELABLE)

        val imgLagu = findViewById<ImageView>(R.id.img_item_photo)
        val nameLagu = findViewById<TextView>(R.id.tv_item_name)
        val descLagu = findViewById<TextView>(R.id.tv_item_description)

        imgLagu.setImageResource(lagu?.imgLagu!!)
        nameLagu.text = lagu.nameLagu
        descLagu.text = lagu.descLagu

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
