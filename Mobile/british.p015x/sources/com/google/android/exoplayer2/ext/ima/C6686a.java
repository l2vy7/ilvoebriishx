package com.google.android.exoplayer2.ext.ima;

/* renamed from: com.google.android.exoplayer2.ext.ima.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6686a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AdTagLoader f27408b;

    public /* synthetic */ C6686a(AdTagLoader adTagLoader) {
        this.f27408b = adTagLoader;
    }

    public final void run() {
        this.f27408b.updateAdProgress();
    }
}
