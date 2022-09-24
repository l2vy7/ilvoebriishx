package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class z12 implements xa3<ParcelFileDescriptor> {

    /* renamed from: a */
    final /* synthetic */ ri0 f42258a;

    z12(d22 d22, ri0 ri0) {
        this.f42258a = ri0;
    }

    public final void zza(Throwable th) {
        try {
            this.f42258a.mo33002k6(zzbd.zza(th));
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f42258a.mo33003x3((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }
}
