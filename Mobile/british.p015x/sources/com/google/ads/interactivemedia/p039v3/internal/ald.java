package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ald */
final /* synthetic */ class ald implements Runnable {

    /* renamed from: a */
    private final CopyOnWriteArraySet f15193a;

    /* renamed from: b */
    private final int f15194b;

    /* renamed from: c */
    private final ale f15195c;

    ald(CopyOnWriteArraySet copyOnWriteArraySet, int i, ale ale) {
        this.f15193a = copyOnWriteArraySet;
        this.f15194b = i;
        this.f15195c = ale;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f15193a;
        int i = this.f15194b;
        ale ale = this.f15195c;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((alg) it.next()).mo13896b(i, ale);
        }
    }
}
