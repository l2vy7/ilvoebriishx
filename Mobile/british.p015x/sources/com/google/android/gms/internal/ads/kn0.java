package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kn0 extends zzb {

    /* renamed from: c */
    final /* synthetic */ nn0 f34376c;

    kn0(nn0 nn0) {
        this.f34376c = nn0;
    }

    public final void zza() {
        s00 s00 = new s00(this.f34376c.f20587e, this.f34376c.f20588f.f43036b);
        synchronized (this.f34376c.f20583a) {
            try {
                zzt.zze();
                v00.m21082a(this.f34376c.f20589g, s00);
            } catch (IllegalArgumentException e) {
                co0.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
