package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nv1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final tv1 f36156a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f36157b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<String, String> f36158c;

    public nv1(tv1 tv1, Executor executor) {
        this.f36156a = tv1;
        this.f36158c = tv1.mo35041c();
        this.f36157b = executor;
    }

    /* renamed from: a */
    public final mv1 mo33772a() {
        mv1 mv1 = new mv1(this);
        mv1 unused = mv1.f35627a.putAll(mv1.f35628b.f36158c);
        return mv1;
    }
}
