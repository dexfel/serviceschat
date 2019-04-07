package com.example.serviceschat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    private CircleImageView fotoPerfil;
    private TextView nombre;
    private RecyclerView rvMensajes;
    private EditText txtMensaje;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fotoPerfil=(CircleImageView) findViewById(R.id.fotoPerfil);
        nombre=(TextView) findViewById(R.id.nombre);
        rvMensajes=(RecyclerView) findViewById(R.id.rvMensajes);
        txtMensaje=(EditText) findViewById(R.id.txtMensaje);
        btnEnviar=(Button) findViewById(R.id.btnEnviar);

    }
}
