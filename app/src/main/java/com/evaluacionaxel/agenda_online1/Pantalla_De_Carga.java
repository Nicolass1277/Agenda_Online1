package com.evaluacionaxel.agenda_online1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pantalla_De_Carga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_de_carga);

        // Simular tiempo de carga
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Pantalla_De_Carga.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000); // Espera de 3 segundos
    }
}


