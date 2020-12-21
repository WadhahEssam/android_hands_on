package com.example.recyclerlistportfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {

    private Project[] projects;

    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // putting attache to root = true, will not work.
        // you will always write this line of code when you want to specify the layout you want the recycler view to render.
        // in a simpler way, it links the ViewHolder to the actual item layout we created.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_portfolio_item, parent, false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        // here we are going to set the values that we need to the item layout.
        holder.bind(projects[position]);
    }

    // this is the first method that is going to be called.
    @Override
    public int getItemCount() {
        return projects.length;
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder {

        private TextView titleTextView;
        private TextView descriptionTextView;
        private ImageView projectImage;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);

            // linking the xml elements to a variables.
            // you will need to call the findViewById from the itemView variable.
            projectImage = itemView.findViewById(R.id.image_portfolio);
            titleTextView = itemView.findViewById(R.id.text_view_portfolio_title);
            descriptionTextView = itemView.findViewById(R.id.text_view_portfolio_description);
        }

        // this functions is called bind by convention.
        public void bind(Project project) {
            // here we are going to set all the texts and images and variables inside of our item layout
            titleTextView.setText(project.getTitle());
            descriptionTextView.setText(project.getDescription());
            projectImage.setImageResource(project.getImage());
        }
    }
}
