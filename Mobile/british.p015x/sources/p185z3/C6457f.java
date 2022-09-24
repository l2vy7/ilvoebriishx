package p185z3;

import p154t3.C6150m;

/* renamed from: z3.f */
/* compiled from: Uploader */
final /* synthetic */ class C6457f implements Runnable {

    /* renamed from: b */
    private final C6462k f26512b;

    /* renamed from: c */
    private final C6150m f26513c;

    /* renamed from: d */
    private final int f26514d;

    /* renamed from: e */
    private final Runnable f26515e;

    private C6457f(C6462k kVar, C6150m mVar, int i, Runnable runnable) {
        this.f26512b = kVar;
        this.f26513c = mVar;
        this.f26514d = i;
        this.f26515e = runnable;
    }

    /* renamed from: a */
    public static Runnable m28170a(C6462k kVar, C6150m mVar, int i, Runnable runnable) {
        return new C6457f(kVar, mVar, i, runnable);
    }

    public void run() {
        C6462k.m28182e(this.f26512b, this.f26513c, this.f26514d, this.f26515e);
    }
}
