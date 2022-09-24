package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sn */
/* compiled from: IMASDK */
abstract class C4345sn {

    /* renamed from: a */
    protected final C4327rw f18625a;

    protected C4345sn(C4327rw rwVar) {
        this.f18625a = rwVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo16632a(alw alw) throws C4144lb;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo16633b(alw alw, long j) throws C4144lb;

    /* renamed from: f */
    public final boolean mo16637f(alw alw, long j) throws C4144lb {
        return mo16632a(alw) && mo16633b(alw, j);
    }
}
