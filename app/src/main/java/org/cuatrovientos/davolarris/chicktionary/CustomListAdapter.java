package org.cuatrovientos.davolarris.chicktionary;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by David on 06/10/2016.
 */

public class CustomListAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<Person> people;


    public CustomListAdapter(Activity act, ArrayList<Person> peo) {
        super();
        this.activity = act;
        this.people = peo;
    }

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public Object getItem(int position) {
        return people.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.list_row, null);

        }

        Person persona = people.get(position);

        ImageView imageViewIcon = (ImageView) v.findViewById(R.id.picture);
        imageViewIcon.setImageResource(persona.getFoto());

        TextView textViewTitle = (TextView) v.findViewById(R.id.nombre);
        textViewTitle.setText(persona.getName());

        TextView textViewText = (TextView) v.findViewById(R.id.puntacion);
        textViewText.setText(persona.getRating().toString());

        return v;
    }
}
