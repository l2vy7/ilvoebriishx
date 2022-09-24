package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mf */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7939mf {

    /* renamed from: a */
    private final Handler f35505a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7977nf f35506b;

    public C7939mf(Handler handler, C7977nf nfVar) {
        Objects.requireNonNull(handler);
        this.f35505a = handler;
        this.f35506b = nfVar;
    }

    /* renamed from: b */
    public final void mo33531b(int i) {
        this.f35505a.post(new C7902lf(this, i));
    }

    /* renamed from: c */
    public final void mo33532c(int i, long j, long j2) {
        this.f35505a.post(new C7793if(this, i, j, j2));
    }

    /* renamed from: d */
    public final void mo33533d(String str, long j, long j2) {
        this.f35505a.post(new C7718gf(this, str, j, j2));
    }

    /* renamed from: e */
    public final void mo33534e(C7903lg lgVar) {
        this.f35505a.post(new C7865kf(this, lgVar));
    }

    /* renamed from: f */
    public final void mo33535f(C7903lg lgVar) {
        this.f35505a.post(new C7681ff(this, lgVar));
    }

    /* renamed from: g */
    public final void mo33536g(zzapg zzapg) {
        this.f35505a.post(new C7755hf(this, zzapg));
    }
}
