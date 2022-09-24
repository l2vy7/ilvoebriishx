package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sc */
/* compiled from: IMASDK */
public final class C4334sc implements C4306rb {

    /* renamed from: a */
    public static final /* synthetic */ int f18560a = 0;

    /* renamed from: b */
    private static final int[] f18561b = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: c */
    private static final int[] f18562c;

    /* renamed from: d */
    private static final byte[] f18563d = amm.m14255y("#!AMR\n");

    /* renamed from: e */
    private static final byte[] f18564e = amm.m14255y("#!AMR-WB\n");

    /* renamed from: f */
    private static final int f18565f;

    /* renamed from: g */
    private final byte[] f18566g;

    /* renamed from: h */
    private boolean f18567h;

    /* renamed from: i */
    private long f18568i;

    /* renamed from: j */
    private int f18569j;

    /* renamed from: k */
    private int f18570k;

    /* renamed from: l */
    private boolean f18571l;

    /* renamed from: m */
    private int f18572m;

    /* renamed from: n */
    private int f18573n;

    /* renamed from: o */
    private long f18574o;

    /* renamed from: p */
    private C4309re f18575p;

    /* renamed from: q */
    private C4327rw f18576q;

    /* renamed from: r */
    private C4324rt f18577r;

    /* renamed from: s */
    private boolean f18578s;

    static {
        int i = C4333sb.f18559b;
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f18562c = iArr;
        f18565f = iArr[8];
    }

    public C4334sc() {
        this((byte[]) null);
    }

    public C4334sc(byte[] bArr) {
        this.f18566g = new byte[1];
        this.f18572m = -1;
    }

    /* renamed from: a */
    private final boolean m18832a(C4307rc rcVar) throws IOException {
        byte[] bArr = f18563d;
        if (m18833b(rcVar, bArr)) {
            this.f18567h = false;
            rcVar.mo16597d(bArr.length);
            return true;
        }
        byte[] bArr2 = f18564e;
        if (!m18833b(rcVar, bArr2)) {
            return false;
        }
        this.f18567h = true;
        rcVar.mo16597d(bArr2.length);
        return true;
    }

