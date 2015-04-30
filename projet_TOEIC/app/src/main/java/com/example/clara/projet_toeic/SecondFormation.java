package com.example.clara.projet_toeic;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondFormation extends ActionBarActivity{
    ListView myList2;


    List<String> valuesList2;

    ArrayAdapter<String> adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        valuesList2 = new ArrayList<String>();
        valuesList2.add("(A) precise");
        valuesList2.add("(B) precisely");
        valuesList2.add("(C) precising");
        valuesList2.add("(D) is precise");




        myList2 = (ListView) findViewById(R.id.listView2);
        adapter2 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                valuesList2
        );
        myList2.setAdapter(adapter2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
