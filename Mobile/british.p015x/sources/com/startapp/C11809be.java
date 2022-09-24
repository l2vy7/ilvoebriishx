package com.startapp;

import com.startapp.C12398vd;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.be */
/* compiled from: Sta */
public class C11809be implements C12398vd.C12399a {

    /* renamed from: a */
    public final ThreadPoolExecutor f52634a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b */
    public final ArrayDeque<C12398vd> f52635b = new ArrayDeque<>();

    /* renamed from: c */
    public C12398vd f52636c = null;

    /* renamed from: a */
    public void mo45176a(C12398vd vdVar) {
        vdVar.f54936a = this;
        this.f52635b.add(vdVar);
        if (this.f52636c == null) {
            C12398vd poll = this.f52635b.poll();
            this.f52636c = poll;
            if (poll != null) {
                poll.executeOnExecutor(this.f52634a, new Object[0]);
            }
        }
    }
}
