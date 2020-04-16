package com.example.practicamaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedCallback

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    private fun setMarkers(
        latitud: String?,
        longitud: String?,
        name: String?,
        seccio:String?
    ) {
        val marker = LatLng(latitud!!.toDouble(), longitud!!.toDouble())
        mMap.addMarker(
            MarkerOptions()
                .position(marker)
                .title(name)
                .snippet(seccio)
        )
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker, 17.0F))
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        val lati:String? = intent.getStringExtra("lati")
        val lon:String? = intent.getStringExtra("lon")
        val name:String? = intent.getStringExtra("nombre")
        val seccio:String = intent.getStringExtra("seccio")
        setMarkers(lati,lon,name,seccio)

    }


}
