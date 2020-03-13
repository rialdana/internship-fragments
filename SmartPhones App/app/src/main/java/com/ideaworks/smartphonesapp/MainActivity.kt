package com.ideaworks.smartphonesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ideaworks.smartphonesapp.fragments.EquipmentListFragment
import com.ideaworks.smartphonesapp.listeners.ActivityListener

class MainActivity : AppCompatActivity(), ActivityListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val fragmentManager = supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, EquipmentListFragment())
            commit()
        }

        setContentView(R.layout.activity_main)
    }

    override fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
            addToBackStack(fragment.tag)
            commit()
        }
    }
}
