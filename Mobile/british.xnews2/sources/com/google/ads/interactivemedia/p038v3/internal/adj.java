package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adj */
/* compiled from: IMASDK */
public abstract class adj extends ada {

    /* renamed from: a */
    private byte[] f14283a;

    /* renamed from: b */
    private volatile boolean f14284b;

    public adj(ajg ajg, ajk ajk, C4120ke keVar, int i, byte[] bArr) {
        super(ajg, ajk, 3, keVar, i, C6540C.TIME_UNSET, C6540C.TIME_UNSET);
        this.f14283a = bArr == null ? amm.f15303f : bArr;
    }

    /* renamed from: a */
    public final byte[] mo13504a() {
        return this.f14283a;
    }

    /* renamed from: b */
    public final void mo13355b() {
        this.f14284b = true;
    }

    /* renamed from: c */
    public final void mo13356c() throws IOException {
        try {
            this.f14246k.mo13296c(this.f14239d);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f14284b) {
                byte[] bArr = this.f14283a;
                int length = bArr.length;
                if (length < i2 + 16384) {
                    this.f14283a = Arrays.copyOf(bArr, length + 16384);
                }
                i = this.f14246k.mo13294a(this.f14283a, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f14284b) {
                mo13505d(this.f14283a, i2);
            }
        } finally {
            amm.m14247q(this.f14246k);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo13505d(byte[] bArr, int i) throws IOException;
}
