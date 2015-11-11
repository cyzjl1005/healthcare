package com.example.zjl.healthcaremobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static android.widget.RadioGroup.*;

public class Info_Search extends AppCompatActivity {

    private RadioGroup mRadioGroup;
    private RadioButton mRadioButton1;
    private RadioButton mRadioButton2;
    private RadioButton mRadioButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__search);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        init();

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

     public void init(){
         mRadioGroup = (RadioGroup)findViewById(R.id.radioGroup);
         mRadioButton1 = (RadioButton)findViewById(R.id.btn1);
         mRadioButton2 = (RadioButton)findViewById(R.id.btn2);
         mRadioButton3 = (RadioButton)findViewById(R.id.btn3);
     }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.btn1:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.btn2:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }








}
