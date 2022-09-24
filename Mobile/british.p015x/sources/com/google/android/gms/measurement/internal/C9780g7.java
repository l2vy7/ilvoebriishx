package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import p256u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.g7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9780g7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzp f46307b;

    /* renamed from: c */
    final /* synthetic */ C9918t7 f46308c;

    C9780g7(C9918t7 t7Var, zzp zzp) {
        this.f46308c = t7Var;
        this.f46307b = zzp;
    }

    public final void run() {
        C9918t7 t7Var = this.f46308c;
        C11030e H = t7Var.f46763d;
        if (H == null) {
            t7Var.f21269a.mo19276j().mo19282q().mo38856a("Failed to send consent settings to service");
            return;
        }
        try {
            C4604n.m20098k(this.f46307b);
            H.mo38829C3(this.f46307b);
            this.f46308c.m45383E();
        } catch (RemoteException e) {
            this.f46308c.f21269a.mo19276j().mo19282q().mo38857b("Failed to send consent settings to the service", e);
        }
    }
}
