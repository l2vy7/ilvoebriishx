package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ss2<T> {
    @GuardedBy("this")

    /* renamed from: a */
    private final Deque<mb3<T>> f39051a = new LinkedBlockingDeque();

    /* renamed from: b */
    private final Callable<T> f39052b;

    /* renamed from: c */
    private final nb3 f39053c;

    public ss2(Callable<T> callable, nb3 nb3) {
        this.f39052b = callable;
        this.f39053c = nb3;
    }

    /* renamed from: a */
    public final synchronized mb3<T> mo34783a() {
        mo34785c(1);
        return this.f39051a.poll();
    }

    /* renamed from: b */
    public final synchronized void mo34784b(mb3<T> mb3) {
        this.f39051a.addFirst(mb3);
    }

    /* renamed from: c */
    public final synchronized void mo34785c(int i) {
        int size = i - this.f39051a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f39051a.add(this.f39053c.mo33675b(this.f39052b));
        }
    }
}
