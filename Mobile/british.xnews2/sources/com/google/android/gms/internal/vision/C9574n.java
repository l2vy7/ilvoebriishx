package com.google.android.gms.internal.vision;

import java.util.List;

/* renamed from: com.google.android.gms.internal.vision.n */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9574n extends C9566m {

    /* renamed from: b */
    private final C9558l f45742b = new C9558l();

    C9574n() {
    }

    /* renamed from: a */
    public final void mo38454a(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.f45742b.mo38485a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    System.err.print("Suppressed: ");
                    printStackTrace.printStackTrace();
                }
            }
        }
    }
}
