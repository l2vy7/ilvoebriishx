package com.startapp.simple.bloomfilter.algo;

import com.startapp.C12024l2;
import java.io.Serializable;

/* compiled from: Sta */
public class OpenBitSet implements Serializable {

    /* renamed from: a */
    public static final /* synthetic */ boolean f54749a = true;
    private static final long serialVersionUID = -901334831550831262L;
    private final long[][] bits;
    private final int pageCount;
    private int wlen;

    static {
        Class<OpenBitSet> cls = OpenBitSet.class;
    }

    public OpenBitSet(long j) {
        int a = mo46514a(j);
        this.wlen = a;
        int i = a % 4096;
        int i2 = a / 4096;
        int i3 = (i == 0 ? 0 : 1) + i2;
        this.pageCount = i3;
        if (i3 <= 100) {
            this.bits = new long[i3][];
            for (int i4 = 0; i4 < i2; i4++) {
                this.bits[i4] = new long[4096];
            }
            if (i != 0) {
                long[][] jArr = this.bits;
                jArr[jArr.length - 1] = new long[i];
                return;
            }
            return;
        }
        throw new RuntimeException(C12024l2.m52554a("HighPageCountException pageCount = ", i3));
    }

    /* renamed from: a */
    public int mo46513a() {
        return this.wlen;
    }

    /* renamed from: a */
    public final int mo46514a(long j) {
        return (int) (((j - 1) >>> 6) + 1);
    }

    /* renamed from: b */
    public void mo46517b(long j) {
        int i = (int) (j >> 6);
        int i2 = this.wlen;
        if (i >= i2) {
            int i3 = (int) ((((j + 1) - 1) >>> 6) + 1);
            if (f54749a || i3 <= i2) {
                this.wlen = i + 1;
            } else {
                throw new AssertionError("Growing of paged bitset is not supported");
            }
        }
        long[] jArr = this.bits[i / 4096];
        int i4 = i % 4096;
        jArr[i4] = (1 << (((int) j) & 63)) | jArr[i4];
    }

    /* renamed from: c */
    public long mo46518c() {
        return ((long) this.wlen) << 6;
    }

    /* renamed from: a */
    public long[] mo46515a(int i) {
        return this.bits[i];
    }

    /* renamed from: b */
    public int mo46516b() {
        return this.pageCount;
    }
}
