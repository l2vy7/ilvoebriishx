package com.google.ads.interactivemedia.p038v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bdh */
/* compiled from: IMASDK */
abstract class bdh implements aws {

    /* renamed from: a */
    public static final int f16162a = azc.f15919a;

    /* renamed from: b */
    private final bdf f16163b;

    /* renamed from: c */
    private final bdf f16164c;

    public bdh(byte[] bArr) throws GeneralSecurityException {
        azc.m15270a(f16162a);
        this.f16163b = mo14945b(bArr, 1);
        this.f16164c = mo14945b(bArr, 0);
    }

    /* renamed from: a */
    public byte[] mo14715a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= (Integer.MAX_VALUE - this.f16163b.mo14942c()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f16163b.mo14942c() + length + 16);
            if (allocate.remaining() >= length + this.f16163b.mo14942c() + 16) {
                int position = allocate.position();
                this.f16163b.mo14943d(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f16163b.mo14942c()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                byte[] bArr4 = new byte[32];
                this.f16164c.mo14944e(bArr3, 0).get(bArr4);
                int length2 = bArr2.length;
                int i = length2 & 15;
                int i2 = i == 0 ? length2 : (length2 + 16) - i;
                int remaining = allocate.remaining();
                int i3 = remaining % 16;
                int i4 = (i3 == 0 ? remaining : (remaining + 16) - i3) + i2;
                ByteBuffer order = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(i2);
                order.put(allocate);
                order.position(i4);
                order.putLong((long) length2);
                order.putLong((long) remaining);
                byte[] a = bdt.m15734a(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(a);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract bdf mo14945b(byte[] bArr, int i) throws InvalidKeyException;
}
