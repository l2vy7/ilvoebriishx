package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anl */
final /* synthetic */ class anl implements Runnable {

    /* renamed from: a */
    private final ann f15446a;

    /* renamed from: b */
    private final C4266pp f15447b;

    /* renamed from: c */
    private final /* synthetic */ int f15448c = 0;

    anl(ann ann, C4266pp ppVar) {
        this.f15446a = ann;
        this.f15447b = ppVar;
    }

    anl(ann ann, C4266pp ppVar, byte[] bArr) {
        this.f15446a = ann;
        this.f15447b = ppVar;
    }

    public final void run() {
        if (this.f15448c != 0) {
            this.f15446a.mo14116t(this.f15447b);
        } else {
            this.f15446a.mo14108l(this.f15447b);
        }
    }
}
