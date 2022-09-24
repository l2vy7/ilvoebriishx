package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kp0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f34392b;

    /* renamed from: c */
    final /* synthetic */ String f34393c;

    /* renamed from: d */
    final /* synthetic */ qp0 f34394d;

    kp0(qp0 qp0, String str, String str2) {
        this.f34394d = qp0;
        this.f34392b = str;
        this.f34393c = str2;
    }

    public final void run() {
        if (this.f34394d.f38237s != null) {
            this.f34394d.f38237s.mo18701g(this.f34392b, this.f34393c);
        }
    }
}
