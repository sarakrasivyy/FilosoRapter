package com.example.filosorapter

import android.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.filosorapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var nbinding: ActivityMainBinding
private lateinit var nActiveFragment: androidx.fragment.app.Fragment
private lateinit var nFragmentManager: FragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(nbinding.root)
        setbottonnav()
    }
 private fun setbottonnav(){
     nFragmentManager= supportFragmentManager

      val homefragment= HomeFragment()
      val addfragment= AddFragment()
      val perfilfragment= PerfilFragment()

        nActiveFragment= homefragment

     nFragmentManager.beginTransaction().add(R.id.hostfragmento,perfilfragment,
         perfilfragment::class.java.name).hide(perfilfragment).commit()
     nFragmentManager.beginTransaction().add(R.id.hostfragmento,addfragment,
         addfragment::class.java.name).hide(addfragment).commit()
     nFragmentManager.beginTransaction().add(R.id.hostfragmento, homefragment
         ,homefragment::class.java.name).hide(homefragment).commit()

     nbinding.btnavegate.setOnNavigationItemSelectedListener{
         when(it.itemId){
             R.id.home->{
                 nFragmentManager.beginTransaction().hide(nActiveFragment).show(homefragment).commit()
                 nActiveFragment=homefragment
                 true}
                 R.id.add->{
                 nFragmentManager.beginTransaction().hide(nActiveFragment).show(homefragment).commit()
                 nActiveFragment=addfragment
                 true}
                 R.id.perfi->{
                 nFragmentManager.beginTransaction().hide(nActiveFragment).show(homefragment).commit()
                 nActiveFragment=perfilfragment
                 true}

         else-> false
         }

     }

 } }


