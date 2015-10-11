package com.fordsyncapp.readit;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new TextFetcher("http://wheredatapp.com/blog/2015/10/6/11-essential-elements-of-a-great-productivity-app") {
            @Override
            void onTextFetched(String text) {
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        }.run(this);
    }

}
