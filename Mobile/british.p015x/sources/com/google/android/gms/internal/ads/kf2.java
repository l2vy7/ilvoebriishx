package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kf2 implements uu3<ef2<ye2>> {

    /* renamed from: a */
    private final iv3<xe2> f34285a;

    /* renamed from: b */
    private final iv3<C6483e> f34286b;

    public kf2(iv3<xe2> iv3, iv3<C6483e> iv32) {
        this.f34285a = iv3;
        this.f34286b = iv32;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ef2(((ze2) this.f34285a).zzb(), ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS, this.f34286b.zzb());
    }
}
