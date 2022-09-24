package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7833jj implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C7943mj f33902b;

    /* renamed from: c */
    final /* synthetic */ C8017oj f33903c;

    C7833jj(C8017oj ojVar, C7943mj mjVar) {
        this.f33903c = ojVar;
        this.f33902b = mjVar;
    }

    public final void run() {
        this.f33902b.mo33550a();
        int size = this.f33903c.f36494o.size();
        for (int i = 0; i < size; i++) {
            ((C7612dk) this.f33903c.f36494o.valueAt(i)).mo31273i();
        }
    }
}
