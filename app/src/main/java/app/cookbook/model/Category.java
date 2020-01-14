package app.cookbook.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Category implements Serializable {
    String title;
    Integer imageId;
    List<Recipe> recipes = new ArrayList<>();

    public Category(String title, Integer imageId, List<Recipe> recipes) {
        this.title = title;
        this.imageId = imageId;
        this.recipes = recipes;
    }

    public void add(Recipe recipe){
        recipes.add(recipe);
    }

    public List<Recipe> getTop() {
        List<Recipe> output = new ArrayList<>();
        for(Recipe r : recipes){
            if(r.getTop())output.add(r);
        }
        return output;
    }

    public List<Recipe> getRecent() {
        List<Recipe> output = new ArrayList<>();
        for(Recipe r : recipes){
            if(r.isRecent())output.add(r);
        }
        return output;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
