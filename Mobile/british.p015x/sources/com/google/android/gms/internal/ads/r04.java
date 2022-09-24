package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r04 {

    /* renamed from: a */
    private final Handler f38454a;

    /* renamed from: b */
    private final s04 f38455b;

    public r04(Handler handler, s04 s04) {
        this.f38454a = s04 == null ? null : handler;
        this.f38455b = s04;
    }

    /* renamed from: a */
    public final void mo34453a(Exception exc) {
        Handler handler = this.f38454a;
        if (handler != null) {
            handler.post(new m04(this, exc));
        }
    }

    /* renamed from: b */
    public final void mo34454b(Exception exc) {
        Handler handler = this.f38454a;
        if (handler != null) {
            handler.post(new n04(this, exc));
        }
    }

    /* renamed from: c */
    public final void mo34455c(String str, long j, long j2) {
        Handler handler = this.f38454a;
        if (handler != null) {
            handler.post(new p04(this, str, j, j2));
        }
    }

    /* renamed from: d */
    public final void mo34456d(String str) {
        Handler handler = this.f38454a;
        if (handler != null) {
            handler.post(new o04(this, str));
        }
    }

    /* renamed from: e */
    public final void mo34457e(mc3 mc3) {
        mc3.mo33526a();
        Handler handler = this.f38454a;
        if (handler != null) {
            handler.post(new k04(this, mc3));
        }
    }

    /* renamed from: f */
    public final void mo34458f(mc3 mc3) {
        Handler handler = this.f38454a;
        if (handler != null) {
            handler.post(new l04(this, mc3));
        }
    }

    /* renamed from: g */
    public final void mo34459g(C8281w wVar, nd3 nd3) {
        Handler handler = this.f38454a;
        if (handler != null) {
            handler.post(new j04(this, wVar, nd3));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo34460h(Exception exc) {
        s04 s04 = this.f38455b;
        int i = d13.f20195a;
        s04.mo18056m(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo34461i(Exception exc) {
        s04 s04 = this.f38455b;
        int i = d13.f20195a;
        s04.mo18044c(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo34462j(String str, long j, long j2) {
        s04 s04 = this.f38455b;
        int i = d13.f20195a;
        s04.mo18046d(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo34463k(String str) {
        s04 s04 = this.f38455b;
        int i = d13.f20195a;
        s04.zzw(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo34464l(mc3 mc3) {
        mc3.mo33526a();
        s04 s04 = this.f38455b;
        int i = d13.f20195a;
        s04.mo18019E(mc3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo34465m(mc3 mc3) {
        s04 s04 = this.f38455b;
        int i = d13.f20195a;
        s04.mo18069z(mc3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo34466n(C8281w wVar, nd3 nd3) {
        int i = d13.f20195a;
        this.f38455b.mo18026L(wVar, nd3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo34467o(long j) {
        s04 s04 = this.f38455b;
        int i = d13.f20195a;
        s04.mo18057n(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo34468p(boolean z) {
        s04 s04 = this.f38455b;
        int i = d13.f20195a;
        s04.mo18050g(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo34469q(int i, long j, long j2) {
        s04 s04 = this.f38455b;
        int i2 = d13.f20195a;
        s04.mo18048e(i, j, j2);
    }

    /* renamed from: r */
    public final void mo34470r(long j) {
        Handler handler = this.f38454a;
        if (handler != null) {
            handler.post(new i04(this, j));
        }
    }

    /* renamed from: s */
    public final void mo34471s(boolean z) {
        Handler handler = this.f38454a;
        if (handler != null) {
            handler.post(new q04(this, z));
        }
    }

    /* renamed from: t */
    public final void mo34472t(int i, long j, long j2) {
        Handler handler = this.f38454a;
        if (handler != null) {
            handler.post(new h04(this, i, j, j2));
        }
    }
}
