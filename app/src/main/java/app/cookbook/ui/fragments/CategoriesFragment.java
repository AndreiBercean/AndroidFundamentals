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

import app.cookbook.CategoryActivity;
import app.cookbook.R;
import app.cookbook.RecipeActivity;
import app.cookbook.adapter.CategoryAdapter;
import app.cookbook.model.Category;
import app.cookbook.model.Recipe;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoriesFragment extends Fragment {

    private List<Category> categories = new ArrayList<Category>();

    private ListView listView;
    private CategoryAdapter categoryAdapter;

    public CategoriesFragment(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_categories, container, false);

        listView = v.findViewById(R.id.list_view);
        categoryAdapter = new CategoryAdapter(v.getContext(), categories);
        listView.setAdapter(categoryAdapter);

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(parent.getContext(), CategoryActivity.class);
                intent.putExtra("category", (Category)categoryAdapter.getItem(position));
                startActivity(intent);
            }
        });
        return v;
    }

}
