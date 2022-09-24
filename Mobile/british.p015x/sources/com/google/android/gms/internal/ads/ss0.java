package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ss0 extends ms0 implements C8160sl<C7613dl> {

    /* renamed from: e */
    private String f39039e;

    /* renamed from: f */
    private final lq0 f39040f;

    /* renamed from: g */
    private boolean f39041g;

    /* renamed from: h */
    private final rs0 f39042h = new rs0();

    /* renamed from: i */
    private final wr0 f39043i = new wr0();

    /* renamed from: j */
    private ByteBuffer f39044j;

    /* renamed from: k */
    private boolean f39045k;

    /* renamed from: l */
    private final Object f39046l = new Object();

    /* renamed from: m */
    private final String f39047m;

    /* renamed from: n */
    private final int f39048n;

    /* renamed from: o */
    private boolean f39049o;

    public ss0(mq0 mq0, lq0 lq0) {
        super(mq0);
        this.f39040f = lq0;
        this.f39047m = mq0 != null ? mq0.zzt() : "";
        this.f39048n = mq0 != null ? mq0.zzh() : 0;
    }

    /* renamed from: y */
    protected static final String m37536y(String str) {
        String valueOf = String.valueOf(vn0.m38849e(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    /* renamed from: z */
    private final void m37537z() {
        int a = (int) this.f39042h.mo34592a();
        int a2 = (int) this.f39043i.mo35662a(this.f39044j);
        int position = this.f39044j.position();
        int round = Math.round(((float) a2) * (((float) position) / ((float) a)));
        boolean z = round > 0;
        int R = cq0.m31088R();
        int T = cq0.m31089T();
        String str = this.f39039e;
        mo18560l(str, m37536y(str), position, a, (long) round, (long) a2, z, R, T);
    }

    /* renamed from: g */
    public final void mo18556g() {
        this.f39041g = true;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo34720h(Object obj, int i) {
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ void mo34721r(Object obj, C7687fl flVar) {
        this.f39042h.mo34593b((C7799il) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.ads.il} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.il} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: com.google.android.gms.internal.ads.ir0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.android.gms.internal.ads.il} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d1, code lost:
        if (r9.f39044j.remaining() > 0) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d3, code lost:
        m37537z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00da, code lost:
        if (r9.f39041g != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dc, code lost:
        r12 = r1.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e4, code lost:
        if ((r12 - r16) < r4) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e6, code lost:
        m37537z();
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f2, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r0 = new java.lang.StringBuilder(49);
        r0.append("Timeout exceeded. Limit: ");
        r0.append(r6);
        r0.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0119, code lost:
        throw new java.io.IOException(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011c, code lost:
        r12 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1 = r9.f39044j.limit();
        r2 = new java.lang.StringBuilder(35);
        r2.append("Precache abort at ");
        r2.append(r1);
        r2.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0141, code lost:
        throw new java.io.IOException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0142, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18567s(java.lang.String r27) {
        /*
            r26 = this;
            r9 = r26
            r10 = r27
            r9.f39039e = r10
            java.lang.String r11 = m37536y(r27)
            java.lang.String r12 = "error"
            r13 = 0
            com.google.android.gms.internal.ads.il r0 = new com.google.android.gms.internal.ads.il     // Catch:{ Exception -> 0x014b }
            java.lang.String r2 = r9.f20549c     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.lq0 r1 = r9.f39040f     // Catch:{ Exception -> 0x014b }
            int r5 = r1.f35187d     // Catch:{ Exception -> 0x014b }
            r3 = 0
            int r6 = r1.f35189f     // Catch:{ Exception -> 0x014b }
            r7 = 1
            r8 = 0
            r1 = r0
            r4 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.lq0 r1 = r9.f39040f     // Catch:{ Exception -> 0x014b }
            boolean r1 = r1.f35193j     // Catch:{ Exception -> 0x014b }
            if (r1 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.ir0 r15 = new com.google.android.gms.internal.ads.ir0     // Catch:{ Exception -> 0x014b }
            android.content.Context r2 = r9.f20548b     // Catch:{ Exception -> 0x014b }
            java.lang.String r4 = r9.f39047m     // Catch:{ Exception -> 0x014b }
            int r5 = r9.f39048n     // Catch:{ Exception -> 0x014b }
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r15
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x014b }
            r0 = r15
        L_0x0037:
            android.net.Uri r16 = android.net.Uri.parse(r27)     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.fl r1 = new com.google.android.gms.internal.ads.fl     // Catch:{ Exception -> 0x014b }
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = -1
            r24 = 0
            r25 = 0
            r15 = r1
            r15.<init>(r16, r17, r18, r20, r22, r24, r25)     // Catch:{ Exception -> 0x014b }
            r0.mo30700b(r1)     // Catch:{ Exception -> 0x014b }
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.mq0> r1 = r9.f20550d     // Catch:{ Exception -> 0x014b }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.mq0 r1 = (com.google.android.gms.internal.ads.mq0) r1     // Catch:{ Exception -> 0x014b }
            if (r1 == 0) goto L_0x005d
            r1.mo18768o(r11, r9)     // Catch:{ Exception -> 0x014b }
        L_0x005d:
            a5.e r1 = com.google.android.gms.ads.internal.zzt.zzA()     // Catch:{ Exception -> 0x014b }
            long r2 = r1.currentTimeMillis()     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.h00<java.lang.Long> r4 = com.google.android.gms.internal.ads.p00.f37209t     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.n00 r5 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ Exception -> 0x014b }
            java.lang.Object r4 = r5.mo18570b(r4)     // Catch:{ Exception -> 0x014b }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x014b }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.h00<java.lang.Long> r6 = com.google.android.gms.internal.ads.p00.f37201s     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.n00 r7 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ Exception -> 0x014b }
            java.lang.Object r6 = r7.mo18570b(r6)     // Catch:{ Exception -> 0x014b }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x014b }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.lq0 r8 = r9.f39040f     // Catch:{ Exception -> 0x014b }
            int r8 = r8.f35186c     // Catch:{ Exception -> 0x014b }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ Exception -> 0x014b }
            r9.f39044j = r8     // Catch:{ Exception -> 0x014b }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r8]     // Catch:{ Exception -> 0x014b }
            r16 = r2
        L_0x0095:
            java.nio.ByteBuffer r14 = r9.f39044j     // Catch:{ Exception -> 0x014b }
            int r14 = r14.remaining()     // Catch:{ Exception -> 0x014b }
            int r14 = java.lang.Math.min(r14, r8)     // Catch:{ Exception -> 0x014b }
            int r14 = r0.mo30699a(r15, r13, r14)     // Catch:{ Exception -> 0x014b }
            r8 = -1
            if (r14 != r8) goto L_0x00b8
            r8 = 1
            r9.f39049o = r8     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.wr0 r0 = r9.f39043i     // Catch:{ Exception -> 0x014b }
            java.nio.ByteBuffer r1 = r9.f39044j     // Catch:{ Exception -> 0x014b }
            long r0 = r0.mo35662a(r1)     // Catch:{ Exception -> 0x014b }
            int r1 = (int) r0     // Catch:{ Exception -> 0x014b }
            long r0 = (long) r1     // Catch:{ Exception -> 0x014b }
            r9.mo18559k(r10, r11, r0)     // Catch:{ Exception -> 0x014b }
        L_0x00b6:
            r1 = 1
            goto L_0x00d7
        L_0x00b8:
            java.lang.Object r8 = r9.f39046l     // Catch:{ Exception -> 0x014b }
            monitor-enter(r8)     // Catch:{ Exception -> 0x014b }
            boolean r13 = r9.f39041g     // Catch:{ all -> 0x0146 }
            if (r13 != 0) goto L_0x00c8
            java.nio.ByteBuffer r13 = r9.f39044j     // Catch:{ all -> 0x0146 }
            r21 = r12
            r12 = 0
            r13.put(r15, r12, r14)     // Catch:{ all -> 0x0144 }
            goto L_0x00ca
        L_0x00c8:
            r21 = r12
        L_0x00ca:
            monitor-exit(r8)     // Catch:{ all -> 0x0144 }
            java.nio.ByteBuffer r8 = r9.f39044j     // Catch:{ Exception -> 0x0142 }
            int r8 = r8.remaining()     // Catch:{ Exception -> 0x0142 }
            if (r8 > 0) goto L_0x00d8
            r26.m37537z()     // Catch:{ Exception -> 0x0142 }
            goto L_0x00b6
        L_0x00d7:
            return r1
        L_0x00d8:
            boolean r8 = r9.f39041g     // Catch:{ Exception -> 0x0142 }
            if (r8 != 0) goto L_0x011c
            long r12 = r1.currentTimeMillis()     // Catch:{ Exception -> 0x0142 }
            long r22 = r12 - r16
            int r8 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x00eb
            r26.m37537z()     // Catch:{ Exception -> 0x0142 }
            r16 = r12
        L_0x00eb:
            long r12 = r12 - r2
            r22 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r6
            int r8 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r8 > 0) goto L_0x00fa
            r12 = r21
            r8 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            goto L_0x0095
        L_0x00fa:
            java.lang.String r12 = "downloadTimeout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a }
            r1 = 49
            r0.<init>(r1)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = "Timeout exceeded. Limit: "
            r0.append(r1)     // Catch:{ Exception -> 0x011a }
            r0.append(r6)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = " sec"
            r0.append(r1)     // Catch:{ Exception -> 0x011a }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x011a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x011a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x011a }
            throw r1     // Catch:{ Exception -> 0x011a }
        L_0x011a:
            r0 = move-exception
            goto L_0x0150
        L_0x011c:
            java.lang.String r12 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x011a }
            java.nio.ByteBuffer r1 = r9.f39044j     // Catch:{ Exception -> 0x011a }
            int r1 = r1.limit()     // Catch:{ Exception -> 0x011a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a }
            r3 = 35
            r2.<init>(r3)     // Catch:{ Exception -> 0x011a }
            java.lang.String r3 = "Precache abort at "
            r2.append(r3)     // Catch:{ Exception -> 0x011a }
            r2.append(r1)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = " bytes"
            r2.append(r1)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x011a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x011a }
            throw r0     // Catch:{ Exception -> 0x011a }
        L_0x0142:
            r0 = move-exception
            goto L_0x014e
        L_0x0144:
            r0 = move-exception
            goto L_0x0149
        L_0x0146:
            r0 = move-exception
            r21 = r12
        L_0x0149:
            monitor-exit(r8)     // Catch:{ all -> 0x0144 }
            throw r0     // Catch:{ Exception -> 0x0142 }
        L_0x014b:
            r0 = move-exception
            r21 = r12
        L_0x014e:
            r12 = r21
        L_0x0150:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 1
            int r2 = r2 + r5
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r1 = ":"
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = java.lang.String.valueOf(r27)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 34
            int r3 = r0.length()
            int r1 = r1 + r3
            r2.<init>(r1)
            java.lang.String r1 = "Failed to preload url "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = " Exception: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.co0.zzj(r1)
            r9.mo18557i(r10, r11, r12, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ss0.mo18567s(java.lang.String):boolean");
    }

    /* renamed from: v */
    public final String mo34780v() {
        return this.f39039e;
    }

    /* renamed from: w */
    public final ByteBuffer mo34781w() {
        synchronized (this.f39046l) {
            ByteBuffer byteBuffer = this.f39044j;
            if (byteBuffer != null && !this.f39045k) {
                byteBuffer.flip();
                this.f39045k = true;
            }
            this.f39041g = true;
        }
        return this.f39044j;
    }

    /* renamed from: x */
    public final boolean mo34782x() {
        return this.f39049o;
    }
}
