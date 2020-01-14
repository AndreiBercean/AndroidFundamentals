package app.cookbook.ui.main;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import app.cookbook.R;
import app.cookbook.adapter.RecipeAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {

    private List<Recipe> recipes = new ArrayList<Recipe>();

    private RecyclerView recyclerView;
    private RecipeAdapter recipeAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public TopFragment(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_top, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager( v.getContext()));
        recipeAdapter = new RecipeAdapter(recipes, v.getContext());
        recyclerView.setAdapter(recipeAdapter);

        return v;
    }

}
