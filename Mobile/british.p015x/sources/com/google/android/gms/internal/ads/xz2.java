package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xz2 {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f41589a;

    /* renamed from: b */
    private final ThreadPoolExecutor f41590b;

    /* renamed from: c */
    private final ArrayDeque<wz2> f41591c = new ArrayDeque<>();

    /* renamed from: d */
    private wz2 f41592d = null;

    public xz2() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f41589a = linkedBlockingQueue;
        this.f41590b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: c */
    private final void m39694c() {
        wz2 poll = this.f41591c.poll();
        this.f41592d = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.f41590b, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo35825a(wz2 wz2) {
        this.f41592d = null;
        m39694c();
    }

    /* renamed from: b */
    public final void mo35826b(wz2 wz2) {
        wz2.mo35699b(this);
        this.f41591c.add(wz2);
        if (this.f41592d == null) {
            m39694c();
        }
    }
}
