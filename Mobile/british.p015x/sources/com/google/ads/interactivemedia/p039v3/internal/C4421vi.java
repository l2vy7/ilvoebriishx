package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vi */
/* compiled from: IMASDK */
public final class C4421vi implements C4306rb {

    /* renamed from: a */
    public static final /* synthetic */ int f19166a = 0;

    /* renamed from: b */
    private final C4422vj f19167b = new C4422vj();

    /* renamed from: c */
    private final alw f19168c = new alw(2786);

    /* renamed from: d */
    private boolean f19169d;

    static {
        int i = C4420vh.f19165b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r8.mo16603j();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if ((r4 - r3) < 8192) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13689d(com.google.ads.interactivemedia.p039v3.internal.C4307rc r8) throws java.io.IOException {
        /*
            r7 = this;
            com.google.ads.interactivemedia.v3.internal.alw r0 = new com.google.ads.interactivemedia.v3.internal.alw
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo13952j()
            r8.mo16600g(r4, r2, r1)
            r0.mo13951i(r2)
            int r4 = r0.mo13961s()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x005f
            r8.mo16603j()
            r8.mo16602i(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.mo13952j()
            r6 = 6
            r8.mo16600g(r5, r2, r6)
            r0.mo13951i(r2)
            int r5 = r0.mo13958p()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0047
            r8.mo16603j()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0043
            return r2
        L_0x0043:
            r8.mo16602i(r4)
            goto L_0x0023
        L_0x0047:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x004d
            return r5
        L_0x004d:
            byte[] r5 = r0.mo13952j()
            int r5 = com.google.ads.interactivemedia.p039v3.internal.C4207nk.m18273d(r5)
            r6 = -1
            if (r5 != r6) goto L_0x0059
            return r2
        L_0x0059:
            int r5 = r5 + -6
            r8.mo16602i(r5)
            goto L_0x0024
        L_0x005f:
            r4 = 3
            r0.mo13954l(r4)
            int r4 = r0.mo13933B()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.mo16602i(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4421vi.mo13689d(com.google.ads.interactivemedia.v3.internal.rc):boolean");
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f19167b.mo16708b(reVar, new C4469xc(0, 1));
        reVar.mo13363bb();
        reVar.mo13364bc(new C4323rs(C6540C.TIME_UNSET));
    }

    /* renamed from: f */
    public final int mo13691f(C4307rc rcVar, C4321rq rqVar) throws IOException {
        int a = rcVar.mo13294a(this.f19168c.mo13952j(), 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.f19168c.mo13951i(0);
        this.f19168c.mo13949g(a);
        if (!this.f19169d) {
            this.f19167b.mo16709c(0, 4);
            this.f19169d = true;
        }
        this.f19167b.mo16710d(this.f19168c);
        return 0;
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        this.f19169d = false;
        this.f19167b.mo16707a();
    }

    /* renamed from: h */
    public final void mo13693h() {
    }
}
