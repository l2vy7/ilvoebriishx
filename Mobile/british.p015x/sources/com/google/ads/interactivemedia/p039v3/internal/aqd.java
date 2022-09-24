package com.google.ads.interactivemedia.p039v3.internal;

import java.util.concurrent.Executor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqd */
/* compiled from: IMASDK */
final class aqd<TResult, TContinuationResult> implements aqt, aqq, aqn, aqh {

    /* renamed from: a */
    private final Executor f15560a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final aqb<TResult, aqs<TContinuationResult>> f15561b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final aqz<TContinuationResult> f15562c;

    public aqd(Executor executor, aqb<TResult, aqs<TContinuationResult>> aqb, aqz<TContinuationResult> aqz) {
        this.f15560a = executor;
        this.f15561b = aqb;
        this.f15562c = aqz;
    }

    /* renamed from: a */
    public final void mo14209a(aqs<TResult> aqs) {
        this.f15560a.execute(new aqc(this, aqs));
    }

    /* renamed from: b */
    public final void mo14210b(TContinuationResult tcontinuationresult) {
        this.f15562c.mo14235k(tcontinuationresult);
    }

    /* renamed from: c */
    public final void mo14211c(Exception exc) {
        this.f15562c.mo14237m(exc);
    }

    /* renamed from: d */
    public final void mo14212d() {
        this.f15562c.mo14239o();
    }
}
