package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class id4 implements vb4 {

    /* renamed from: n */
    public static final cc4 f20396n = gd4.f32249b;

    /* renamed from: o */
    private static final int[] f20397o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: p */
    private static final int[] f20398p;

    /* renamed from: q */
    private static final byte[] f20399q = d13.m20324w("#!AMR\n");

    /* renamed from: r */
    private static final byte[] f20400r = d13.m20324w("#!AMR-WB\n");

    /* renamed from: s */
    private static final int f20401s;

    /* renamed from: a */
    private final byte[] f20402a = new byte[1];

    /* renamed from: b */
    private boolean f20403b;

    /* renamed from: c */
    private long f20404c;

    /* renamed from: d */
    private int f20405d;

    /* renamed from: e */
    private int f20406e;

    /* renamed from: f */
    private boolean f20407f;

    /* renamed from: g */
    private int f20408g = -1;

    /* renamed from: h */
    private int f20409h;

    /* renamed from: i */
    private long f20410i;

    /* renamed from: j */
    private yb4 f20411j;

    /* renamed from: k */
    private ad4 f20412k;

    /* renamed from: l */
    private wc4 f20413l;

    /* renamed from: m */
    private boolean f20414m;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f20398p = iArr;
        f20401s = iArr[8];
    }

    public id4(int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ EOFException -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A[Catch:{ EOFException -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m20544b(com.google.android.gms.internal.ads.wb4 r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f20406e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0099
            r12.zzj()     // Catch:{ EOFException -> 0x0098 }
            byte[] r0 = r11.f20402a     // Catch:{ EOFException -> 0x0098 }
            r4 = r12
            com.google.android.gms.internal.ads.qb4 r4 = (com.google.android.gms.internal.ads.qb4) r4     // Catch:{ EOFException -> 0x0098 }
            r4.mo33311e(r0, r3, r2, r3)     // Catch:{ EOFException -> 0x0098 }
            byte[] r0 = r11.f20402a     // Catch:{ EOFException -> 0x0098 }
            byte r0 = r0[r3]     // Catch:{ EOFException -> 0x0098 }
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L_0x0080
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r11.f20403b     // Catch:{ EOFException -> 0x0098 }
            if (r4 == 0) goto L_0x002c
            r6 = 10
            if (r0 < r6) goto L_0x0037
            r6 = 13
            if (r0 <= r6) goto L_0x002c
            goto L_0x0037
        L_0x002c:
            if (r4 != 0) goto L_0x0055
            r6 = 12
            if (r0 < r6) goto L_0x0037
            r6 = 14
            if (r0 > r6) goto L_0x0037
            goto L_0x0055
        L_0x0037:
            if (r4 == 0) goto L_0x003e
            int[] r4 = f20398p     // Catch:{ EOFException -> 0x0098 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0098 }
            goto L_0x0042
        L_0x003e:
            int[] r4 = f20397o     // Catch:{ EOFException -> 0x0098 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0098 }
        L_0x0042:
            r11.f20405d = r0     // Catch:{ EOFException -> 0x0098 }
            r11.f20406e = r0
            int r4 = r11.f20408g
            if (r4 != r1) goto L_0x004d
            r11.f20408g = r0
            r4 = r0
        L_0x004d:
            if (r4 != r0) goto L_0x0099
            int r4 = r11.f20409h
            int r4 = r4 + r2
            r11.f20409h = r4
            goto L_0x0099
        L_0x0055:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L_0x005c
            r12 = r3
        L_0x005c:
            int r2 = r12.length()     // Catch:{ EOFException -> 0x0098 }
            int r2 = r2 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0098 }
            r3.<init>(r2)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r2 = "Illegal AMR "
            r3.append(r2)     // Catch:{ EOFException -> 0x0098 }
            r3.append(r12)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r12 = " frame type "
            r3.append(r12)     // Catch:{ EOFException -> 0x0098 }
            r3.append(r0)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r12 = r3.toString()     // Catch:{ EOFException -> 0x0098 }
            com.google.android.gms.internal.ads.iy r12 = com.google.android.gms.internal.ads.C7811iy.m33482a(r12, r5)     // Catch:{ EOFException -> 0x0098 }
            throw r12     // Catch:{ EOFException -> 0x0098 }
        L_0x0080:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0098 }
            r2 = 42
            r12.<init>(r2)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch:{ EOFException -> 0x0098 }
            r12.append(r0)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r12 = r12.toString()     // Catch:{ EOFException -> 0x0098 }
            com.google.android.gms.internal.ads.iy r12 = com.google.android.gms.internal.ads.C7811iy.m33482a(r12, r5)     // Catch:{ EOFException -> 0x0098 }
            throw r12     // Catch:{ EOFException -> 0x0098 }
        L_0x0098:
            return r1
        L_0x0099:
            com.google.android.gms.internal.ads.ad4 r4 = r11.f20412k
            int r12 = com.google.android.gms.internal.ads.yc4.m39856a(r4, r12, r0, r2)
            if (r12 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            int r0 = r11.f20406e
            int r0 = r0 - r12
            r11.f20406e = r0
            if (r0 <= 0) goto L_0x00aa
            return r3
        L_0x00aa:
            com.google.android.gms.internal.ads.ad4 r4 = r11.f20412k
            long r5 = r11.f20404c
            r7 = 1
            int r8 = r11.f20405d
            r9 = 0
            r10 = 0
            r4.mo30358e(r5, r7, r8, r9, r10)
            long r0 = r11.f20404c
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f20404c = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.id4.m20544b(com.google.android.gms.internal.ads.wb4):int");
    }

    /* renamed from: e */
    private static boolean m20545e(wb4 wb4, byte[] bArr) throws IOException {
        wb4.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((qb4) wb4).mo33311e(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: g */
    private final boolean m20546g(wb4 wb4) throws IOException {
        byte[] bArr = f20399q;
        if (m20545e(wb4, bArr)) {
            this.f20403b = false;
            ((qb4) wb4).mo34305k(bArr.length, false);
            return true;
        }
        byte[] bArr2 = f20400r;
        if (!m20545e(wb4, bArr2)) {
            return false;
        }
        this.f20403b = true;
        ((qb4) wb4).mo34305k(bArr2.length, false);
        return true;
    }

    /* renamed from: a */
    public final boolean mo18187a(wb4 wb4) throws IOException {
        return m20546g(wb4);
    }

    /* renamed from: c */
    public final int mo18189c(wb4 wb4, tc4 tc4) throws IOException {
        nu1.m20743b(this.f20412k);
        int i = d13.f20195a;
        if (wb4.zze() != 0 || m20546g(wb4)) {
            if (!this.f20414m) {
                this.f20414m = true;
                boolean z = this.f20403b;
                String str = true != z ? MimeTypes.AUDIO_AMR_NB : MimeTypes.AUDIO_AMR_WB;
                int i2 = true != z ? 8000 : AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
                ad4 ad4 = this.f20412k;
                ge4 ge4 = new ge4();
                ge4.mo32093s(str);
                ge4.mo32086l(f20401s);
                ge4.mo32076e0(1);
                ge4.mo32094t(i2);
                ad4.mo30354a(ge4.mo32099y());
            }
            int b = m20544b(wb4);
            if (this.f20407f) {
                return b;
            }
            vc4 vc4 = new vc4(C6540C.TIME_UNSET, 0);
            this.f20413l = vc4;
            this.f20411j.mo18210l(vc4);
            this.f20407f = true;
            return b;
        }
        throw C7811iy.m33482a("Could not find AMR header.", (Throwable) null);
    }

    /* renamed from: d */
    public final void mo18190d(yb4 yb4) {
        this.f20411j = yb4;
        this.f20412k = yb4.mo18211m(0, 1);
        yb4.zzB();
    }

    /* renamed from: f */
    public final void mo18191f(long j, long j2) {
        this.f20404c = 0;
        this.f20405d = 0;
        this.f20406e = 0;
        this.f20410i = 0;
    }
}
