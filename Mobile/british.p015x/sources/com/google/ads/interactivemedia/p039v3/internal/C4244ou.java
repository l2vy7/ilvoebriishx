package com.google.ads.interactivemedia.p039v3.internal;

import android.os.SystemClock;
import java.lang.Exception;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ou */
/* compiled from: IMASDK */
final class C4244ou<T extends Exception> {

    /* renamed from: a */
    private T f18230a;

    /* renamed from: b */
    private long f18231b;

    /* renamed from: a */
    public final void mo16482a(T t) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f18230a == null) {
            this.f18230a = t;
            this.f18231b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f18231b) {
            T t2 = this.f18230a;
            if (t2 != t) {
                bej.m15774a(t2, t);
            }
            T t3 = this.f18230a;
            mo16483b();
            throw t3;
        }
    }

    /* renamed from: b */
    public final void mo16483b() {
        this.f18230a = null;
    }
}
