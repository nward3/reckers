package com.nicholasward.reckers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_item_list);

        ArrayList<MenuItem> pizzas = new ArrayList<>();
        pizzas.add(new MenuItem("Cheese Pizza", "Mozzarella, cheddar, and feta cheese", 5.85));
        pizzas.add(new MenuItem("Meat Lover's", "Pizza sauce, ham, pepperoni, sausage, bacon, blended mozzarella", 6.95));
        pizzas.add(new MenuItem("Toscano", "Pesto sauce, ham, spinach, feta cheese, diced tomatoes, blended mozzarella", 6.95));
        pizzas.add(new MenuItem("Garden", "Pesto sauce, tomatoes, feta cheese, red onion, mushrooms, green peppers, blended mozzarella", 6.95));
        pizzas.add(new MenuItem("Hawaiian BBQ", "BBQ sauce, pineapple, ham, blended mozzarella", 6.95));

        MenuItemAdapter adapter = new MenuItemAdapter(this, pizzas);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
