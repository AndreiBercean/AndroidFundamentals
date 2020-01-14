package app.cookbook.model;

/*
carrots
celery
tomatoes
potatoes
green beans
corn
peas
yellow onion and garlic
*/

import java.util.ArrayList;
import java.util.List;

import app.cookbook.R;

public class ContentCreator {

    public ContentCreator() {
    }

    public List<Category> getCategories(){
        List<Category> output = new ArrayList<>();

        Category pizza = new Category("Pizza", R.drawable.pizza_category, new ArrayList<Recipe>());
        List<Recipe> pizzas = new ArrayList<>();
        List<String> ing = new ArrayList<>();
        ing.add("1 pizza dough");
        ing.add("8 oz Italian salami (cut in half)");
        ing.add("8 oz Parmesan cheese (grated)");
        ing.add("1 cup mozzarella cheese (grated)");
        ing.add("3 mini sweet peppers (cut in rounds)");
        ing.add("1/4 cup red onion (diced)");
        ing.add("1 cup grape tomatoes (sliced lenghtwise)");
        ing.add("1 cup marinara sauce");

        String instr = "Preheat your oven to 450 degrees\n" +
                "Place your baking stone in the oven to heat***\n" +
                "Roll out your pizza dough on a pizza paddle (already sprinkled with corn meal)\n" +
                "Once the oven is preheated, shake your pizza dough off the paddle onto the baking stone and bake for 8 to 10 minutes\n" +
                "Remove pizza crust with baking stone from the oven\n" +
                "Spread marinara sauce all over pizza crust\n" +
                "Sprinkle mozzarella cheese over the sauce\n" +
                "Layout your salami slices, arranged as you like\n" +
                "Sprinkle red onions and sweet peppers over the salami\n" +
                "Sprinkle your grated Parmesan cheese over the whole pizza\n" +
                "Bake until cheese is melted (about 5 to 8 more minutes)\n" +
                "Remove from oven and place your fresh grape tomatoes over the whole pizza\n" +
                "Slice and enjoy eating this tasty pizza";
        pizzas.add(new Recipe("Salami pizza", R.drawable.salami_pizza, "Simple salami pizza, great and easy to make.", ing, instr, true));

        ing = new ArrayList<>();
        ing.add("1 pizza dough");
        ing.add("8 oz Parmesan cheese (grated)");
        ing.add("1 cup mozzarella cheese (grated)");
        ing.add("3 mini sweet peppers (cut in rounds)");
        ing.add("1/4 cup red onion (diced)");
        ing.add("1 cup grape tomatoes (sliced lenghtwise)");
        ing.add("1 cup marinara sauce");
        String instr2 = "Sprinkle yeast over warm water in a small bowl. The water should be no more than 100 degrees F (40 degrees C). Let stand for 5 minutes until yeast softens and begins to form a creamy foam.\n" +
                "Sift flour, sugar, 1 tablespoon oregano, and 1 teaspoon salt into a large bowl. Mix egg and oil into dry ingredients; stir in yeast mixture. When dough has pulled together, turn out onto a lightly floured surface and knead until smooth and elastic, about 8 minutes. Lightly oil a large bowl, then place dough in bowl and turn to coat with oil. Cover with a light cloth and let rise in a warm place (80 to 95 degrees F (27 to 35 degrees C)) until doubled in volume, about 1 hour.\n" +
                "Preheat oven to 450 degrees F (235 degrees C). Lightly grease a baking sheet.\n" +
                "Cook and stir diced tomatoes, tomato paste, onion, 1 tablespoon oregano, garlic, onion powder, 1 teaspoon salt, and pepper in a saucepan over medium heat. Cook until sauce has thickened, 15 to 20 minutes.\n" +
                "Punch down dough and turn it out onto a lightly floured surface. Use a knife to divide dough into two equal pieces--do not tear. Shape dough into rounds and let rest for 10 minutes. Form dough into rectangles, and place onto prepared baking sheet. Spoon tomato sauce over dough. Sprinkle with 1 1/4 cup mozzarella cheese; top with bell pepper, onion, and mushroom. Sprinkle 1/4 cup mozzarella cheese over top.\n" +
                "Bake in preheated oven until crust is browned and crisp and cheese has melted, 20 to 25 minutes.";

        pizzas.add(new Recipe("Vegetarian pizza", R.drawable.vegetarian_pizza, "A healthy and tasty alternative.", ing, instr2, false));
        pizza.setRecipes(pizzas);
        output.add(pizza);

        Category soup = new Category("Soup", R.drawable.soup_category, new ArrayList<Recipe>());
        List<Recipe> soups = new ArrayList<>();

        ing = new ArrayList<>();
        ing.add("carrots");
        ing.add("celery");
        ing.add("tomatoes");
        ing.add("potatoes");
        ing.add("green beans");
        ing.add("corn");
        ing.add("peas");
        ing.add("yellow onion");
        ing.add("garlic");
        String instr3 = "Heat olive oil in a large pot over medium-high heat. \n" +
                "\n" +
                "Add onions, carrots, and celery and saute 4 minutes then add garlic and saute 30 seconds longer.\n" +
                "\n" +
                "Add in broth tomatoes, potatoes, parsley, bay leaves, thyme and season with salt and pepper to taste*.\n" +
                "\n" +
                "Bring to a boil, then add green beans. \n" +
                "\n" +
                "Reduce heat to medium-low, cover and simmer until potatoes are almst fully tender, about 20 - 30 minutes. \n" +
                "\n" +
                "Add corn and peas and cook 5 minutes longer. Serve warm.";

        soups.add(new Recipe("Vegetable soup", R.drawable.vegetable_soup, "Simple and easy to make.", ing, instr3, false));

        ing = new ArrayList<>();
        ing.add("2 tbsp olive oil");
        ing.add("2 onions , finely chopped");
        ing.add("1kg pumpkin or squash (try kabocha), peeled, deseeded and chopped into chunks");
        ing.add("700ml vegetable stock or chicken stock");
        ing.add("150ml double cream");
        String instr4 = "Heat 2 tbsp olive oil in a large saucepan, then gently cook 2 finely chopped onions for 5 mins, until soft but not coloured.\n" +
                "\n" +
                "Add 1kg pumpkin or squash, cut into chunks, to the pan, then carry on cooking for 8-10 mins, stirring occasionally until it starts to soften and turn golden.\n" +
                "\n" +
                "Pour 700ml vegetable or chicken stock into the pan and season with salt and pepper. Bring to the boil, then simmer for 10 mins until the squash is very soft.\n" +
                "\n" +
                "Pour 150ml double cream into the pan, bring back to the boil, then purée with a hand blender. For an extra-velvety consistency you can pour the soup through a fine sieve. The soup can now be frozen for up to 2 months.\n" +
                "\n" +
                "To make the croutons: cut 4 slices wholemeal seeded bread into small squares.\n" +
                "\n" +
                "Heat 2 tbsp olive oil in a frying pan, then fry the bread until it starts to become crisp.\n" +
                "\n" +
                "Add a handful of pumpkin seeds to the pan, then cook for a few mins more until they are toasted. These can be made a day ahead and stored in an airtight container.\n" +
                "\n" +
                "Reheat the soup if needed, taste for seasoning, then serve scattered with croutons and seeds and drizzled with more olive oil, if you want.";

        soups.add(new Recipe("Pumpkin soup", R.drawable.pumpkin_soup, "A healthy and tasty, great in autumn.", ing, instr4, true));
        soup.setRecipes(soups);
        output.add(soup);

        return output;
    }
}
