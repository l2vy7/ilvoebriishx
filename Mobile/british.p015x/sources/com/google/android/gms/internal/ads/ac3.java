package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ac3 extends kb3 {

    /* renamed from: d */
    private final Callable f29602d;

    /* renamed from: e */
    final /* synthetic */ bc3 f29603e;

    ac3(bc3 bc3, Callable callable) {
        this.f29603e = bc3;
        Objects.requireNonNull(callable);
        this.f29602d = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo30344a() throws Exception {
        return this.f29602d.call();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo30345b() {
        return this.f29602d.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo30346d(Throwable th) {
        this.f29603e.mo18664w(th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo30347e(Object obj) {
        this.f29603e.mo18663v(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo30348f() {
        return this.f29603e.isDone();
    }
}
