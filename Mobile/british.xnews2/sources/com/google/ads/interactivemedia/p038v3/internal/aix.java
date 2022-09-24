package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aix */
/* compiled from: IMASDK */
public final class aix {

    /* renamed from: a */
    private final CopyOnWriteArrayList<aiw> f15027a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public final void mo13789a(Handler handler, aiy aiy) {
        mo13790b(aiy);
        this.f15027a.add(new aiw(handler, aiy));
    }

    /* renamed from: b */
    public final void mo13790b(aiy aiy) {
        Iterator<aiw> it = this.f15027a.iterator();
        while (it.hasNext()) {
            aiw next = it.next();
            if (next.f15025b == aiy) {
                next.mo13788a();
                this.f15027a.remove(next);
            }
        }
    }

    /* renamed from: c */
    public final void mo13791c(int i, long j, long j2) {
        Iterator<aiw> it = this.f15027a.iterator();
        while (it.hasNext()) {
            aiw next = it.next();
            if (!next.f15026c) {
                next.f15024a.post(new aiv(next, i, j, j2));
            }
        }
    }
}
