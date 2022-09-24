package com.google.android.gms.internal.vision;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.vision.l */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9558l {

    /* renamed from: a */
    private final ConcurrentHashMap<C9582o, List<Throwable>> f45729a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f45730b = new ReferenceQueue<>();

    C9558l() {
    }

    /* renamed from: a */
    public final List<Throwable> mo38485a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f45730b.poll();
        while (poll != null) {
            this.f45729a.remove(poll);
            poll = this.f45730b.poll();
        }
        List<Throwable> list = this.f45729a.get(new C9582o(th, (ReferenceQueue<Throwable>) null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f45729a.putIfAbsent(new C9582o(th, this.f45730b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
