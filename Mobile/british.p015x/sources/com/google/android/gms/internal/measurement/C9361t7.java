package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9361t7 extends C9392v7 {

    /* renamed from: b */
    private final byte[] f45466b;

    /* renamed from: c */
    private int f45467c;

    /* renamed from: d */
    private int f45468d;

    /* renamed from: e */
    private int f45469e = Integer.MAX_VALUE;

    /* synthetic */ C9361t7(byte[] bArr, int i, int i2, boolean z, C9345s7 s7Var) {
        super((C9345s7) null);
        this.f45466b = bArr;
        this.f45467c = 0;
    }

    /* renamed from: c */
    public final int mo38058c(int i) throws C9085b9 {
        int i2 = this.f45469e;
        this.f45469e = 0;
        int i3 = this.f45467c + this.f45468d;
        this.f45467c = i3;
        if (i3 > 0) {
            this.f45468d = i3;
            this.f45467c = 0;
        } else {
            this.f45468d = 0;
        }
        return i2;
    }
}
