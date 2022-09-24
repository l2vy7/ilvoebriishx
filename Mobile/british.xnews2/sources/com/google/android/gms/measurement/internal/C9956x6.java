package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.atomic.AtomicReference;
import p255u5.C11026a;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.x6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9956x6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f46854b;

    /* renamed from: c */
    final /* synthetic */ zzp f46855c;

    /* renamed from: d */
    final /* synthetic */ C9918t7 f46856d;

    C9956x6(C9918t7 t7Var, AtomicReference atomicReference, zzp zzp) {
        this.f46856d = t7Var;
        this.f46854b = atomicReference;
        this.f46855c = zzp;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f46854b) {
            try {
                if (!this.f46856d.f21269a.mo19365F().mo19395p().mo43338i(C11026a.ANALYTICS_STORAGE)) {
                    this.f46856d.f21269a.mo19276j().mo19288x().mo38856a("Analytics storage consent denied; will not get app instance id");
                    this.f46856d.f21269a.mo19367I().mo38924C((String) null);
                    this.f46856d.f21269a.mo19365F().f21331g.mo39099b((String) null);
                    this.f46854b.set((Object) null);
                    this.f46854b.notify();
                    return;
                }
                C9918t7 t7Var = this.f46856d;
                C11030e H = t7Var.f46763d;
                if (H == null) {
                    t7Var.f21269a.mo19276j().mo19282q().mo38856a("Failed to get app instance id");
                    this.f46854b.notify();
                    return;
                }
                C4604n.m20098k(this.f46855c);
                this.f46854b.set(H.mo38848t1(this.f46855c));
                String str = (String) this.f46854b.get();
                if (str != null) {
                    this.f46856d.f21269a.mo19367I().mo38924C(str);
                    this.f46856d.f21269a.mo19365F().f21331g.mo39099b(str);
                }
                this.f46856d.m45383E();
                atomicReference = this.f46854b;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f46856d.f21269a.mo19276j().mo19282q().mo38857b("Failed to get app instance id", e);
                    atomicReference = this.f46854b;
                } catch (Throwable th) {
                    this.f46854b.notify();
                    throw th;
                }
            }
        }
    }
}
