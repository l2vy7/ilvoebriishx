package com.ironsource.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;

public class IronsourceLifecycleProvider extends ContentProvider {

    /* renamed from: b */
    private static boolean f22057b = false;

    /* renamed from: a */
    static boolean m22840a() {
        return f22057b;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        f22057b = true;
        C4991d a = C4991d.m22849a();
        Context context = getContext();
        if (C4991d.f22062m.compareAndSet(false, true)) {
            a.f22064c = new Handler(Looper.getMainLooper());
            Application application = (Application) context.getApplicationContext();
            if (application != null) {
                application.registerActivityLifecycleCallbacks(a);
            }
        }
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
