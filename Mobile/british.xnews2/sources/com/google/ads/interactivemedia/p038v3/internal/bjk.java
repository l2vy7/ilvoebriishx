package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjk */
/* compiled from: IMASDK */
final class bjk extends bjo {
    private static final long serialVersionUID = 1;

    /* renamed from: c */
    private final int f16478c = 0;

    /* renamed from: d */
    private final int f16479d;

    bjk(byte[] bArr, int i, int i2) {
        super(bArr);
        bjq.m16054t(0, i2, bArr.length);
        this.f16479d = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    /* renamed from: a */
    public final byte mo15199a(int i) {
        int i2 = this.f16479d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f16480a[i];
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
    public final byte mo15200b(int i) {
        return this.f16480a[i];
    }

    /* renamed from: c */
    public final int mo15201c() {
        return this.f16479d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo15202d() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo15203e(byte[] bArr, int i) {
        System.arraycopy(this.f16480a, 0, bArr, 0, i);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return bjq.m16052o(mo15216q());
    }
}
