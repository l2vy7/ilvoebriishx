package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajl */
/* compiled from: IMASDK */
public final class ajl {

    /* renamed from: a */
    private final byte[] f15063a = null;

    /* renamed from: b */
    private final ais[] f15064b = new ais[1];

    /* renamed from: c */
    private int f15065c;

    /* renamed from: d */
    private int f15066d;

    /* renamed from: e */
    private int f15067e = 0;

    /* renamed from: f */
    private ais[] f15068f = new ais[100];

    public ajl() {
        aup.m14885p(true);
        aup.m14885p(true);
    }

    /* renamed from: a */
    public final synchronized void mo13815a() {
        mo13816b(0);
    }

    /* renamed from: b */
    public final synchronized void mo13816b(int i) {
        int i2 = this.f15065c;
        this.f15065c = i;
        if (i < i2) {
            mo13820f();
        }
    }

    /* renamed from: c */
    public final synchronized ais mo13817c() {
        ais ais;
        this.f15066d++;
        int i = this.f15067e;
        if (i > 0) {
            ais[] aisArr = this.f15068f;
            int i2 = i - 1;
            this.f15067e = i2;
            ais = aisArr[i2];
            aup.m14890u(ais);
            this.f15068f[this.f15067e] = null;
        } else {
            ais = new ais(new byte[C6540C.DEFAULT_BUFFER_SEGMENT_SIZE], 0);
        }
        return ais;
    }

    /* renamed from: d */
    public final synchronized void mo13818d(ais ais) {
        ais[] aisArr = this.f15064b;
        aisArr[0] = ais;
        mo13819e(aisArr);
    }

    /* renamed from: e */
    public final synchronized void mo13819e(ais[] aisArr) {
        int i = this.f15067e + r0;
        ais[] aisArr2 = this.f15068f;
        int length = aisArr2.length;
        if (i >= length) {
            this.f15068f = (ais[]) Arrays.copyOf(aisArr2, Math.max(length + length, i));
        }
        for (ais ais : aisArr) {
            ais[] aisArr3 = this.f15068f;
            int i2 = this.f15067e;
            this.f15067e = i2 + 1;
            aisArr3[i2] = ais;
        }
        this.f15066d -= aisArr.length;
        notifyAll();
    }

    /* renamed from: f */
    public final synchronized void mo13820f() {
        int max = Math.max(0, amm.m14189F(this.f15065c, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.f15066d);
        int i = this.f15067e;
        if (max < i) {
            Arrays.fill(this.f15068f, max, i, (Object) null);
            this.f15067e = max;
        }
    }

    /* renamed from: g */
    public final synchronized int mo13821g() {
        return this.f15066d * C6540C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }
}
