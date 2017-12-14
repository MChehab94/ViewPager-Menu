package mchehab.com.viewpagermenu;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        List<Fragment> listFragment = new ArrayList<>();
        listFragment.add(new FirstFragment());
        listFragment.add(new SecondFragment());
        listFragment.add(new ThirdFragment());

        List<String> listTitles = new ArrayList<>();
        listTitles.add("Fragment One");
        listTitles.add("Fragment Two");
        listTitles.add("Fragment Three");

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),
                listFragment, listTitles);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
