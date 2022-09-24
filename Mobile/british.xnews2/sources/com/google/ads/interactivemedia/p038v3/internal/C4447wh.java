package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wh */
/* compiled from: IMASDK */
final class C4447wh {

    /* renamed from: a */
    public byte[] f19418a;

    /* renamed from: b */
    public int f19419b;

    /* renamed from: c */
    private final int f19420c;

    /* renamed from: d */
    private boolean f19421d;

    /* renamed from: e */
    private boolean f19422e;

    public C4447wh(int i) {
        this.f19420c = i;
        byte[] bArr = new byte[131];
        this.f19418a = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void mo16741a() {
        this.f19421d = false;
        this.f19422e = false;
    }

    /* renamed from: b */
    public final boolean mo16742b() {
        return this.f19422e;
    }

    /* renamed from: c */
    public final void mo16743c(int i) {
        boolean z = true;
        aup.m14887r(!this.f19421d);
        if (i != this.f19420c) {
            z = false;
        }
        this.f19421d = z;
        if (z) {
            this.f19419b = 3;
            this.f19422e = false;
        }
    }

    /* renamed from: d */
    public final void mo16744d(byte[] bArr, int i, int i2) {
        if (this.f19421d) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f19418a;
            int length = bArr2.length;
            int i4 = this.f19419b + i3;
            if (length < i4) {
                this.f19418a = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f19418a, this.f19419b, i3);
            this.f19419b += i3;
        }
    }

    /* renamed from: e */
    public final boolean mo16745e(int i) {
        if (!this.f19421d) {
            return false;
        }
        this.f19419b -= i;
        this.f19421d = false;
        this.f19422e = true;
        return true;
    }
}
