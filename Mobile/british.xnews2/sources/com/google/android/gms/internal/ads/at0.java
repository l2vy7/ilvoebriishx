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
public final class at0 extends va1 {

    /* renamed from: e */
    private final Context f29738e;

    /* renamed from: f */
    private final yd1 f29739f;

    /* renamed from: g */
    private final String f29740g;

    /* renamed from: h */
    private final int f29741h;

    /* renamed from: i */
    private final boolean f29742i = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue();

    /* renamed from: j */
    private InputStream f29743j;

    /* renamed from: k */
    private boolean f29744k;

    /* renamed from: l */
    private Uri f29745l;

    /* renamed from: m */
    private volatile zzbak f29746m;

    /* renamed from: n */
    private boolean f29747n = false;

    /* renamed from: o */
    private boolean f29748o = false;

    /* renamed from: p */
    private boolean f29749p = false;

    /* renamed from: q */
    private boolean f29750q = false;

    /* renamed from: r */
    private long f29751r = 0;

    /* renamed from: s */
    private mb3<Long> f29752s = null;

    /* renamed from: t */
    private final AtomicLong f29753t = new AtomicLong(-1);

    /* renamed from: u */
    private final lt0 f29754u;

    public at0(Context context, yd1 yd1, String str, int i, mt1 mt1, lt0 lt0, byte[] bArr) {
        super(false);
        this.f29738e = context;
        this.f29739f = yd1;
        this.f29754u = lt0;
        this.f29740g = str;
        this.f29741h = i;
        mo30796h(mt1);
    }

