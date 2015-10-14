package com.lhu.sampletablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TabLayout tabs;
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = (TabLayout) findViewById(R.id.tabs);
        pager = (ViewPager) findViewById(R.id.pager);

        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

        tabs.setupWithViewPager(pager);

        //tabs.setTabsFromPagerAdapter(adapter);
        tabs.removeAllTabs();

        for (int i = 0; i < 4; i++) {
            tabs.addTab(tabs.newTab().setText("Tab" + i));
        }
    }
}
