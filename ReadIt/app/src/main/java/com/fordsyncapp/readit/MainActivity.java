package com.fordsyncapp.readit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Patterns;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*List<Site> sites = BrowserHistory.crawl(this);
        Collections.sort(sites, new Comparator<Site>() {
            @Override
            public int compare(Site lhs, Site rhs) {
                return rhs.getDate().compareTo(lhs.getDate());
            }
        });
        String url = sites.get(0).getUrl();*/


        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();

        if (Intent.ACTION_SEND.equals(action) && type != null) {
            if ("text/plain".equals(type)) {
                readUrl(intent.getStringExtra(Intent.EXTRA_TEXT)); // Handle text being sent
            }

        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);

        Matcher matcher = Patterns.WEB_URL.matcher(sharedText);
        String url = matcher.group(1);
//        "http://www.engadget.com/2015/10/08/elon-musk-apple-car-diss/"

        Toast.makeText(this, "Loading " + url, Toast.LENGTH_SHORT).show();

        readUrl(url);
    }

    private void readUrl(String url) {
        new TextFetcher(url) {
            @Override
            void onTextFetched(String text) {
//                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                ((TextView) findViewById(R.id.main_view)).setText(text);
            }
        }.run(this);
    }
}