package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.k2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
abstract class C9217k2 implements Runnable {

    /* renamed from: b */
    final long f45115b;

    /* renamed from: c */
    final long f45116c;

    /* renamed from: d */
    final boolean f45117d;

    /* renamed from: e */
    final /* synthetic */ C9372u2 f45118e;

    C9217k2(C9372u2 u2Var, boolean z) {
        this.f45118e = u2Var;
        this.f45115b = u2Var.f45483b.currentTimeMillis();
        this.f45116c = u2Var.f45483b.elapsedRealtime();
        this.f45117d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo37305a() throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo37306b() {
    }

    public final void run() {
        if (this.f45118e.f45488g) {
            mo37306b();
            return;
        }
        try {
            mo37305a();
        } catch (Exception e) {
            this.f45118e.m43679j(e, false, this.f45117d);
            mo37306b();
        }
    }
}
