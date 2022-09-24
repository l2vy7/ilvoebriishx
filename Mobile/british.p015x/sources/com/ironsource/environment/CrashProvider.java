package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class CrashProvider extends ContentProvider {

    /* renamed from: b */
    private Context f21981b;

    /* renamed from: c */
    private C4977f f21982c;

    /* renamed from: d */
    private String f21983d;

    /* renamed from: e */
    private UriMatcher f21984e = new UriMatcher(-1);

    /* renamed from: f */
    private Uri f21985f;

    /* renamed from: g */
    private int f21986g = 1;

    /* renamed from: h */
    private int f21987h = 2;

    /* renamed from: i */
    private String f21988i;

    /* renamed from: j */
    private String f21989j;

    /* renamed from: k */
    private String f21990k = "REPORTS";

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        int match = this.f21984e.match(uri);
        if (match == 1) {
            return this.f21988i;
        }
        if (match == 2) {
            return this.f21989j;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        this.f21981b = getContext();
        this.f21982c = new C4977f(this.f21981b);
        this.f21983d = this.f21981b.getPackageName();
        this.f21985f = Uri.parse("content://" + this.f21983d + "/REPORTS");
        this.f21988i = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f21989j = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.f21984e.match(uri);
        if (match == 1) {
            return C4977f.m22776b();
        }
        if (match == 2) {
            return C4977f.m22773a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
