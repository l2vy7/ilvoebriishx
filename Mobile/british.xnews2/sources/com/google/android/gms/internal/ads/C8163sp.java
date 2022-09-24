package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C7377d;
import p006a5.C6480b;

/* renamed from: com.google.android.gms.internal.ads.sp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8163sp extends zzc<C8235up> {
    C8163sp(Context context, Looper looper, C7377d.C7378a aVar, C7377d.C7379b bVar) {
        super(ij0.m33229a(context), looper, 123, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof C8235up ? (C8235up) queryLocalInterface : new C8235up(iBinder);
    }

    /* renamed from: e */
    public final boolean mo34769e() {
        return ((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue() && C6480b.m28238c(getAvailableFeatures(), zzb.zza);
    }

    /* renamed from: f */
    public final C8235up mo34770f() throws DeadObjectException {
        return (C8235up) super.getService();
    }

    public final Feature[] getApiFeatures() {
        return zzb.zzb;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}
