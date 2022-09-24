package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lk */
/* compiled from: IMASDK */
public final class C4153lk {

    /* renamed from: a */
    private final C4152lj f17831a;

    /* renamed from: b */
    private final C4151li f17832b;

    /* renamed from: c */
    private final aks f17833c;

    /* renamed from: d */
    private final C4171mb f17834d;

    /* renamed from: e */
    private int f17835e;

    /* renamed from: f */
    private Object f17836f;

    /* renamed from: g */
    private final Looper f17837g;

    /* renamed from: h */
    private final int f17838h;

    /* renamed from: i */
    private final long f17839i = C6540C.TIME_UNSET;

    /* renamed from: j */
    private final boolean f17840j = true;

    /* renamed from: k */
    private boolean f17841k;

    /* renamed from: l */
    private boolean f17842l;

    /* renamed from: m */
    private boolean f17843m;

    public C4153lk(C4151li liVar, C4152lj ljVar, C4171mb mbVar, int i, aks aks, Looper looper) {
        this.f17832b = liVar;
        this.f17831a = ljVar;
        this.f17834d = mbVar;
        this.f17837g = looper;
        this.f17833c = aks;
        this.f17838h = i;
    }

    /* renamed from: a */
    public final C4171mb mo16250a() {
        return this.f17834d;
    }

    /* renamed from: b */
    public final C4152lj mo16251b() {
        return this.f17831a;
    }

    /* renamed from: c */
    public final int mo16252c() {
        return this.f17835e;
    }

    /* renamed from: d */
    public final Object mo16253d() {
        return this.f17836f;
    }

    /* renamed from: e */
    public final Looper mo16254e() {
        return this.f17837g;
    }

    /* renamed from: f */
    public final long mo16255f() {
        return C6540C.TIME_UNSET;
    }

    /* renamed from: g */
    public final int mo16256g() {
        return this.f17838h;
    }

    /* renamed from: h */
    public final boolean mo16257h() {
        return true;
    }

    /* renamed from: i */
    public final synchronized void mo16258i(boolean z) {
        this.f17842l = z | this.f17842l;
        this.f17843m = true;
        notifyAll();
    }

    /* renamed from: j */
    public final synchronized void mo16259j(long j) throws InterruptedException, TimeoutException {
        aup.m14887r(this.f17841k);
        aup.m14887r(this.f17837g.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        long j3 = elapsedRealtime + SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        while (!this.f17843m) {
            if (j2 > 0) {
                wait(j2);
                j2 = j3 - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
    }

    /* renamed from: k */
    public final synchronized void mo16260k() {
    }

    /* renamed from: l */
    public final void mo16261l() {
        aup.m14887r(!this.f17841k);
        aup.m14885p(true);
        this.f17841k = true;
        this.f17832b.mo16035f(this);
    }

    /* renamed from: m */
    public final void mo16262m(Object obj) {
        aup.m14887r(!this.f17841k);
        this.f17836f = obj;
    }

    /* renamed from: n */
    public final void mo16263n(int i) {
        aup.m14887r(!this.f17841k);
        this.f17835e = i;
    }
}
