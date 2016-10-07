package org.cuatrovientos.davolarris.chicktionary;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private Person persona;
    private TextView txtNombre, txtEmail, txtNumero, txtNota;
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        createActionBar();

        txtNombre = (TextView)findViewById(R.id.idNombre);
        txtEmail = (TextView)findViewById(R.id.idEmail);
        txtNota = (TextView)findViewById(R.id.idMark);
        txtNumero = (TextView)findViewById(R.id.idTel);
        progress = (ProgressBar)findViewById(R.id.progressBar2);



        persona = (Person) getIntent().getExtras().getSerializable("Persona"); //getIntent().getSerializableExtra("Persona")


        if (persona != null) {
            txtNombre.setText(persona.getName());
            txtEmail.setText(persona.getEmail());
            txtNota.setText(persona.getRating().toString());
            txtNumero.setText(persona.getPhone().toString());
            progress.setProgress(persona.getRating());
        }


    }

    private void createActionBar(){
        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
