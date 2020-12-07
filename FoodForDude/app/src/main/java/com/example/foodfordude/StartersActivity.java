package com.example.foodfordude;

import androidx.appcompat.app.AppCompatActivity;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {
    ListView startersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);
        startersList = findViewById(R.id.list_view_menu);

        ListItem[] listItems = {
                new ListItem("the first element", "the description for it", 2134),
                new ListItem("the second element", "the description for it", 2134),
                new ListItem("the forth element", "the description for it", 2134)
        };
        ArrayAdapter<ListItem> listContentsArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listItems);
        startersList.setAdapter(listContentsArrayAdapter);

//        Simple List View Example
//        String[] listContents = {
//                "first item",
//                "second item",
//                "third item"
//        };
//        // this is using an already made simple layout provided by android and you can actually make your own
//        ArrayAdapter<String> listContentsArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listContents);
//        startersList.setAdapter(listContentsArrayAdapter);
    }
}