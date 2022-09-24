package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.a7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9718a7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9844m6 f46154b;

    /* renamed from: c */
    final /* synthetic */ C9918t7 f46155c;

    C9718a7(C9918t7 t7Var, C9844m6 m6Var) {
        this.f46155c = t7Var;
        this.f46154b = m6Var;
    }

    public final void run() {
        C9918t7 t7Var = this.f46155c;
        C11030e H = t7Var.f46763d;
        if (H == null) {
            t7Var.f21269a.mo19276j().mo19282q().mo38856a("Failed to send current screen to service");
            return;
        }
        try {
            C9844m6 m6Var = this.f46154b;
            if (m6Var == null) {
                H.mo38830E3(0, (String) null, (String) null, t7Var.f21269a.mo19277r().getPackageName());
            } else {
                H.mo38830E3(m6Var.f46469c, m6Var.f46467a, m6Var.f46468b, t7Var.f21269a.mo19277r().getPackageName());
            }
            this.f46155c.m45383E();
        } catch (RemoteException e) {
            this.f46155c.f21269a.mo19276j().mo19282q().mo38857b("Failed to send current screen to the service", e);
        }
    }
}
