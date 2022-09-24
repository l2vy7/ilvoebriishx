package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ny */
final /* synthetic */ class C4221ny implements Runnable {

    /* renamed from: a */
    private final C4225ob f18116a;

    /* renamed from: b */
    private final C4266pp f18117b;

    /* renamed from: c */
    private final /* synthetic */ int f18118c = 0;

    C4221ny(C4225ob obVar, C4266pp ppVar) {
        this.f18116a = obVar;
        this.f18117b = ppVar;
    }

    C4221ny(C4225ob obVar, C4266pp ppVar, byte[] bArr) {
        this.f18116a = obVar;
        this.f18117b = ppVar;
    }

    public final void run() {
        if (this.f18118c != 0) {
            this.f18116a.mo16410t(this.f18117b);
        } else {
            this.f18116a.mo16404n(this.f18117b);
        }
    }
}
