package p179y3;

import p142r3.C6002h;
import p153t3.C6141h;
import p153t3.C6150m;

/* renamed from: y3.a */
/* compiled from: DefaultScheduler */
final /* synthetic */ class C6408a implements Runnable {

    /* renamed from: b */
    private final C6410c f26326b;

    /* renamed from: c */
    private final C6150m f26327c;

    /* renamed from: d */
    private final C6002h f26328d;

    /* renamed from: e */
    private final C6141h f26329e;

    private C6408a(C6410c cVar, C6150m mVar, C6002h hVar, C6141h hVar2) {
        this.f26326b = cVar;
        this.f26327c = mVar;
        this.f26328d = hVar;
        this.f26329e = hVar2;
    }

    /* renamed from: a */
    public static Runnable m28091a(C6410c cVar, C6150m mVar, C6002h hVar, C6141h hVar2) {
        return new C6408a(cVar, mVar, hVar, hVar2);
    }

    public void run() {
        C6410c.m28095c(this.f26326b, this.f26327c, this.f26328d, this.f26329e);
    }
}
