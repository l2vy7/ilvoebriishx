package com.iab.omid.library.adcolony.walking.p047a;

import com.iab.omid.library.adcolony.walking.p047a.C4861b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.adcolony.walking.a.c */
public class C4864c implements C4861b.C4862a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f21763a;

    /* renamed from: b */
    private final ThreadPoolExecutor f21764b;

    /* renamed from: c */
    private final ArrayDeque<C4861b> f21765c = new ArrayDeque<>();

    /* renamed from: d */
    private C4861b f21766d = null;

    public C4864c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f21763a = linkedBlockingQueue;
        this.f21764b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m22430a() {
        C4861b poll = this.f21765c.poll();
        this.f21766d = poll;
        if (poll != null) {
            poll.mo20206a(this.f21764b);
        }
    }

    /* renamed from: a */
    public void mo20208a(C4861b bVar) {
        this.f21766d = null;
        m22430a();
    }

    /* renamed from: b */
    public void mo20211b(C4861b bVar) {
        bVar.mo20204a((C4861b.C4862a) this);
        this.f21765c.add(bVar);
        if (this.f21766d == null) {
            m22430a();
        }
    }
}
