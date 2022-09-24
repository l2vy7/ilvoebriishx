package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kl2 implements zi2<ll2> {

    /* renamed from: a */
    private final nn0 f34365a;

    /* renamed from: b */
    private final boolean f34366b;

    /* renamed from: c */
    private final ScheduledExecutorService f34367c;

    /* renamed from: d */
    private final nb3 f34368d;

    /* renamed from: e */
    private final String f34369e;

    /* renamed from: f */
    private final dn0 f34370f;

    kl2(nn0 nn0, boolean z, dn0 dn0, nb3 nb3, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.f34365a = nn0;
        this.f34366b = z;
        this.f34370f = dn0;
        this.f34368d = nb3;
        this.f34369e = str;
        this.f34367c = scheduledExecutorService;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ll2 mo33113a(Exception exc) {
        this.f34365a.mo18592s(exc, "TrustlessTokenSignal");
        return null;
    }

    public final mb3<ll2> zzb() {
        if (!r20.f38507a.mo34648e().booleanValue() && !this.f34366b) {
            return bb3.m30649i(null);
        }
        return bb3.m30646f(bb3.m30655o(bb3.m30653m(bb3.m30649i(null), jl2.f33933a, this.f34368d), r20.f38509c.mo34648e().longValue(), TimeUnit.MILLISECONDS, this.f34367c), Exception.class, new il2(this), this.f34368d);
    }
}
