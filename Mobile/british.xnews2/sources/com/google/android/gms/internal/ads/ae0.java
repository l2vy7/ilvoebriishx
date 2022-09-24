package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p130p3.C5902a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class ae0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C5902a f29617b;

    /* renamed from: c */
    final /* synthetic */ be0 f29618c;

    ae0(be0 be0, C5902a aVar) {
        this.f29618c = be0;
        this.f29617b = aVar;
    }

    public final void run() {
        try {
            this.f29618c.f29979a.mo34073k(ce0.m30976a(this.f29617b));
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
