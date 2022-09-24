package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.zb */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8842zb extends C8442ac {

    /* renamed from: a */
    private final byte[] f44263a;

    /* renamed from: b */
    private int f44264b;

    /* renamed from: c */
    private int f44265c;

    /* renamed from: d */
    private int f44266d = Integer.MAX_VALUE;

    /* synthetic */ C8842zb(byte[] bArr, int i, int i2, boolean z, C8812xb xbVar) {
        super((C8812xb) null);
        this.f44263a = bArr;
        this.f44264b = 0;
    }

    /* renamed from: a */
    public final int mo36786a(int i) throws C8460bd {
        int i2 = this.f44266d;
        this.f44266d = 0;
        int i3 = this.f44264b + this.f44265c;
        this.f44264b = i3;
        if (i3 > 0) {
            this.f44265c = i3;
            this.f44264b = 0;
        } else {
            this.f44265c = 0;
        }
        return i2;
    }
}
