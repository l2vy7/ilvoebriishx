package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vl */
/* compiled from: IMASDK */
public final class C4424vl implements C4306rb {

    /* renamed from: a */
    public static final /* synthetic */ int f19184a = 0;

    /* renamed from: b */
    private final C4425vm f19185b = new C4425vm((String) null);

    /* renamed from: c */
    private final alw f19186c = new alw(16384);

    /* renamed from: d */
    private boolean f19187d;

    static {
        int i = C4423vk.f19183b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        r15.mo16603j();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        if ((r4 - r3) < 8192) goto L_0x004a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13689d(com.google.ads.interactivemedia.p038v3.internal.C4307rc r15) throws java.io.IOException {
        /*
            r14 = this;
            com.google.ads.interactivemedia.v3.internal.alw r0 = new com.google.ads.interactivemedia.v3.internal.alw
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo13952j()
            r15.mo16600g(r4, r2, r1)
            r0.mo13951i(r2)
            int r4 = r0.mo13961s()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L_0x0096
            r15.mo16603j()
            r15.mo16602i(r3)
            r4 = r3
        L_0x0024:
            r1 = 0
        L_0x0025:
            byte[] r5 = r0.mo13952j()
            r7 = 7
            r15.mo16600g(r5, r2, r7)
            r0.mo13951i(r2)
            int r5 = r0.mo13958p()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r8) goto L_0x004e
            if (r5 == r9) goto L_0x004e
            r15.mo16603j()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x004a
            return r2
        L_0x004a:
            r15.mo16602i(r4)
            goto L_0x0024
        L_0x004e:
            r8 = 1
            int r1 = r1 + r8
            r10 = 4
            if (r1 < r10) goto L_0x0054
            return r8
        L_0x0054:
            byte[] r8 = r0.mo13952j()
            int r11 = com.google.ads.interactivemedia.p038v3.internal.C4209nm.f18086a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r7) goto L_0x0060
            r11 = -1
            goto L_0x008d
        L_0x0060:
            r11 = 2
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            byte r13 = r8[r6]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L_0x0087
            byte r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            byte r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L_0x0088
        L_0x0087:
            r7 = 4
        L_0x0088:
            if (r5 != r9) goto L_0x008c
            int r7 = r7 + 2
        L_0x008c:
            int r11 = r11 + r7
        L_0x008d:
            if (r11 != r12) goto L_0x0090
            return r2
        L_0x0090:
            int r11 = r11 + -7
            r15.mo16602i(r11)
            goto L_0x0025
        L_0x0096:
            r0.mo13954l(r6)
            int r4 = r0.mo13933B()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r15.mo16602i(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4424vl.mo13689d(com.google.ads.interactivemedia.v3.internal.rc):boolean");
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f19185b.mo16708b(reVar, new C4469xc(0, 1));
        reVar.mo13363bb();
        reVar.mo13364bc(new C4323rs(C6540C.TIME_UNSET));
    }

    /* renamed from: f */
    public final int mo13691f(C4307rc rcVar, C4321rq rqVar) throws IOException {
        int a = rcVar.mo13294a(this.f19186c.mo13952j(), 0, 16384);
        if (a == -1) {
            return -1;
        }
        this.f19186c.mo13951i(0);
        this.f19186c.mo13949g(a);
        if (!this.f19187d) {
            this.f19185b.mo16709c(0, 4);
            this.f19187d = true;
        }
        this.f19185b.mo16710d(this.f19186c);
        return 0;
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        this.f19187d = false;
        this.f19185b.mo16707a();
    }

    /* renamed from: h */
    public final void mo13693h() {
    }
}
