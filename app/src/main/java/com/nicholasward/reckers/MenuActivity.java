package com.nicholasward.reckers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // find the view for the pizzas
        TextView pizzas = (TextView) findViewById(R.id.pizzas);
        pizzas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // new intent to open PizzaActivity
                Intent pizzasIntent = new Intent(MenuActivity.this, PizzaActivity.class);

                // start the new activity
                startActivity(pizzasIntent);
            }

        });

        // find the view for the piadinas
        TextView piadinas = (TextView) findViewById(R.id.piadinas);
        piadinas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // new intent to open PizzaActivity
                Intent piadinasIntent = new Intent(MenuActivity.this, PiadinaActivity.class);

                // start the new activity
                startActivity(piadinasIntent);
            }

        });

        // find the view for the burgers
        TextView burgers = (TextView) findViewById(R.id.burgers);
        burgers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // new intent to open PizzaActivity
                Intent burgersIntent = new Intent(MenuActivity.this, BurgerActivity.class);

                // start the new activity
                startActivity(burgersIntent);
            }

        });

        // find the view for the salads
        TextView salads = (TextView) findViewById(R.id.salads);
        salads.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // new intent to open PizzaActivity
                Intent saladsIntent = new Intent(MenuActivity.this, SaladActivity.class);

                // start the new activity
                startActivity(saladsIntent);
            }

        });

        // find the view for the smoothies
        TextView smoothies = (TextView) findViewById(R.id.smoothies);
        smoothies.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // new intent to open PizzaActivity
                Intent smoothiesIntent = new Intent(MenuActivity.this, SmoothieActivity.class);

                // start the new activity
                startActivity(smoothiesIntent);
            }

        });

        // find the view for the coffee
        TextView coffee = (TextView) findViewById(R.id.coffee);
        coffee.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // new intent to open PizzaActivity
                Intent coffeeIntent = new Intent(MenuActivity.this, CoffeeActivity.class);

                // start the new activity
                startActivity(coffeeIntent);
            }

        });
    }
}
