package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7377d;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7250h0 implements C7377d.C7380c {

    /* renamed from: a */
    private final WeakReference<C7306s0> f29017a;

    /* renamed from: b */
    private final C7191a<?> f29018b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f29019c;

    public C7250h0(C7306s0 s0Var, C7191a<?> aVar, boolean z) {
        this.f29017a = new WeakReference<>(s0Var);
        this.f29018b = aVar;
        this.f29019c = z;
    }

    /* renamed from: a */
    public final void mo29866a(ConnectionResult connectionResult) {
        Lock y;
        C7306s0 s0Var = (C7306s0) this.f29017a.get();
        if (s0Var != null) {
            C4604n.m20102o(Looper.myLooper() == s0Var.f29106a.f19988o.mo17962l(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            s0Var.f29107b.lock();
            try {
                if (!s0Var.m29764n(0)) {
                    y = s0Var.f29107b;
                } else {
                    if (!connectionResult.mo29686G0()) {
                        s0Var.m29762l(connectionResult, this.f29018b, this.f29019c);
                    }
                    if (s0Var.m29765o()) {
                        s0Var.m29763m();
                    }
                    y = s0Var.f29107b;
                }
                y.unlock();
            } catch (Throwable th) {
                s0Var.f29107b.unlock();
                throw th;
            }
        }
    }
}
