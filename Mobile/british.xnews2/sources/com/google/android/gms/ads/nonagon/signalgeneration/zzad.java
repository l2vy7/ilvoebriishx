package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.dw2;
import com.google.android.gms.internal.ads.iv3;
import com.google.android.gms.internal.ads.mb3;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.r91;
import com.google.android.gms.internal.ads.s91;
import com.google.android.gms.internal.ads.uu3;
import com.google.android.gms.internal.ads.wv2;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzad implements uu3<mb3<zzah>> {

    /* renamed from: a */
    private final iv3<dw2> f28069a;

    /* renamed from: b */
    private final iv3<zzaf> f28070b;

    /* renamed from: c */
    private final iv3<r91> f28071c;

    public zzad(iv3<dw2> iv3, iv3<zzaf> iv32, iv3<r91> iv33) {
        this.f28069a = iv3;
        this.f28070b = iv32;
        this.f28071c = iv33;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.f28069a.zzb().mo35307b(wv2.GENERATE_SIGNALS, ((s91) this.f28071c).zzb().mo34521c()).mo35047f(((zzag) this.f28070b).zzb()).mo35050i((long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37011W3)).intValue(), TimeUnit.SECONDS).mo35042a();
    }
}
