package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.an */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7509an {

    /* renamed from: a */
    private final Handler f29694a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7545bn f29695b;

    public C7509an(Handler handler, C7545bn bnVar) {
        Objects.requireNonNull(handler);
        this.f29694a = handler;
        this.f29695b = bnVar;
    }

    /* renamed from: b */
    public final void mo30428b(String str, long j, long j2) {
        this.f29694a.post(new C8232um(this, str, j, j2));
    }

    /* renamed from: c */
    public final void mo30429c(C7903lg lgVar) {
        this.f29694a.post(new C8411zm(this, lgVar));
    }

    /* renamed from: d */
    public final void mo30430d(int i, long j) {
        this.f29694a.post(new C8303wm(this, i, j));
    }

    /* renamed from: e */
    public final void mo30431e(C7903lg lgVar) {
        this.f29694a.post(new C8196tm(this, lgVar));
    }

    /* renamed from: f */
    public final void mo30432f(zzapg zzapg) {
        this.f29694a.post(new C8269vm(this, zzapg));
    }

    /* renamed from: g */
    public final void mo30433g(Surface surface) {
        this.f29694a.post(new C8375ym(this, surface));
    }

    /* renamed from: h */
    public final void mo30434h(int i, int i2, int i3, float f) {
        this.f29694a.post(new C8339xm(this, i, i2, i3, f));
    }
}
