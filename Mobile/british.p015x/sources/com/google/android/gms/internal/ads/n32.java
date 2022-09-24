package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class n32 implements fv2 {

    /* renamed from: a */
    public final /* synthetic */ o32 f35880a;

    /* renamed from: b */
    public final /* synthetic */ boolean f35881b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f35882c;

    /* renamed from: d */
    public final /* synthetic */ C7915ls f35883d;

    /* renamed from: e */
    public final /* synthetic */ C8238us f35884e;

    public /* synthetic */ n32(o32 o32, boolean z, ArrayList arrayList, C7915ls lsVar, C8238us usVar) {
        this.f35880a = o32;
        this.f35881b = z;
        this.f35882c = arrayList;
        this.f35883d = lsVar;
        this.f35884e = usVar;
    }

    public final Object zza(Object obj) {
        o32 o32 = this.f35880a;
        boolean z = this.f35881b;
        ArrayList arrayList = this.f35882c;
        C7915ls lsVar = this.f35883d;
        C8238us usVar = this.f35884e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!o32.f36266b.f37321f.zzL()) {
            byte[] f = p32.m35946f(o32.f36266b, z, arrayList, lsVar, usVar);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(zzt.zzA().currentTimeMillis()));
            contentValues.put("serialized_proto_data", f);
            sQLiteDatabase.insert("offline_signal_contents", (String) null, contentValues);
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"total_requests"}));
            if (!z) {
                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"failed_requests"}));
            }
        }
        return null;
    }
}
