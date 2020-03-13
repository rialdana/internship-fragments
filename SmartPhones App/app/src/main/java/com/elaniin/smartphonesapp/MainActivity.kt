package com.elaniin.smartphonesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elaniin.smartphonesapp.fragments.EquipmentDetailFragment
import com.elaniin.smartphonesapp.fragments.EquipmentListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargando el primer fragment
        val fragmentManager = supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, EquipmentListFragment())
            commit()
        }

        setContentView(R.layout.activity_main)
    }
}
