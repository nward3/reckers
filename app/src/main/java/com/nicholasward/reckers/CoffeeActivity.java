package com.nicholasward.reckers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CoffeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_item_list);

        ArrayList<MenuItem> coffee = new ArrayList<>();
        coffee.add(new MenuItem("Coffee", null, 2.59));
        coffee.add(new MenuItem("Brewed Coffee of the Day", null, 2.19));
        coffee.add(new MenuItem("Hot Chocolate", null, 3.89));
        coffee.add(new MenuItem("Tazzo Chai Latte", null, 3.89));
        coffee.add(new MenuItem("Tazzo Tea", null, 2.19));
        coffee.add(new MenuItem("Coffee Frappuccino", null, 4.15));
        coffee.add(new MenuItem("Vanilla Bean Frappuccino", null, 4.15));
        coffee.add(new MenuItem("Caramel Frappuccino", null, 4.60));
        coffee.add(new MenuItem("Mocha Frappuccino", null, 4.60));
        coffee.add(new MenuItem("Latte", null, 3.89));
        coffee.add(new MenuItem("Mocha", null, 4.09));
        coffee.add(new MenuItem("Cappuccino", null, 3.89));
        coffee.add(new MenuItem("Caramel Macchiato", null, 4.49));
        coffee.add(new MenuItem("Americano", null, 2.69));

        MenuItemAdapter adapter = new MenuItemAdapter(this, coffee);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
