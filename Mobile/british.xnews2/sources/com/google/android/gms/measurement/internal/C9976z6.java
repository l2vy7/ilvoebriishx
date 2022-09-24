package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.z6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9976z6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzp f46922b;

    /* renamed from: c */
    final /* synthetic */ C9918t7 f46923c;

    C9976z6(C9918t7 t7Var, zzp zzp) {
        this.f46923c = t7Var;
        this.f46922b = zzp;
    }

    public final void run() {
        C9918t7 t7Var = this.f46923c;
        C11030e H = t7Var.f46763d;
        if (H == null) {
            t7Var.f21269a.mo19276j().mo19282q().mo38856a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C4604n.m20098k(this.f46922b);
            H.mo38832H2(this.f46922b);
            this.f46923c.f21269a.mo19362C().mo39262t();
            this.f46923c.mo39220q(H, (AbstractSafeParcelable) null, this.f46922b);
            this.f46923c.m45383E();
        } catch (RemoteException e) {
            this.f46923c.f21269a.mo19276j().mo19282q().mo38857b("Failed to send app launch to the service", e);
        }
    }
}
