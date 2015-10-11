package com.fordsyncapp.readit;

/**
 * Created by oded on 10/11/15.
 */
public abstract class TextFetcher {

    private String url;

    TextFetcher(String url) {
        this.url = url;
    }


    abstract void onTextFetched(String text);


    void run() {
        onTextFetched(url);
    }
}
