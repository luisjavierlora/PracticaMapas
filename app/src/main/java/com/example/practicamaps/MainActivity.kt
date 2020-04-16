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

        allSede.add(Sede("Sede Medellin","campus Principal","6.2677479","-75.5710303",R.mipmap.campus,"Medellin, Colombia"))
        allSede.add(Sede("Sede Turbo","siencias del mar","8.1005917","76.7163555",R.mipmap.sedeturbo,"Uraba, Antioquia"))
        allSede.add(Sede("Sede Apartadò"," seccional Uraba","7.8699295","-76.6366763",R.mipmap.sedeapartado,"Apartadó, Antioquia"))
        allSede.add(Sede("Sede Tulenapa","seccional Uraba","7.7738284","-76.6637863",R.mipmap.sedecarepa,"Carepa, Antioquia"))
        allSede.add(Sede(  "Sede Bajo cauca","seccional Bajo Cauca", "7.9937688",  "-75.1953623", R.mipmap.sedebajocauca,"Caucasia, Antioquia" ))
        allSede.add(Sede(  "Sede Norte Yarumal", "Seccional Norte Yarumal", "6.9644149", "-75.5302546", R.mipmap.sedeyarumal,"Yarumal, Antioquia" ))
        allSede.add(Sede(  "Sede Amalfi","seccional Amalfi", "6.9070564", "-75.0762484", R.mipmap.sedeamalfi,"Amalfi, Antioquia" ))
        allSede.add(Sede(  "Distrito minero Segovia Remedios", "seccional Distrito minero Segovia Remedios",  "7.081029",   "-74.703066",  R.mipmap.sededistrito,"Segovia, Antioquia"))
        allSede.add(Sede(  "Sede Magdalena Medio", "seccional Magdalena Medio",  "6.492137",  "-74.409268",  R.mipmap.sedemagdalena,"Puerto Berrío, Antioquia" ))
        allSede.add(Sede(  "Sede oriente", "seccional oriente","6.0626738","-75.5286885",R.mipmap.sedeoriente,"Rionegro, Antioquia"))
        allSede.add(Sede(  "Sede Sonsón",  "seccional Sonsón", "5.717653",  "-75.297787", R.mipmap.sedesonson,"Sonson,Antioquia" ))
        allSede.add(Sede(  "Sede Occidente","seccional Occidente", "6.555013",  "-75.826472",  R.mipmap.sedeocci, "Santa Fe de Antioquia, Antioquia" ))
        allSede.add(Sede(  "Sede Suroeste", "seccional Suroeste", "5.692518",  "-75.881834",  R.mipmap.sedesuro,"Andes, Antioquia"))
    }
}
