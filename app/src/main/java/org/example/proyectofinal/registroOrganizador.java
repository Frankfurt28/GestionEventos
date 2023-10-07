package org.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class registroOrganizador extends AppCompatActivity {


    private Button btn_NavBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_organizador);
        btn_NavBack = findViewById(R.id.btn_regresar);

        btn_NavBack.setOnClickListener(v -> {
            pressBtn_NavBack();
        });
    }
    private void pressBtn_NavBack(){
        Intent intent = new Intent(this,inicioSesion.class);
        startActivity(intent);
    }
}