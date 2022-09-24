package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bo3 extends OutputStream {

    /* renamed from: g */
    private static final byte[] f30059g = new byte[0];

    /* renamed from: b */
    private final int f30060b = 128;

    /* renamed from: c */
    private final ArrayList<eo3> f30061c = new ArrayList<>();

    /* renamed from: d */
    private int f30062d;

    /* renamed from: e */
    private byte[] f30063e = new byte[128];

    /* renamed from: f */
    private int f30064f;

    bo3(int i) {
    }

    /* renamed from: e */
    private final void m30791e(int i) {
        this.f30061c.add(new ao3(this.f30063e));
        int length = this.f30062d + this.f30063e.length;
        this.f30062d = length;
        this.f30063e = new byte[Math.max(this.f30060b, Math.max(i, length >>> 1))];
        this.f30064f = 0;
    }

    /* renamed from: c */
    public final synchronized int mo30749c() {
        return this.f30062d + this.f30064f;
    }

    /* renamed from: d */
    public final synchronized eo3 mo30750d() {
        int i = this.f30064f;
        byte[] bArr = this.f30063e;
        int length = bArr.length;
        if (i >= length) {
            this.f30061c.add(new ao3(bArr));
            this.f30063e = f30059g;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i));
            this.f30061c.add(new ao3(bArr2));
        }
        this.f30062d += this.f30064f;
        this.f30064f = 0;
        return eo3.m31872K(this.f30061c);
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo30749c())});
    }

    public final synchronized void write(int i) {
        if (this.f30064f == this.f30063e.length) {
            m30791e(1);
        }
        byte[] bArr = this.f30063e;
        int i2 = this.f30064f;
        this.f30064f = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f30063e;
        int length = bArr2.length;
        int i3 = this.f30064f;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f30064f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        m30791e(i5);
        System.arraycopy(bArr, i + i4, this.f30063e, 0, i5);
        this.f30064f = i5;
    }
}
