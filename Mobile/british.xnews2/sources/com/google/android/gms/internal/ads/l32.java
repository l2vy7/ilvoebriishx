package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l32 implements ew2 {

    /* renamed from: b */
    private final i32 f34816b;

    l32(i32 i32) {
        this.f34816b = i32;
    }

    /* renamed from: g */
    public final void mo18539g(wv2 wv2, String str) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36868E4)).booleanValue() && wv2.RENDERER == wv2) {
            this.f34816b.mo32543f(zzt.zzA().elapsedRealtime());
        }
    }

    /* renamed from: l */
    public final void mo18540l(wv2 wv2, String str, Throwable th) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36868E4)).booleanValue() && wv2.RENDERER == wv2 && this.f34816b.mo32540c() != 0) {
            this.f34816b.mo32542e(zzt.zzA().elapsedRealtime() - this.f34816b.mo32540c());
        }
    }

    /* renamed from: n */
    public final void mo18541n(wv2 wv2, String str) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36868E4)).booleanValue() && wv2.RENDERER == wv2 && this.f34816b.mo32540c() != 0) {
            this.f34816b.mo32542e(zzt.zzA().elapsedRealtime() - this.f34816b.mo32540c());
        }
    }

    /* renamed from: z */
    public final void mo18543z(wv2 wv2, String str) {
    }
}
