package app.cookbook.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import app.cookbook.R;
import app.cookbook.holder.RecipeViewHolder;
import app.cookbook.ui.main.Recipe;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeViewHolder> {

    private List objects;
    private Context context;

    public RecipeAdapter(List objects, Context context) {
        this.objects = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        return new RecipeViewHolder((layoutInflater.inflate(R.layout.recipe_layout, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        holder.bindViewHolder((Recipe) objects.get(position));
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }
}
