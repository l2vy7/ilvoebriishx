package com.google.ads.interactivemedia.p038v3.internal;

import java.util.concurrent.Executor;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqm */
/* compiled from: IMASDK */
final class aqm<TResult> implements aqt<TResult> {

    /* renamed from: a */
    private final Executor f15574a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15575b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final aqn f15576c;

    public aqm(Executor executor, aqn aqn) {
        this.f15574a = executor;
        this.f15576c = aqn;
    }

    /* renamed from: a */
    public final void mo14209a(aqs<TResult> aqs) {
        if (!aqs.mo14219b() && !aqs.mo14220c()) {
            synchronized (this.f15575b) {
                if (this.f15576c != null) {
                    this.f15574a.execute(new aql(this, aqs));
                }
            }
        }
    }
}
