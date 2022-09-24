package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.rb */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8719rb extends C8765ub {

    /* renamed from: g */
    private final int f43954g;

    C8719rb(byte[] bArr, int i, int i2) {
        super(bArr);
        C8796wb.m41384v(0, i2, bArr.length);
        this.f43954g = i2;
    }

    /* renamed from: a */
    public final byte mo36695a(int i) {
        int i2 = this.f43954g;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f44122f[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte mo36696b(int i) {
        return this.f44122f[i];
    }

    /* renamed from: c */
    public final int mo36697c() {
        return this.f43954g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo36698x() {
        return 0;
    }
}
