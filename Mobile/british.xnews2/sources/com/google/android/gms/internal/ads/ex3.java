package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ex3 {

    /* renamed from: a */
    private final dx3 f31530a;

    /* renamed from: b */
    private final cx3 f31531b;

    /* renamed from: c */
    private final ov1 f31532c;

    /* renamed from: d */
    private final gi0 f31533d;

    /* renamed from: e */
    private int f31534e;

    /* renamed from: f */
    private Object f31535f;

    /* renamed from: g */
    private final Looper f31536g;

    /* renamed from: h */
    private final int f31537h;

    /* renamed from: i */
    private boolean f31538i;

    /* renamed from: j */
    private boolean f31539j;

    /* renamed from: k */
    private boolean f31540k;

    public ex3(cx3 cx3, dx3 dx3, gi0 gi0, int i, ov1 ov1, Looper looper) {
        this.f31531b = cx3;
        this.f31530a = dx3;
        this.f31533d = gi0;
        this.f31536g = looper;
        this.f31532c = ov1;
        this.f31537h = i;
    }

    /* renamed from: a */
    public final int mo31680a() {
        return this.f31534e;
    }

    /* renamed from: b */
    public final Looper mo31681b() {
        return this.f31536g;
    }

    /* renamed from: c */
    public final dx3 mo31682c() {
        return this.f31530a;
    }

    /* renamed from: d */
    public final ex3 mo31683d() {
        nu1.m20747f(!this.f31538i);
        this.f31538i = true;
        this.f31531b.mo31050b(this);
        return this;
    }

    /* renamed from: e */
    public final ex3 mo31684e(Object obj) {
        nu1.m20747f(!this.f31538i);
        this.f31535f = obj;
        return this;
    }

    /* renamed from: f */
    public final ex3 mo31685f(int i) {
        nu1.m20747f(!this.f31538i);
        this.f31534e = i;
        return this;
    }

    /* renamed from: g */
    public final Object mo31686g() {
        return this.f31535f;
    }

    /* renamed from: h */
    public final synchronized void mo31687h(boolean z) {
        this.f31539j = z | this.f31539j;
        this.f31540k = true;
        notifyAll();
    }

    /* renamed from: i */
    public final synchronized boolean mo31688i(long j) throws InterruptedException, TimeoutException {
        nu1.m20747f(this.f31538i);
        nu1.m20747f(this.f31536g.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        long j3 = elapsedRealtime + SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        while (!this.f31540k) {
            if (j2 > 0) {
                wait(j2);
                j2 = j3 - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.f31539j;
    }

    /* renamed from: j */
    public final synchronized boolean mo31689j() {
        return false;
    }
}
