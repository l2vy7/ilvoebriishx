package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7203b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C7377d;
import com.google.android.gms.common.internal.C7414o;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p006a5.C6480b;

/* renamed from: com.google.android.gms.common.api.internal.x1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7330x1<T> implements OnCompleteListener<T> {

    /* renamed from: a */
    private final C4595g f29186a;

    /* renamed from: b */
    private final int f29187b;

    /* renamed from: c */
    private final C7220b<?> f29188c;

    /* renamed from: d */
    private final long f29189d;

    /* renamed from: e */
    private final long f29190e;

    C7330x1(C4595g gVar, int i, C7220b<?> bVar, long j, long j2, String str, String str2) {
        this.f29186a = gVar;
        this.f29187b = i;
        this.f29188c = bVar;
        this.f29189d = j;
        this.f29190e = j2;
    }

    /* renamed from: a */
    static <T> C7330x1<T> m29884a(C4595g gVar, int i, C7220b<?> bVar) {
        boolean z;
        if (!gVar.mo17936g()) {
            return null;
        }
        RootTelemetryConfiguration a = C7414o.m30045b().mo30145a();
        if (a == null) {
            z = true;
        } else if (!a.mo30035E0()) {
            return null;
        } else {
            z = a.mo30036F0();
            C4596m1 x = gVar.mo17940x(bVar);
            if (x != null) {
                if (!(x.mo17958s() instanceof C7377d)) {
                    return null;
                }
                C7377d dVar = (C7377d) x.mo17958s();
                if (dVar.hasConnectionInfo() && !dVar.isConnecting()) {
                    ConnectionTelemetryConfiguration b = m29885b(x, dVar, i);
                    if (b == null) {
                        return null;
                    }
                    x.mo17944E();
                    z = b.mo30027G0();
                }
            }
        }
        return new C7330x1(gVar, i, bVar, z ? System.currentTimeMillis() : 0, z ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    /* renamed from: b */
    private static ConnectionTelemetryConfiguration m29885b(C4596m1<?> m1Var, C7377d<?> dVar, int i) {
        int[] D0;
        int[] E0;
        ConnectionTelemetryConfiguration telemetryConfiguration = dVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.mo30026F0() || ((D0 = telemetryConfiguration.mo30024D0()) != null ? !C6480b.m28237b(D0, i) : !((E0 = telemetryConfiguration.mo30025E0()) == null || !C6480b.m28237b(E0, i))) || m1Var.mo17956p() >= telemetryConfiguration.mo30023C0()) {
            return null;
        }
        return telemetryConfiguration;
    }

    public final void onComplete(Task<T> task) {
        C4596m1 x;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int i7;
        if (this.f29186a.mo17936g()) {
            RootTelemetryConfiguration a = C7414o.m30045b().mo30145a();
            if ((a == null || a.mo30035E0()) && (x = this.f29186a.mo17940x(this.f29188c)) != null && (x.mo17958s() instanceof C7377d)) {
                C7377d dVar = (C7377d) x.mo17958s();
                boolean z = true;
                boolean z2 = this.f29189d > 0;
                int gCoreServiceId = dVar.getGCoreServiceId();
                if (a != null) {
                    boolean F0 = z2 & a.mo30036F0();
                    int C0 = a.mo30033C0();
                    int D0 = a.mo30034D0();
                    i3 = a.mo30037G0();
                    if (dVar.hasConnectionInfo() && !dVar.isConnecting()) {
                        ConnectionTelemetryConfiguration b = m29885b(x, dVar, this.f29187b);
                        if (b != null) {
                            if (!b.mo30027G0() || this.f29189d <= 0) {
                                z = false;
                            }
                            D0 = b.mo30023C0();
                            F0 = z;
                        } else {
                            return;
                        }
                    }
                    i2 = C0;
                    i = D0;
                } else {
                    i3 = 0;
                    i2 = 5000;
                    i = 100;
                }
                C4595g gVar = this.f29186a;
                if (task.isSuccessful()) {
                    i5 = 0;
                    i4 = 0;
                } else {
                    if (task.isCanceled()) {
                        i5 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof C7203b) {
                            Status a2 = ((C7203b) exception).mo29765a();
                            int D02 = a2.mo29732D0();
                            ConnectionResult C02 = a2.mo29731C0();
                            if (C02 == null) {
                                i7 = -1;
                            } else {
                                i7 = C02.mo29682C0();
                            }
                            i4 = i7;
                            i5 = D02;
                        } else {
                            i5 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z2) {
                    long j3 = this.f29189d;
                    j = System.currentTimeMillis();
                    j2 = j3;
                    i6 = (int) (SystemClock.elapsedRealtime() - this.f29190e);
                } else {
                    j2 = 0;
                    j = 0;
                    i6 = -1;
                }
                gVar.mo17930J(new MethodInvocation(this.f29187b, i5, i4, j2, j, (String) null, (String) null, gCoreServiceId, i6), i3, (long) i2, i);
            }
        }
    }
}
