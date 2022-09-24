package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.f2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7668f2 implements vb4 {

    /* renamed from: d */
    public static final cc4 f31573d = C7631e2.f31165b;

    /* renamed from: a */
    private final C7705g2 f31574a = new C7705g2((String) null);

    /* renamed from: b */
    private final uq2 f31575b = new uq2(2786);

    /* renamed from: c */
    private boolean f31576c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r9.zzj();
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        if ((r5 - r3) >= 8192) goto L_0x004c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18187a(com.google.android.gms.internal.ads.wb4 r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.uq2 r0 = new com.google.android.gms.internal.ads.uq2
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo35238h()
            r5 = r9
            com.google.android.gms.internal.ads.qb4 r5 = (com.google.android.gms.internal.ads.qb4) r5
            r5.mo33311e(r4, r2, r1, r2)
            r0.mo35236f(r2)
            int r4 = r0.mo35251u()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L_0x0065
            r9.zzj()
            r4 = r9
            com.google.android.gms.internal.ads.qb4 r4 = (com.google.android.gms.internal.ads.qb4) r4
            r4.mo34304j(r3, r2)
            r5 = r3
        L_0x0029:
            r1 = 0
        L_0x002a:
            byte[] r6 = r0.mo35238h()
            r7 = 6
            r4.mo33311e(r6, r2, r7, r2)
            r0.mo35236f(r2)
            int r6 = r0.mo35253w()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L_0x004d
            r9.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L_0x004c
            r4.mo34304j(r5, r2)
            goto L_0x0029
        L_0x004c:
            return r2
        L_0x004d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0053
            return r6
        L_0x0053:
            byte[] r6 = r0.mo35238h()
            int r6 = com.google.android.gms.internal.ads.ab4.m30274a(r6)
            r7 = -1
            if (r6 != r7) goto L_0x005f
            return r2
        L_0x005f:
            int r6 = r6 + -6
            r4.mo34304j(r6, r2)
            goto L_0x002a
        L_0x0065:
            r4 = 3
            r0.mo35237g(r4)
            int r4 = r0.mo35248r()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo34304j(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7668f2.mo18187a(com.google.android.gms.internal.ads.wb4):boolean");
    }

    /* renamed from: c */
    public final int mo18189c(wb4 wb4, tc4 tc4) throws IOException {
        int b = wb4.mo30477b(this.f31575b.mo35238h(), 0, 2786);
        if (b == -1) {
            return -1;
        }
        this.f31575b.mo35236f(0);
        this.f31575b.mo35235e(b);
        if (!this.f31576c) {
            this.f31574a.mo18074c(0, 4);
            this.f31576c = true;
        }
        this.f31574a.mo18072a(this.f31575b);
        return 0;
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f31574a.mo18073b(yb4, new C7633e4(Integer.MIN_VALUE, 0, 1));
        yb4.zzB();
        yb4.mo18210l(new vc4(C6540C.TIME_UNSET, 0));
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        this.f31576c = false;
        this.f31574a.zze();
    }
}
