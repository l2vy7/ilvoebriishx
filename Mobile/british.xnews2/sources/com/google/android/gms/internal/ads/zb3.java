package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zb3 extends kb3<mb3> {

    /* renamed from: d */
    private final ga3 f42415d;

    /* renamed from: e */
    final /* synthetic */ bc3 f42416e;

    zb3(bc3 bc3, ga3 ga3) {
        this.f42416e = bc3;
        Objects.requireNonNull(ga3);
        this.f42415d = ga3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30344a() throws Exception {
        mb3 zza = this.f42415d.zza();
        b43.m20207d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f42415d);
        return zza;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo30345b() {
        return this.f42415d.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo30346d(Throwable th) {
        this.f42416e.mo18664w(th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo30347e(Object obj) {
        this.f42416e.mo18665x((mb3) obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo30348f() {
        return this.f42416e.isDone();
    }
}
