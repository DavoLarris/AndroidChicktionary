package org.cuatrovientos.davolarris.chicktionary;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        people.add(new Person("Hey", "davo.larris@gmail.com", 46631158, 10, "yo.png"));
        people.add(new Person("Guapo", "guapo@gmail.com", 452535, 8, "yo.png"));
        people.add(new Person("Jaja", "jajaja@gmail.com", 4567865, 6, "yo.png"));
     }


    private void setupCustomList() {

        ListAdapter customizedListAdapter = new ListAdapter(this, people);

        listViewPeople = (ListView) findViewById(R.id.idListView);

        listViewPeople.setAdapter(customizedListAdapter);


        listViewPeople.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "You pressed " + position, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
