package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class mo3 {

    /* renamed from: d */
    private static volatile int f35590d = 100;

    /* renamed from: e */
    public static final /* synthetic */ int f35591e = 0;

    /* renamed from: a */
    int f35592a;

    /* renamed from: b */
    final int f35593b = f35590d;

    /* renamed from: c */
    no3 f35594c;

    /* synthetic */ mo3(lo3 lo3) {
    }

    /* renamed from: e */
    public static int m34837e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: f */
    public static long m34838f(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: g */
    static mo3 m34839g(byte[] bArr, int i, int i2, boolean z) {
        go3 go3 = new go3(bArr, i, i2, z, (fo3) null);
        try {
            go3.mo32189k(i2);
            return go3;
        } catch (wp3 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract void mo32174A(int i) throws wp3;

    /* renamed from: a */
    public abstract void mo32182a(int i);

    /* renamed from: b */
    public abstract boolean mo32183b() throws IOException;

    /* renamed from: c */
    public abstract boolean mo32184c() throws IOException;

    /* renamed from: d */
    public abstract boolean mo32185d(int i) throws IOException;

    /* renamed from: h */
    public abstract double mo32186h() throws IOException;

    /* renamed from: i */
    public abstract float mo32187i() throws IOException;

    /* renamed from: j */
    public abstract int mo32188j();

    /* renamed from: k */
    public abstract int mo32189k(int i) throws wp3;

    /* renamed from: l */
    public abstract int mo32190l() throws IOException;

    /* renamed from: m */
    public abstract int mo32191m() throws IOException;

    /* renamed from: n */
    public abstract int mo32192n() throws IOException;

    /* renamed from: o */
    public abstract int mo32193o() throws IOException;

    /* renamed from: p */
    public abstract int mo32194p() throws IOException;

    /* renamed from: q */
    public abstract int mo32195q() throws IOException;

    /* renamed from: r */
    public abstract int mo32196r() throws IOException;

    /* renamed from: s */
    public abstract long mo32197s() throws IOException;

    /* renamed from: t */
    public abstract long mo32198t() throws IOException;

    /* renamed from: u */
    public abstract long mo32199u() throws IOException;

    /* renamed from: v */
    public abstract long mo32200v() throws IOException;

    /* renamed from: w */
    public abstract long mo32201w() throws IOException;

    /* renamed from: x */
    public abstract eo3 mo32202x() throws IOException;

    /* renamed from: y */
    public abstract String mo32203y() throws IOException;

    /* renamed from: z */
    public abstract String mo32204z() throws IOException;
}
