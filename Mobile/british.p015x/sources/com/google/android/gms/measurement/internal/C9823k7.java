package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p256u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.k7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9823k7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f46406b;

    /* renamed from: c */
    final /* synthetic */ String f46407c;

    /* renamed from: d */
    final /* synthetic */ String f46408d;

    /* renamed from: e */
    final /* synthetic */ zzp f46409e;

    /* renamed from: f */
    final /* synthetic */ C9918t7 f46410f;

    C9823k7(C9918t7 t7Var, AtomicReference atomicReference, String str, String str2, String str3, zzp zzp) {
        this.f46410f = t7Var;
        this.f46406b = atomicReference;
        this.f46407c = str2;
        this.f46408d = str3;
        this.f46409e = zzp;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f46406b) {
            try {
                C9918t7 t7Var = this.f46410f;
                C11030e H = t7Var.f46763d;
                if (H == null) {
                    t7Var.f21269a.mo19276j().mo19282q().mo38859d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f46407c, this.f46408d);
                    this.f46406b.set(Collections.emptyList());
                    this.f46406b.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C4604n.m20098k(this.f46409e);
                    this.f46406b.set(H.mo38835L2(this.f46407c, this.f46408d, this.f46409e));
                } else {
                    this.f46406b.set(H.mo38840V1((String) null, this.f46407c, this.f46408d));
                }
                this.f46410f.m45383E();
                atomicReference = this.f46406b;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f46410f.f21269a.mo19276j().mo19282q().mo38859d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f46407c, e);
                    this.f46406b.set(Collections.emptyList());
                    atomicReference = this.f46406b;
                } catch (Throwable th) {
                    this.f46406b.notify();
                    throw th;
                }
            }
        }
    }
}
