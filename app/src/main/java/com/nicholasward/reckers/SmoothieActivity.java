package com.nicholasward.reckers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.M;

public class SmoothieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_item_list);

        final ArrayList<MenuItem> smoothies = new ArrayList<>();
        smoothies.add(new MenuItem("Wild Strawberry", "Strawberries blended with kiwi lime sorbet & booster", 4.75));
        smoothies.add(new MenuItem("Maui Mango", "Mango sorbet blended with mango, strawberries, bananas & booster", 4.75));
        smoothies.add(new MenuItem("Tropical Therapy", "Pineapple and coconut blended with kiwi lime sorbet & booster", 4.75));
        smoothies.add(new MenuItem("Caribbean Craze", "Sorbet blended with strawberries, bananas & booster", 4.75));
        smoothies.add(new MenuItem("Mango Me Crazy", "Mango sorbet blended with mango, pineapple, & booster", 4.75));
        smoothies.add(new MenuItem("Cookie Dough", "Greek yogurt blended with gluten-free chocolate chip cookie dough & booster", 4.75));
        smoothies.add(new MenuItem("Jamican Jammer", "Strawberries and bananas blended with fat-free Greek yogurt & booster", 4.75));
        smoothies.add(new MenuItem("Peach on the Beach", "Peaches, strawberries and mango blended with orange sorbet & booster", 4.75));
        smoothies.add(new MenuItem("Orange Sunrise", "Orange sorbet blended with pineapple, strawberries, bananas & booster", 4.75));
        smoothies.add(new MenuItem("Purple Reign", "Blueberries blended with Pom-raspberry sorbet, strawberries & booster", 4.75));
        smoothies.add(new MenuItem("Bangin' Berry", "Blueberries and bananas blended with Pom-raspberry sorbet & booster", 4.75));
        smoothies.add(new MenuItem("Oh Kale!", "Organic kale, spinach & 14 greens blended with mango, pineapple and mango sorbet", 4.99));
        smoothies.add(new MenuItem("Super Red", "Apples, strawberries, pineapple blended with mango sorbet & 4 organic veggies", 4.99));
        smoothies.add(new MenuItem("Peanut Butter Protein", "Peanut butter, bananas, chocolate & fat-free Greek yogurt blended with muscle-building protein", 4.99));

        MenuItemAdapter adapter = new MenuItemAdapter(this, smoothies);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
