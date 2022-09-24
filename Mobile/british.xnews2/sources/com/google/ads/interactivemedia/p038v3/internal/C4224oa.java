package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oa */
final /* synthetic */ class C4224oa implements Runnable {

    /* renamed from: a */
    private final C4225ob f18148a;

    /* renamed from: b */
    private final Exception f18149b;

    /* renamed from: c */
    private final /* synthetic */ int f18150c = 0;

    C4224oa(C4225ob obVar, Exception exc) {
        this.f18148a = obVar;
        this.f18149b = exc;
    }

    C4224oa(C4225ob obVar, Exception exc, byte[] bArr) {
        this.f18148a = obVar;
        this.f18149b = exc;
    }

    public final void run() {
        if (this.f18150c != 0) {
            this.f18148a.mo16402l(this.f18149b);
        } else {
            this.f18148a.mo16401k(this.f18149b);
        }
    }
}
