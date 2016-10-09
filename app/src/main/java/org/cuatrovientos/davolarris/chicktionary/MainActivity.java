package org.cuatrovientos.davolarris.chicktionary;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ListView listViewPeople;
    private ArrayList<Person> people;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupData();
        setupCustomList();
    }

    private void setupData () {
        people = new ArrayList<Person>();
        people.add(new Person("Hey", "davo.larris@gmail.com", 46631158, 10, R.drawable.uno));
        people.add(new Person("Guapo", "guapo@gmail.com", 452535, 8, R.drawable.dos));
        people.add(new Person("Jaja", "jajaja@gmail.com", 4567865, 6, R.drawable.tres));
     }


    private void setupCustomList() {


        CustomListAdapter customizedListAdapter = new CustomListAdapter(this, people);



        listViewPeople = (ListView) findViewById(R.id.idListView);

        listViewPeople.setAdapter(customizedListAdapter);


        listViewPeople.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent myIntent = new Intent(MainActivity.this, DetailActivity.class);
                myIntent.putExtra("Persona", people.get(position));
                startActivity(myIntent);
            }
        });

    }

}
