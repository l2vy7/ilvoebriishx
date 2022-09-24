package com.google.ads.interactivemedia.p038v3.internal;

import java.util.concurrent.Executor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqg */
/* compiled from: IMASDK */
final class aqg<TResult> implements aqt<TResult> {

    /* renamed from: a */
    private final Executor f15564a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15565b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final aqh f15566c;

    public aqg(Executor executor, aqh aqh) {
        this.f15564a = executor;
        this.f15566c = aqh;
    }

    /* renamed from: a */
    public final void mo14209a(aqs<TResult> aqs) {
        if (aqs.mo14220c()) {
            synchronized (this.f15565b) {
                if (this.f15566c != null) {
                    this.f15564a.execute(new aqf(this));
                }
            }
        }
    }
}
