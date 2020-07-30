package com.pandey.saurabh.logutils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelatedView relatedView;
    RelatedView relatedVieww;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relatedView = findViewById(R.id.testCustom);

        relatedVieww = findViewById(R.id.testtCustom);


        relatedView.setLinkClickListener(new RelatedView.onLinkClickEventListener() {
            @Override
            public void onLinkItemClick(String moduleName) {
                Toast.makeText(MainActivity.this, "hello"+moduleName, Toast.LENGTH_SHORT).show();
            }
        });



        relatedVieww.setLinkClickListener(new RelatedView.onLinkClickEventListener() {
            @Override
            public void onLinkItemClick(String moduleName) {
                Toast.makeText(MainActivity.this, "hello"+moduleName, Toast.LENGTH_SHORT).show();

            }
        });


        relatedView.setResultText("hello");


    }
}