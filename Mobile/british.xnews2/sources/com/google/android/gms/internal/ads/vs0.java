package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.zzt;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vs0 extends ms0 implements bq0 {

    /* renamed from: e */
    private cq0 f40532e;

    /* renamed from: f */
    private String f40533f;

    /* renamed from: g */
    private boolean f40534g;

    /* renamed from: h */
    private boolean f40535h;

    /* renamed from: i */
    private ds0 f40536i;

    /* renamed from: j */
    private long f40537j;

    /* renamed from: k */
    private long f40538k;

    public vs0(mq0 mq0, lq0 lq0) {
        super(mq0);
        cq0 cq0;
        Context context = mq0.getContext();
        if (lq0.f35196m) {
            cq0 = new nt0(context, lq0, (mq0) this.f20550d.get());
        } else {
            cq0 = new tr0(context, lq0, (mq0) this.f20550d.get());
        }
        this.f40532e = cq0;
        cq0.mo30987F(this);
    }

    /* renamed from: x */
    protected static final String m38918x(String str) {
        String valueOf = String.valueOf(vn0.m38849e(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    /* renamed from: y */
    private static String m38919y(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    /* renamed from: z */
    private final void m38920z(long j) {
        zzt.zza.postDelayed(new us0(this), j);
    }

    /* renamed from: a */
    public final void mo30767a(int i) {
    }

    /* renamed from: b */
    public final void mo30768b(String str, Exception exc) {
        co0.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzo().mo18591r(exc, "VideoStreamExoPlayerCache.onException");
    }

    /* renamed from: c */
    public final void mo30769c(boolean z, long j) {
        mq0 mq0 = (mq0) this.f20550d.get();
        if (mq0 != null) {
            po0.f37726e.execute(new ts0(mq0, z, j));
        }
    }

    /* renamed from: d */
    public final void mo30770d(String str, Exception exc) {
        co0.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzo().mo18591r(exc, "VideoStreamExoPlayerCache.onError");
    }

    /* renamed from: e */
    public final void mo30771e(int i, int i2) {
    }

    /* renamed from: g */
    public final void mo18556g() {
        synchronized (this) {
            this.f40534g = true;
            notify();
            release();
        }
        String str = this.f40533f;
        if (str != null) {
            mo18557i(this.f40533f, m38918x(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    /* renamed from: n */
    public final void mo18562n(int i) {
        this.f40532e.mo30985D(i);
    }

    /* renamed from: o */
    public final void mo18563o(int i) {
        this.f40532e.mo30986E(i);
    }

    /* renamed from: p */
    public final void mo18564p(int i) {
        this.f40532e.mo30988G(i);
    }

    /* renamed from: q */
    public final void mo18565q(int i) {
        this.f40532e.mo30989H(i);
    }

    public final void release() {
        cq0 cq0 = this.f40532e;
        if (cq0 != null) {
            cq0.mo30987F((bq0) null);
            this.f40532e.mo30983B();
        }
    }

    /* renamed from: s */
    public final boolean mo18567s(String str) {
        return mo18568t(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0137, code lost:
        r5 = r45;
        r6 = r46;
        r7 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r5.mo18559k(r6, r7, r3);
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18568t(java.lang.String r46, java.lang.String[] r47) {
        /*
            r45 = this;
            r15 = r45
            r13 = r46
            r0 = r47
            r15.f40533f = r13
            java.lang.String r14 = m38918x(r46)
            java.lang.String r17 = "error"
            r18 = 0
            int r1 = r0.length     // Catch:{ Exception -> 0x01ca }
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch:{ Exception -> 0x01ca }
            r2 = 0
        L_0x0014:
            int r3 = r0.length     // Catch:{ Exception -> 0x01ca }
            if (r2 >= r3) goto L_0x0022
            r3 = r0[r2]     // Catch:{ Exception -> 0x01ca }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x01ca }
            r1[r2] = r3     // Catch:{ Exception -> 0x01ca }
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0022:
            com.google.android.gms.internal.ads.cq0 r0 = r15.f40532e     // Catch:{ Exception -> 0x01ca }
            java.lang.String r2 = r15.f20549c     // Catch:{ Exception -> 0x01ca }
            r0.mo31007z(r1, r2)     // Catch:{ Exception -> 0x01ca }
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.mq0> r0 = r15.f20550d     // Catch:{ Exception -> 0x01ca }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01ca }
            com.google.android.gms.internal.ads.mq0 r0 = (com.google.android.gms.internal.ads.mq0) r0     // Catch:{ Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0036
            r0.mo18768o(r14, r15)     // Catch:{ Exception -> 0x01ca }
        L_0x0036:
            a5.e r0 = com.google.android.gms.ads.internal.zzt.zzA()     // Catch:{ Exception -> 0x01ca }
            long r19 = r0.currentTimeMillis()     // Catch:{ Exception -> 0x01ca }
            com.google.android.gms.internal.ads.h00<java.lang.Long> r1 = com.google.android.gms.internal.ads.p00.f37209t     // Catch:{ Exception -> 0x01ca }
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ Exception -> 0x01ca }
            java.lang.Object r1 = r2.mo18570b(r1)     // Catch:{ Exception -> 0x01ca }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01ca }
            long r11 = r1.longValue()     // Catch:{ Exception -> 0x01ca }
            com.google.android.gms.internal.ads.h00<java.lang.Long> r1 = com.google.android.gms.internal.ads.p00.f37201s     // Catch:{ Exception -> 0x01ca }
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ Exception -> 0x01ca }
            java.lang.Object r1 = r2.mo18570b(r1)     // Catch:{ Exception -> 0x01ca }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01ca }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x01ca }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r9 = r1 * r3
            com.google.android.gms.internal.ads.h00<java.lang.Integer> r1 = com.google.android.gms.internal.ads.p00.f37192r     // Catch:{ Exception -> 0x01ca }
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ Exception -> 0x01ca }
            java.lang.Object r1 = r2.mo18570b(r1)     // Catch:{ Exception -> 0x01ca }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01ca }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01ca }
            long r6 = (long) r1     // Catch:{ Exception -> 0x01ca }
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.p00.f37194r1     // Catch:{ Exception -> 0x01ca }
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ Exception -> 0x01ca }
            java.lang.Object r1 = r2.mo18570b(r1)     // Catch:{ Exception -> 0x01ca }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x01ca }
            boolean r21 = r1.booleanValue()     // Catch:{ Exception -> 0x01ca }
            r22 = -1
            r1 = r22
        L_0x0087:
            monitor-enter(r45)     // Catch:{ Exception -> 0x01ca }
            long r3 = r0.currentTimeMillis()     // Catch:{ all -> 0x01c2 }
            long r3 = r3 - r19
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0195
            boolean r3 = r15.f40534g     // Catch:{ all -> 0x01c2 }
            if (r3 != 0) goto L_0x0188
            boolean r3 = r15.f40535h     // Catch:{ all -> 0x01c2 }
            r24 = 1
            if (r3 == 0) goto L_0x00a0
            monitor-exit(r45)     // Catch:{ all -> 0x01c2 }
            r5 = r15
            goto L_0x0157
        L_0x00a0:
            com.google.android.gms.internal.ads.cq0 r3 = r15.f40532e     // Catch:{ all -> 0x01c2 }
            boolean r3 = r3.mo30996O()     // Catch:{ all -> 0x01c2 }
            if (r3 == 0) goto L_0x017b
            com.google.android.gms.internal.ads.cq0 r3 = r15.f40532e     // Catch:{ all -> 0x01c2 }
            long r4 = r3.mo31004Y()     // Catch:{ all -> 0x01c2 }
            r25 = 0
            int r3 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x015b
            com.google.android.gms.internal.ads.cq0 r3 = r15.f40532e     // Catch:{ all -> 0x01c2 }
            long r27 = r3.mo31000U()     // Catch:{ all -> 0x01c2 }
            int r3 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x012a
            int r1 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c4
            r8 = 1
            goto L_0x00c5
        L_0x00c4:
            r8 = 0
        L_0x00c5:
            if (r21 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.cq0 r1 = r15.f40532e     // Catch:{ all -> 0x01c2 }
            long r1 = r1.mo31005Z()     // Catch:{ all -> 0x01c2 }
            r29 = r1
            goto L_0x00d2
        L_0x00d0:
            r29 = r22
        L_0x00d2:
            if (r21 == 0) goto L_0x00dd
            com.google.android.gms.internal.ads.cq0 r1 = r15.f40532e     // Catch:{ all -> 0x01c2 }
            long r1 = r1.mo31002W()     // Catch:{ all -> 0x01c2 }
            r31 = r1
            goto L_0x00df
        L_0x00dd:
            r31 = r22
        L_0x00df:
            if (r21 == 0) goto L_0x00ea
            com.google.android.gms.internal.ads.cq0 r1 = r15.f40532e     // Catch:{ all -> 0x01c2 }
            long r1 = r1.mo31006a0()     // Catch:{ all -> 0x01c2 }
            r33 = r1
            goto L_0x00ec
        L_0x00ea:
            r33 = r22
        L_0x00ec:
            int r16 = com.google.android.gms.internal.ads.cq0.m31088R()     // Catch:{ all -> 0x0122 }
            int r35 = com.google.android.gms.internal.ads.cq0.m31089T()     // Catch:{ all -> 0x0122 }
            r1 = r45
            r2 = r46
            r3 = r14
            r36 = r4
            r4 = r27
            r38 = r6
            r6 = r36
            r40 = r9
            r9 = r29
            r42 = r11
            r11 = r31
            r44 = r14
            r13 = r33
            r15 = r16
            r16 = r35
            r1.mo18561m(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch:{ all -> 0x0119 }
            r1 = r27
            r3 = r36
            goto L_0x0133
        L_0x0119:
            r0 = move-exception
            r5 = r45
            r6 = r46
            r7 = r44
            goto L_0x01c6
        L_0x0122:
            r0 = move-exception
            r5 = r45
            r6 = r46
            r7 = r14
            goto L_0x01c6
        L_0x012a:
            r38 = r6
            r40 = r9
            r42 = r11
            r44 = r14
            r3 = r4
        L_0x0133:
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0142
            r5 = r45
            r6 = r46
            r7 = r44
            r5.mo18559k(r6, r7, r3)     // Catch:{ all -> 0x01c0 }
            monitor-exit(r45)     // Catch:{ all -> 0x01c0 }
            goto L_0x0157
        L_0x0142:
            r5 = r45
            r6 = r46
            r7 = r44
            com.google.android.gms.internal.ads.cq0 r3 = r5.f40532e     // Catch:{ all -> 0x01c0 }
            long r3 = r3.mo31001V()     // Catch:{ all -> 0x01c0 }
            int r8 = (r3 > r38 ? 1 : (r3 == r38 ? 0 : -1))
            if (r8 < 0) goto L_0x0158
            int r3 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x0158
            monitor-exit(r45)     // Catch:{ all -> 0x01c0 }
        L_0x0157:
            return r24
        L_0x0158:
            r3 = r42
            goto L_0x0163
        L_0x015b:
            r38 = r6
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            r3 = r11
        L_0x0163:
            r5.wait(r3)     // Catch:{ InterruptedException -> 0x0171 }
            monitor-exit(r45)     // Catch:{ all -> 0x01c0 }
            r11 = r3
            r15 = r5
            r13 = r6
            r14 = r7
            r6 = r38
            r9 = r40
            goto L_0x0087
        L_0x0171:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01bc }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x01bc }
            throw r0     // Catch:{ all -> 0x01bc }
        L_0x017b:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01bc }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x01bc }
            throw r0     // Catch:{ all -> 0x01bc }
        L_0x0188:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01bc }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x01bc }
            throw r0     // Catch:{ all -> 0x01bc }
        L_0x0195:
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01bc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bc }
            r3 = 47
            r2.<init>(r3)     // Catch:{ all -> 0x01bc }
            java.lang.String r3 = "Timeout reached. Limit: "
            r2.append(r3)     // Catch:{ all -> 0x01bc }
            r3 = r40
            r2.append(r3)     // Catch:{ all -> 0x01bc }
            java.lang.String r3 = " ms"
            r2.append(r3)     // Catch:{ all -> 0x01bc }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01bc }
            r0.<init>(r2)     // Catch:{ all -> 0x01bc }
            throw r0     // Catch:{ all -> 0x01bc }
        L_0x01bc:
            r0 = move-exception
            r17 = r1
            goto L_0x01c6
        L_0x01c0:
            r0 = move-exception
            goto L_0x01c6
        L_0x01c2:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L_0x01c6:
            monitor-exit(r45)     // Catch:{ all -> 0x01c0 }
            throw r0     // Catch:{ Exception -> 0x01c8 }
        L_0x01c8:
            r0 = move-exception
            goto L_0x01ce
        L_0x01ca:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L_0x01ce:
            r1 = r17
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r46)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r3 = r3 + 34
            int r3 = r3 + r4
            r8.<init>(r3)
            java.lang.String r3 = "Failed to preload url "
            r8.append(r3)
            r8.append(r6)
            java.lang.String r3 = " Exception: "
            r8.append(r3)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.google.android.gms.internal.ads.co0.zzj(r2)
            com.google.android.gms.internal.ads.nn0 r2 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r3 = "VideoStreamExoPlayerCache.preload"
            r2.mo18591r(r0, r3)
            r45.release()
            java.lang.String r0 = m38919y(r1, r0)
            r5.mo18557i(r6, r7, r1, r0)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vs0.mo18568t(java.lang.String, java.lang.String[]):boolean");
    }

    /* renamed from: u */
    public final boolean mo18569u(String str, String[] strArr, ds0 ds0) {
        this.f40533f = str;
        this.f40536i = ds0;
        String x = m38918x(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.f40532e.mo31007z(uriArr, this.f20549c);
            mq0 mq0 = (mq0) this.f20550d.get();
            if (mq0 != null) {
                mq0.mo18768o(x, this);
            }
            this.f40537j = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            this.f40538k = -1;
            m38920z(0);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            co0.zzj(sb.toString());
            com.google.android.gms.ads.internal.zzt.zzo().mo18591r(e, "VideoStreamExoPlayerCache.preload");
            release();
            mo18557i(str, x, "error", m38919y("error", e));
            return false;
        }
    }

    /* renamed from: v */
    public final cq0 mo35489v() {
        synchronized (this) {
            this.f40535h = true;
            notify();
        }
        this.f40532e.mo30987F((bq0) null);
        cq0 cq0 = this.f40532e;
        this.f40532e = null;
        return cq0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: com.google.android.gms.internal.ads.vs0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: com.google.android.gms.internal.ads.vs0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: com.google.android.gms.internal.ads.vs0} */
    /* JADX WARNING: type inference failed for: r2v11, types: [boolean] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0110, code lost:
        r2.m38920z(((java.lang.Long) com.google.android.gms.internal.ads.C8311wv.m39277c().mo18570b(com.google.android.gms.internal.ads.p00.f37209t)).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0123, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo35490w() {
        /*
            r32 = this;
            r15 = r32
            java.lang.String r0 = r15.f40533f
            java.lang.String r13 = m38918x(r0)
            java.lang.String r17 = "error"
            com.google.android.gms.internal.ads.h00<java.lang.Long> r0 = com.google.android.gms.internal.ads.p00.f37201s     // Catch:{ Exception -> 0x016f }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ Exception -> 0x016f }
            java.lang.Object r0 = r1.mo18570b(r0)     // Catch:{ Exception -> 0x016f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x016f }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x016f }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            com.google.android.gms.internal.ads.h00<java.lang.Integer> r2 = com.google.android.gms.internal.ads.p00.f37192r     // Catch:{ Exception -> 0x016f }
            com.google.android.gms.internal.ads.n00 r3 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ Exception -> 0x016f }
            java.lang.Object r2 = r3.mo18570b(r2)     // Catch:{ Exception -> 0x016f }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x016f }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x016f }
            long r11 = (long) r2     // Catch:{ Exception -> 0x016f }
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.p00.f37194r1     // Catch:{ Exception -> 0x016f }
            com.google.android.gms.internal.ads.n00 r3 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ Exception -> 0x016f }
            java.lang.Object r2 = r3.mo18570b(r2)     // Catch:{ Exception -> 0x016f }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x016f }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x016f }
            monitor-enter(r32)     // Catch:{ Exception -> 0x016f }
            a5.e r3 = com.google.android.gms.ads.internal.zzt.zzA()     // Catch:{ all -> 0x0168 }
            long r3 = r3.currentTimeMillis()     // Catch:{ all -> 0x0168 }
            long r5 = r15.f40537j     // Catch:{ all -> 0x0168 }
            long r3 = r3 - r5
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0140
            boolean r0 = r15.f40534g     // Catch:{ all -> 0x0168 }
            if (r0 != 0) goto L_0x0130
            boolean r0 = r15.f40535h     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x005b
            monitor-exit(r32)     // Catch:{ all -> 0x0168 }
            r2 = r15
            goto L_0x01be
        L_0x005b:
            com.google.android.gms.internal.ads.cq0 r0 = r15.f40532e     // Catch:{ all -> 0x0168 }
            boolean r0 = r0.mo30996O()     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0124
            com.google.android.gms.internal.ads.cq0 r0 = r15.f40532e     // Catch:{ all -> 0x0168 }
            long r9 = r0.mo31004Y()     // Catch:{ all -> 0x0168 }
            r18 = 0
            int r0 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x010d
            com.google.android.gms.internal.ads.cq0 r0 = r15.f40532e     // Catch:{ all -> 0x0168 }
            long r6 = r0.mo31000U()     // Catch:{ all -> 0x0168 }
            long r0 = r15.f40538k     // Catch:{ all -> 0x0168 }
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x00e0
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            r0 = 1
            r8 = 1
            goto L_0x0084
        L_0x0082:
            r0 = 0
            r8 = 0
        L_0x0084:
            java.lang.String r0 = r15.f40533f     // Catch:{ all -> 0x00db }
            r3 = -1
            if (r2 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.cq0 r1 = r15.f40532e     // Catch:{ all -> 0x0168 }
            long r20 = r1.mo31005Z()     // Catch:{ all -> 0x0168 }
            goto L_0x0093
        L_0x0091:
            r20 = r3
        L_0x0093:
            if (r2 == 0) goto L_0x009c
            com.google.android.gms.internal.ads.cq0 r1 = r15.f40532e     // Catch:{ all -> 0x0168 }
            long r22 = r1.mo31002W()     // Catch:{ all -> 0x0168 }
            goto L_0x009e
        L_0x009c:
            r22 = r3
        L_0x009e:
            if (r2 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.cq0 r1 = r15.f40532e     // Catch:{ all -> 0x0168 }
            long r1 = r1.mo31006a0()     // Catch:{ all -> 0x0168 }
            r24 = r1
            goto L_0x00ab
        L_0x00a9:
            r24 = r3
        L_0x00ab:
            int r16 = com.google.android.gms.internal.ads.cq0.m31088R()     // Catch:{ all -> 0x00db }
            int r26 = com.google.android.gms.internal.ads.cq0.m31089T()     // Catch:{ all -> 0x00db }
            r1 = r32
            r2 = r0
            r3 = r13
            r4 = r6
            r27 = r6
            r6 = r9
            r29 = r9
            r9 = r20
            r20 = r11
            r11 = r22
            r31 = r13
            r13 = r24
            r15 = r16
            r16 = r26
            r1.mo18561m(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch:{ all -> 0x00d7 }
            r2 = r32
            r0 = r27
            r2.f40538k = r0     // Catch:{ all -> 0x00f5 }
            r3 = r29
            goto L_0x00e7
        L_0x00d7:
            r0 = move-exception
            r2 = r32
            goto L_0x00f6
        L_0x00db:
            r0 = move-exception
            r2 = r15
            r5 = r13
            goto L_0x016b
        L_0x00e0:
            r0 = r6
            r20 = r11
            r31 = r13
            r2 = r15
            r3 = r9
        L_0x00e7:
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x00fa
            java.lang.String r0 = r2.f40533f     // Catch:{ all -> 0x00f5 }
            r5 = r31
            r2.mo18559k(r0, r5, r3)     // Catch:{ all -> 0x0166 }
            monitor-exit(r32)     // Catch:{ all -> 0x0166 }
            goto L_0x01be
        L_0x00f5:
            r0 = move-exception
        L_0x00f6:
            r5 = r31
            goto L_0x016b
        L_0x00fa:
            r5 = r31
            com.google.android.gms.internal.ads.cq0 r3 = r2.f40532e     // Catch:{ all -> 0x0166 }
            long r3 = r3.mo31001V()     // Catch:{ all -> 0x0166 }
            int r6 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r6 < 0) goto L_0x010f
            int r3 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x010f
            monitor-exit(r32)     // Catch:{ all -> 0x0166 }
            goto L_0x01be
        L_0x010d:
            r5 = r13
            r2 = r15
        L_0x010f:
            monitor-exit(r32)     // Catch:{ all -> 0x0166 }
            com.google.android.gms.internal.ads.h00<java.lang.Long> r0 = com.google.android.gms.internal.ads.p00.f37209t
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r1.mo18570b(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2.m38920z(r0)
            return
        L_0x0124:
            r5 = r13
            r2 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "ExoPlayer was released during preloading."
            r0.<init>(r3)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x013c }
        L_0x0130:
            r5 = r13
            r2 = r15
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "Abort requested before buffering finished. "
            r0.<init>(r3)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x013c }
        L_0x013c:
            r0 = move-exception
            r17 = r1
            goto L_0x016b
        L_0x0140:
            r5 = r13
            r2 = r15
            java.lang.String r3 = "downloadTimeout"
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            r7 = 47
            r6.<init>(r7)     // Catch:{ all -> 0x0162 }
            java.lang.String r7 = "Timeout reached. Limit: "
            r6.append(r7)     // Catch:{ all -> 0x0162 }
            r6.append(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = " ms"
            r6.append(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0162 }
            r4.<init>(r0)     // Catch:{ all -> 0x0162 }
            throw r4     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            r17 = r3
            goto L_0x016b
        L_0x0166:
            r0 = move-exception
            goto L_0x016b
        L_0x0168:
            r0 = move-exception
            r5 = r13
            r2 = r15
        L_0x016b:
            monitor-exit(r32)     // Catch:{ all -> 0x0166 }
            throw r0     // Catch:{ Exception -> 0x016d }
        L_0x016d:
            r0 = move-exception
            goto L_0x0172
        L_0x016f:
            r0 = move-exception
            r5 = r13
            r2 = r15
        L_0x0172:
            r1 = r17
            java.lang.String r3 = r2.f40533f
            java.lang.String r4 = r0.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r4)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + 34
            int r6 = r6 + r7
            r8.<init>(r6)
            java.lang.String r6 = "Failed to preload url "
            r8.append(r6)
            r8.append(r3)
            java.lang.String r3 = " Exception: "
            r8.append(r3)
            r8.append(r4)
            java.lang.String r3 = r8.toString()
            com.google.android.gms.internal.ads.co0.zzj(r3)
            com.google.android.gms.internal.ads.nn0 r3 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r4 = "VideoStreamExoPlayerCache.preload"
            r3.mo18591r(r0, r4)
            r32.release()
            java.lang.String r0 = m38919y(r1, r0)
            java.lang.String r3 = r2.f40533f
            r2.mo18557i(r3, r5, r1, r0)
        L_0x01be:
            com.google.android.gms.internal.ads.es0 r0 = com.google.android.gms.ads.internal.zzt.zzy()
            com.google.android.gms.internal.ads.ds0 r1 = r2.f40536i
            r0.mo31659c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vs0.mo35490w():void");
    }

    public final void zzv() {
        co0.zzj("Precache onRenderedFirstFrame");
    }
}
