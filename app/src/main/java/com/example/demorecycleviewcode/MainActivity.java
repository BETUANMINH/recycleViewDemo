package com.example.demorecycleviewcode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Item 1", "Description 1", R.drawable.ic_launcher_background));
        items.add(new Item("Item 2", "Description 2", R.drawable.ic_launcher_background));
        items.add(new Item("Item 3", "Description 3", R.drawable.ic_launcher_background));
        items.add(new Item("Item 4", "Description 4", R.drawable.ic_launcher_background));
        items.add(new Item("Item 5", "Description 5", R.drawable.ic_launcher_background));
        items.add(new Item("Item 6", "Description 6", R.drawable.ic_launcher_background));
        items.add(new Item("Item 7", "Description 7", R.drawable.ic_launcher_background));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
}
}