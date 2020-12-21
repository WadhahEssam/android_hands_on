package com.example.recyclerlistportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView projectsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Project[] projectsArray = {
                new Project("The first project title", "this is the first description for the first project", R.drawable.ic_launcher_background),
                new Project("The second project title", "this is the second description for the first project", R.drawable.ic_launcher_background)
        };

        projectsRecyclerView = findViewById(R.id.recycler_view_projects);

        projectsRecyclerView.setAdapter(new ProjectsAdapter(projectsArray));


    }
}