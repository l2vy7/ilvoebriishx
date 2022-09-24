package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7204c;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;
import p150t.C6077a;

/* renamed from: com.google.android.gms.common.api.internal.c3 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7230c3 {

    /* renamed from: a */
    private final C6077a<C7220b<?>, ConnectionResult> f28988a;

    /* renamed from: b */
    private final C6077a<C7220b<?>, String> f28989b;

    /* renamed from: c */
    private final TaskCompletionSource<Map<C7220b<?>, String>> f28990c;

    /* renamed from: d */
    private int f28991d;

    /* renamed from: e */
    private boolean f28992e;

    /* renamed from: a */
    public final Set<C7220b<?>> mo29840a() {
        return this.f28988a.keySet();
    }

    /* renamed from: b */
    public final void mo29841b(C7220b<?> bVar, ConnectionResult connectionResult, String str) {
        this.f28988a.put(bVar, connectionResult);
        this.f28989b.put(bVar, str);
        this.f28991d--;
        if (!connectionResult.mo29686G0()) {
            this.f28992e = true;
        }
        if (this.f28991d != 0) {
            return;
        }
        if (this.f28992e) {
            this.f28990c.setException(new C7204c(this.f28988a));
            return;
        }
        this.f28990c.setResult(this.f28989b);
    }
}
