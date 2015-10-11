package com.fordsyncapp.readit;

import android.content.Context;
import android.database.Cursor;
import android.provider.Browser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oded on 6/7/15.
 */
public class BrowserHistory {
    private static final String WEB_HISTORY_COUNT = "3000";

    public static List<Site> crawl(Context context) {
        List<Site> sites = new ArrayList<>();
        String[] proj = new String[]{
                android.provider.Browser.BookmarkColumns.TITLE,
                android.provider.Browser.BookmarkColumns.URL,
                android.provider.Browser.BookmarkColumns._ID,
                android.provider.Browser.BookmarkColumns.DATE};
        String sel = android.provider.Browser.BookmarkColumns.BOOKMARK + " = 0 AND " + android.provider.Browser.BookmarkColumns.VISITS + " > 2"; // 0 = history, 1 = bookmark
        String limit = WEB_HISTORY_COUNT;
        String sortOrder = String.format("%s limit " + limit, android.provider.Browser.BookmarkColumns.VISITS + " DESC");
        Cursor cursor = context.getContentResolver().query(android.provider.Browser.BOOKMARKS_URI, proj, sel, null, sortOrder);
        String title = "";
        String url = "";
        Long date = null;
        if (cursor == null) return null;

        while (cursor.moveToNext()) {
            title = cursor.getString(cursor.getColumnIndex(android.provider.Browser.BookmarkColumns.TITLE));
            url = cursor.getString(cursor.getColumnIndex(android.provider.Browser.BookmarkColumns.URL));
            date = cursor.getLong(cursor.getColumnIndex(android.provider.Browser.BookmarkColumns.DATE));
            String id = cursor.getString(cursor.getColumnIndex(android.provider.Browser.BookmarkColumns._ID));

            // Do something with title and url

            Site site = new Site();
            site.setTitle(title);
            site.setUrl(url);
            site.setDate(date);
            sites.add(site);
        }
        cursor.close();

        return sites;
    }
}
