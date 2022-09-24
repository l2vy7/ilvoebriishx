package com.google.android.gms.internal.ads;

import androidx.work.impl.utils.futures.C1474b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class j93 extends f93 {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater<p93, Thread> f20465a;

    /* renamed from: b */
    final AtomicReferenceFieldUpdater<p93, p93> f20466b;

    /* renamed from: c */
    final AtomicReferenceFieldUpdater<q93, p93> f20467c;

    /* renamed from: d */
    final AtomicReferenceFieldUpdater<q93, i93> f20468d;

    /* renamed from: e */
    final AtomicReferenceFieldUpdater<q93, Object> f20469e;

    j93(AtomicReferenceFieldUpdater<p93, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<p93, p93> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<q93, p93> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<q93, i93> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<q93, Object> atomicReferenceFieldUpdater5) {
        super((e93) null);
        this.f20465a = atomicReferenceFieldUpdater;
        this.f20466b = atomicReferenceFieldUpdater2;
        this.f20467c = atomicReferenceFieldUpdater3;
        this.f20468d = atomicReferenceFieldUpdater4;
        this.f20469e = atomicReferenceFieldUpdater5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18310a(p93 p93, @CheckForNull p93 p932) {
        this.f20466b.lazySet(p93, p932);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18311b(p93 p93, Thread thread) {
        this.f20465a.lazySet(p93, thread);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo18312c(q93<?> q93, @CheckForNull i93 i93, i93 i932) {
        return C1474b.m7751a(this.f20468d, q93, i93, i932);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo18313d(q93<?> q93, @CheckForNull Object obj, Object obj2) {
        return C1474b.m7751a(this.f20469e, q93, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo18314e(q93<?> q93, @CheckForNull p93 p93, @CheckForNull p93 p932) {
        return C1474b.m7751a(this.f20467c, q93, p93, p932);
    }
}
