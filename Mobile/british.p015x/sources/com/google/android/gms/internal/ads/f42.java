package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f42 extends SQLiteOpenHelper {

    /* renamed from: b */
    private final Context f31623b;

    /* renamed from: c */
    private final nb3 f31624c;

    public f42(Context context, nb3 nb3) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) C8311wv.m39277c().mo18570b(p00.f37109h6)).intValue());
        this.f31623b = context;
        this.f31624c = nb3;
    }

    /* renamed from: h */
    static /* synthetic */ void m32034h(SQLiteDatabase sQLiteDatabase, String str, io0 io0) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        m32036m(sQLiteDatabase, io0);
    }

    /* renamed from: l */
    static final void m32035l(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m32036m(SQLiteDatabase sQLiteDatabase, io0 io0) {
        sQLiteDatabase.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("event_state = ");
            sb.append(1);
            String sb2 = sb.toString();
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, sb2, (String[]) null, (String) null, (String) null, "timestamp ASC", (String) null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                io0.zza(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Void mo31745c(h42 h42, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(h42.f32606a));
        contentValues.put("gws_query_id", h42.f32607b);
        contentValues.put("url", h42.f32608c);
        contentValues.put("event_state", Integer.valueOf(h42.f32609d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", (String) null, contentValues);
        zzt.zzp();
        zzbv zzE = com.google.android.gms.ads.internal.util.zzt.zzE(this.f31623b);
        if (zzE != null) {
            try {
                zzE.zze(C10489b.m48195m6(this.f31623b));
            } catch (RemoteException e) {
                zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo31746e(String str) {
        mo31748g(new b42(this, str));
    }

    /* renamed from: f */
    public final void mo31747f(h42 h42) {
        mo31748g(new a42(this, h42));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo31748g(fv2<SQLiteDatabase, Void> fv2) {
        bb3.m30658r(this.f31624c.mo33675b(new d42(this)), new e42(this, fv2), this.f31624c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo31749j(SQLiteDatabase sQLiteDatabase, io0 io0, String str) {
        this.f31624c.execute(new c42(sQLiteDatabase, str, io0));
    }

    /* renamed from: k */
    public final void mo31750k(io0 io0, String str) {
        mo31748g(new z32(this, io0, str));
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
