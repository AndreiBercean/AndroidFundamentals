package app.cookbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import app.cookbook.adapter.RecipeAdapter;
import app.cookbook.model.Category;
import app.cookbook.model.Recipe;

public class CategoryActivity extends AppCompatActivity {

    TextView titleView;
    ImageView imageView;
    Category category;
    ListView listView;
    RecipeAdapter recipeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        category = (Category) getIntent().getSerializableExtra("category");
        listView = findViewById(R.id.list_view);
        imageView = findViewById(R.id.image);
        titleView = findViewById(R.id.title);

        titleView.setText(category.getTitle());
        imageView.setImageResource(category.getImageId());

        recipeAdapter = new RecipeAdapter(this, category.getRecipes());
        recipeAdapter.setObjects(category.getRecipes());
        listView.setAdapter(recipeAdapter);

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ((Recipe)recipeAdapter.getItem(position)).setRecent(true);
                Intent intent = new Intent(parent.getContext(), RecipeActivity.class);
                intent.putExtra("recipe", (Recipe)recipeAdapter.getItem(position));
                startActivity(intent);
            }
        });
    }
}
