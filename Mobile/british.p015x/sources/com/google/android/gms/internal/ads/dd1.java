package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class dd1 implements Runnable {

    /* renamed from: b */
    private final WeakReference<ed1> f30718b;

    /* synthetic */ dd1(ed1 ed1, cd1 cd1) {
        this.f30718b = new WeakReference<>(ed1);
    }

    public final void run() {
        ed1 ed1 = (ed1) this.f30718b.get();
        if (ed1 != null) {
            ed1.mo30919B0(bd1.f29969a);
        }
    }
}
