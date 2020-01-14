package app.cookbook.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import app.cookbook.R;
import app.cookbook.model.Recipe;

public class RecipeAdapter extends ArrayAdapter {

    private ImageView imageView;
    private TextView titleView;
    private TextView descriptionView;

    private List<Recipe> objects;
    private Context context;

    public RecipeAdapter(Context context, List<Recipe> objects) {
        super(context, 0, objects);
        this.objects = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            convertView = inflater.inflate(R.layout.recipe_layout, parent, false);
        }

        imageView = convertView.findViewById(R.id.image);
        titleView = convertView.findViewById(R.id.title);
        descriptionView = convertView.findViewById(R.id.description);

        final Recipe recipe = objects.get(position);

        imageView.setImageResource(recipe.getImageId());
        titleView.setText(recipe.getTitle());
        descriptionView.setText(recipe.getDescription());

        return convertView;
    }

    public List<Recipe> getObjects() {
        return objects;
    }

    public void setObjects(List<Recipe> objects) {
        this.objects = objects;
    }

    public void clearObjects() {
        objects.clear();
    }

    public void refresh(){
        notifyDataSetChanged();
    }
}
