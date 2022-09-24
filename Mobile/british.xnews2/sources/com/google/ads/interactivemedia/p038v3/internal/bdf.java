package com.google.ads.interactivemedia.p038v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdf */
/* compiled from: IMASDK */
abstract class bdf implements bds {

    /* renamed from: b */
    private static final int[] f16159b = m15711i(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    int[] f16160a;

    /* renamed from: c */
    private final int f16161c;

    bdf(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f16160a = m15711i(bArr);
            this.f16161c = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: f */
    static void m15708f(int[] iArr, int[] iArr2) {
        int[] iArr3 = f16159b;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* renamed from: g */
    static void m15709g(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            m15710h(iArr2, 0, 4, 8, 12);
            m15710h(iArr2, 1, 5, 9, 13);
            m15710h(iArr2, 2, 6, 10, 14);
            m15710h(iArr2, 3, 7, 11, 15);
            m15710h(iArr2, 0, 5, 10, 15);
            m15710h(iArr2, 1, 6, 11, 12);
            m15710h(iArr2, 2, 7, 8, 13);
            m15710h(iArr2, 3, 4, 9, 14);
        }
    }

    /* renamed from: h */
    static void m15710h(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int j = m15712j(i5 ^ iArr[i4], 16);
        iArr[i4] = j;
        int i6 = iArr[i3] + j;
        iArr[i3] = i6;
        int j2 = m15712j(iArr[i2] ^ i6, 12);
        iArr[i2] = j2;
        int i7 = iArr[i] + j2;
        iArr[i] = i7;
        int j3 = m15712j(iArr[i4] ^ i7, 8);
        iArr[i4] = j3;
        int i8 = iArr[i3] + j3;
        iArr[i3] = i8;
        iArr[i2] = m15712j(iArr[i2] ^ i8, 7);
    }

    /* renamed from: i */
    static int[] m15711i(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* renamed from: j */
    private static int m15712j(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: a */
    public final byte[] mo14932a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= Integer.MAX_VALUE - mo14942c()) {
            ByteBuffer allocate = ByteBuffer.allocate(mo14942c() + length);
            mo14943d(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int[] mo14941b(int[] iArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo14942c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo14943d(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - mo14942c() >= bArr.length) {
            byte[] a = bdz.m15753a(mo14942c());
            byteBuffer.put(a);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer e = mo14944e(a, this.f16161c + i2);
                if (i2 == i - 1) {
                    awr.m15067d(byteBuffer, wrap, e, remaining % 64);
                } else {
                    awr.m15067d(byteBuffer, wrap, e, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final ByteBuffer mo14944e(byte[] bArr, int i) {
        int[] b = mo14941b(m15711i(bArr), i);
        int[] iArr = (int[]) b.clone();
        m15709g(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }
}
