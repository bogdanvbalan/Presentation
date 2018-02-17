package com.example.android.presentation;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToWebsite (View View){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("https://blackboxlabs.ro/"));
        startActivity(sendIntent);
    }

    public void callNumber (View View){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_DIAL);
        sendIntent.setData(Uri.parse("tel:+40762832747"));
        startActivity(sendIntent);
    }
    public void launchMaps(View View){
        double latitude = 45.697070;
        double longitude = 27.182853;
        String label = "Blackbox Labs";
        String uriBegin = "geo:" + latitude + "," + longitude;
        String query = latitude + "," + longitude + "(" + label + ")";
        String encodedQuery = Uri.encode(query);
        String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
        Uri uri = Uri.parse(uriString);
        Intent sendIntent = new Intent(android.content.Intent.ACTION_VIEW, uri);
        startActivity(sendIntent);
    }
}
