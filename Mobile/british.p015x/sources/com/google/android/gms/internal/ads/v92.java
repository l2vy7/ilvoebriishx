package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class v92 implements xb1 {

    /* renamed from: a */
    boolean f40350a = false;

    /* renamed from: b */
    final /* synthetic */ u42 f40351b;

    /* renamed from: c */
    final /* synthetic */ uo0 f40352c;

    /* renamed from: d */
    final /* synthetic */ w92 f40353d;

    v92(w92 w92, u42 u42, uo0 uo0) {
        this.f40353d = w92;
        this.f40351b = u42;
        this.f40352c = uo0;
    }

    /* renamed from: a */
    private final void m38752a(zzbew zzbew) {
        int i = 1;
        if (true == ((Boolean) C8311wv.m39277c().mo18570b(p00.f36987T3)).booleanValue()) {
            i = 3;
        }
        this.f40352c.zze(new v42(i, zzbew));
    }

    /* renamed from: S */
    public final synchronized void mo35384S(zzbew zzbew) {
        this.f40350a = true;
        m38752a(zzbew);
    }

    /* renamed from: m */
    public final void mo35385m(int i) {
        if (!this.f40350a) {
            m38752a(new zzbew(i, w92.m39076e(this.f40351b.f39762a, i), AdError.UNDEFINED_DOMAIN, (zzbew) null, (IBinder) null));
        }
    }

    /* renamed from: n */
    public final synchronized void mo35386n(int i, String str) {
        if (!this.f40350a) {
            this.f40350a = true;
            if (str == null) {
                str = w92.m39076e(this.f40351b.f39762a, i);
            }
            m38752a(new zzbew(i, str, AdError.UNDEFINED_DOMAIN, (zzbew) null, (IBinder) null));
        }
    }

    public final synchronized void zzd() {
        this.f40352c.zzd(null);
    }
}
