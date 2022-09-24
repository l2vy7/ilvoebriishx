package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class i93 {

    /* renamed from: d */
    static final i93 f20388d = new i93();
    @CheckForNull

    /* renamed from: a */
    final Runnable f20389a;
    @CheckForNull

    /* renamed from: b */
    final Executor f20390b;
    @CheckForNull

    /* renamed from: c */
    i93 f20391c;

    i93() {
        this.f20389a = null;
        this.f20390b = null;
    }

    i93(Runnable runnable, Executor executor) {
        this.f20389a = runnable;
        this.f20390b = executor;
    }
}
