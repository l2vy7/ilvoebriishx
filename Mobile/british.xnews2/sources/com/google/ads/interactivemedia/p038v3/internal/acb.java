package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import com.startapp.C12425x3;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acb */
/* compiled from: IMASDK */
final class acb {

    /* renamed from: a */
    private final alw f14122a = new alw(32);

    /* renamed from: b */
    private aca f14123b;

    /* renamed from: c */
    private aca f14124c;

    /* renamed from: d */
    private aca f14125d;

    /* renamed from: e */
    private long f14126e;

    /* renamed from: f */
    private final ajl f14127f;

    public acb(ajl ajl) {
        this.f14127f = ajl;
        aca aca = new aca(0);
        this.f14123b = aca;
        this.f14124c = aca;
        this.f14125d = aca;
    }

    /* renamed from: j */
    private final void m13000j(aca aca) {
        if (aca.f14119c) {
            aca aca2 = this.f14125d;
            boolean z = aca2.f14119c;
            int i = (z ? 1 : 0) + (((int) (aca2.f14117a - aca.f14117a)) / C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
            ais[] aisArr = new ais[i];
            for (int i2 = 0; i2 < i; i2++) {
                aisArr[i2] = aca.f14120d;
                aca = aca.mo13381b();
            }
            this.f14127f.mo13819e(aisArr);
        }
    }

    /* renamed from: k */
    private final int m13001k(int i) {
        aca aca = this.f14125d;
        if (!aca.f14119c) {
            ais c = this.f14127f.mo13817c();
            aca aca2 = new aca(this.f14125d.f14118b);
            aca.f14120d = c;
            aca.f14121e = aca2;
            aca.f14119c = true;
        }
        return Math.min(i, (int) (this.f14125d.f14118b - this.f14126e));
    }

    /* renamed from: l */
    private final void m13002l(int i) {
        long j = this.f14126e + ((long) i);
        this.f14126e = j;
        aca aca = this.f14125d;
        if (j == aca.f14118b) {
            this.f14125d = aca.f14121e;
        }
    }

    /* renamed from: m */
    private static aca m13003m(aca aca, C4269ps psVar, acd acd, alw alw) {
        aca aca2;
        int i;
        C4269ps psVar2 = psVar;
        acd acd2 = acd;
        alw alw2 = alw;
        if (psVar.mo16521j()) {
            long j = acd2.f14129b;
            alw2.mo13943a(1);
            aca o = m13005o(aca, j, alw.mo13952j(), 1);
            long j2 = j + 1;
            byte b = alw.mo13952j()[0];
            byte b2 = b & C12425x3.f55111d;
            byte b3 = b & Byte.MAX_VALUE;
            C4265po poVar = psVar2.f18396a;
            byte[] bArr = poVar.f18380a;
            if (bArr == null) {
                poVar.f18380a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aca2 = m13005o(o, j2, poVar.f18380a, b3);
            long j3 = j2 + ((long) b3);
            if (b2 != 0) {
                alw2.mo13943a(2);
                aca2 = m13005o(aca2, j3, alw.mo13952j(), 2);
                j3 += 2;
                i = alw.mo13958p();
            } else {
                i = 1;
            }
            int[] iArr = poVar.f18381b;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = poVar.f18382c;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (b2 != 0) {
                int i2 = i * 6;
                alw2.mo13943a(i2);
                aca2 = m13005o(aca2, j3, alw.mo13952j(), i2);
                j3 += (long) i2;
                alw2.mo13951i(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr2[i3] = alw.mo13958p();
                    iArr4[i3] = alw.mo13934C();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = acd2.f14128a - ((int) (j3 - acd2.f14129b));
            }
            C4326rv rvVar = acd2.f14130c;
            int i4 = amm.f15298a;
            poVar.mo16516a(i, iArr2, iArr4, rvVar.f18542b, poVar.f18380a, rvVar.f18541a, rvVar.f18543c, rvVar.f18544d);
            long j4 = acd2.f14129b;
            int i5 = (int) (j3 - j4);
            acd2.f14129b = j4 + ((long) i5);
            acd2.f14128a -= i5;
        } else {
            aca2 = aca;
        }
        if (psVar.mo16512e()) {
            alw2.mo13943a(4);
            aca o2 = m13005o(aca2, acd2.f14129b, alw.mo13952j(), 4);
            int C = alw.mo13934C();
            acd2.f14129b += 4;
            acd2.f14128a -= 4;
            psVar2.mo16520i(C);
            aca n = m13004n(o2, acd2.f14129b, psVar2.f18397b, C);
            acd2.f14129b += (long) C;
            int i6 = acd2.f14128a - C;
            acd2.f14128a = i6;
            ByteBuffer byteBuffer = psVar2.f18400e;
            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                psVar2.f18400e = ByteBuffer.allocate(i6);
            } else {
                psVar2.f18400e.clear();
            }
            return m13004n(n, acd2.f14129b, psVar2.f18400e, acd2.f14128a);
        }
        psVar2.mo16520i(acd2.f14128a);
        return m13004n(aca2, acd2.f14129b, psVar2.f18397b, acd2.f14128a);
    }

    /* renamed from: n */
    private static aca m13004n(aca aca, long j, ByteBuffer byteBuffer, int i) {
        aca p = m13006p(aca, j);
        while (i > 0) {
            int min = Math.min(i, (int) (p.f14118b - j));
            byteBuffer.put(p.f14120d.f15013a, p.mo13380a(j), min);
            i -= min;
            j += (long) min;
            if (j == p.f14118b) {
                p = p.f14121e;
            }
        }
        return p;
    }

    /* renamed from: o */
    private static aca m13005o(aca aca, long j, byte[] bArr, int i) {
        aca p = m13006p(aca, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (p.f14118b - j));
            System.arraycopy(p.f14120d.f15013a, p.mo13380a(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == p.f14118b) {
                p = p.f14121e;
            }
        }
        return p;
    }

    /* renamed from: p */
    private static aca m13006p(aca aca, long j) {
        while (j >= aca.f14118b) {
            aca = aca.f14121e;
        }
        return aca;
    }

    /* renamed from: a */
    public final void mo13382a() {
        m13000j(this.f14123b);
        aca aca = new aca(0);
        this.f14123b = aca;
        this.f14124c = aca;
        this.f14125d = aca;
        this.f14126e = 0;
        this.f14127f.mo13820f();
    }

    /* renamed from: b */
    public final void mo13383b(long j) {
        this.f14126e = j;
        if (j != 0) {
            aca aca = this.f14123b;
            if (j != aca.f14117a) {
                while (this.f14126e > aca.f14118b) {
                    aca = aca.f14121e;
                }
                aca aca2 = aca.f14121e;
                m13000j(aca2);
                aca aca3 = new aca(aca.f14118b);
                aca.f14121e = aca3;
                if (this.f14126e == aca.f14118b) {
                    aca = aca3;
                }
                this.f14125d = aca;
                if (this.f14124c == aca2) {
                    this.f14124c = aca3;
                    return;
                }
                return;
            }
        }
        m13000j(this.f14123b);
        aca aca4 = new aca(this.f14126e);
        this.f14123b = aca4;
        this.f14124c = aca4;
        this.f14125d = aca4;
    }

    /* renamed from: c */
    public final void mo13384c() {
        this.f14124c = this.f14123b;
    }

    /* renamed from: d */
    public final void mo13385d(C4269ps psVar, acd acd) {
        this.f14124c = m13003m(this.f14124c, psVar, acd, this.f14122a);
    }

    /* renamed from: e */
    public final void mo13386e(C4269ps psVar, acd acd) {
        m13003m(this.f14124c, psVar, acd, this.f14122a);
    }

    /* renamed from: f */
    public final void mo13387f(long j) {
        aca aca;
        if (j != -1) {
            while (true) {
                aca = this.f14123b;
                if (j < aca.f14118b) {
                    break;
                }
                this.f14127f.mo13818d(aca.f14120d);
                this.f14123b = this.f14123b.mo13381b();
            }
            if (this.f14124c.f14117a < aca.f14117a) {
                this.f14124c = aca;
            }
        }
    }

    /* renamed from: g */
    public final long mo13388g() {
        return this.f14126e;
    }

    /* renamed from: h */
    public final int mo13389h(ajd ajd, int i, boolean z) throws IOException {
        int k = m13001k(i);
        aca aca = this.f14125d;
        int a = ajd.mo13294a(aca.f14120d.f15013a, aca.mo13380a(this.f14126e), k);
        if (a != -1) {
            m13002l(a);
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: i */
    public final void mo13390i(alw alw, int i) {
        while (i > 0) {
            int k = m13001k(i);
            aca aca = this.f14125d;
            alw.mo13956n(aca.f14120d.f15013a, aca.mo13380a(this.f14126e), k);
            i -= k;
            m13002l(k);
        }
    }
}
