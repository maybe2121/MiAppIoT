package com.example.miappiot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Botón principal
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        // TextViews tipo enlace
        val btnRecuperar = findViewById<TextView>(R.id.btnRecuperar)
        val btnRegistrar = findViewById<TextView>(R.id.btnRegistrar)

        // Acción al presionar "Iniciar Sesión"
        btnLogin.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Inicio de sesión")
                .setMessage("Inicio de sesión exitoso")
                .setPositiveButton("OK", null)
                .show()
        }

        // Acción al presionar "Recuperar Clave"
        btnRecuperar.setOnClickListener {
            startActivity(Intent(this, RecuperarActivity::class.java))
        }

        // Acción al presionar "Registrar Cuenta"
        btnRegistrar.setOnClickListener {
            startActivity(Intent(this, RegistrarActivity::class.java))
        }
    }
}
