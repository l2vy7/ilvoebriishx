package com.google.ads.interactivemedia.p039v3.internal;

import java.util.concurrent.Executor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqj */
/* compiled from: IMASDK */
final class aqj<TResult> implements aqt<TResult> {

    /* renamed from: a */
    private final Executor f15569a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15570b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final aqk<TResult> f15571c;

    public aqj(Executor executor, aqk<TResult> aqk) {
        this.f15569a = executor;
        this.f15571c = aqk;
    }

    /* renamed from: a */
    public final void mo14209a(aqs<TResult> aqs) {
        synchronized (this.f15570b) {
        }
        this.f15569a.execute(new aqi(this, aqs));
    }
}
