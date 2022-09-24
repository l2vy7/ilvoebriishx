package com.google.android.gms.internal.vision;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.vision.o */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9582o extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f45757a;

    public C9582o(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f45757a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C9582o.class) {
            if (this == obj) {
                return true;
            }
            C9582o oVar = (C9582o) obj;
            return this.f45757a == oVar.f45757a && get() == oVar.get();
        }
    }

    public final int hashCode() {
        return this.f45757a;
    }
}
