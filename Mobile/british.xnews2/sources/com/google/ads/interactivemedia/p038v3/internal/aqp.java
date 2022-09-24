package com.google.ads.interactivemedia.p038v3.internal;

import java.util.concurrent.Executor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqp */
/* compiled from: IMASDK */
final class aqp<TResult> implements aqt<TResult> {

    /* renamed from: a */
    private final Executor f15579a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15580b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final aqq<? super TResult> f15581c;

    public aqp(Executor executor, aqq<? super TResult> aqq) {
        this.f15579a = executor;
        this.f15581c = aqq;
    }

    /* renamed from: a */
    public final void mo14209a(aqs<TResult> aqs) {
        if (aqs.mo14219b()) {
            synchronized (this.f15580b) {
                if (this.f15581c != null) {
                    this.f15579a.execute(new aqo(this, aqs));
                }
            }
        }
    }
}
