package com.example.zjl.healthcaremobile;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

import java.net.URL;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {
//    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    private Button btn;
    private Thread mthread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        btn=(Button)findViewById(R.id.button_login);
//        btn.setOnClickListener(new OnClickListener() {
//
////            public void onClick(View view) {
////                mthread=new Thread(runnable);
////                mthread.start();
////
////            }
//        });

    }

    public void login(View view){
        Intent intent = new Intent(this, Info_Search.class);
        EditText edit_username = (EditText) findViewById(R.id.username);
        EditText edit_password = (EditText) findViewById(R.id.password);
        String username = edit_username.getText().toString();
        String password = edit_password.getText().toString();
        if( username.contentEquals("zjl") && password.contentEquals("healthcare") ){
            intent.putExtra("username", username);
            startActivity(intent);
        } else {
            new AlertDialog.Builder(this)
                    .setTitle("login failed")
                    .setMessage("your user ID or password is wrong")
                    .setPositiveButton("OK", null)
                    .show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
