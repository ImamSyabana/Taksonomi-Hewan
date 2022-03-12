package com.example.bissmillahlulus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class DetailHewanActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hewan)

        val animal = intent.getParcelableExtra<Animal>(INTENT_PARCELABLE)
        Log.d("test", animal.toString())

        val animalsImages = findViewById<ImageView>(R.id.gambarHewan)
        val animalsNames = findViewById<TextView>(R.id.tvNamaHewan)
        val animalsDetails = findViewById<TextView>(R.id.tvDetailHewan)

        animalsImages.setImageResource(animal?.photo!!)
        animalsNames.text = animal.name
        animalsDetails.text = animal.detail
    }
}
