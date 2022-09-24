package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ek2 implements zi2<fk2> {

    /* renamed from: a */
    private final Context f31396a;

    /* renamed from: b */
    private final nn0 f31397b;

    /* renamed from: c */
    private final ScheduledExecutorService f31398c;

    /* renamed from: d */
    private final Executor f31399d;

    /* renamed from: e */
    private final String f31400e;

    /* renamed from: f */
    private final fn0 f31401f;

    public ek2(fn0 fn0, int i, Context context, nn0 nn0, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.f31401f = fn0;
        this.f31396a = context;
        this.f31397b = nn0;
        this.f31398c = scheduledExecutorService;
        this.f31399d = executor;
        this.f31400e = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ fk2 mo31597a(Exception exc) {
        this.f31397b.mo18592s(exc, "AttestationTokenSignal");
        return null;
    }

    public final mb3<fk2> zzb() {
        return bb3.m30646f((sa3) bb3.m30655o(bb3.m30653m(sa3.m37369D(bb3.m30652l(new dk2(this), this.f31399d)), ck2.f30408a, this.f31399d), ((Long) C8311wv.m39277c().mo18570b(p00.f36904J0)).longValue(), TimeUnit.MILLISECONDS, this.f31398c), Exception.class, new bk2(this), tb3.m37771b());
    }
}
