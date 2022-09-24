package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ib0 {

    /* renamed from: a */
    private final Object f20392a = new Object();

    /* renamed from: b */
    private final Object f20393b = new Object();
    @GuardedBy("lockClient")

    /* renamed from: c */
    private sb0 f20394c;
    @GuardedBy("lockService")

    /* renamed from: d */
    private sb0 f20395d;

    /* renamed from: c */
    private static final Context m20541c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final sb0 mo18420a(Context context, zzcjf zzcjf) {
        sb0 sb0;
        synchronized (this.f20392a) {
            if (this.f20394c == null) {
                this.f20394c = new sb0(m20541c(context), zzcjf, (String) C8311wv.m39277c().mo18570b(p00.f37039a));
            }
            sb0 = this.f20394c;
        }
        return sb0;
    }

    /* renamed from: b */
    public final sb0 mo18421b(Context context, zzcjf zzcjf) {
        sb0 sb0;
        synchronized (this.f20393b) {
            if (this.f20395d == null) {
                this.f20395d = new sb0(m20541c(context), zzcjf, n20.f35872b.mo34648e());
            }
            sb0 = this.f20395d;
        }
        return sb0;
    }
}
