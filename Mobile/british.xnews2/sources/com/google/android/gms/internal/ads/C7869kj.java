package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.kj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7869kj implements Runnable {

    /* renamed from: b */
    final /* synthetic */ IOException f34345b;

    /* renamed from: c */
    final /* synthetic */ C8017oj f34346c;

    C7869kj(C8017oj ojVar, IOException iOException) {
        this.f34346c = ojVar;
        this.f34345b = iOException;
    }

    public final void run() {
        this.f34346c.f36485f.mo34137d(this.f34345b);
    }
}
