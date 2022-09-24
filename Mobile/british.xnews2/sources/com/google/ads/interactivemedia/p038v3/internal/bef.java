package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bef */
/* compiled from: IMASDK */
final class bef {

    /* renamed from: a */
    private final ConcurrentHashMap<bee, List<Throwable>> f16200a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f16201b = new ReferenceQueue<>();

    bef() {
    }

    /* renamed from: a */
    public final List<Throwable> mo14961a(Throwable th, boolean z) {
        ReferenceQueue<Throwable> referenceQueue = this.f16201b;
        while (true) {
            Reference<? extends Throwable> poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.f16200a.remove(poll);
            referenceQueue = this.f16201b;
        }
        List<Throwable> list = this.f16200a.get(new bee(th, (ReferenceQueue<Throwable>) null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f16200a.putIfAbsent(new bee(th, this.f16201b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
