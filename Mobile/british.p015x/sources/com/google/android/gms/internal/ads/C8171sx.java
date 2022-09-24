package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* renamed from: com.google.android.gms.internal.ads.sx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8171sx implements MuteThisAdReason {

    /* renamed from: a */
    private final String f39099a;

    /* renamed from: b */
    private final C8137rx f39100b;

    public C8171sx(C8137rx rxVar) {
        String str;
        this.f39100b = rxVar;
        try {
            str = rxVar.zze();
        } catch (RemoteException e) {
            co0.zzh("", e);
            str = null;
        }
        this.f39099a = str;
    }

    /* renamed from: a */
    public final C8137rx mo34826a() {
        return this.f39100b;
    }

    public final String getDescription() {
        return this.f39099a;
    }

    public final String toString() {
        return this.f39099a;
    }
}
