package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abq */
/* compiled from: IMASDK */
final class abq implements ake, aaq {

    /* renamed from: a */
    final /* synthetic */ abv f14031a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f14032b = aas.m12804a();

    /* renamed from: c */
    private final Uri f14033c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ako f14034d;

    /* renamed from: e */
    private final abn f14035e;

    /* renamed from: f */
    private final C4309re f14036f;

    /* renamed from: g */
    private final aku f14037g;

    /* renamed from: h */
    private final C4321rq f14038h = new C4321rq();

    /* renamed from: i */
    private volatile boolean f14039i;

    /* renamed from: j */
    private boolean f14040j = true;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f14041k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ajk f14042l = m12926j(0);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f14043m = -1;

    /* renamed from: n */
    private C4327rw f14044n;

    /* renamed from: o */
    private boolean f14045o;

    public abq(abv abv, Uri uri, ajg ajg, abn abn, C4309re reVar, aku aku) {
        this.f14031a = abv;
        this.f14033c = uri;
        this.f14034d = new ako(ajg);
        this.f14035e = abn;
        this.f14036f = reVar;
        this.f14037g = aku;
    }

    /* renamed from: i */
    static /* synthetic */ void m12925i(abq abq, long j, long j2) {
        abq.f14038h.f18533a = j;
        abq.f14041k = j2;
        abq.f14040j = true;
        abq.f14045o = false;
    }

    /* renamed from: j */
    private final ajk m12926j(long j) {
        ajj ajj = new ajj();
        ajj.mo13811f(this.f14033c);
        ajj.mo13810e(j);
        ajj.mo13807b(6);
        ajj.mo13808c(abv.f14054b);
        return ajj.mo13806a();
    }

    /* renamed from: a */
    public final void mo13293a(alw alw) {
        long j;
        if (!this.f14045o) {
            j = this.f14041k;
        } else {
            j = Math.max(this.f14031a.m12951R(), this.f14041k);
        }
        int e = alw.mo13947e();
        C4327rw rwVar = this.f14044n;
        aup.m14890u(rwVar);
        rwVar.mo13406d(alw, e);
        rwVar.mo13404b(j, 1, e, 0, (C4326rv) null);
        this.f14045o = true;
    }

