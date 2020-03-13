package com.ideaworks.smartphonesapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ideaworks.smartphonesapp.OBJECT_KEY

import com.ideaworks.smartphonesapp.R
import com.ideaworks.smartphonesapp.models.Equipo

class EquipmentDetailFragment : Fragment() {
    private var equipment: Equipo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            equipment = it.getParcelable(OBJECT_KEY)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_equipment_detail, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(equipo: Equipo) = EquipmentDetailFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(OBJECT_KEY, equipo)
                }
            }
    }
}
