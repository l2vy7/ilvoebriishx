package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.f7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9769f7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzp f46271b;

    /* renamed from: c */
    final /* synthetic */ C9918t7 f46272c;

    C9769f7(C9918t7 t7Var, zzp zzp) {
        this.f46272c = t7Var;
        this.f46271b = zzp;
    }

    public final void run() {
        C9918t7 t7Var = this.f46272c;
        C11030e H = t7Var.f46763d;
        if (H == null) {
            t7Var.f21269a.mo19276j().mo19282q().mo38856a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C4604n.m20098k(this.f46271b);
            H.mo38843e3(this.f46271b);
            this.f46272c.m45383E();
        } catch (RemoteException e) {
            this.f46272c.f21269a.mo19276j().mo19282q().mo38857b("Failed to send measurementEnabled to the service", e);
        }
    }
}
