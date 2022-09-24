package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class ud4 {

    /* renamed from: a */
    protected final ad4 f39830a;

    protected ud4(ad4 ad4) {
        this.f39830a = ad4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo34112a(uq2 uq2) throws C7811iy;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo34113b(uq2 uq2, long j) throws C7811iy;

    /* renamed from: c */
    public final boolean mo35169c(uq2 uq2, long j) throws C7811iy {
        return mo34112a(uq2) && mo34113b(uq2, j);
    }
}
