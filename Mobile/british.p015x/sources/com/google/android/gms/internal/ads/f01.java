package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class f01 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ g01 f31563b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f31564c;

    public /* synthetic */ f01(g01 g01, Runnable runnable) {
        this.f31563b = g01;
        this.f31564c = runnable;
    }

    public final void run() {
        po0.f37726e.execute(new e01(this.f31563b, this.f31564c));
    }
}
