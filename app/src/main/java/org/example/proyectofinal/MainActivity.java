package org.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_NavInicioSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_NavInicioSesion = findViewById(R.id.btn_NaviniciarSesion);

        btn_NavInicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInicioSesionAcitvity();
            }
        });

    }
    private void openInicioSesionAcitvity(){
        Intent intent = new Intent(this,inicioSesion.class);
        startActivity(intent);
    }

}