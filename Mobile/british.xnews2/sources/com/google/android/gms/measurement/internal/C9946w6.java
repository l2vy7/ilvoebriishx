package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.w6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9946w6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzp f46831b;

    /* renamed from: c */
    final /* synthetic */ C9918t7 f46832c;

    C9946w6(C9918t7 t7Var, zzp zzp) {
        this.f46832c = t7Var;
        this.f46831b = zzp;
    }

    public final void run() {
        C9918t7 t7Var = this.f46832c;
        C11030e H = t7Var.f46763d;
        if (H == null) {
            t7Var.f21269a.mo19276j().mo19282q().mo38856a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C4604n.m20098k(this.f46831b);
            H.mo38841Y0(this.f46831b);
        } catch (RemoteException e) {
            this.f46832c.f21269a.mo19276j().mo19282q().mo38857b("Failed to reset data on the service: remote exception", e);
        }
        this.f46832c.m45383E();
    }
}
