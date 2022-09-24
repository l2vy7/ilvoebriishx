package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.i2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7779i2 implements vb4 {

    /* renamed from: d */
    public static final cc4 f33032d = C7741h2.f32587b;

    /* renamed from: a */
    private final C7816j2 f33033a = new C7816j2((String) null);

    /* renamed from: b */
    private final uq2 f33034b = new uq2(16384);

    /* renamed from: c */
    private boolean f33035c;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        r16.zzj();
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004f, code lost:
        if ((r5 - r3) >= 8192) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18187a(com.google.android.gms.internal.ads.wb4 r16) throws java.io.IOException {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.uq2 r0 = new com.google.android.gms.internal.ads.uq2
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo35238h()
            r5 = r16
            com.google.android.gms.internal.ads.qb4 r5 = (com.google.android.gms.internal.ads.qb4) r5
            r5.mo33311e(r4, r2, r1, r2)
            r0.mo35236f(r2)
            int r4 = r0.mo35251u()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L_0x009e
            r16.zzj()
            r4 = r16
            com.google.android.gms.internal.ads.qb4 r4 = (com.google.android.gms.internal.ads.qb4) r4
            r4.mo34304j(r3, r2)
            r5 = r3
        L_0x002c:
            r1 = 0
        L_0x002d:
            byte[] r6 = r0.mo35238h()
            r8 = 7
            r4.mo33311e(r6, r2, r8, r2)
            r0.mo35236f(r2)
            int r6 = r0.mo35253w()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L_0x0056
            if (r6 == r10) goto L_0x0056
            r16.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L_0x0055
            r4.mo34304j(r5, r2)
            goto L_0x002c
        L_0x0055:
            return r2
        L_0x0056:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L_0x005c
            return r9
        L_0x005c:
            byte[] r9 = r0.mo35238h()
            int r12 = com.google.android.gms.internal.ads.db4.f30706b
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L_0x0068
            r12 = -1
            goto L_0x0095
        L_0x0068:
            r12 = 2
            byte r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            byte r14 = r9[r7]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L_0x008f
            byte r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            r12 = 5
            byte r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r11 = r11 | r12
            r12 = 6
            byte r9 = r9[r12]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r12 = r11 | r9
            goto L_0x0090
        L_0x008f:
            r8 = 4
        L_0x0090:
            if (r6 != r10) goto L_0x0094
            int r8 = r8 + 2
        L_0x0094:
            int r12 = r12 + r8
        L_0x0095:
            if (r12 != r13) goto L_0x0098
            return r2
        L_0x0098:
            int r12 = r12 + -7
            r4.mo34304j(r12, r2)
            goto L_0x002d
        L_0x009e:
            r0.mo35237g(r7)
            int r4 = r0.mo35248r()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo34304j(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7779i2.mo18187a(com.google.android.gms.internal.ads.wb4):boolean");
    }

    /* renamed from: c */
    public final int mo18189c(wb4 wb4, tc4 tc4) throws IOException {
        int b = wb4.mo30477b(this.f33034b.mo35238h(), 0, 16384);
        if (b == -1) {
            return -1;
        }
        this.f33034b.mo35236f(0);
        this.f33034b.mo35235e(b);
        if (!this.f33035c) {
            this.f33033a.mo18074c(0, 4);
            this.f33035c = true;
        }
        this.f33033a.mo18072a(this.f33034b);
        return 0;
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f33033a.mo18073b(yb4, new C7633e4(Integer.MIN_VALUE, 0, 1));
        yb4.zzB();
        yb4.mo18210l(new vc4(C6540C.TIME_UNSET, 0));
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        this.f33035c = false;
        this.f33033a.zze();
    }
}
