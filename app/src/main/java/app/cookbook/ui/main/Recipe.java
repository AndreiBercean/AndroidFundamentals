package app.cookbook.ui.main;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    String title;
    Integer imageId;
    String description;
    List<String> ingredients = new ArrayList<>();
    String instructions;

    public Recipe(String title, Integer imageId, String description, List<String> ingredients, String instructions) {
        this.title = title;
        this.imageId = imageId;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
