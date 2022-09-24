package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.l0 */
final class C8940l0 extends C8926j0 {

    /* renamed from: d */
    private final byte[] f44593d;

    /* renamed from: e */
    private final boolean f44594e;

    /* renamed from: f */
    private int f44595f;

    /* renamed from: g */
    private int f44596g;

    /* renamed from: h */
    private int f44597h;

    /* renamed from: i */
    private int f44598i;

    /* renamed from: j */
    private int f44599j;

    private C8940l0(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f44599j = Integer.MAX_VALUE;
        this.f44593d = bArr;
        this.f44595f = i2 + i;
        this.f44597h = i;
        this.f44598i = i;
        this.f44594e = z;
    }

    /* renamed from: c */
    public final int mo36977c() {
        return this.f44597h - this.f44598i;
    }

    /* renamed from: d */
    public final int mo36978d(int i) throws C8941l1 {
        if (i >= 0) {
            int c = i + mo36977c();
            int i2 = this.f44599j;
            if (c <= i2) {
                this.f44599j = c;
                int i3 = this.f44595f + this.f44596g;
                this.f44595f = i3;
                int i4 = i3 - this.f44598i;
                if (i4 > c) {
                    int i5 = i4 - c;
                    this.f44596g = i5;
                    this.f44595f = i3 - i5;
                } else {
                    this.f44596g = 0;
                }
                return i2;
            }
            throw C8941l1.m41909a();
        }
        throw new C8941l1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
