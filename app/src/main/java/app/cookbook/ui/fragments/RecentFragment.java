package app.cookbook.ui.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import app.cookbook.R;
import app.cookbook.RecipeActivity;
import app.cookbook.adapter.RecipeAdapter;
import app.cookbook.model.Recipe;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecentFragment extends Fragment {

    private List<Recipe> recipes = new ArrayList<Recipe>();

    private ListView listView;
    private RecipeAdapter recipeAdapter;

    public RecentFragment(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_recent, container, false);
        listView = v.findViewById(R.id.list_view);
        recipeAdapter = new RecipeAdapter(v.getContext(), recipes);
        recipeAdapter.setObjects(recipes);
        listView.setAdapter(recipeAdapter);

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(parent.getContext(), RecipeActivity.class);
                intent.putExtra("recipe", (Recipe)recipeAdapter.getItem(position));
                startActivity(intent);
            }
        });

        return v;
    }

}
