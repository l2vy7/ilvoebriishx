package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class c42 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SQLiteDatabase f30243b;

    /* renamed from: c */
    public final /* synthetic */ String f30244c;

    /* renamed from: d */
    public final /* synthetic */ io0 f30245d;

    public /* synthetic */ c42(SQLiteDatabase sQLiteDatabase, String str, io0 io0) {
        this.f30243b = sQLiteDatabase;
        this.f30244c = str;
        this.f30245d = io0;
    }

    public final void run() {
        f42.m32034h(this.f30243b, this.f30244c, this.f30245d);
    }
}
