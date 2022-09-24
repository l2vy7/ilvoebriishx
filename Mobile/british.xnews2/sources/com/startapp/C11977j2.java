package com.startapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.startapp.j2 */
/* compiled from: Sta */
public abstract class C11977j2 extends SQLiteOpenHelper {

    /* renamed from: a */
    public volatile SQLiteDatabase f53136a;

    /* renamed from: b */
    public final Object f53137b = new Object();

    public C11977j2(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
    }

    /* renamed from: a */
    public SQLiteDatabase mo45465a() {
        SQLiteDatabase sQLiteDatabase = this.f53136a;
        if (sQLiteDatabase == null) {
            synchronized (this.f53137b) {
                sQLiteDatabase = this.f53136a;
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = getWritableDatabase();
                    this.f53136a = sQLiteDatabase;
                }
            }
        }
        return sQLiteDatabase;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
