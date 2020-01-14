package app.cookbook.adapter;

import android.content.Context;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import app.cookbook.R;
import app.cookbook.ui.main.CategoriesFragment;
import app.cookbook.ui.main.PlaceholderFragment;
import app.cookbook.ui.main.RecentFragment;
import app.cookbook.ui.main.Recipe;
import app.cookbook.ui.main.TopFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    List<Recipe> recipes = new ArrayList<>();


    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        recipes.add(new Recipe("Pizza",R.drawable.pizza, "IT IS PIZZA MAN a loot of pizzaaaaaaaaa sda ds fas dfas fa sf asf asf as f asfasfasfasf", new ArrayList<String>(), "Instr"));
        recipes.add(new Recipe("Pizza2", R.drawable.pizza, "IT IS PIZZA MAN a loot of pizzaaaaaaaaa sda ds fas dfas fa sf asf asf as f asfasfasfasf", new ArrayList<String>(), "Instr"));
        recipes.add(new Recipe("Pizza3", R.drawable.pizza, "IT IS PIZZA MAN a loot of pizzaaaaaaaaa sda ds fas dfas fa sf asf asf as f asfasfasfasf", new ArrayList<String>(), "Instr"));
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0:
                return new RecentFragment(recipes);
            case 1:
                return new TopFragment(recipes);
            case 2:
                return new CategoriesFragment();
            default:
                return PlaceholderFragment.newInstance(position + 1);
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Log.d("SPA", position+"");
        switch (position){
            case 0:
                return "Recent";
            case 1:
                return "Top viewed";
            case 2:
                return "Categories";
            default:
                return "DEFAULT";
        }
        //return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}