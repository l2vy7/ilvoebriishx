package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.rl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8126rl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f38701a = C7836jm.m33650l("Loader:ExtractorMediaPeriod");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8019ol<? extends C8054pl> f38702b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f38703c;

    public C8126rl(String str) {
    }

    /* renamed from: a */
    public final <T extends C8054pl> long mo34548a(T t, C7983nl<T> nlVar, int i) {
        Looper myLooper = Looper.myLooper();
        C8195tl.m37900e(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C8019ol(this, myLooper, t, nlVar, i, elapsedRealtime).mo33941c(0);
        return elapsedRealtime;
    }

    /* renamed from: f */
    public final void mo34549f() {
        this.f38702b.mo33939a(false);
    }

    /* renamed from: g */
    public final void mo34550g(int i) throws IOException {
        IOException iOException = this.f38703c;
        if (iOException == null) {
            C8019ol<? extends C8054pl> olVar = this.f38702b;
            if (olVar != null) {
                olVar.mo33940b(olVar.f36522d);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: h */
    public final void mo34551h(Runnable runnable) {
        C8019ol<? extends C8054pl> olVar = this.f38702b;
        if (olVar != null) {
            olVar.mo33939a(true);
        }
        this.f38701a.execute(runnable);
        this.f38701a.shutdown();
    }

    /* renamed from: i */
    public final boolean mo34552i() {
        return this.f38702b != null;
    }
}
