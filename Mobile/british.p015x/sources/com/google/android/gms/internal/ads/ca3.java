package com.google.android.gms.internal.ads;

import androidx.work.impl.utils.futures.C1474b;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ca3 extends ba3 {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater<fa3<?>, Set<Throwable>> f20175a;

    /* renamed from: b */
    final AtomicIntegerFieldUpdater<fa3<?>> f20176b;

    ca3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super((aa3) null);
        this.f20175a = atomicReferenceFieldUpdater;
        this.f20176b = atomicIntegerFieldUpdater;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo18117a(fa3<?> fa3) {
        return this.f20176b.decrementAndGet(fa3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18118b(fa3<?> fa3, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
        C1474b.m7751a(this.f20175a, fa3, (Object) null, set2);
    }
}
