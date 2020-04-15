package com.example.practicamaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val allSede: MutableList<Sede> = mutableListOf()
    lateinit var RV_SedeAdapter: RV_SedeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        getSedes()

        RV_SedeAdapter = RV_SedeAdapter(
            this,
            allSede as ArrayList<Sede>
        )

        rv_sedes.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )

        rv_sedes.adapter = RV_SedeAdapter



    }


    fun getSedes(){

        allSede.add(Sede("Sede Medellin","Campus Principal","6.2677479","-75.5710303",R.drawable.campus,"Medellin, Colombia"))
        allSede.add(Sede("Sede Turbo","Ciencias del mar","8.1005917","76.7163555",R.drawable.sedeturbo,"Uraba, Antioquia"))
        allSede.add(Sede("Sede Apartadò"," Seccional Uraba","7.8699295","-76.6366763",R.drawable.sedeapartado,"Apartadó, Antioquia"))
        allSede.add(Sede("Sede Tulenapa","seccional Uraba","7.7738284","-76.6637863",R.drawable.sedecarepa,"Carepa, Antioquia"))
    }
}
