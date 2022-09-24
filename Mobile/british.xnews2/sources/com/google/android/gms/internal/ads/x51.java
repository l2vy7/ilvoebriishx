package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x51 extends m41 {

    /* renamed from: i */
    private final i50 f41039i;

    /* renamed from: j */
    private final Runnable f41040j;

    /* renamed from: k */
    private final Executor f41041k;

    public x51(n61 n61, i50 i50, Runnable runnable, Executor executor) {
        super(n61);
        this.f41039i = i50;
        this.f41040j = runnable;
        this.f41041k = executor;
    }

    /* renamed from: o */
    static /* synthetic */ void m39378o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final void mo31311b() {
        this.f41041k.execute(new v51(this, new w51(new AtomicReference(this.f41040j))));
    }

    /* renamed from: h */
    public final int mo33468h() {
        return 0;
    }

    /* renamed from: i */
    public final View mo33469i() {
        return null;
    }

    /* renamed from: j */
    public final C7774hy mo33470j() {
        return null;
    }

    /* renamed from: k */
    public final jr2 mo33471k() {
        return null;
    }

    /* renamed from: l */
    public final jr2 mo33472l() {
        return null;
    }

    /* renamed from: m */
    public final void mo33473m() {
    }

    /* renamed from: n */
    public final void mo33474n(ViewGroup viewGroup, zzbfi zzbfi) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo35724p(Runnable runnable) {
        try {
            if (!this.f41039i.mo32009O(C10489b.m48195m6(runnable))) {
                m39378o(((w51) runnable).f40702b);
            }
        } catch (RemoteException unused) {
            m39378o(((w51) runnable).f40702b);
        }
    }
}
