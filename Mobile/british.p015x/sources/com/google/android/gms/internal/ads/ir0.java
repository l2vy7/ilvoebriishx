package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import p006a5.C0114k;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ir0 implements C7613dl {

    /* renamed from: a */
    private final C8160sl<C7613dl> f33407a;

    /* renamed from: b */
    private final Context f33408b;

    /* renamed from: c */
    private final C7613dl f33409c;

    /* renamed from: d */
    private final String f33410d;

    /* renamed from: e */
    private final int f33411e;

    /* renamed from: f */
    private final boolean f33412f = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue();

    /* renamed from: g */
    private InputStream f33413g;

    /* renamed from: h */
    private boolean f33414h;

    /* renamed from: i */
    private Uri f33415i;

    /* renamed from: j */
    private volatile zzbak f33416j;

    /* renamed from: k */
    private boolean f33417k = false;

    /* renamed from: l */
    private boolean f33418l = false;

    /* renamed from: m */
    private boolean f33419m = false;

    /* renamed from: n */
    private boolean f33420n = false;

    /* renamed from: o */
    private long f33421o = 0;

    /* renamed from: p */
    private mb3<Long> f33422p = null;

    /* renamed from: q */
    private final AtomicLong f33423q = new AtomicLong(-1);

    /* renamed from: r */
    private final rr0 f33424r;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.google.android.gms.internal.ads.dl] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.dl, java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.String, int] */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.sl<com.google.android.gms.internal.ads.dl>, int] */
    /* JADX WARNING: type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.rr0, com.google.android.gms.internal.ads.sl<com.google.android.gms.internal.ads.dl>] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ir0(android.content.Context r1, android.content.Context r2, com.google.android.gms.internal.ads.C7613dl r3, java.lang.String r4, int r5, com.google.android.gms.internal.ads.C8160sl<com.google.android.gms.internal.ads.C7613dl> r6, com.google.android.gms.internal.ads.rr0 r7) {
        /*
            r0 = this;
            r0.<init>()
            r0.f33408b = r1
            r0.f33409c = r2
            r0.f33407a = r5
            r0.f33424r = r6
            r0.f33410d = r3
            r0.f33411e = r4
            r1 = 0
            r0.f33417k = r1
            r0.f33418l = r1
            r0.f33419m = r1
            r0.f33420n = r1
            r1 = 0
            r0.f33421o = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r2 = -1
            r1.<init>(r2)
            r0.f33423q = r1
            r1 = 0
            r0.f33422p = r1
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.p00.f37194r1
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r1 = r2.mo18570b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.f33412f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ir0.<init>(android.content.Context, com.google.android.gms.internal.ads.dl, java.lang.String, int, com.google.android.gms.internal.ads.sl, com.google.android.gms.internal.ads.rr0, byte[]):void");
    }

    /* renamed from: j */
    private final void m33385j(C7687fl flVar) {
        C8160sl<C7613dl> slVar = this.f33407a;
        if (slVar != null) {
            ((tr0) slVar).mo34721r(this, flVar);
        }
    }

    /* renamed from: k */
    private final boolean m33386k() {
        if (!this.f33412f) {
            return false;
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36978S2)).booleanValue() && !this.f33419m) {
            return true;
        }
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36986T2)).booleanValue() || this.f33420n) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo30699a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        C8160sl<C7613dl> slVar;
        if (this.f33414h) {
            InputStream inputStream = this.f33413g;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.f33409c.mo30699a(bArr, i, i2);
            }
            if ((!this.f33412f || this.f33413g != null) && (slVar = this.f33407a) != null) {
                ((tr0) slVar).mo35026g0(this, i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ea  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0132=Splitter:B:39:0x0132, B:34:0x010f=Splitter:B:34:0x010f} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo30700b(com.google.android.gms.internal.ads.C7687fl r15) throws java.io.IOException {
        /*
            r14 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r14.f33414h
            if (r2 != 0) goto L_0x0209
            r2 = 1
            r14.f33414h = r2
            android.net.Uri r3 = r15.f31785a
            r14.f33415i = r3
            boolean r3 = r14.f33412f
            if (r3 != 0) goto L_0x0016
            r14.m33385j(r15)
        L_0x0016:
            android.net.Uri r3 = r15.f31785a
            com.google.android.gms.internal.ads.zzbak r3 = com.google.android.gms.internal.ads.zzbak.m40638C0(r3)
            r14.f33416j = r3
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.p00.f36954P2
            com.google.android.gms.internal.ads.n00 r4 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r3 = r4.mo18570b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x0188
            com.google.android.gms.internal.ads.zzbak r3 = r14.f33416j
            if (r3 == 0) goto L_0x01e4
            com.google.android.gms.internal.ads.zzbak r3 = r14.f33416j
            long r7 = r15.f31787c
            r3.f42930i = r7
            com.google.android.gms.internal.ads.zzbak r3 = r14.f33416j
            java.lang.String r7 = r14.f33410d
            java.lang.String r7 = com.google.android.gms.internal.ads.m43.m20696c(r7)
            r3.f42931j = r7
            com.google.android.gms.internal.ads.zzbak r3 = r14.f33416j
            int r7 = r14.f33411e
            r3.f42932k = r7
            com.google.android.gms.internal.ads.zzbak r3 = r14.f33416j
            boolean r3 = r3.f42929h
            if (r3 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.h00<java.lang.Long> r3 = com.google.android.gms.internal.ads.p00.f36970R2
            com.google.android.gms.internal.ads.n00 r7 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r3 = r7.mo18570b(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            goto L_0x006c
        L_0x0060:
            com.google.android.gms.internal.ads.h00<java.lang.Long> r3 = com.google.android.gms.internal.ads.p00.f36962Q2
            com.google.android.gms.internal.ads.n00 r7 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r3 = r7.mo18570b(r3)
            java.lang.Long r3 = (java.lang.Long) r3
        L_0x006c:
            long r7 = r3.longValue()
            a5.e r3 = com.google.android.gms.ads.internal.zzt.zzA()
            long r9 = r3.elapsedRealtime()
            com.google.android.gms.ads.internal.zzt.zzd()
            android.content.Context r3 = r14.f33408b
            com.google.android.gms.internal.ads.zzbak r11 = r14.f33416j
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.C7618dq.m31544a(r3, r11)
            r11 = 44
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x0131, InterruptedException -> 0x010e, all -> 0x010b }
            java.lang.Object r7 = r3.get(r7, r12)     // Catch:{ ExecutionException | TimeoutException -> 0x0131, InterruptedException -> 0x010e, all -> 0x010b }
            com.google.android.gms.internal.ads.eq r7 = (com.google.android.gms.internal.ads.C7655eq) r7     // Catch:{ ExecutionException | TimeoutException -> 0x0131, InterruptedException -> 0x010e, all -> 0x010b }
            boolean r8 = r7.mo31639d()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f33417k = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r8 = r7.mo31641f()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f33419m = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r8 = r7.mo31640e()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f33420n = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            long r12 = r7.mo31637a()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f33421o = r12     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r8 = r14.m33386k()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            if (r8 != 0) goto L_0x00e0
            java.io.InputStream r7 = r7.mo31638c()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f33413g = r7     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r7 = r14.f33412f     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            if (r7 == 0) goto L_0x00b8
            r14.m33385j(r15)     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
        L_0x00b8:
            a5.e r15 = com.google.android.gms.ads.internal.zzt.zzA()
            long r6 = r15.elapsedRealtime()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.rr0 r15 = r14.f33424r
            com.google.android.gms.internal.ads.tr0 r15 = r15.f38763a
            r15.mo35024f0(r2, r6)
            r14.f33418l = r2
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r11)
            r15.append(r1)
            r15.append(r6)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r15)
            return r4
        L_0x00e0:
            a5.e r3 = com.google.android.gms.ads.internal.zzt.zzA()
            long r3 = r3.elapsedRealtime()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.rr0 r5 = r14.f33424r
            com.google.android.gms.internal.ads.tr0 r5 = r5.f38763a
            r5.mo35024f0(r2, r3)
            r14.f33418l = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0159
        L_0x0105:
            r15 = move-exception
            goto L_0x0160
        L_0x0107:
            r4 = 1
            goto L_0x010f
        L_0x0109:
            r4 = 1
            goto L_0x0132
        L_0x010b:
            r15 = move-exception
            r2 = 0
            goto L_0x0160
        L_0x010e:
            r4 = 0
        L_0x010f:
            r3.cancel(r2)     // Catch:{ all -> 0x015e }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x015e }
            r2.interrupt()     // Catch:{ all -> 0x015e }
            a5.e r2 = com.google.android.gms.ads.internal.zzt.zzA()
            long r2 = r2.elapsedRealtime()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.rr0 r5 = r14.f33424r
            com.google.android.gms.internal.ads.tr0 r5 = r5.f38763a
            r5.mo35024f0(r4, r2)
            r14.f33418l = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            goto L_0x014c
        L_0x0131:
            r4 = 0
        L_0x0132:
            r3.cancel(r2)     // Catch:{ all -> 0x015e }
            a5.e r2 = com.google.android.gms.ads.internal.zzt.zzA()
            long r2 = r2.elapsedRealtime()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.rr0 r5 = r14.f33424r
            com.google.android.gms.internal.ads.tr0 r5 = r5.f38763a
            r5.mo35024f0(r4, r2)
            r14.f33418l = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
        L_0x014c:
            r4.append(r1)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x0159:
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            goto L_0x01e4
        L_0x015e:
            r15 = move-exception
            r2 = r4
        L_0x0160:
            a5.e r3 = com.google.android.gms.ads.internal.zzt.zzA()
            long r3 = r3.elapsedRealtime()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.rr0 r5 = r14.f33424r
            com.google.android.gms.internal.ads.tr0 r5 = r5.f38763a
            r5.mo35024f0(r2, r3)
            r14.f33418l = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            throw r15
        L_0x0188:
            com.google.android.gms.internal.ads.zzbak r0 = r14.f33416j
            if (r0 == 0) goto L_0x01ad
            com.google.android.gms.internal.ads.zzbak r0 = r14.f33416j
            long r7 = r15.f31787c
            r0.f42930i = r7
            com.google.android.gms.internal.ads.zzbak r0 = r14.f33416j
            java.lang.String r1 = r14.f33410d
            java.lang.String r1 = com.google.android.gms.internal.ads.m43.m20696c(r1)
            r0.f42931j = r1
            com.google.android.gms.internal.ads.zzbak r0 = r14.f33416j
            int r1 = r14.f33411e
            r0.f42932k = r1
            com.google.android.gms.internal.ads.qp r0 = com.google.android.gms.ads.internal.zzt.zzc()
            com.google.android.gms.internal.ads.zzbak r1 = r14.f33416j
            com.google.android.gms.internal.ads.zzbah r0 = r0.mo34375b(r1)
            goto L_0x01ae
        L_0x01ad:
            r0 = 0
        L_0x01ae:
            if (r0 == 0) goto L_0x01e4
            boolean r1 = r0.mo36231G0()
            if (r1 == 0) goto L_0x01e4
            boolean r1 = r0.mo36230F0()
            r14.f33417k = r1
            boolean r1 = r0.mo36233I0()
            r14.f33419m = r1
            boolean r1 = r0.mo36232H0()
            r14.f33420n = r1
            long r7 = r0.mo36227C0()
            r14.f33421o = r7
            r14.f33418l = r2
            boolean r1 = r14.m33386k()
            if (r1 != 0) goto L_0x01e4
            java.io.InputStream r0 = r0.mo36229E0()
            r14.f33413g = r0
            boolean r0 = r14.f33412f
            if (r0 == 0) goto L_0x01e3
            r14.m33385j(r15)
        L_0x01e3:
            return r4
        L_0x01e4:
            r14.f33418l = r6
            com.google.android.gms.internal.ads.zzbak r0 = r14.f33416j
            if (r0 == 0) goto L_0x0202
            com.google.android.gms.internal.ads.fl r0 = new com.google.android.gms.internal.ads.fl
            com.google.android.gms.internal.ads.zzbak r1 = r14.f33416j
            java.lang.String r1 = r1.f42923b
            android.net.Uri r2 = android.net.Uri.parse(r1)
            r3 = 0
            long r4 = r15.f31786b
            long r6 = r15.f31787c
            long r8 = r15.f31788d
            r10 = 0
            r11 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r15 = r0
        L_0x0202:
            com.google.android.gms.internal.ads.dl r0 = r14.f33409c
            long r0 = r0.mo30700b(r15)
            return r0
        L_0x0209:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open CacheDataSource."
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ir0.mo30700b(com.google.android.gms.internal.ads.fl):long");
    }

    /* renamed from: c */
    public final long mo32744c() {
        return this.f33421o;
    }

    /* renamed from: d */
    public final long mo32745d() {
        if (this.f33416j == null) {
            return -1;
        }
        if (this.f33423q.get() != -1) {
            return this.f33423q.get();
        }
        synchronized (this) {
            if (this.f33422p == null) {
                this.f33422p = po0.f37722a.mo33675b(new hr0(this));
            }
        }
        if (!this.f33422p.isDone()) {
            return -1;
        }
        try {
            this.f33423q.compareAndSet(-1, this.f33422p.get().longValue());
            return this.f33423q.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ Long mo32746e() throws Exception {
        return Long.valueOf(zzt.zzc().mo34374a(this.f33416j));
    }

    /* renamed from: f */
    public final boolean mo32747f() {
        return this.f33417k;
    }

    /* renamed from: g */
    public final boolean mo32748g() {
        return this.f33420n;
    }

    /* renamed from: h */
    public final boolean mo32749h() {
        return this.f33419m;
    }

    /* renamed from: i */
    public final boolean mo32750i() {
        return this.f33418l;
    }

    public final Uri zzc() {
        return this.f33415i;
    }

    public final void zzd() throws IOException {
        if (this.f33414h) {
            this.f33414h = false;
            this.f33415i = null;
            InputStream inputStream = this.f33413g;
            if (inputStream != null) {
                C0114k.m409a(inputStream);
                this.f33413g = null;
                return;
            }
            this.f33409c.zzd();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }
}
