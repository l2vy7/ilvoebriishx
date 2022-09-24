package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class d32 implements xa3<SQLiteDatabase> {

    /* renamed from: a */
    final /* synthetic */ fv2 f30629a;

    d32(e32 e32, fv2 fv2) {
        this.f30629a = fv2;
    }

    public final void zza(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        co0.zzg(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f30629a.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            co0.zzg(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }
}
