package com.nicholasward.reckers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BurgerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_item_list);

        ArrayList burgers = new ArrayList<>();
        burgers.add(new MenuItem("Char-Grilled Burger", "Char-grilled 1/4 lb burger patty with pickle, lettuce and tomato", 5.25));
        burgers.add(new MenuItem("Back Yard Burger", "Char-grilled 1/4 lb burger patty with BBQ sauce, bacon, cheddar cheese and onion rings", 6.50));
        burgers.add(new MenuItem("Char-Grilled Chicken Sandwich", "Char-grilled chicken with pick;e, lettuce and tomato", 5.95));

        MenuItemAdapter adapter = new MenuItemAdapter(this, burgers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
