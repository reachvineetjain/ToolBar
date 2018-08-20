package com.nehavin.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    //adds popmenu to toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int menu_id = item.getItemId();

        switch (menu_id){
            case R.id.item1_id:
                Log.i(TAG, "onOptionsItemSelected: Item ID 1 Selected");
                break;
            case R.id.item2_id:
                Log.i(TAG, "onOptionsItemSelected: Item ID 2 Selected");
                break;
            case R.id.item3_id:
                Log.i(TAG, "onOptionsItemSelected: Item ID 3 Selected");
                break;
            case R.id.cart:
                Log.i(TAG, "onOptionsItemSelected: Cart Selected");
                break;
            case R.id.search_id:
                Log.i(TAG, "onOptionsItemSelected: Search Selected");
                break;
            case android.R.id.home:
                Log.i(TAG, "onOptionsItemSelected: Back Selected");
                finish();
                break;
            default:
                Log.i(TAG, "onOptionsItemSelected: In valid option");

        }

        return super.onOptionsItemSelected(item);
    }
}
