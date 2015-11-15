package com.example.zjl.healthcaremobile;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import static android.widget.RadioGroup.*;

public class Info_Search extends AppCompatActivity {

//    private static final int NUM_PAGES = 3;

//    private List<View> listViews;
//    private RadioGroup mRadioGroup;
//    private RadioButton mRadioButton1;
//    private RadioButton mRadioButton2;
//    private RadioButton mRadioButton3;
//    private int offset = 0;
//    private int currIndex = 0;
//    private int bmpW;
//
//    private ViewPager mPager;
//    private PagerAdapter mPagerAdapter;


    private View view1, view2, view3;
    private ViewPager viewPager;
    private PagerTitleStrip pagerTitleStrip;
    private PagerTabStrip pagerTabStrip;
    private List<View> viewList;
    private List<String> titleList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__search);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        mPager = (ViewPager) findViewById(R.id.pager);
//        listViews = new ArrayList<View>();
//        mPager.setAdapter(new MyPagerAdapter(listViews));
//        mPager.setCurrentItem(0);
//        mPager.setOnPageChangeListener(new MyOnPageChangeListener());
//

//
//
//
//        mPager.setAdapter(mPagerAdapter);
        Intent intent = getIntent();
//        init();
        initView();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        pagerTabStrip=(PagerTabStrip) findViewById(R.id.pagertab);
        pagerTabStrip.setTabIndicatorColor(0x0106001b);
        pagerTabStrip.setDrawFullUnderline(false);
        pagerTabStrip.setBackgroundColor(0x01060014);
        pagerTabStrip.setTextSpacing(50);

        view1 = findViewById(R.layout.layout1);
        view2 = findViewById(R.layout.layout2);
        view3 = findViewById(R.layout.layout3);

        LayoutInflater lf = getLayoutInflater().from(this);
        view1 = lf.inflate(R.layout.layout1, null);
        view2 = lf.inflate(R.layout.layout2, null);
        view3 = lf.inflate(R.layout.layout3, null);



        viewList = new ArrayList<View>();
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);

        titleList = new ArrayList<String>();
        titleList.add("User");
        titleList.add("Index");
        titleList.add("Search");

        Spinner spinner = (Spinner) findViewById(R.id.spinnner);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,new String[]{"A", "B", "C", "D"});
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        PagerAdapter pagerAdapter = new PagerAdapter() {

            @Override
            public boolean isViewFromObject(View arg0, Object arg1) {

                return arg0 == arg1;
            }

            @Override
            public int getCount() {

                return viewList.size();
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {

                container.removeView(viewList.get(position));
            }

            @Override
            public int getItemPosition(Object object) {

                return super.getItemPosition(object);
            }

            @Override
            public CharSequence getPageTitle(int position) {

                return titleList.get(position);
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {

                container.addView(viewList.get(position));
                return viewList.get(position);
            }




        };

        viewPager.setAdapter(pagerAdapter);

    }









}
