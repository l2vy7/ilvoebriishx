package com.startapp;

import android.content.SharedPreferences;

/* renamed from: com.startapp.a0 */
/* compiled from: Sta */
public class C5000a0 {

    /* renamed from: a */
    public final Object f22107a = new Object();

    /* renamed from: b */
    public final SharedPreferences f22108b;

    /* renamed from: c */
    public volatile String f22109c;

    /* renamed from: d */
    public volatile String f22110d;

    public C5000a0(SharedPreferences sharedPreferences) {
        this.f22108b = sharedPreferences;
    }

    /* renamed from: a */
    public boolean mo20648a() {
        boolean contains;
        synchronized (this.f22107a) {
            contains = this.f22108b.contains("2696a7f502faed4b");
        }
        return contains;
    }
}