    /* renamed from: u */
    private final boolean m30450u() {
        if (!this.f29742i) {
            return false;
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36978S2)).booleanValue() && !this.f29749p) {
            return true;
        }
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36986T2)).booleanValue() || this.f29750q) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f29744k) {
            InputStream inputStream = this.f29743j;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.f29739f.mo30477b(bArr, i, i2);
            }
            if (!this.f29742i || this.f29743j != null) {
                mo35395j(i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ea  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0132=Splitter:B:39:0x0132, B:34:0x010f=Splitter:B:34:0x010f} */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo30478i(com.google.android.gms.internal.ads.ci1 r15) throws java.io.IOException {
        /*
            r14 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r14.f29744k
            if (r2 != 0) goto L_0x020a
            r2 = 1
            r14.f29744k = r2
            android.net.Uri r3 = r15.f30390a
            r14.f29745l = r3
            boolean r3 = r14.f29742i
            if (r3 != 0) goto L_0x0016
            r14.mo35398m(r15)
        L_0x0016:
            android.net.Uri r3 = r15.f30390a
            com.google.android.gms.internal.ads.zzbak r3 = com.google.android.gms.internal.ads.zzbak.m40638C0(r3)
            r14.f29746m = r3
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.p00.f36954P2
            com.google.android.gms.internal.ads.n00 r4 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r3 = r4.mo18570b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x0188
            com.google.android.gms.internal.ads.zzbak r3 = r14.f29746m
            if (r3 == 0) goto L_0x01e4
            com.google.android.gms.internal.ads.zzbak r3 = r14.f29746m
            long r7 = r15.f30395f
            r3.f42930i = r7
            com.google.android.gms.internal.ads.zzbak r3 = r14.f29746m
            java.lang.String r7 = r14.f29740g
            java.lang.String r7 = com.google.android.gms.internal.ads.m43.m20696c(r7)
            r3.f42931j = r7
            com.google.android.gms.internal.ads.zzbak r3 = r14.f29746m
            int r7 = r14.f29741h
            r3.f42932k = r7
            com.google.android.gms.internal.ads.zzbak r3 = r14.f29746m
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
            android.content.Context r3 = r14.f29738e
            com.google.android.gms.internal.ads.zzbak r11 = r14.f29746m
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.C7618dq.m31544a(r3, r11)
            r11 = 44
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x0131, InterruptedException -> 0x010e, all -> 0x010b }
            java.lang.Object r7 = r3.get(r7, r12)     // Catch:{ ExecutionException | TimeoutException -> 0x0131, InterruptedException -> 0x010e, all -> 0x010b }
            com.google.android.gms.internal.ads.eq r7 = (com.google.android.gms.internal.ads.C7655eq) r7     // Catch:{ ExecutionException | TimeoutException -> 0x0131, InterruptedException -> 0x010e, all -> 0x010b }
            boolean r8 = r7.mo31639d()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f29747n = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r8 = r7.mo31641f()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f29749p = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r8 = r7.mo31640e()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f29750q = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            long r12 = r7.mo31637a()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f29751r = r12     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r8 = r14.m30450u()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            if (r8 != 0) goto L_0x00e0
            java.io.InputStream r7 = r7.mo31638c()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f29743j = r7     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r7 = r14.f29742i     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            if (r7 == 0) goto L_0x00b8
            r14.mo35398m(r15)     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
        L_0x00b8:
            a5.e r15 = com.google.android.gms.ads.internal.zzt.zzA()
            long r6 = r15.elapsedRealtime()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.lt0 r15 = r14.f29754u
            com.google.android.gms.internal.ads.nt0 r15 = r15.f35258a
            r15.mo33748c0(r2, r6)
            r14.f29748o = r2
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
            com.google.android.gms.internal.ads.lt0 r5 = r14.f29754u
            com.google.android.gms.internal.ads.nt0 r5 = r5.f35258a
            r5.mo33748c0(r2, r3)
            r14.f29748o = r2
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
            com.google.android.gms.internal.ads.lt0 r5 = r14.f29754u
            com.google.android.gms.internal.ads.nt0 r5 = r5.f35258a
            r5.mo33748c0(r4, r2)
            r14.f29748o = r4
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
            com.google.android.gms.internal.ads.lt0 r5 = r14.f29754u
            com.google.android.gms.internal.ads.nt0 r5 = r5.f35258a
            r5.mo33748c0(r4, r2)
            r14.f29748o = r4
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
            com.google.android.gms.internal.ads.lt0 r5 = r14.f29754u
            com.google.android.gms.internal.ads.nt0 r5 = r5.f35258a
            r5.mo33748c0(r2, r3)
            r14.f29748o = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            throw r15
        L_0x0188:
            com.google.android.gms.internal.ads.zzbak r0 = r14.f29746m
            if (r0 == 0) goto L_0x01ad
            com.google.android.gms.internal.ads.zzbak r0 = r14.f29746m
            long r7 = r15.f30395f
            r0.f42930i = r7
            com.google.android.gms.internal.ads.zzbak r0 = r14.f29746m
            java.lang.String r1 = r14.f29740g
            java.lang.String r1 = com.google.android.gms.internal.ads.m43.m20696c(r1)
            r0.f42931j = r1
            com.google.android.gms.internal.ads.zzbak r0 = r14.f29746m
            int r1 = r14.f29741h
            r0.f42932k = r1
            com.google.android.gms.internal.ads.qp r0 = com.google.android.gms.ads.internal.zzt.zzc()
            com.google.android.gms.internal.ads.zzbak r1 = r14.f29746m
            com.google.android.gms.internal.ads.zzbah r0 = r0.mo34375b(r1)
            goto L_0x01ae
        L_0x01ad:
            r0 = 0
        L_0x01ae:
            if (r0 == 0) goto L_0x01e4
            boolean r1 = r0.mo36231G0()
            if (r1 == 0) goto L_0x01e4
            boolean r1 = r0.mo36230F0()
            r14.f29747n = r1
            boolean r1 = r0.mo36233I0()
            r14.f29749p = r1
            boolean r1 = r0.mo36232H0()
            r14.f29750q = r1
            long r7 = r0.mo36227C0()
            r14.f29751r = r7
            r14.f29748o = r2
            boolean r1 = r14.m30450u()
            if (r1 != 0) goto L_0x01e4
            java.io.InputStream r0 = r0.mo36229E0()
            r14.f29743j = r0
            boolean r0 = r14.f29742i
            if (r0 == 0) goto L_0x01e3
            r14.mo35398m(r15)
        L_0x01e3:
            return r4
        L_0x01e4:
            r14.f29748o = r6
            com.google.android.gms.internal.ads.zzbak r0 = r14.f29746m
            if (r0 == 0) goto L_0x0203
            com.google.android.gms.internal.ads.ci1 r0 = new com.google.android.gms.internal.ads.ci1
            com.google.android.gms.internal.ads.zzbak r1 = r14.f29746m
            java.lang.String r1 = r1.f42923b
            android.net.Uri r2 = android.net.Uri.parse(r1)
            long r4 = r15.f30394e
            long r6 = r15.f30395f
            long r8 = r15.f30396g
            r3 = 0
            r10 = 0
            int r11 = r15.f30398i
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r15 = r0
        L_0x0203:
            com.google.android.gms.internal.ads.yd1 r0 = r14.f29739f
            long r0 = r0.mo30478i(r15)
            return r0
        L_0x020a:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open GcacheDataSource."
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.at0.mo30478i(com.google.android.gms.internal.ads.ci1):long");
    }

    /* renamed from: n */
    public final long mo30479n() {
        return this.f29751r;
    }

    /* renamed from: o */
    public final long mo30480o() {
        if (this.f29746m == null) {
            return -1;
        }
        if (this.f29753t.get() != -1) {
            return this.f29753t.get();
        }
        synchronized (this) {
            if (this.f29752s == null) {
                this.f29752s = po0.f37722a.mo33675b(new zs0(this));
            }
        }
        if (!this.f29752s.isDone()) {
            return -1;
        }
        try {
            this.f29753t.compareAndSet(-1, this.f29752s.get().longValue());
            return this.f29753t.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ Long mo30481p() throws Exception {
        return Long.valueOf(zzt.zzc().mo34374a(this.f29746m));
    }

    /* renamed from: q */
    public final boolean mo30482q() {
        return this.f29747n;
    }

    /* renamed from: r */
    public final boolean mo30483r() {
        return this.f29750q;
    }

    /* renamed from: s */
    public final boolean mo30484s() {
        return this.f29749p;
    }

    /* renamed from: t */
    public final boolean mo30485t() {
        return this.f29748o;
    }

    public final Uri zzi() {
        return this.f29745l;
    }

    public final void zzj() throws IOException {
        if (this.f29744k) {
            boolean z = false;
            this.f29744k = false;
            this.f29745l = null;
            if (!this.f29742i || this.f29743j != null) {
                z = true;
            }
            InputStream inputStream = this.f29743j;
            if (inputStream != null) {
                C0114k.m409a(inputStream);
                this.f29743j = null;
            } else {
                this.f29739f.zzj();
            }
            if (z) {
                mo35396k();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }
}
