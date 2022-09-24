package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.b7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9728b7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzp f46179b;

    /* renamed from: c */
    final /* synthetic */ Bundle f46180c;

    /* renamed from: d */
    final /* synthetic */ C9918t7 f46181d;

    C9728b7(C9918t7 t7Var, zzp zzp, Bundle bundle) {
        this.f46181d = t7Var;
        this.f46179b = zzp;
        this.f46180c = bundle;
    }

    public final void run() {
        C9918t7 t7Var = this.f46181d;
        C11030e H = t7Var.f46763d;
        if (H == null) {
            t7Var.f21269a.mo19276j().mo19282q().mo38856a("Failed to send default event parameters to service");
            return;
        }
        try {
            C4604n.m20098k(this.f46179b);
            H.mo38850x0(this.f46180c, this.f46179b);
        } catch (RemoteException e) {
            this.f46181d.f21269a.mo19276j().mo19282q().mo38857b("Failed to send default event parameters to service", e);
        }
    }
}
