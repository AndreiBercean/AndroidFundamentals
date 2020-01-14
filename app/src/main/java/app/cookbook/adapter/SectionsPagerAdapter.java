package app.cookbook.adapter;

import android.content.Context;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import app.cookbook.R;
import app.cookbook.model.Category;
import app.cookbook.model.ContentCreator;
import app.cookbook.ui.fragments.CategoriesFragment;
import app.cookbook.ui.fragments.RecentFragment;
import app.cookbook.model.Recipe;
import app.cookbook.ui.fragments.TopFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    List<Category> categories = new ArrayList<>();
    ContentCreator contentCreator = new ContentCreator();

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        categories = contentCreator.getCategories();
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0:
                List<Recipe> recent = new ArrayList<>();
                for(Category c: categories){
                    recent.addAll(c.getRecent());
                }
                return new RecentFragment(categories.get(0).getRecipes());
            case 1:
                List<Recipe> top = new ArrayList<>();
                for(Category c: categories){
                    top.addAll(c.getTop());
                }
                return new TopFragment(top);
            case 2:
                return new CategoriesFragment(categories);
            default:
                return null;
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