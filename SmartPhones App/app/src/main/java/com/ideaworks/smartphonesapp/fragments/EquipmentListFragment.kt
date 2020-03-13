package com.ideaworks.smartphonesapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.ideaworks.smartphonesapp.R
import com.ideaworks.smartphonesapp.adapters.EquiposAdapter
import com.ideaworks.smartphonesapp.models.Equipo
import com.ideaworks.smartphonesapp.models.Properties
import java.util.ArrayList

/**
 * A simple [Fragment] subclass.
 */
class EquipmentListFragment : Fragment(), EquiposAdapter.OnClickListener {

    private lateinit var recyclerViewEquipos: RecyclerView
    private var equiposList = arrayListOf<Equipo>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_equipment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerViewEquipos = view.findViewById(R.id.recyclerview_equipos)

        equiposList = getEquiposList()

        recyclerViewEquipos.adapter = EquiposAdapter(equiposList, this)

    }

    private fun getEquiposList(): ArrayList<Equipo> {
        return arrayListOf(
            Equipo(
                "Galaxy s9",
                10,
                "https://i.gadgets360cdn.com/products/large/1519585124_635_samsung_galaxy_s9_blue.jpg",
                Properties(
                    "4gb",
                    "Intel",
                    true
                )
            ),

            Equipo(
                "Galaxy s10",
                8,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSq0GDki9MC_-zdwgx0K517gCEPJf0JUg27Nd62R185vjtqtu28",
                Properties(
                    "6gb",
                    "AMD",
                    true
                )
            ),

            Equipo(
                "iPhone 11",
                100,
                "https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/iphone-11-pro-select-2019-family?wid=882&amp;hei=1058&amp;fmt=jpeg&amp;qlt=80&amp;op_usm=0.5,0.5&amp;.v=1567812930312",
                Properties(
                    "3gb",
                    "Apple",
                    false
                )
            )
        )
    }

    override fun showEquipmentDetail(equipo: Equipo) {

    }


}
