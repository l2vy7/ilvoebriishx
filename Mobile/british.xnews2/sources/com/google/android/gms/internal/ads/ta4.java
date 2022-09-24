package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ta4 {

    /* renamed from: a */
    private final Handler f39366a;

    /* renamed from: b */
    private final ua4 f39367b;

    public ta4(Handler handler, ua4 ua4) {
        this.f39366a = ua4 == null ? null : handler;
        this.f39367b = ua4;
    }

    /* renamed from: a */
    public final void mo34881a(String str, long j, long j2) {
        Handler handler = this.f39366a;
        if (handler != null) {
            handler.post(new sa4(this, str, j, j2));
        }
    }

    /* renamed from: b */
    public final void mo34882b(String str) {
        Handler handler = this.f39366a;
        if (handler != null) {
            handler.post(new ra4(this, str));
        }
    }

    /* renamed from: c */
    public final void mo34883c(mc3 mc3) {
        mc3.mo33526a();
        Handler handler = this.f39366a;
        if (handler != null) {
            handler.post(new na4(this, mc3));
        }
    }

    /* renamed from: d */
    public final void mo34884d(int i, long j) {
        Handler handler = this.f39366a;
        if (handler != null) {
            handler.post(new ja4(this, i, j));
        }
    }

    /* renamed from: e */
    public final void mo34885e(mc3 mc3) {
        Handler handler = this.f39366a;
        if (handler != null) {
            handler.post(new oa4(this, mc3));
        }
    }

    /* renamed from: f */
    public final void mo34886f(C8281w wVar, nd3 nd3) {
        Handler handler = this.f39366a;
        if (handler != null) {
            handler.post(new la4(this, wVar, nd3));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo34887g(String str, long j, long j2) {
        ua4 ua4 = this.f39367b;
        int i = d13.f20195a;
        ua4.mo18022H(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo34888h(String str) {
        ua4 ua4 = this.f39367b;
        int i = d13.f20195a;
        ua4.mo18030P(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo34889i(mc3 mc3) {
        mc3.mo33526a();
        ua4 ua4 = this.f39367b;
        int i = d13.f20195a;
        ua4.mo18053j(mc3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo34890j(int i, long j) {
        ua4 ua4 = this.f39367b;
        int i2 = d13.f20195a;
        ua4.mo18016B(i, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo34891k(mc3 mc3) {
        ua4 ua4 = this.f39367b;
        int i = d13.f20195a;
        ua4.mo18042b(mc3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo34892l(C8281w wVar, nd3 nd3) {
        int i = d13.f20195a;
        this.f39367b.mo18066w(wVar, nd3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo34893m(Object obj, long j) {
        ua4 ua4 = this.f39367b;
        int i = d13.f20195a;
        ua4.mo18054k(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo34894n(long j, int i) {
        ua4 ua4 = this.f39367b;
        int i2 = d13.f20195a;
        ua4.mo18068y(j, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo34895o(Exception exc) {
        ua4 ua4 = this.f39367b;
        int i = d13.f20195a;
        ua4.mo18017C(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo34896p(ky0 ky0) {
        ua4 ua4 = this.f39367b;
        int i = d13.f20195a;
        ua4.mo18051h(ky0);
    }

    /* renamed from: q */
    public final void mo34897q(Object obj) {
        if (this.f39366a != null) {
            this.f39366a.post(new qa4(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: r */
    public final void mo34898r(long j, int i) {
        Handler handler = this.f39366a;
        if (handler != null) {
            handler.post(new ka4(this, j, i));
        }
    }

    /* renamed from: s */
    public final void mo34899s(Exception exc) {
        Handler handler = this.f39366a;
        if (handler != null) {
            handler.post(new pa4(this, exc));
        }
    }

    /* renamed from: t */
    public final void mo34900t(ky0 ky0) {
        Handler handler = this.f39366a;
        if (handler != null) {
            handler.post(new ma4(this, ky0));
        }
    }
}
