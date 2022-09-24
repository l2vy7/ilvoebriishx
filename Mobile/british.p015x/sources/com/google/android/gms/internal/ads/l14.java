package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.lang.Exception;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class l14<T extends Exception> {

    /* renamed from: a */
    private T f34788a;

    /* renamed from: b */
    private long f34789b;

    public l14(long j) {
    }

    /* renamed from: a */
    public final void mo33233a() {
        this.f34788a = null;
    }

    /* renamed from: b */
    public final void mo33234b(T t) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f34788a == null) {
            this.f34788a = t;
            this.f34789b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f34789b) {
            T t2 = this.f34788a;
            this.f34788a = null;
            throw t2;
        }
    }
}
