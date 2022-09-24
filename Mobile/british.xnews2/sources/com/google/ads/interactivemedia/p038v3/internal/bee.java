package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bee */
/* compiled from: IMASDK */
final class bee extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f16199a;

    public bee(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f16199a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == bee.class) {
            if (this == obj) {
                return true;
            }
            bee bee = (bee) obj;
            return this.f16199a == bee.f16199a && get() == bee.get();
        }
    }

    public final int hashCode() {
        return this.f16199a;
    }
}
