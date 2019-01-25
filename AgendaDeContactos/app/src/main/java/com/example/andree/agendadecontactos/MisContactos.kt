package com.example.andree.agendadecontactos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mis_contactos.*

class MisContactos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mis_contactos)
        setUI()
        /*agregar contactos button
        *va a pasarse a otra pantalla
        *va a permitir agregar el contacto en la otra pantalla*/

        agregar_contacto.setOnClickListener {
            val intent1 = Intent(this, agregar_contacto::class.java)
            startActivity(intent1)
            finish()
        }


    }
    fun setUI(){
        text_name1.setText("MENU")
    }
}
