package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9252m7 extends C9298p7 {

    /* renamed from: g */
    private final int f45198g;

    C9252m7(byte[] bArr, int i, int i2) {
        super(bArr);
        C9329r7.m43543q(0, i2, bArr.length);
        this.f45198g = i2;
    }

    /* renamed from: a */
    public final byte mo37729a(int i) {
        int i2 = this.f45198g;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f45362f[i];
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
    public final byte mo37730b(int i) {
        return this.f45362f[i];
    }

    /* renamed from: c */
    public final int mo37731c() {
        return this.f45198g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo37732x() {
        return 0;
    }
}
