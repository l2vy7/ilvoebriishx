package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ma3 extends na3 {

    /* renamed from: f */
    private final Callable f35465f;

    /* renamed from: g */
    final /* synthetic */ oa3 f35466g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ma3(oa3 oa3, Callable callable, Executor executor) {
        super(oa3, executor);
        this.f35466g = oa3;
        Objects.requireNonNull(callable);
        this.f35465f = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo30344a() throws Exception {
        return this.f35465f.call();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo30345b() {
        return this.f35465f.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo33515h(Object obj) {
        this.f35466g.mo18663v(obj);
    }
}
