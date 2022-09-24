package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g32 implements cc1, pa1 {

    /* renamed from: d */
    private static final Object f32130d = new Object();

    /* renamed from: e */
    private static int f32131e;

    /* renamed from: b */
    private final zzg f32132b;

    /* renamed from: c */
    private final p32 f32133c;

    public g32(p32 p32, zzg zzg) {
        this.f32133c = p32;
        this.f32132b = zzg;
    }

    /* renamed from: a */
    private final void m32348a(boolean z) {
        int i;
        int intValue;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36868E4)).booleanValue() && !this.f32132b.zzL()) {
            Object obj = f32130d;
            synchronized (obj) {
                i = f32131e;
                intValue = ((Integer) C8311wv.m39277c().mo18570b(p00.f36876F4)).intValue();
            }
            if (i < intValue) {
                this.f32133c.mo34044e(z);
                synchronized (obj) {
                    f32131e++;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo18436d(zzbew zzbew) {
        m32348a(false);
    }

    public final void zzn() {
        m32348a(true);
    }
}
