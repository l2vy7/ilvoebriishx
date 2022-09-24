package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.ads.internal.util.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class k02 extends qi0 {

    /* renamed from: b */
    final /* synthetic */ l02 f34091b;

    protected k02(l02 l02) {
        this.f34091b = l02;
    }

    /* renamed from: k6 */
    public final void mo33002k6(zzbd zzbd) {
        this.f34091b.f34767b.zze(new zzbc(zzbd.zza, zzbd.zzb));
    }

    /* renamed from: x3 */
    public final void mo33003x3(ParcelFileDescriptor parcelFileDescriptor) {
        this.f34091b.f34767b.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
