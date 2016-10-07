package org.cuatrovientos.davolarris.chicktionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    private Person persona;
    private TextView txtNombre, txtEmail, txtNumero, txtNota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        txtNombre = (TextView)findViewById(R.id.nombre);
        txtEmail = (TextView)findViewById(R.id.idEmail);
        txtNota = (TextView)findViewById(R.id.idMark);
        txtNumero = (TextView)findViewById(R.id.idTel);


        persona = (Person) getIntent().getExtras().getSerializable("Persona");


        txtNombre.setText(persona.getName());
        txtEmail.setText(persona.getEmail());
        txtNota.setText(persona.getRating().toString());
        txtNumero.setText(persona.getPhone().toString());

        setContentView(R.layout.activity_detail);
    }
}
