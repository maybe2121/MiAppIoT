package com.example.miappiot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class RegistrarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        val btnCrearCuenta = findViewById<Button>(R.id.btnCrearCuenta)
        val btnVolverLogin2 = findViewById<Button>(R.id.btnVolverLogin2)

        // Botón CREAR CUENTA
        btnCrearCuenta.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Cuenta Creada")
                .setMessage("Tu cuenta ha sido registrada exitosamente")
                .setPositiveButton("OK", null)
                .show()
        }

        // Botón VOLVER AL LOGIN
        btnVolverLogin2.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()  // Cierra esta pantalla al volver
        }
    }
}