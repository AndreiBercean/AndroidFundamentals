package app.cookbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import app.cookbook.model.Recipe;

public class RecipeActivity extends AppCompatActivity {

    TextView title, description, ingredients, instructions;
    ImageView imageView;
    Recipe recipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        title = findViewById(R.id.title);
        description = findViewById(R.id.description);
        ingredients = findViewById(R.id.ingredients);
        instructions = findViewById(R.id.instructions);
        imageView = findViewById(R.id.image);

        recipe = (Recipe)getIntent().getSerializableExtra("recipe");

        imageView.setImageResource(recipe.getImageId());
        title.setText(recipe.getTitle());
        description.setText(recipe.getDescription());
        String s = "";
        for(String i: recipe.getIngredients()){
            s += i + "\n";
        }
        ingredients.setText(s);
        instructions.setText(recipe.getInstructions());
    }
}
