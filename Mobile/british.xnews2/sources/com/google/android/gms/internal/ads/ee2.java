package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ee2 implements yi2<Bundle> {

    /* renamed from: a */
    private final zzbfo f31336a;

    /* renamed from: b */
    private final zzcjf f31337b;

    /* renamed from: c */
    private final boolean f31338c;

    public ee2(zzbfo zzbfo, zzcjf zzcjf, boolean z) {
        this.f31336a = zzbfo;
        this.f31337b = zzcjf;
        this.f31338c = z;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f31337b.f43038d >= ((Integer) C8311wv.m39277c().mo18570b(p00.f36907J3)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36915K3)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f31338c);
        }
        zzbfo zzbfo = this.f31336a;
        if (zzbfo != null) {
            int i = zzbfo.f42983b;
            if (i == 1) {
                bundle.putString("avo", TtmlNode.TAG_P);
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
