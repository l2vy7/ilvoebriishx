package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.zd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C8402zd implements C8224ue, C8261ve {

    /* renamed from: a */
    private final int f42428a;

    /* renamed from: b */
    private C8295we f42429b;

    /* renamed from: c */
    private int f42430c;

    /* renamed from: d */
    private int f42431d;

    /* renamed from: e */
    private C7649ek f42432e;

    /* renamed from: f */
    private long f42433f;

    /* renamed from: g */
    private boolean f42434g = true;

    /* renamed from: h */
    private boolean f42435h;

    public C8402zd(int i) {
        this.f42428a = i;
    }

    /* renamed from: d */
    public final void mo35170d() throws C7536be {
        boolean z = true;
        if (this.f42431d != 1) {
            z = false;
        }
        C8195tl.m37900e(z);
        this.f42431d = 2;
        mo30909r();
    }

    /* renamed from: e */
    public final void mo35171e(int i) {
        this.f42430c = i;
    }

    /* renamed from: f */
    public final void mo35172f(long j) throws C7536be {
        this.f42435h = false;
        this.f42434g = false;
        mo30908q(j, false);
    }

    /* renamed from: g */
    public final void mo35173g(C8295we weVar, zzapg[] zzapgArr, C7649ek ekVar, long j, boolean z, long j2) throws C7536be {
        C8195tl.m37900e(this.f42431d == 0);
        this.f42429b = weVar;
        this.f42431d = 1;
        mo30907p(z);
        mo35174i(zzapgArr, ekVar, j2);
        mo30908q(j, z);
    }

    /* renamed from: i */
    public final void mo35174i(zzapg[] zzapgArr, C7649ek ekVar, long j) throws C7536be {
        C8195tl.m37900e(!this.f42435h);
        this.f42432e = ekVar;
        this.f42434g = false;
        this.f42433f = j;
        mo34359t(zzapgArr, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo36048k() {
        return this.f42434g ? this.f42435h : this.f42432e.zze();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo36049l() {
        return this.f42430c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo36050m(C8083qe qeVar, C7940mg mgVar, boolean z) {
        C8083qe qeVar2 = qeVar;
        C7940mg mgVar2 = mgVar;
        int b = this.f42432e.mo31594b(qeVar2, mgVar2, z);
        if (b == -4) {
            if (mgVar.mo32121f()) {
                this.f42434g = true;
                return this.f42435h ? -4 : -3;
            }
            mgVar2.f35511d += this.f42433f;
        } else if (b == -5) {
            zzapg zzapg = qeVar2.f37994a;
            long j = zzapg.f42887x;
            if (j != Long.MAX_VALUE) {
                qeVar2.f37994a = new zzapg(zzapg.f42865b, zzapg.f42869f, zzapg.f42870g, zzapg.f42867d, zzapg.f42866c, zzapg.f42871h, zzapg.f42874k, zzapg.f42875l, zzapg.f42876m, zzapg.f42877n, zzapg.f42878o, zzapg.f42880q, zzapg.f42879p, zzapg.f42881r, zzapg.f42882s, zzapg.f42883t, zzapg.f42884u, zzapg.f42885v, zzapg.f42886w, zzapg.f42888y, zzapg.f42889z, zzapg.f42863A, j + this.f42433f, zzapg.f42872i, zzapg.f42873j, zzapg.f42868e);
                return -5;
            }
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C8295we mo36051n() {
        return this.f42429b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo30906o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo30907p(boolean z) throws C7536be;

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo30908q(long j, boolean z) throws C7536be;

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo30909r() throws C7536be;

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo30910s() throws C7536be;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo34359t(zzapg[] zzapgArr, long j) throws C7536be {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo36052u(long j) {
        this.f42432e.mo31593a(j - this.f42433f);
    }

    public final boolean zzA() {
        return this.f42434g;
    }

    public final boolean zzB() {
        return this.f42435h;
    }

    public final int zzb() {
        return this.f42431d;
    }

    public final int zzc() {
        return this.f42428a;
    }

    public final C8261ve zzf() {
        return this;
    }

    public final C7649ek zzh() {
        return this.f42432e;
    }

    public C8338xl zzi() {
        return null;
    }

    public final void zzj() {
        boolean z = true;
        if (this.f42431d != 1) {
            z = false;
        }
        C8195tl.m37900e(z);
        this.f42431d = 0;
        this.f42432e = null;
        this.f42435h = false;
        mo30906o();
    }

    public final void zzm() throws IOException {
        this.f42432e.zzc();
    }

    public final void zzv() {
        this.f42435h = true;
    }

    public final void zzz() throws C7536be {
        C8195tl.m37900e(this.f42431d == 2);
        this.f42431d = 1;
        mo30910s();
    }
}
