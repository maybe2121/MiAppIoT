package com.example.miappiot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class RecuperarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar)

        val btnEnviarClave = findViewById<Button>(R.id.btnEnviarClave)
        val btnVolverLogin = findViewById<Button>(R.id.btnVolverLogin)

        // Botón ENVIAR CLAVE
        btnEnviarClave.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Clave Enviada")
                .setMessage("Se ha enviado una clave temporal a tu email")
                .setPositiveButton("OK", null)
                .show()
        }

        // Botón VOLVER AL LOGIN
        btnVolverLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()  // Cierra esta pantalla al volver
        }
    }
}