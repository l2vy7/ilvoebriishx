package com.startapp.sdk.adsbase;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.startapp.C11827ca;
import com.startapp.C5009h0;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class StartAppInitProvider extends ContentProvider {
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        Object obj = StartAppSDKInternal.f22265C;
        Context a = C5009h0.m22892a(context);
        if (a != null) {
            context = a;
        }
        ComponentLocator.m23305a(context).mo21220g().execute(new C11827ca(context));
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
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
