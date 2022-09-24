package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class e42 implements xa3<SQLiteDatabase> {

    /* renamed from: a */
    final /* synthetic */ fv2 f31222a;

    e42(f42 f42, fv2 fv2) {
        this.f31222a = fv2;
    }

    public final void zza(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        co0.zzg(valueOf.length() != 0 ? "Failed to get offline buffered ping database: ".concat(valueOf) : new String("Failed to get offline buffered ping database: "));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str;
        try {
            this.f31222a.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Error executing function on offline buffered ping database: ".concat(valueOf);
            } else {
                str = new String("Error executing function on offline buffered ping database: ");
            }
            co0.zzg(str);
        }
    }
}
