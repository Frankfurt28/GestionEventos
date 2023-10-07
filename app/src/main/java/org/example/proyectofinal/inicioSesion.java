package org.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.example.proyectofinal.databinding.ActivityMainBinding;

public class inicioSesion extends AppCompatActivity {
    private Button btn_InicioSesion;
    private EditText eT_correo;
    private Button btn_NavBack;
    private Button btn_NavCuentaNueva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        //ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        btn_NavBack = findViewById(R.id.btn_regresar);
        btn_NavCuentaNueva=findViewById(R.id.btn_NavCuentaNueva);
        btn_InicioSesion = findViewById(R.id.btn_inicioSesion);
        eT_correo = findViewById(R.id.eT_correo);

        btn_NavCuentaNueva.setOnClickListener(v -> {
        pressBtn_NavCuentaNueva();
        });

        btn_InicioSesion.setOnClickListener(v -> {
        pressBtn_InicioSesion();
        });
        btn_NavBack.setOnClickListener(v -> {
        pressBtn_NavBack();
        });
    }

    private void pressBtn_InicioSesion(){
            String email= eT_correo.getText().toString();
            if (!email.isEmpty()){

            }else {
                Toast.makeText(this,"Ingrese un correo",Toast.LENGTH_SHORT).show();
            }
    }
    private void pressBtn_NavBack(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private void pressBtn_NavCuentaNueva(){
        Intent intent = new Intent(this,registroOrganizador.class);
        startActivity(intent);
    }
}