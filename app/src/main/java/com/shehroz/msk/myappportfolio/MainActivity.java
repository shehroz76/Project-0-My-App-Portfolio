package com.shehroz.msk.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pop_movies = (Button) findViewById(R.id.pop_movies);
        Button  stock_hawk = (Button) findViewById(R.id.stock);
        Button  buil_it_bigger = (Button) findViewById(R.id.build_it);
        Button  material = (Button) findViewById(R.id.material_make);
        Button  ubiquitous = (Button) findViewById(R.id.ubiquitous);
        Button  capstone = (Button) findViewById(R.id.capstone);


        pop_movies.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Popular Movies app !", Toast.LENGTH_LONG).show();

            }
        });

        stock_hawk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Stock Hawk app!", Toast.LENGTH_LONG).show();

            }
        });

        buil_it_bigger.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch Build it Bigger app!", Toast.LENGTH_LONG).show();

            }
        });

        material.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch Make Your App Material  !", Toast.LENGTH_LONG).show();

            }
        });

        ubiquitous.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Go Ubiquitous  !", Toast.LENGTH_LONG).show();

            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Capstone  !", Toast.LENGTH_LONG).show();

            }
        });

}
}