    /* renamed from: b */
    public final void mo13355b() {
        this.f14039i = true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:71|72|(1:74)(1:75)|76) */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r7 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0125, code lost:
        if (r7.length() != 0) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0127, code lost:
        r7 = "Invalid metadata interval: ".concat(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012c, code lost:
        r7 = new java.lang.String("Invalid metadata interval: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0131, code lost:
        android.util.Log.w("IcyHeaders", r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x011d */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x022b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01ea A[EDGE_INSN: B:125:0x01ea->B:108:0x01ea ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b5 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cb A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f3 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0135 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0139 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0194 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x019d A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01aa A[SYNTHETIC, Splitter:B:93:0x01aa] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13356c() throws java.io.IOException {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "Invalid metadata interval: "
        L_0x0004:
            boolean r2 = r1.f14039i
            if (r2 != 0) goto L_0x022b
            r2 = -1
            r4 = 1
            r5 = 0
            com.google.ads.interactivemedia.v3.internal.rq r6 = r1.f14038h     // Catch:{ all -> 0x020c }
            long r13 = r6.f18533a     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.ajk r6 = r1.m12926j(r13)     // Catch:{ all -> 0x020c }
            r1.f14042l = r6     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.ako r7 = r1.f14034d     // Catch:{ all -> 0x020c }
            long r6 = r7.mo13296c(r6)     // Catch:{ all -> 0x020c }
            r1.f14043m = r6     // Catch:{ all -> 0x020c }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0025
            long r6 = r6 + r13
            r1.f14043m = r6     // Catch:{ all -> 0x020c }
        L_0x0025:
            com.google.ads.interactivemedia.v3.internal.abv r6 = r1.f14031a     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.ako r7 = r1.f14034d     // Catch:{ all -> 0x020c }
            java.util.Map r7 = r7.mo13298e()     // Catch:{ all -> 0x020c }
            java.lang.String r8 = "icy-br"
            java.lang.Object r8 = r7.get(r8)     // Catch:{ all -> 0x020c }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x020c }
            java.lang.String r9 = "IcyHeaders"
            r10 = -1
            if (r8 == 0) goto L_0x0087
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x020c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020c }
            int r11 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0069 }
            int r11 = r11 * 1000
            if (r11 <= 0) goto L_0x004a
            r8 = 1
            goto L_0x0066
        L_0x004a:
            java.lang.String r12 = "Invalid bitrate: "
            java.lang.String r15 = java.lang.String.valueOf(r8)     // Catch:{ NumberFormatException -> 0x006a }
            int r16 = r15.length()     // Catch:{ NumberFormatException -> 0x006a }
            if (r16 == 0) goto L_0x005b
            java.lang.String r12 = r12.concat(r15)     // Catch:{ NumberFormatException -> 0x006a }
            goto L_0x0061
        L_0x005b:
            java.lang.String r15 = new java.lang.String     // Catch:{ NumberFormatException -> 0x006a }
            r15.<init>(r12)     // Catch:{ NumberFormatException -> 0x006a }
            r12 = r15
        L_0x0061:
            android.util.Log.w(r9, r12)     // Catch:{ NumberFormatException -> 0x006a }
            r8 = 0
            r11 = -1
        L_0x0066:
            r16 = r11
            goto L_0x008a
        L_0x0069:
            r11 = -1
        L_0x006a:
            java.lang.String r12 = "Invalid bitrate header: "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x020c }
            int r15 = r8.length()     // Catch:{ all -> 0x020c }
            if (r15 == 0) goto L_0x007b
            java.lang.String r8 = r12.concat(r8)     // Catch:{ all -> 0x020c }
            goto L_0x0080
        L_0x007b:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x020c }
            r8.<init>(r12)     // Catch:{ all -> 0x020c }
        L_0x0080:
            android.util.Log.w(r9, r8)     // Catch:{ all -> 0x020c }
            r16 = r11
            r8 = 0
            goto L_0x008a
        L_0x0087:
            r8 = 0
            r16 = -1
        L_0x008a:
            java.lang.String r11 = "icy-genre"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x020c }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x020c }
            r12 = 0
            if (r11 == 0) goto L_0x009f
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x020c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020c }
            r17 = r8
            r8 = 1
            goto L_0x00a1
        L_0x009f:
            r17 = r12
        L_0x00a1:
            java.lang.String r11 = "icy-name"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x020c }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x020c }
            if (r11 == 0) goto L_0x00b5
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x020c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020c }
            r18 = r8
            r8 = 1
            goto L_0x00b7
        L_0x00b5:
            r18 = r12
        L_0x00b7:
            java.lang.String r11 = "icy-url"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x020c }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x020c }
            if (r11 == 0) goto L_0x00cb
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x020c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020c }
            r19 = r8
            r8 = 1
            goto L_0x00cd
        L_0x00cb:
            r19 = r12
        L_0x00cd:
            java.lang.String r11 = "icy-pub"
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x020c }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x020c }
            if (r11 == 0) goto L_0x00e7
            java.lang.Object r8 = r11.get(r5)     // Catch:{ all -> 0x020c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x020c }
            java.lang.String r11 = "1"
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x020c }
            r20 = r8
            r8 = 1
            goto L_0x00e9
        L_0x00e7:
            r20 = 0
        L_0x00e9:
            java.lang.String r11 = "icy-metaint"
            java.lang.Object r7 = r7.get(r11)     // Catch:{ all -> 0x020c }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x020c }
            if (r7 == 0) goto L_0x0135
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x020c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x020c }
            int r11 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x011c }
            if (r11 <= 0) goto L_0x0101
            r8 = 1
            goto L_0x0119
        L_0x0101:
            java.lang.String r15 = java.lang.String.valueOf(r7)     // Catch:{ NumberFormatException -> 0x011d }
            int r21 = r15.length()     // Catch:{ NumberFormatException -> 0x011d }
            if (r21 == 0) goto L_0x0110
            java.lang.String r15 = r0.concat(r15)     // Catch:{ NumberFormatException -> 0x011d }
            goto L_0x0115
        L_0x0110:
            java.lang.String r15 = new java.lang.String     // Catch:{ NumberFormatException -> 0x011d }
            r15.<init>(r0)     // Catch:{ NumberFormatException -> 0x011d }
        L_0x0115:
            android.util.Log.w(r9, r15)     // Catch:{ NumberFormatException -> 0x011d }
            r11 = -1
        L_0x0119:
            r21 = r11
            goto L_0x0137
        L_0x011c:
            r11 = -1
        L_0x011d:
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x020c }
            int r15 = r7.length()     // Catch:{ all -> 0x020c }
            if (r15 == 0) goto L_0x012c
            java.lang.String r7 = r0.concat(r7)     // Catch:{ all -> 0x020c }
            goto L_0x0131
        L_0x012c:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x020c }
            r7.<init>(r0)     // Catch:{ all -> 0x020c }
        L_0x0131:
            android.util.Log.w(r9, r7)     // Catch:{ all -> 0x020c }
            goto L_0x0119
        L_0x0135:
            r21 = -1
        L_0x0137:
            if (r8 == 0) goto L_0x013f
            com.google.ads.interactivemedia.v3.internal.yx r12 = new com.google.ads.interactivemedia.v3.internal.yx     // Catch:{ all -> 0x020c }
            r15 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x020c }
        L_0x013f:
            r6.f14084r = r12     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.ako r6 = r1.f14034d     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.abv r7 = r1.f14031a     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.yx r7 = r7.f14084r     // Catch:{ all -> 0x020c }
            if (r7 == 0) goto L_0x0174
            com.google.ads.interactivemedia.v3.internal.abv r7 = r1.f14031a     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.yx r7 = r7.f14084r     // Catch:{ all -> 0x020c }
            int r7 = r7.f19716f     // Catch:{ all -> 0x020c }
            if (r7 == r10) goto L_0x0174
            com.google.ads.interactivemedia.v3.internal.aar r6 = new com.google.ads.interactivemedia.v3.internal.aar     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.ako r7 = r1.f14034d     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.abv r8 = r1.f14031a     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.yx r8 = r8.f14084r     // Catch:{ all -> 0x020c }
            int r8 = r8.f19716f     // Catch:{ all -> 0x020c }
            r6.<init>(r7, r8, r1)     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.abv r7 = r1.f14031a     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.rw r7 = r7.mo13372u()     // Catch:{ all -> 0x020c }
            r1.f14044n = r7     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.ke r8 = com.google.ads.interactivemedia.p039v3.internal.abv.f14055c     // Catch:{ all -> 0x020c }
            r7.mo13403a(r8)     // Catch:{ all -> 0x020c }
        L_0x0174:
            r8 = r6
            com.google.ads.interactivemedia.v3.internal.abn r7 = r1.f14035e     // Catch:{ all -> 0x020c }
            android.net.Uri r9 = r1.f14033c     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.ako r6 = r1.f14034d     // Catch:{ all -> 0x020c }
            java.util.Map r10 = r6.mo13298e()     // Catch:{ all -> 0x020c }
            long r11 = r1.f14043m     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.re r15 = r1.f14036f     // Catch:{ all -> 0x020c }
            r16 = r11
            r11 = r13
            r2 = r13
            r13 = r16
            r7.mo13347a(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.abv r6 = r1.f14031a     // Catch:{ all -> 0x020c }
            com.google.ads.interactivemedia.v3.internal.yx r6 = r6.f14084r     // Catch:{ all -> 0x020c }
            if (r6 == 0) goto L_0x0199
            com.google.ads.interactivemedia.v3.internal.abn r6 = r1.f14035e     // Catch:{ all -> 0x020c }
            r6.mo13349c()     // Catch:{ all -> 0x020c }
        L_0x0199:
            boolean r6 = r1.f14040j     // Catch:{ all -> 0x020c }
            if (r6 == 0) goto L_0x01a6
            com.google.ads.interactivemedia.v3.internal.abn r6 = r1.f14035e     // Catch:{ all -> 0x020c }
            long r7 = r1.f14041k     // Catch:{ all -> 0x020c }
            r6.mo13351e(r2, r7)     // Catch:{ all -> 0x020c }
            r1.f14040j = r5     // Catch:{ all -> 0x020c }
        L_0x01a6:
            r13 = r2
            r2 = 0
        L_0x01a8:
            if (r2 != 0) goto L_0x01ea
            boolean r3 = r1.f14039i     // Catch:{ all -> 0x01e7 }
            if (r3 != 0) goto L_0x01e5
            com.google.ads.interactivemedia.v3.internal.aku r3 = r1.f14037g     // Catch:{ InterruptedException -> 0x01df }
            r3.mo13860b()     // Catch:{ InterruptedException -> 0x01df }
            com.google.ads.interactivemedia.v3.internal.abn r3 = r1.f14035e     // Catch:{ all -> 0x01e7 }
            com.google.ads.interactivemedia.v3.internal.rq r6 = r1.f14038h     // Catch:{ all -> 0x01e7 }
            int r2 = r3.mo13352f(r6)     // Catch:{ all -> 0x01e7 }
            com.google.ads.interactivemedia.v3.internal.abn r3 = r1.f14035e     // Catch:{ all -> 0x01e7 }
            long r6 = r3.mo13350d()     // Catch:{ all -> 0x01e7 }
            r8 = 1048576(0x100000, double:5.180654E-318)
            long r8 = r8 + r13
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a8
            com.google.ads.interactivemedia.v3.internal.aku r3 = r1.f14037g     // Catch:{ all -> 0x01e7 }
            r3.mo13862d()     // Catch:{ all -> 0x01e7 }
            com.google.ads.interactivemedia.v3.internal.abv r3 = r1.f14031a     // Catch:{ all -> 0x01e7 }
            android.os.Handler r3 = r3.f14082p     // Catch:{ all -> 0x01e7 }
            com.google.ads.interactivemedia.v3.internal.abv r8 = r1.f14031a     // Catch:{ all -> 0x01e7 }
            java.lang.Runnable r8 = r8.f14081o     // Catch:{ all -> 0x01e7 }
            r3.post(r8)     // Catch:{ all -> 0x01e7 }
            r13 = r6
            goto L_0x01a8
        L_0x01df:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x01e7 }
            r0.<init>()     // Catch:{ all -> 0x01e7 }
            throw r0     // Catch:{ all -> 0x01e7 }
        L_0x01e5:
            r2 = 0
            goto L_0x01ea
        L_0x01e7:
            r0 = move-exception
            r5 = r2
            goto L_0x020d
        L_0x01ea:
            if (r2 != r4) goto L_0x01ed
            goto L_0x0204
        L_0x01ed:
            com.google.ads.interactivemedia.v3.internal.abn r3 = r1.f14035e
            long r3 = r3.mo13350d()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0203
            com.google.ads.interactivemedia.v3.internal.rq r3 = r1.f14038h
            com.google.ads.interactivemedia.v3.internal.abn r4 = r1.f14035e
            long r4 = r4.mo13350d()
            r3.f18533a = r4
        L_0x0203:
            r5 = r2
        L_0x0204:
            com.google.ads.interactivemedia.v3.internal.ako r2 = r1.f14034d
            com.google.ads.interactivemedia.p039v3.internal.amm.m14247q(r2)
            if (r5 == 0) goto L_0x0004
            goto L_0x022b
        L_0x020c:
            r0 = move-exception
        L_0x020d:
            if (r5 == r4) goto L_0x0225
            com.google.ads.interactivemedia.v3.internal.abn r2 = r1.f14035e
            long r2 = r2.mo13350d()
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0225
            com.google.ads.interactivemedia.v3.internal.rq r2 = r1.f14038h
            com.google.ads.interactivemedia.v3.internal.abn r3 = r1.f14035e
            long r3 = r3.mo13350d()
            r2.f18533a = r3
        L_0x0225:
            com.google.ads.interactivemedia.v3.internal.ako r2 = r1.f14034d
            com.google.ads.interactivemedia.p039v3.internal.amm.m14247q(r2)
            throw r0
        L_0x022b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.abq.mo13356c():void");
    }
}
