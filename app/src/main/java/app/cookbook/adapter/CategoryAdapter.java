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
import app.cookbook.model.Category;

public class CategoryAdapter extends ArrayAdapter {

    private ImageView imageView;
    private TextView titleView;

    private List<Category> objects;
    private Context context;

    public CategoryAdapter(Context context, List<Category> objects) {
        super(context, 0, objects);
        this.objects = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            convertView = inflater.inflate(R.layout.category_layout, parent, false);
        }

        imageView = convertView.findViewById(R.id.image);
        titleView = convertView.findViewById(R.id.title);

        final Category category = objects.get(position);

        imageView.setImageResource(category.getImageId());
        titleView.setText(category.getTitle());

        return convertView;
    }

    public List<Category> getObjects() {
        return objects;
    }

    public void setObjects(List<Category> objects) {
        this.objects = objects;
    }

    public void clearObjects() {
        objects.clear();
    }

    public void refresh(){
        notifyDataSetChanged();
    }
}