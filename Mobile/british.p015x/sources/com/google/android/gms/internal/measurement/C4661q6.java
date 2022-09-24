package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.q6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C4661q6 extends C9344s6 {

    /* renamed from: b */
    static final C4661q6 f21258b = new C4661q6();

    private C4661q6() {
    }

    /* renamed from: a */
    public final Object mo19213a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: b */
    public final boolean mo19214b() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
