package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.m3 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7279m3 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C7324w f29069b;

    C7279m3(C7324w wVar) {
        this.f29069b = wVar;
    }

    public final void run() {
        this.f29069b.f29174n.lock();
        try {
            C7324w.m29866y(this.f29069b);
        } finally {
            this.f29069b.f29174n.unlock();
        }
    }
}
