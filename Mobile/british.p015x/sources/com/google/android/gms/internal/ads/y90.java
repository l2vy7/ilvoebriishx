package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.gms.ads.internal.util.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class y90 implements lv0 {

    /* renamed from: a */
    public final /* synthetic */ ha0 f41738a;

    public /* synthetic */ y90(ha0 ha0, byte[] bArr) {
        this.f41738a = ha0;
    }

    public final void zza() {
        ha0 ha0 = this.f41738a;
        zzt.zza.postDelayed(new na0(ha0.f32687a, ha0.f32688b, ha0.f32689c), ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS);
    }
}
