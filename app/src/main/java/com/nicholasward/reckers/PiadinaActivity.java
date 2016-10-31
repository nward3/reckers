package com.nicholasward.reckers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PiadinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_item_list);

        ArrayList<MenuItem> piadinas = new ArrayList<>();
        piadinas.add(new MenuItem("Italian BLT", "Bacon, diced tomatoes, house greens, blended bozzarella cheese and pesto mayonnaise", 6.05));
        piadinas.add(new MenuItem("Chicken Caesar", "Grilled chicken, house greens, parmesan and caesar dressing", 6.45));
        piadinas.add(new MenuItem("Buffalo Chicken", "Grilled chicken, red onion, diced tomatoes, blue cheese, and buffalo wild mild sauce", 6.35));
        piadinas.add(new MenuItem("Veggie", "Red onions, sliced mushrooms, diced tomatoes, house greens, and pesto sauce", 5.75));

        MenuItemAdapter adapter = new MenuItemAdapter(this, piadinas);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
