package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.d0 */
final class C8877d0 extends C8909h0 {

    /* renamed from: f */
    private final int f44490f;

    /* renamed from: g */
    private final int f44491g;

    C8877d0(byte[] bArr, int i, int i2) {
        super(bArr);
        C8847a0.m41489h(i, i + i2, bArr.length);
        this.f44490f = i;
        this.f44491g = i2;
    }

    /* renamed from: q */
    public final byte mo36808q(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.f44547e[this.f44490f + i];
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

    public final int size() {
        return this.f44491g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo36871v() {
        return this.f44490f;
    }
}
