package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.C2978z;

/* renamed from: com.adcolony.sdk.m */
class C2845m {
    C2845m() {
    }

    /* renamed from: a */
    static void m9830a(String str, ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.insertOrThrow(str, (String) null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            C2978z.C2979a aVar = new C2978z.C2979a();
            C2978z.C2979a a = aVar.mo10088a("Exception on insert to " + str + ", db version:").mo10086a(sQLiteDatabase.getVersion());
            a.mo10088a(". Values: " + contentValues.toString() + " caused: ").mo10088a(e.toString()).mo10090a(C2978z.f11948h);
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: a */
    static void m9829a(int i, long j, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            if (str == null) {
                j = -1;
                str = "rowid";
            }
            if (i >= 0) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select " + str + " from " + str2 + " order by " + str + " desc limit 1 offset " + i, (String[]) null);
                if (rawQuery.moveToFirst()) {
                    j = Math.max(j, rawQuery.getLong(0));
                }
                rawQuery.close();
            }
            if (j >= 0) {
                sQLiteDatabase.execSQL("delete from " + str2 + " where " + str + " <= " + j);
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            new C2978z.C2979a().mo10088a("Exception on deleting excessive rows:").mo10088a(e.toString()).mo10090a(C2978z.f11948h);
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }
}
