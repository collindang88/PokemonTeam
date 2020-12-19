package com.example.pokemonteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pokemonteam.classes.Pokemon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    List<Pokemon> pokemonTeam;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        pokemonTeam = new ArrayList<>();

        pokemonTeam.add(new Pokemon("Munchlax", 453, "Normal", "Pickup", R.mipmap.munchlax));
        pokemonTeam.add(new Pokemon("Greninja", 453, "Water | Dark", "Sneaky", R.mipmap.greninja));
        pokemonTeam.add(new Pokemon("Grumpig", 453, "Psychic", "Thick Fat", R.mipmap.grumpig));
        pokemonTeam.add(new Pokemon("Snivy", 453, "Grass", "Overgrow", R.mipmap.snivy));
        pokemonTeam.add(new Pokemon("Lucario", 453, "Steel | Fighting", "Intimidate", R.mipmap.lucario));


        ArrayAdapter<Pokemon> adapter = new ArrayAdapter<Pokemon>(getBaseContext(), android.R.layout.simple_list_item_1, pokemonTeam);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent detailIntent = new Intent(getBaseContext(), DetailsActivity.class);
        detailIntent.putExtra("pokemon", (Serializable) pokemonTeam.get(position));
        startActivity(detailIntent);
    }
}