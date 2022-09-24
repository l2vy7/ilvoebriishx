package com.google.ads.interactivemedia.p038v3.internal;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bz */
/* compiled from: IMASDK */
public final class C3898bz {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f16801a;

    /* renamed from: b */
    private final ThreadPoolExecutor f16802b;

    /* renamed from: c */
    private final ArrayDeque<C3897by> f16803c = new ArrayDeque<>();

    /* renamed from: d */
    private C3897by f16804d = null;

    public C3898bz() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f16801a = linkedBlockingQueue;
        this.f16802b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: c */
    private final void m16895c() {
        C3897by poll = this.f16803c.poll();
        this.f16804d = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.f16802b, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo15605a(C3897by byVar) {
        byVar.mo15603b(this);
        this.f16803c.add(byVar);
        if (this.f16804d == null) {
            m16895c();
        }
    }

    /* renamed from: b */
    public final void mo15606b() {
        this.f16804d = null;
        m16895c();
    }
}
