package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pw2 implements uu3<nw2> {

    /* renamed from: a */
    private final iv3<uw2> f37778a;

    /* renamed from: b */
    private final iv3<cx2> f37779b;

    /* renamed from: c */
    private final iv3<ScheduledExecutorService> f37780c;

    public pw2(iv3<uw2> iv3, iv3<cx2> iv32, iv3<ScheduledExecutorService> iv33) {
        this.f37778a = iv3;
        this.f37779b = iv32;
        this.f37780c = iv33;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        ou3<uw2> a = tu3.m38016a(this.f37778a);
        ou3<cx2> a2 = tu3.m38016a(this.f37779b);
        ScheduledExecutorService zzb = this.f37780c.zzb();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37199r6)).booleanValue()) {
            obj = new rw2(a.zzb(), zzb);
        } else {
            obj = a2.zzb();
        }
        cv3.m31156b(obj);
        return obj;
    }
}
