package com.example.android.firstsem;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;


public class checklist extends ActionBarActivity {

    /**
     * Called when the activity is first created.
     */
    private ExpandListAdapter ExpAdapter;
    private ArrayList<ExpandListGroup> ExpListItems;
    private ExpandableListView ExpandList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);
        ExpandList = (ExpandableListView) findViewById(R.id.expandableListView);
        ExpListItems = SetStandardGroups();
        ExpAdapter = new ExpandListAdapter(checklist.this, ExpListItems);
        ExpandList.setAdapter((ExpandableListAdapter) ExpAdapter);
    }

    public ArrayList<ExpandListGroup> SetStandardGroups() {

        ArrayList<ExpandListGroup> list = new ArrayList<ExpandListGroup>();
        ArrayList<ExpandListChild> list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru1 = new ExpandListGroup();
        gru1.setName("Comedy");

        ExpandListChild ch1_1 = new ExpandListChild();
        ch1_1.setName("A movie");
        ch1_1.setTag(null);
        list2.add(ch1_1);

        ExpandListChild ch1_2 = new ExpandListChild();
        ch1_2.setName("An other movie");
        ch1_2.setTag(null);
        list2.add(ch1_2);

        ExpandListChild ch1_3 = new ExpandListChild();
        ch1_3.setName("And an other movie");
        ch1_3.setTag(null);
        list2.add(ch1_3);
        gru1.setItems(list2);

        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru2 = new ExpandListGroup();
        gru2.setName("Action");

        ExpandListChild ch2_1 = new ExpandListChild();
        ch2_1.setName("A movie");
        ch2_1.setTag(null);
        list2.add(ch2_1);

        ExpandListChild ch2_2 = new ExpandListChild();
        ch2_2.setName("An other movie");
        ch2_2.setTag(null);
        list2.add(ch2_2);

        ExpandListChild ch2_3 = new ExpandListChild();
        ch2_3.setName("And an other movie");
        ch2_3.setTag(null);
        list2.add(ch2_3);
        gru2.setItems(list2);
        list.add(gru1);
        list.add(gru2);

        return list;
    }

}

