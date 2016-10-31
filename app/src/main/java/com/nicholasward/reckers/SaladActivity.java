package com.nicholasward.reckers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SaladActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_item_list);

        final ArrayList<MenuItem> salads = new ArrayList<>();
        salads.add(new MenuItem("Grilled Chicken Caesar", "House greens, grilled chicken, parmesan, seasoned croutons and caesar dressing", 6.25));
        salads.add(new MenuItem("Grilled Chicken Buffalo", "House greens, grilled chicken, blue cheese, red onions, bacon, tomatoes, & spicy buffalo dressing", 6.45));
        salads.add(new MenuItem("Recker's House Salad", "House greens, cucumbers, diced tomatoes, sliced mushrooms, red onions, seasoned croutons and your choice of dressing", 4.35));

        MenuItemAdapter adapter = new MenuItemAdapter(this, salads);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
