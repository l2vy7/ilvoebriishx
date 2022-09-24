package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kw2 {

    /* renamed from: a */
    private final Executor f34500a;

    /* renamed from: b */
    private final io0 f34501b;

    public kw2(Executor executor, io0 io0) {
        this.f34500a = executor;
        this.f34501b = io0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo33192a(String str) {
        this.f34501b.zza(str);
    }

    /* renamed from: b */
    public final void mo33193b(String str) {
        this.f34500a.execute(new jw2(this, str));
    }
}
