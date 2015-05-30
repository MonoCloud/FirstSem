package com.example.android.firstsem;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class checklist extends ActionBarActivity {

    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);

        cb1 = (CheckBox)findViewById(R.id.checkBox);
        cb1.setChecked(getFromSP("cb1"));
        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setChecked(getFromSP("cb2"));
        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        cb3.setChecked(getFromSP("cb3"));
        cb4 = (CheckBox)findViewById(R.id.checkBox4);
        cb4.setChecked(getFromSP("cb4"));
        cb5 = (CheckBox)findViewById(R.id.checkBox5);
        cb5.setChecked(getFromSP("cb5"));
        cb6 = (CheckBox)findViewById(R.id.checkBox6);
        cb6.setChecked(getFromSP("cb6"));
        cb7 = (CheckBox)findViewById(R.id.checkBox7);
        cb7.setChecked(getFromSP("cb7"));
        cb8 = (CheckBox)findViewById(R.id.checkBox8);
        cb8.setChecked(getFromSP("cb8"));
        cb9 = (CheckBox)findViewById(R.id.checkBox9);
        cb9.setChecked(getFromSP("cb9"));
        cb10 = (CheckBox)findViewById(R.id.checkBox10);
        cb10.setChecked(getFromSP("cb10"));
        cb11 = (CheckBox)findViewById(R.id.checkBox11);
        cb11.setChecked(getFromSP("cb11"));
        cb12 = (CheckBox)findViewById(R.id.checkBox12);
        cb12.setChecked(getFromSP("cb12"));
        cb13 = (CheckBox)findViewById(R.id.checkBox13);
        cb13.setChecked(getFromSP("cb13"));
        cb14 = (CheckBox)findViewById(R.id.checkBox14);
        cb14.setChecked(getFromSP("cb14"));
        cb15 = (CheckBox)findViewById(R.id.checkBox15);
        cb15.setChecked(getFromSP("cb15"));
        cb16 = (CheckBox)findViewById(R.id.checkBox16);
        cb16.setChecked(getFromSP("cb16"));
        cb17 = (CheckBox)findViewById(R.id.checkBox17);
        cb17.setChecked(getFromSP("cb17"));
        cb18 = (CheckBox)findViewById(R.id.checkBox18);
        cb18.setChecked(getFromSP("cb18"));
    }

    private boolean getFromSP(String key){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("FirstSem", android.content.Context.MODE_PRIVATE);
        return preferences.getBoolean(key, false);
    }

    private void saveInSp(String key,boolean value){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("FirstSem", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkBox:
                if(checked) saveInSp("cb1",true);
                else saveInSp("cb1",false);
                break;
            case R.id.checkBox2:
                if(checked) saveInSp("cb2",true);
                else  saveInSp("cb2",false);
                break;
            case R.id.checkBox3:
                if(checked) saveInSp("cb3",true);
                else  saveInSp("cb3",false);
                break;
            case R.id.checkBox4:
                if(checked) saveInSp("cb4",true);
                else  saveInSp("cb4",false);
                break;
            case R.id.checkBox5:
                if(checked) saveInSp("cb5",true);
                else  saveInSp("cb5",false);
                break;
            case R.id.checkBox6:
                if(checked) saveInSp("cb6",true);
                else  saveInSp("cb6",false);
                break;
            case R.id.checkBox7:
                if(checked) saveInSp("cb7",true);
                else  saveInSp("cb7",false);
                break;
            case R.id.checkBox8:
                if(checked) saveInSp("cb8",true);
                else  saveInSp("cb8",false);
                break;
            case R.id.checkBox9:
                if(checked) saveInSp("cb9",true);
                else  saveInSp("cb9",false);
                break;
            case R.id.checkBox10:
                if(checked) saveInSp("cb10",true);
                else  saveInSp("cb10",false);
                break;
            case R.id.checkBox11:
                if(checked) saveInSp("cb11",true);
                else  saveInSp("cb11",false);
                break;
            case R.id.checkBox12:
                if(checked) saveInSp("cb12",true);
                else  saveInSp("cb12",false);
                break;
            case R.id.checkBox13:
                if(checked) saveInSp("cb13",true);
                else  saveInSp("cb13",false);
                break;
            case R.id.checkBox14:
                if(checked) saveInSp("cb14",true);
                else  saveInSp("cb14",false);
                break;
            case R.id.checkBox15:
                if(checked) saveInSp("cb15",true);
                else  saveInSp("cb15",false);
                break;
            case R.id.checkBox16:
                if(checked) saveInSp("cb16",true);
                else  saveInSp("cb16",false);
                break;
            case R.id.checkBox17:
                if(checked) saveInSp("cb17",true);
                else  saveInSp("cb17",false);
                break;
            case R.id.checkBox18:
                if(checked) saveInSp("cb18",true);
                else  saveInSp("cb18",false);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_checklist, menu);
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

