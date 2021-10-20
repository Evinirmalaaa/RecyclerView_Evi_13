package com.example.recyclerview_evi_13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val laguList = listOf<Lagu>(
            Lagu(
                R.drawable.pamungkas,
                nameLagu = "Pamungkas",
                descLagu = "To The Bon"
            ),

            Lagu(
                R.drawable.payung,
                nameLagu = "Payung Teduh",
                descLagu = "Akad"
            ),

            Lagu(
                R.drawable.raisa,
                nameLagu = "Raisa",
                descLagu = "Anganku Anganmu"
            ),

            Lagu(
                R.drawable.tulus,
                nameLagu = "Tulus",
                descLagu = "Manusia Kuat"
            ),

            Lagu(
                R.drawable.virgoun,
                nameLagu = "Virgoun",
                descLagu = "Surat Cinta Untuk Starla"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_lagu)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = LaguAdapter(this, laguList){
            val intent = Intent(this, DetailLaguActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}