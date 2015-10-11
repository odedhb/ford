package com.fordsyncapp.readit;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by oded on 10/11/15.
 */
public abstract class TextFetcher {

    private String url;

    TextFetcher(String url) {
        this.url = url;
    }


    abstract void onTextFetched(String text);


    void run(Context context) {
        new AsyncFetch(context).execute();
    }


    class AsyncFetch extends AsyncTask {

        private String text;
        private Context context;

        AsyncFetch(Context context) {
            this.context = context;
        }

        @Override
        protected Object doInBackground(Object[] objects) {
            Document doc = null;
            try {
                doc = Jsoup.connect(url).get();
                text = doc.body().text();
            } catch (IOException e) {
                Toast.makeText(context, "Internet is down again :(", Toast.LENGTH_SHORT).show();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            onTextFetched(text);
        }
    }
}
