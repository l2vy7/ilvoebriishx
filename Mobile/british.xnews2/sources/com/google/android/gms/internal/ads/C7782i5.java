package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7782i5 {

    /* renamed from: a */
    private int f33092a = 2500;

    /* renamed from: b */
    private int f33093b;

    /* renamed from: a */
    public final int mo32553a() {
        return this.f33093b;
    }

    /* renamed from: b */
    public final int mo32554b() {
        return this.f33092a;
    }

    /* renamed from: c */
    public final void mo32555c(C7635e6 e6Var) throws C7635e6 {
        int i = this.f33093b + 1;
        this.f33093b = i;
        int i2 = this.f33092a;
        this.f33092a = i2 + ((int) ((float) i2));
        if (i > 1) {
            throw e6Var;
        }
    }
}
