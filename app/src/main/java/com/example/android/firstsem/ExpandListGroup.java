package com.example.android.firstsem;

import java.util.ArrayList;

/**
 * Created by LarsNonnemann on 29.05.15.
 */
public class ExpandListGroup {

    private String Name;
    private ArrayList<ExpandListChild> Items;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public ArrayList<ExpandListChild> getItems() {
        return Items;
    }

    public void setItems(ArrayList<ExpandListChild> Items) {
        this.Items = Items;
    }
}
