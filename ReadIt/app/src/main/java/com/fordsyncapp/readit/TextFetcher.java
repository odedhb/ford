package com.fordsyncapp.readit;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
                Element element = doc.body();
                Elements children = element.children();

                List<String> childTexts = new ArrayList<>();
                for (Element child : children) {
                    Log.d("cool", child.text());
                    childTexts.add(child.text());
                }

                Collections.sort(childTexts, new Comparator<String>() {
                    @Override
                    public int compare(String lhs, String rhs) {
                        //sort the tags by length, the longest one is probably the article
                        return Integer.valueOf(rhs.length()).compareTo(lhs.length());
                    }
                });

                text = childTexts.get(0);

            } catch (IOException e) {
                return null;
            }
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {

            if (text == null) {
                Toast.makeText(context, "Internet is down again :(", Toast.LENGTH_SHORT).show();
            } else {
                onTextFetched(text);
            }
        }
    }
}
