package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p22 implements mh1 {

    /* renamed from: b */
    private boolean f37297b = false;

    /* renamed from: c */
    private boolean f37298c = false;

    /* renamed from: d */
    private final String f37299d;

    /* renamed from: e */
    private final nw2 f37300e;

    /* renamed from: f */
    private final zzg f37301f;

    public p22(String str, nw2 nw2) {
        this.f37299d = str;
        this.f37300e = nw2;
        this.f37301f = zzt.zzo().mo18583h();
    }

    /* renamed from: b */
    private final mw2 m35932b(String str) {
        String str2;
        if (this.f37301f.zzL()) {
            str2 = "";
        } else {
            str2 = this.f37299d;
        }
        mw2 b = mw2.m34936b(str);
        b.mo33603a("tms", Long.toString(zzt.zzA().elapsedRealtime(), 10));
        b.mo33603a("tid", str2);
        return b;
    }

    /* renamed from: a */
    public final void mo33087a(String str) {
        nw2 nw2 = this.f37300e;
        mw2 b = m35932b("adapter_init_started");
        b.mo33603a("ancn", str);
        nw2.mo31048a(b);
    }

    /* renamed from: c */
    public final void mo33088c(String str, String str2) {
        nw2 nw2 = this.f37300e;
        mw2 b = m35932b("adapter_init_finished");
        b.mo33603a("ancn", str);
        b.mo33603a("rqe", str2);
        nw2.mo31048a(b);
    }

    /* renamed from: z */
    public final void mo33089z(String str) {
        nw2 nw2 = this.f37300e;
        mw2 b = m35932b("adapter_init_finished");
        b.mo33603a("ancn", str);
        nw2.mo31048a(b);
    }

    public final synchronized void zzd() {
        if (!this.f37298c) {
            this.f37300e.mo31048a(m35932b("init_finished"));
            this.f37298c = true;
        }
    }

    public final synchronized void zze() {
        if (!this.f37297b) {
            this.f37300e.mo31048a(m35932b("init_started"));
            this.f37297b = true;
        }
    }
}
