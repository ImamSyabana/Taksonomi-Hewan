package com.example.bissmillahlulus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bissmillahlulus.Profil.DetailProfileActivity
import android.view.View as View

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var recviewAnimal: RecyclerView
    private var list: ArrayList<Animal> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recviewAnimal = findViewById(R.id.recview_animal)
        recviewAnimal.setHasFixedSize(true)

        list.addAll(AnimalsData.listData)

        val aboutButton: Button = findViewById(R.id.about_button)
        aboutButton.setOnClickListener(this)


        showRecyclerList()
    }

    override fun onClick(v: View?){
        when(v?.id) {
            R.id.about_button -> {
                val aboutButton = Intent(this@MainActivity, DetailProfileActivity::class.java)
                startActivity(aboutButton)
            }
        }
    }


    private fun showRecyclerList() {
        recviewAnimal.layoutManager = LinearLayoutManager(this)
        val animalAdapter = ListAnimalAdapter(list)
        recviewAnimal.adapter = animalAdapter
        animalAdapter.setOnItemClickCallback(object : ListAnimalAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Animal) {
                showSelectedAnimal(data)
            }
        })
    }

    private fun showSelectedAnimal(animal: Animal) {
        Toast.makeText(this, "Kamu memilih " + animal.name, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, DetailHewanActivity::class.java)
        intent.putExtra("OBJECT_INTENT", animal)

        startActivity(intent)

    }



}

