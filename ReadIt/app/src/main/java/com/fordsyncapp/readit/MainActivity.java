package com.fordsyncapp.readit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

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


        Intent startIntent = new Intent(this, SdlService.class);
        startService(startIntent);

        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();

        if (Intent.ACTION_SEND.equals(action) && type != null) {
            if ("text/plain".equals(type)) {
                fetchUrl(intent.getStringExtra(Intent.EXTRA_TEXT)); // Handle text being sent
            }
        }
    }


    private void fetchUrl(String url) {
        new TextFetcher(url) {
            @Override
            void onTextFetched(String text) {
//                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                ((TextView) findViewById(R.id.main_view)).setText(text);

                TextFetcher.saveLastWebsite(MainActivity.this, text);
            }
        }.run(this);
    }

    public void play(View view) {
        Intent startIntent = new Intent(this, SdlService.class);
        startService(startIntent);
    }

//    private void fordSpeak(String ttsText) {
//        sdlService.readText(ttsText);
//    }
}