package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    List<String> name;
    List<Integer> icon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = new ArrayList<>();
        icon = new ArrayList<>();

        icon.add(R.drawable.amazon);
        icon.add(R.drawable.android);
        icon.add(R.drawable.bing);
        icon.add(R.drawable.box);
        icon.add(R.drawable.dropbox);
        icon.add(R.drawable.facebook);
        icon.add(R.drawable.foursquare);
        icon.add(R.drawable.google_plus);
        icon.add(R.drawable.html_5);
        icon.add(R.drawable.instagram);
        icon.add(R.drawable.linkedin);
        icon.add(R.drawable.paypal);
        icon.add(R.drawable.periscope);
        icon.add(R.drawable.pinterest);
        icon.add(R.drawable.quora);
        icon.add(R.drawable.skype);
        icon.add(R.drawable.snapchat);
        icon.add(R.drawable.soundcloud);
        icon.add(R.drawable.spotify);
        icon.add(R.drawable.twitter);
        icon.add(R.drawable.whatsapp);
        icon.add(R.drawable.wordpress);
        icon.add(R.drawable.youtube);

        name.add("Amazon"); name.add("Android"); name.add("Bing");
        name.add("Box"); name.add("Dropbox"); name.add("Facebook");
        name.add("Foursquare"); name.add("Google"); name.add("Html");
        name.add("Instagram"); name.add("Linkedin"); name.add("Paypal");
        name.add("Periscope"); name.add("Pinterest"); name.add("Quora");
        name.add("Skype"); name.add("Snapchat"); name.add("Soundcloud");
        name.add("Spodify"); name.add("Twitter"); name.add("Whatsapp");
        name.add("Wordpress"); name.add("Youtube"); name.add("Paypal");

        recyclerView = findViewById(R.id.rvLayout);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(this,name,icon);
        recyclerView.setAdapter(adapter);

    }
}