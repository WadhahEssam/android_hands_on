package com.example.foodfordude;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    ListView mainCoursesList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        mainCoursesList = findViewById(R.id.list_view_main_courses);

        ListItem[] listItems = {
                new ListItem("the first element", "the description for it", 2134),
                new ListItem("the second element", "the description for it", 2134),
                new ListItem("the forth element", "the description for it", 2134)
        };
        ArrayAdapter<ListItem> listContentsArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listItems);
        mainCoursesList.setAdapter(listContentsArrayAdapter);
    }
}