    /* renamed from: b */
    private static boolean m18833b(C4307rc rcVar, byte[] bArr) throws IOException {
        rcVar.mo16603j();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        rcVar.mo16600g(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0035 A[Catch:{ EOFException -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[Catch:{ EOFException -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m18834c(com.google.ads.interactivemedia.p039v3.internal.C4307rc r10) throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f18570k
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != 0) goto L_0x0097
            r10.mo16603j()     // Catch:{ EOFException -> 0x0096 }
            byte[] r0 = r9.f18566g     // Catch:{ EOFException -> 0x0096 }
            r10.mo16600g(r0, r1, r3)     // Catch:{ EOFException -> 0x0096 }
            byte[] r0 = r9.f18566g     // Catch:{ EOFException -> 0x0096 }
            byte r0 = r0[r1]     // Catch:{ EOFException -> 0x0096 }
            r4 = r0 & 131(0x83, float:1.84E-43)
            if (r4 > 0) goto L_0x007d
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r9.f18567h     // Catch:{ EOFException -> 0x0096 }
            if (r4 == 0) goto L_0x0028
            r5 = 10
            if (r0 < r5) goto L_0x0033
            r5 = 13
            if (r0 <= r5) goto L_0x0028
            goto L_0x0033
        L_0x0028:
            if (r4 != 0) goto L_0x0051
            r5 = 12
            if (r0 < r5) goto L_0x0033
            r5 = 14
            if (r0 > r5) goto L_0x0033
            goto L_0x0051
        L_0x0033:
            if (r4 == 0) goto L_0x003a
            int[] r4 = f18562c     // Catch:{ EOFException -> 0x0096 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0096 }
            goto L_0x003e
        L_0x003a:
            int[] r4 = f18561b     // Catch:{ EOFException -> 0x0096 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0096 }
        L_0x003e:
            r9.f18569j = r0     // Catch:{ EOFException -> 0x0096 }
            r9.f18570k = r0
            int r4 = r9.f18572m
            if (r4 != r2) goto L_0x0049
            r9.f18572m = r0
            r4 = r0
        L_0x0049:
            if (r4 != r0) goto L_0x0097
            int r0 = r9.f18573n
            int r0 = r0 + r3
            r9.f18573n = r0
            goto L_0x0097
        L_0x0051:
            com.google.ads.interactivemedia.v3.internal.lb r10 = new com.google.ads.interactivemedia.v3.internal.lb     // Catch:{ EOFException -> 0x0096 }
            java.lang.String r1 = "WB"
            java.lang.String r5 = "NB"
            if (r3 == r4) goto L_0x005a
            r1 = r5
        L_0x005a:
            int r3 = r1.length()     // Catch:{ EOFException -> 0x0096 }
            int r3 = r3 + 35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0096 }
            r4.<init>(r3)     // Catch:{ EOFException -> 0x0096 }
            java.lang.String r3 = "Illegal AMR "
            r4.append(r3)     // Catch:{ EOFException -> 0x0096 }
            r4.append(r1)     // Catch:{ EOFException -> 0x0096 }
            java.lang.String r1 = " frame type "
            r4.append(r1)     // Catch:{ EOFException -> 0x0096 }
            r4.append(r0)     // Catch:{ EOFException -> 0x0096 }
            java.lang.String r0 = r4.toString()     // Catch:{ EOFException -> 0x0096 }
            r10.<init>((java.lang.String) r0)     // Catch:{ EOFException -> 0x0096 }
            throw r10     // Catch:{ EOFException -> 0x0096 }
        L_0x007d:
            com.google.ads.interactivemedia.v3.internal.lb r10 = new com.google.ads.interactivemedia.v3.internal.lb     // Catch:{ EOFException -> 0x0096 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0096 }
            r3 = 42
            r1.<init>(r3)     // Catch:{ EOFException -> 0x0096 }
            java.lang.String r3 = "Invalid padding bits for frame header "
            r1.append(r3)     // Catch:{ EOFException -> 0x0096 }
            r1.append(r0)     // Catch:{ EOFException -> 0x0096 }
            java.lang.String r0 = r1.toString()     // Catch:{ EOFException -> 0x0096 }
            r10.<init>((java.lang.String) r0)     // Catch:{ EOFException -> 0x0096 }
            throw r10     // Catch:{ EOFException -> 0x0096 }
        L_0x0096:
            return r2
        L_0x0097:
            com.google.ads.interactivemedia.v3.internal.rw r0 = r9.f18576q
            int r4 = r9.f18570k
            int r10 = r0.mo13405c(r10, r4, r3)
            if (r10 != r2) goto L_0x00a2
            return r2
        L_0x00a2:
            int r0 = r9.f18570k
            int r0 = r0 - r10
            r9.f18570k = r0
            if (r0 <= 0) goto L_0x00aa
            return r1
        L_0x00aa:
            com.google.ads.interactivemedia.v3.internal.rw r2 = r9.f18576q
            long r3 = r9.f18574o
            long r5 = r9.f18568i
            long r3 = r3 + r5
            r5 = 1
            int r6 = r9.f18569j
            r7 = 0
            r8 = 0
            r2.mo13404b(r3, r5, r6, r7, r8)
            long r2 = r9.f18568i
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r2 + r4
            r9.f18568i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4334sc.m18834c(com.google.ads.interactivemedia.v3.internal.rc):int");
    }

    /* renamed from: d */
    public final boolean mo13689d(C4307rc rcVar) throws IOException {
        return m18832a(rcVar);
    }

    /* renamed from: e */
    public final void mo13690e(C4309re reVar) {
        this.f18575p = reVar;
        this.f18576q = reVar.mo13362ba(0, 1);
        reVar.mo13363bb();
    }

    /* renamed from: f */
    public final int mo13691f(C4307rc rcVar, C4321rq rqVar) throws IOException {
        aup.m14889t(this.f18576q);
        int i = amm.f15298a;
        if (rcVar.mo16605l() != 0 || m18832a(rcVar)) {
            if (!this.f18578s) {
                this.f18578s = true;
                boolean z = this.f18567h;
                String str = true != z ? MimeTypes.AUDIO_AMR_NB : MimeTypes.AUDIO_AMR_WB;
                int i2 = true != z ? 8000 : AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
                C4327rw rwVar = this.f18576q;
                C4119kd kdVar = new C4119kd();
                kdVar.mo16120ae(str);
                kdVar.mo16111W(f18565f);
                kdVar.mo16096H(1);
                kdVar.mo16121af(i2);
                rwVar.mo13403a(kdVar.mo16115a());
            }
            int c = m18834c(rcVar);
            if (!this.f18571l) {
                C4323rs rsVar = new C4323rs(C6540C.TIME_UNSET);
                this.f18577r = rsVar;
                this.f18575p.mo13364bc(rsVar);
                this.f18571l = true;
            }
            return c;
        }
        throw new C4144lb("Could not find AMR header.");
    }

    /* renamed from: g */
    public final void mo13692g(long j, long j2) {
        this.f18568i = 0;
        this.f18569j = 0;
        this.f18570k = 0;
        this.f18574o = 0;
    }

    /* renamed from: h */
    public final void mo13693h() {
    }
}
