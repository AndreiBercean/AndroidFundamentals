package app.cookbook.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import app.cookbook.R;
import app.cookbook.ui.main.Recipe;

public class RecipeViewHolder extends RecyclerView.ViewHolder{

    private ImageView imageView;
    private TextView titleView;
    private TextView descriptionView;

    public RecipeViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image);
        titleView = itemView.findViewById(R.id.title);
        descriptionView = itemView.findViewById(R.id.description);
    }

    public void bindViewHolder(Recipe recipe) {
        imageView.setImageResource(recipe.getImageId());
        titleView.setText(recipe.getTitle());
        descriptionView.setText(recipe.getDescription());
    }
}
