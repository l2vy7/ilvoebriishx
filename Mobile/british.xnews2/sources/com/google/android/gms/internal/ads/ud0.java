package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import p198d5.C10487a;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ud0 extends bd0 {

    /* renamed from: b */
    private final MediationInterscrollerAd f39827b;

    public ud0(MediationInterscrollerAd mediationInterscrollerAd) {
        this.f39827b = mediationInterscrollerAd;
    }

    public final C10487a zze() {
        return C10489b.m48195m6(this.f39827b.getView());
    }

    public final boolean zzf() {
        return this.f39827b.shouldDelegateInterscrollerEffect();
    }
}
