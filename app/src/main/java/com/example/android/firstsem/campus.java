package com.example.android.firstsem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class campus extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_campus, menu);
        return true;
    }

    public void switchToNews(View view){
        startActivity(new Intent(campus.this, news.class));
    }

    public void switchToEvents(View view){
        startActivity(new Intent(campus.this, events.class));
    }

    public void switchToStundenplan(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://lsf.uni-rostock.de/qisserver/rds?state=change&type=5&moduleParameter=veranstaltungSearch&nextdir=change&next=search.vm&subdir=veranstaltung&_form=display&function=search&clean=y&category=veranstaltung.search&navigationPosition=lectures%2Csearch&breadcrumb=searchLectures&topitem=lectures&subitem=search"));
        startActivity(browserIntent);
    }

    public void switchToPruef(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pruefung.uni-rostock.de/qisserver/rds?state=user&type=0"));
        startActivity(browserIntent);
    }

    public void switchToSport(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://hochschulsport.uni-rostock.de/sportarten/aktueller_zeitraum/index.html"));
        startActivity(browserIntent);
    }

    public void switchToKontakte(View view){
        startActivity(new Intent(campus.this, kontakt.class));
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
