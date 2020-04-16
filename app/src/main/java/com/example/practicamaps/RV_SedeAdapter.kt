package com.example.practicamaps

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.core.graphics.drawable.toBitmap
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class RV_SedeAdapter(private val context: Context, private val sedesList: ArrayList<Sede>) : RecyclerView.Adapter<RV_SedeAdapter.SedesViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SedesViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        return SedesViewHolder(itemView, context)
    }

    override fun getItemCount(): Int = sedesList.size

    override fun onBindViewHolder(holder: SedesViewHolder, position: Int) {
        val sede: Sede = sedesList.get(position)
        holder.bindDeudor(sede)
    }


    class SedesViewHolder(
        itemView: View,
        context: Context
    ) : RecyclerView.ViewHolder(itemView) {

        fun bindDeudor(sede: Sede) {
            itemView.tv_title.text =  sede.nombre
            itemView.iv_sede.setImageResource(sede.foto)
            itemView.tv_location.text=sede.location

            itemView.setOnClickListener {
                goToMaps(sede.latitud,sede.longitud, it.context,sede.nombre,sede.secional)
            }
        }


        fun goToMaps(lati:String,lon: String,context: Context,name:String,seccio:String){
            val intent= Intent(context,MapsActivity::class.java)
            intent.putExtra("lati", lati)
            intent.putExtra("lon", lon)
            intent.putExtra("nombre",name)
            intent.putExtra("seccio",seccio)
            context.startActivity(intent)
        }
    }




}