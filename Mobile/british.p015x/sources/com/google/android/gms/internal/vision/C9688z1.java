package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.z1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9688z1 extends C9672x1 {

    /* renamed from: d */
    private final byte[] f46016d;

    /* renamed from: e */
    private final boolean f46017e;

    /* renamed from: f */
    private int f46018f;

    /* renamed from: g */
    private int f46019g;

    /* renamed from: h */
    private int f46020h;

    /* renamed from: i */
    private int f46021i;

    /* renamed from: j */
    private int f46022j;

    private C9688z1(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f46022j = Integer.MAX_VALUE;
        this.f46016d = bArr;
        this.f46018f = i2 + i;
        this.f46020h = i;
        this.f46021i = i;
        this.f46017e = z;
    }

    /* renamed from: f */
    private final void m44908f() {
        int i = this.f46018f + this.f46019g;
        this.f46018f = i;
        int i2 = i - this.f46021i;
        int i3 = this.f46022j;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f46019g = i4;
            this.f46018f = i - i4;
            return;
        }
        this.f46019g = 0;
    }

    /* renamed from: b */
    public final int mo38636b(int i) throws C9513f3 {
        if (i >= 0) {
            int d = i + mo38637d();
            int i2 = this.f46022j;
            if (d <= i2) {
                this.f46022j = d;
                m44908f();
                return i2;
            }
            throw C9513f3.m44255a();
        }
        throw C9513f3.m44256b();
    }

    /* renamed from: d */
    public final int mo38637d() {
        return this.f46020h - this.f46021i;
    }
}
