package com.fordsyncapp.readit;

/**
 * Created by oded on 10/11/15.
 */
public class Site {

    private String title;
    private String url;
    private Long date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Long getDate() {
        return date;
    }
}
