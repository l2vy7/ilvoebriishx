package com.google.android.gms.internal.cast;

import androidx.mediarouter.media.C1001r;

/* renamed from: com.google.android.gms.internal.cast.c */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final /* synthetic */ class C8463c implements Runnable {

    /* renamed from: b */
    private final C8497e f43307b;

    /* renamed from: c */
    private final C1001r f43308c;

    /* renamed from: d */
    private final int f43309d;

    C8463c(C8497e eVar, C1001r rVar, int i) {
        this.f43307b = eVar;
        this.f43308c = rVar;
        this.f43309d = i;
    }

    public final void run() {
        this.f43307b.mo36450m6(this.f43308c, this.f43309d);
    }
}
