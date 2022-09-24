package com.iab.omid.library.ironsrc.walking.p052a;

import com.iab.omid.library.ironsrc.walking.p052a.C4911b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.c */
public class C4914c implements C4911b.C4912a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f21877a;

    /* renamed from: b */
    private final ThreadPoolExecutor f21878b;

    /* renamed from: c */
    private final ArrayDeque<C4911b> f21879c = new ArrayDeque<>();

    /* renamed from: d */
    private C4911b f21880d = null;

    public C4914c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f21877a = linkedBlockingQueue;
        this.f21878b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m22651a() {
        C4911b poll = this.f21879c.poll();
        this.f21880d = poll;
        if (poll != null) {
            poll.mo20392a(this.f21878b);
        }
    }

    /* renamed from: a */
    public void mo20394a(C4911b bVar) {
        this.f21880d = null;
        m22651a();
    }

    /* renamed from: b */
    public void mo20397b(C4911b bVar) {
        bVar.mo20390a((C4911b.C4912a) this);
        this.f21879c.add(bVar);
        if (this.f21880d == null) {
            m22651a();
        }
    }
}
