package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class k93<V> implements Runnable {

    /* renamed from: b */
    final q93<V> f34202b;

    /* renamed from: c */
    final mb3<? extends V> f34203c;

    k93(q93<V> q93, mb3<? extends V> mb3) {
        this.f34202b = q93;
        this.f34203c = mb3;
    }

    public final void run() {
        if (this.f34202b.f20662b == this) {
            if (q93.f20660g.mo18313d(this.f34202b, this, q93.m20845f(this.f34203c))) {
                q93.m20841C(this.f34202b);
            }
        }
    }
}
