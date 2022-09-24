package com.ironsource.environment;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.ironsource.environment.f */
public final class C4977f extends SQLiteOpenHelper {
    public C4977f(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.Cursor m22773a(int r4) {
        /*
            com.ironsource.environment.f r0 = new com.ironsource.environment.f
            com.ironsource.environment.e r1 = com.ironsource.environment.C4970e.m22762a()
            android.content.Context r1 = r1.f22035f
            r0.<init>(r1)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch:{ all -> 0x002e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "SELECT * FROM REPORTSWHERE id= "
            r2.<init>(r3)     // Catch:{ all -> 0x002b }
            r2.append(r4)     // Catch:{ all -> 0x002b }
            java.lang.String r4 = ";"
            r2.append(r4)     // Catch:{ all -> 0x002b }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x002b }
            android.database.Cursor r4 = r0.rawQuery(r4, r1)     // Catch:{ all -> 0x002b }
            r0.close()
            return r4
        L_0x002b:
            r4 = move-exception
            r1 = r0
            goto L_0x002f
        L_0x002e:
            r4 = move-exception
        L_0x002f:
            if (r1 == 0) goto L_0x0034
            r1.close()
        L_0x0034:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C4977f.m22773a(int):android.database.Cursor");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ironsource.environment.C4961c> m22774a() {
        /*
            com.ironsource.environment.f r0 = new com.ironsource.environment.f
            com.ironsource.environment.e r1 = com.ironsource.environment.C4970e.m22762a()
            android.content.Context r1 = r1.f22035f
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "SELECT * FROM REPORTS ;"
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch:{ all -> 0x004d }
            android.database.Cursor r2 = r0.rawQuery(r2, r3)     // Catch:{ all -> 0x004a }
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0043
        L_0x0021:
            r3 = 0
            int r3 = r2.getInt(r3)     // Catch:{ all -> 0x004a }
            r4 = 1
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x004a }
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ all -> 0x004a }
            r6 = 3
            java.lang.String r6 = r2.getString(r6)     // Catch:{ all -> 0x004a }
            com.ironsource.environment.c r7 = new com.ironsource.environment.c     // Catch:{ all -> 0x004a }
            r7.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x004a }
            r1.add(r7)     // Catch:{ all -> 0x004a }
            boolean r3 = r2.moveToNext()     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0021
        L_0x0043:
            r2.close()     // Catch:{ all -> 0x004a }
            r0.close()
            return r1
        L_0x004a:
            r1 = move-exception
            r3 = r0
            goto L_0x004e
        L_0x004d:
            r1 = move-exception
        L_0x004e:
            if (r3 == 0) goto L_0x0053
            r3.close()
        L_0x0053:
            goto L_0x0055
        L_0x0054:
            throw r1
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C4977f.m22774a():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m22775a(com.ironsource.environment.C4961c r6) {
        /*
            com.ironsource.environment.f r0 = new com.ironsource.environment.f
            com.ironsource.environment.e r1 = com.ironsource.environment.C4970e.m22762a()
            android.content.Context r1 = r1.f22035f
            r0.<init>(r1)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ all -> 0x0045 }
            r0.beginTransaction()     // Catch:{ all -> 0x0042 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0042 }
            r2.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = r6.mo20576a()     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = r6.mo20577b()     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = r6.mo20578c()     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = "stack_trace"
            r2.put(r5, r3)     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "crash_date"
            r2.put(r3, r4)     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "crashType"
            r2.put(r3, r6)     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = "REPORTS"
            r0.insert(r6, r1, r2)     // Catch:{ all -> 0x0042 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0042 }
            r0.endTransaction()
            r0.close()
            return
        L_0x0042:
            r6 = move-exception
            r1 = r0
            goto L_0x0046
        L_0x0045:
            r6 = move-exception
        L_0x0046:
            if (r1 == 0) goto L_0x004e
            r1.endTransaction()
            r1.close()
        L_0x004e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C4977f.m22775a(com.ironsource.environment.c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.Cursor m22776b() {
        /*
            com.ironsource.environment.f r0 = new com.ironsource.environment.f
            com.ironsource.environment.e r1 = com.ironsource.environment.C4970e.m22762a()
            android.content.Context r1 = r1.f22035f
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r1 = "SELECT * FROM REPORTS;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch:{ all -> 0x0022 }
            android.database.Cursor r1 = r0.rawQuery(r1, r2)     // Catch:{ all -> 0x001f }
            r0.close()
            return r1
        L_0x001f:
            r1 = move-exception
            r2 = r0
            goto L_0x0023
        L_0x0022:
            r1 = move-exception
        L_0x0023:
            if (r2 == 0) goto L_0x0028
            r2.close()
        L_0x0028:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C4977f.m22776b():android.database.Cursor");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m22777c() {
        /*
            com.ironsource.environment.f r0 = new com.ironsource.environment.f
            com.ironsource.environment.e r1 = com.ironsource.environment.C4970e.m22762a()
            android.content.Context r1 = r1.f22035f
            r0.<init>(r1)
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ all -> 0x001a }
            java.lang.String r1 = "DELETE FROM REPORTS WHERE id >= 0;"
            r0.execSQL(r1)     // Catch:{ all -> 0x0018 }
            r0.close()
            return
        L_0x0018:
            r1 = move-exception
            goto L_0x001c
        L_0x001a:
            r1 = move-exception
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C4977f.m22777c():void");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
