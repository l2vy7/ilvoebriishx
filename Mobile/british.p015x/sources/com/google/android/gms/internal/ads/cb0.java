package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.C4604n;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cb0 extends bp0<x90> {

    /* renamed from: c */
    private final Object f30308c = new Object();

    /* renamed from: d */
    private final zzbf<x90> f30309d;

    /* renamed from: e */
    private boolean f30310e;

    /* renamed from: f */
    private int f30311f;

    public cb0(zzbf<x90> zzbf) {
        this.f30309d = zzbf;
        this.f30310e = false;
        this.f30311f = 0;
    }

    /* renamed from: f */
    public final xa0 mo30873f() {
        xa0 xa0 = new xa0(this);
        synchronized (this.f30308c) {
            mo30763e(new ya0(this, xa0), new za0(this, xa0));
            C4604n.m20101n(this.f30311f >= 0);
            this.f30311f++;
        }
        return xa0;
    }

    /* renamed from: g */
    public final void mo30874g() {
        synchronized (this.f30308c) {
            C4604n.m20101n(this.f30311f >= 0);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f30310e = true;
            mo30875h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo30875h() {
        synchronized (this.f30308c) {
            C4604n.m20101n(this.f30311f >= 0);
            if (!this.f30310e || this.f30311f != 0) {
                zze.zza("There are still references to the engine. Not destroying.");
            } else {
                zze.zza("No reference is left (including root). Cleaning up engine.");
                mo30763e(new bb0(this), new xo0());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo30876i() {
        synchronized (this.f30308c) {
            C4604n.m20101n(this.f30311f > 0);
            zze.zza("Releasing 1 reference for JS Engine");
            this.f30311f--;
            mo30875h();
        }
    }
}
