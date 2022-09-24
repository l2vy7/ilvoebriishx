package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.c1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
abstract class C7228c1 {

    /* renamed from: a */
    private final C7222b1 f28984a;

    protected C7228c1(C7222b1 b1Var) {
        this.f28984a = b1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29838a();

    /* renamed from: b */
    public final void mo29839b(C4594e1 e1Var) {
        Lock k;
        e1Var.f19975b.lock();
        try {
            if (e1Var.f19985l != this.f28984a) {
                k = e1Var.f19975b;
            } else {
                mo29838a();
                k = e1Var.f19975b;
            }
            k.unlock();
        } catch (Throwable th) {
            e1Var.f19975b.unlock();
            throw th;
        }
    }
}
