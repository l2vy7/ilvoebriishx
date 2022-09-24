package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.measurement.internal.v2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9932v2 extends SQLiteOpenHelper {

    /* renamed from: b */
    final /* synthetic */ C9952x2 f46799b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9932v2(C9952x2 x2Var, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f46799b = x2Var;
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f46799b.f21269a.mo19276j().mo19282q().mo38856a("Opening the local database failed, dropping and recreating it");
            this.f46799b.f21269a.mo19392z();
            if (!this.f46799b.f21269a.mo19277r().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f46799b.f21269a.mo19276j().mo19282q().mo38857b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f46799b.f21269a.mo19276j().mo19282q().mo38857b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C9804j.m45182b(this.f46799b.f21269a.mo19276j(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C9804j.m45181a(this.f46799b.f21269a.mo19276j(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
