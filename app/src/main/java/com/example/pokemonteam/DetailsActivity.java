package com.example.pokemonteam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pokemonteam.classes.Pokemon;

public class DetailsActivity extends AppCompatActivity {

    TextView nameTextView;
    TextView numberTextView;
    TextView typeTextView;
    TextView abilityTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        numberTextView = (TextView) findViewById(R.id.numberTextView);
        typeTextView = (TextView) findViewById(R.id.typeTextView);
        abilityTextView = (TextView) findViewById(R.id.abilityTextView);
        imageView = (ImageView) findViewById(R.id.imageView);

        Pokemon pokemon = (Pokemon) getIntent().getSerializableExtra("pokemon");
        imageView.setImageResource(pokemon.getResID());
        nameTextView.setText(pokemon.getName());
        numberTextView.setText("#" + pokemon.getNumber());
        typeTextView.setText("Type: " + pokemon.getType());
        abilityTextView.setText("Ability: " + pokemon.getAbility());



        /* String name = (String) getIntent().getExtras().get("name");
        nameTextView.setText(name);

        if (name.equals("Munchlax")) {
            imageView.setImageResource(R.mipmap.munchlax);
            numberTextView.setText("#542");
            typeTextView.setText("Type: Normal");
            abilityTextView.setText("Abliity: Pickup");
        }
        if (name.equals("Greninja")) {
            imageView.setImageResource(R.mipmap.greninja);
            numberTextView.setText("#4513");
            typeTextView.setText("Type: Water | Dark");
            abilityTextView.setText("Ability: Ninja Stars");
        }
        */

    }
}