package com.example.android.firstsem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Linklist extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linklist);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_linklist, menu);
        return true;
    }

    public void switchToLink3(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uni-rostock.de"));
        startActivity(browserIntent);
    }

    public void switchToLink4(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://email.uni-rostock.de"));
        startActivity(browserIntent);
    }

    public void switchToLink5(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://studip.uni-rostock.de"));
        startActivity(browserIntent);
    }

    public void switchToLink6(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://lsf.uni-rostock.de"));
        startActivity(browserIntent);
    }

    public void switchToLink7(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.studentenwerk-rostock.de"));
        startActivity(browserIntent);
    }

    public void switchToLink8(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pruefung.uni-rostock.de"));
        startActivity(browserIntent);
    }

    public void switchToLink9(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fsr-inf.uni-rostock.de"));
        startActivity(browserIntent);
    }

    public void switchToLink10(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ief.uni-rostock.de"));
        startActivity(browserIntent);
    }

    public void switchToLink11(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sprachenzentrum.uni-rostock.de"));
        startActivity(browserIntent);
    }

    public void switchToLink12(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ilias.uni-rostock.de"));
        startActivity(browserIntent);
    }

    public void switchToLink13(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ub.uni-rostock.de"));
        startActivity(browserIntent);
    }

    public void switchToLink14(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://hochschulsport.uni-rostock.de"));
        startActivity(browserIntent);
    }

    public void switchToLink15(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.itmz.uni-rostock.de/internet/zugang/w-lan/"));
        startActivity(browserIntent);
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
