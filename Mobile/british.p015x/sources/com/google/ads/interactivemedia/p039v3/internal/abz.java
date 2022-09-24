package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abz */
/* compiled from: IMASDK */
public final class abz extends C4544zx implements abr {

    /* renamed from: a */
    private final C4129kn f14099a;

    /* renamed from: b */
    private final C4128km f14100b;

    /* renamed from: c */
    private final ajf f14101c;

    /* renamed from: d */
    private final abm f14102d;

    /* renamed from: e */
    private final C4286qi f14103e;

    /* renamed from: f */
    private final int f14104f = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;

    /* renamed from: g */
    private boolean f14105g = true;

    /* renamed from: h */
    private long f14106h = C6540C.TIME_UNSET;

    /* renamed from: i */
    private boolean f14107i;

    /* renamed from: j */
    private boolean f14108j;

    /* renamed from: k */
    private akp f14109k;

    /* renamed from: l */
    private final aup f14110l;

    abz(C4129kn knVar, ajf ajf, abm abm, C4286qi qiVar, aup aup, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C4128km kmVar = knVar.f17729b;
        aup.m14890u(kmVar);
        this.f14100b = kmVar;
        this.f14099a = knVar;
        this.f14101c = ajf;
        this.f14102d = abm;
        this.f14103e = qiVar;
        this.f14110l = aup;
    }

    /* renamed from: y */
    private final void m12988y() {
        long j = this.f14106h;
        boolean z = this.f14107i;
        boolean z2 = this.f14108j;
        C4129kn knVar = this.f14099a;
        acl acl = r1;
        acl acl2 = new acl(C6540C.TIME_UNSET, C6540C.TIME_UNSET, j, j, 0, 0, z, false, (Object) null, knVar, z2 ? knVar.f17730c : null);
        mo16937e(this.f14105g ? new abw(acl) : acl);
    }

    /* renamed from: U */
    public final C4129kn mo13273U() {
        return this.f14099a;
    }

    /* renamed from: V */
    public final void mo13274V(aaz aaz) {
        ((abv) aaz).mo13365j();
    }

    /* renamed from: W */
    public final aaz mo13275W(abb abb, ajl ajl, long j) {
        ajo b = ((ajp) this.f14101c).mo13800a();
        akp akp = this.f14109k;
        if (akp != null) {
            b.mo13295b(akp);
        }
        return new abv(this.f14100b.f17720a, b, this.f14102d.mo13346a(), this.f14103e, mo16940h(abb), this.f14110l, mo16938f(abb), this, ajl, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13254a(akp akp) {
        this.f14109k = akp;
        this.f14103e.mo16576c();
        m12988y();
    }

    /* renamed from: b */
    public final void mo13357b(long j, boolean z, boolean z2) {
        if (j == C6540C.TIME_UNSET) {
            j = this.f14106h;
        }
        if (this.f14105g || this.f14106h != j || this.f14107i != z || this.f14108j != z2) {
            this.f14106h = j;
            this.f14107i = z;
            this.f14108j = z2;
            this.f14105g = false;
            m12988y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo13256d() {
        this.f14103e.mo16577d();
    }

    /* renamed from: u */
    public final void mo13257u() {
    }
}
