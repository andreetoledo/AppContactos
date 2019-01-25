package com.example.andree.agendadecontactos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_crear__contacto.*

class Crear_Contacto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear__contacto)

        regresar.setOnClickListener {
            val intento2 = Intent(this, MisContactos::class.java)
            startActivity(intento2)
            finish()

        }
    }
}
