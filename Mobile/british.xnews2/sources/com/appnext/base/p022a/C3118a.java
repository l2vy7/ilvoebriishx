package com.appnext.base.p022a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.appnext.base.C3117a;
import com.appnext.base.moments.p027a.p029b.C3132b;

/* renamed from: com.appnext.base.a.a */
public class C3118a extends SQLiteOpenHelper {

    /* renamed from: bQ */
    private static volatile C3118a f12196bQ;

    private C3118a(Context context) {
        super(context, "appnext_dbs472", (SQLiteDatabase.CursorFactory) null, 12);
    }

    /* renamed from: a */
    public static C3118a m10554a(Context context) {
        if (f12196bQ == null) {
            synchronized (C3118a.class) {
                if (f12196bQ == null) {
                    f12196bQ = new C3118a(context.getApplicationContext());
                }
            }
        }
        return f12196bQ;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("create table ct ( p text, c integer)");
            sQLiteDatabase.execSQL(C3132b.m10599ah());
            sQLiteDatabase.execSQL("create table config_table ( key text primary key, status text not null default 'off', sample text not null default '1', sample_type text not null default '',cycle text not null default '1', cycle_type text not null default 'once', service_key text not null default '', data text not null default '')");
        } catch (Throwable th) {
            C3117a.m10553a("DatabaseSqlHelper$onCreate", th);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ct");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS collected_data_table");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS config_table");
            onCreate(sQLiteDatabase);
        } catch (Throwable th) {
            C3117a.m10553a("DatabaseSqlHelper$dropTables", th);
        }
    }
}
