package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.g6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7709g6 {

    /* renamed from: c */
    public static final boolean f32163c = C7745h6.f32629b;

    /* renamed from: a */
    private final List<C7672f6> f32164a = new ArrayList();

    /* renamed from: b */
    private boolean f32165b = false;

    C7709g6() {
    }

    /* renamed from: a */
    public final synchronized void mo32017a(String str, long j) {
        if (!this.f32165b) {
            this.f32164a.add(new C7672f6(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    /* renamed from: b */
    public final synchronized void mo32018b(String str) {
        long j;
        this.f32165b = true;
        if (this.f32164a.size() == 0) {
            j = 0;
        } else {
            long j2 = this.f32164a.get(0).f31647c;
            List<C7672f6> list = this.f32164a;
            j = list.get(list.size() - 1).f31647c - j2;
        }
        if (j > 0) {
            long j3 = this.f32164a.get(0).f31647c;
            C7745h6.m32818a("(%-4d ms) %s", Long.valueOf(j), str);
            for (C7672f6 next : this.f32164a) {
                long j4 = next.f31647c;
                C7745h6.m32818a("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(next.f31646b), next.f31645a);
                j3 = j4;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (!this.f32165b) {
            mo32018b("Request on the loose");
            C7745h6.m32819b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
