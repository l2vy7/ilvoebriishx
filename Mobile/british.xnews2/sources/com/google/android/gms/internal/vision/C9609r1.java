package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.r1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9609r1 extends C9642v1 {

    /* renamed from: g */
    private final int f45841g;

    /* renamed from: h */
    private final int f45842h;

    C9609r1(byte[] bArr, int i, int i2) {
        super(bArr);
        C9552k1.m44406r(i, i + i2, bArr.length);
        this.f45841g = i;
        this.f45842h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final int mo38565A() {
        return this.f45841g;
    }

    /* renamed from: f */
    public final byte mo38458f(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.f45905f[this.f45841g + i];
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
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final byte mo38459h(int i) {
        return this.f45905f[this.f45841g + i];
    }

    public final int size() {
        return this.f45842h;
    }
}
