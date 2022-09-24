package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p256u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.m7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9845m7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f46473b;

    /* renamed from: c */
    final /* synthetic */ String f46474c;

    /* renamed from: d */
    final /* synthetic */ String f46475d;

    /* renamed from: e */
    final /* synthetic */ zzp f46476e;

    /* renamed from: f */
    final /* synthetic */ boolean f46477f;

    /* renamed from: g */
    final /* synthetic */ C9918t7 f46478g;

    C9845m7(C9918t7 t7Var, AtomicReference atomicReference, String str, String str2, String str3, zzp zzp, boolean z) {
        this.f46478g = t7Var;
        this.f46473b = atomicReference;
        this.f46474c = str2;
        this.f46475d = str3;
        this.f46476e = zzp;
        this.f46477f = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f46473b) {
            try {
                C9918t7 t7Var = this.f46478g;
                C11030e H = t7Var.f46763d;
                if (H == null) {
                    t7Var.f21269a.mo19276j().mo19282q().mo38859d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f46474c, this.f46475d);
                    this.f46473b.set(Collections.emptyList());
                    this.f46473b.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C4604n.m20098k(this.f46476e);
                    this.f46473b.set(H.mo38836N3(this.f46474c, this.f46475d, this.f46477f, this.f46476e));
                } else {
                    this.f46473b.set(H.mo38837P0((String) null, this.f46474c, this.f46475d, this.f46477f));
                }
                this.f46478g.m45383E();
                atomicReference = this.f46473b;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f46478g.f21269a.mo19276j().mo19282q().mo38859d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f46474c, e);
                    this.f46473b.set(Collections.emptyList());
                    atomicReference = this.f46473b;
                } catch (Throwable th) {
                    this.f46473b.notify();
                    throw th;
                }
            }
        }
    }
}
