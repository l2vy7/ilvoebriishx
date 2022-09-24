package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class h93 {

    /* renamed from: b */
    static final h93 f32685b = new h93(new C7749a("Failure occurred while trying to finish a future."));

    /* renamed from: a */
    final Throwable f32686a;

    /* renamed from: com.google.android.gms.internal.ads.h93$a */
    /* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
    class C7749a extends Throwable {
        C7749a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    h93(Throwable th) {
        Objects.requireNonNull(th);
        this.f32686a = th;
    }
}
