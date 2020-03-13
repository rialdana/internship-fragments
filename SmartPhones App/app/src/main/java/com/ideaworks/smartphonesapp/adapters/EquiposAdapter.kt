package com.ideaworks.smartphonesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ideaworks.smartphonesapp.R
import com.ideaworks.smartphonesapp.models.Equipo

class EquiposAdapter(private val equipos: ArrayList<Equipo>, private val listener: OnClickListener) :
    RecyclerView.Adapter<EquiposAdapter.EquiposViewHolder>() {


    inner class EquiposViewHolder(itemView: View, private val listener: OnClickListener) : RecyclerView.ViewHolder(itemView) {
        lateinit var image: ImageView
        lateinit var title: TextView
        lateinit var container: View

        fun bindData(equipo: Equipo) {
            image = itemView.findViewById(R.id.image_equipment_detail)
            title = itemView.findViewById(R.id.text_equipment_name)
            container = itemView.findViewById(R.id.container_equipo)

            container.setOnClickListener {
                listener.showEquipmentDetail(equipo)
            }

            Glide.with(itemView).load(equipo.image).into(image)
            title.text = equipo.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EquiposViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_equipo, parent, false)

        return EquiposViewHolder(view, listener)

    }

    override fun getItemCount(): Int {
        return equipos.size
    }

    override fun onBindViewHolder(holder: EquiposViewHolder, position: Int) {
        holder.bindData(equipos[position])
    }

    interface OnClickListener{
        fun showEquipmentDetail(equipo: Equipo)
    }
}