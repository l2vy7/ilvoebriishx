package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nt0 extends cq0 implements mt1, c04 {

    /* renamed from: w */
    public static final /* synthetic */ int f36107w = 0;

    /* renamed from: d */
    private final Context f36108d;

    /* renamed from: e */
    private final ys0 f36109e;

    /* renamed from: f */
    private final s74 f36110f;

    /* renamed from: g */
    private final lq0 f36111g;

    /* renamed from: h */
    private final WeakReference<mq0> f36112h;

    /* renamed from: i */
    private final g64 f36113i;

    /* renamed from: j */
    private qx3 f36114j;

    /* renamed from: k */
    private ByteBuffer f36115k;

    /* renamed from: l */
    private boolean f36116l;

    /* renamed from: m */
    private bq0 f36117m;

    /* renamed from: n */
    private int f36118n;

    /* renamed from: o */
    private int f36119o;

    /* renamed from: p */
    private long f36120p;

    /* renamed from: q */
    private final String f36121q;

    /* renamed from: r */
    private final int f36122r;

    /* renamed from: s */
    private final Object f36123s = new Object();
    @GuardedBy("httpDataSourcesLock")

    /* renamed from: t */
    private final ArrayList<kr1> f36124t;

    /* renamed from: u */
    private volatile at0 f36125u;

    /* renamed from: v */
    private final Set<WeakReference<xs0>> f36126v = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f4, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.C8311wv.m39277c().mo18570b(com.google.android.gms.internal.ads.p00.f37194r1)).booleanValue() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f8, code lost:
        if (r7.f35193j == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fa, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fd, code lost:
        if (r7.f35192i <= 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ff, code lost:
        r8 = new com.google.android.gms.internal.ads.et0(r5, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0105, code lost:
        r8 = new com.google.android.gms.internal.ads.ft0(r5, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010c, code lost:
        if (r7.f35193j == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010e, code lost:
        r7 = new com.google.android.gms.internal.ads.dt0(r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0115, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0116, code lost:
        r6 = r5.f36115k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0118, code lost:
        if (r6 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011e, code lost:
        if (r6.limit() <= 0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0120, code lost:
        r6 = new byte[r5.f36115k.limit()];
        r5.f36115k.get(r6);
        r7 = new com.google.android.gms.internal.ads.ct0(r7, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nt0(android.content.Context r6, com.google.android.gms.internal.ads.lq0 r7, com.google.android.gms.internal.ads.mq0 r8) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.f36123s = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.f36126v = r0
            r5.f36108d = r6
            r5.f36111g = r7
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r5.f36112h = r0
            com.google.android.gms.internal.ads.ys0 r0 = new com.google.android.gms.internal.ads.ys0
            r0.<init>()
            r5.f36109e = r0
            com.google.android.gms.internal.ads.s74 r1 = new com.google.android.gms.internal.ads.s74
            r1.<init>(r6)
            r5.f36110f = r1
            boolean r2 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "OfficialSimpleExoPlayerAdapter initialize "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.zze.zza(r2)
        L_0x003d:
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.gms.internal.ads.cq0.f30460b
            r2.incrementAndGet()
            com.google.android.gms.internal.ads.xm3 r2 = new com.google.android.gms.internal.ads.xm3
            com.google.android.gms.internal.ads.it0 r3 = new com.google.android.gms.internal.ads.it0
            r3.<init>(r5)
            r4 = 0
            r2.<init>(r6, r3, r4)
            r2.mo35772b(r1)
            r2.mo35771a(r0)
            com.google.android.gms.internal.ads.qx3 r0 = r2.mo35773c()
            r5.f36114j = r0
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f37219u1
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r1.mo18570b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L_0x0071
            com.google.android.gms.internal.ads.qx3 r0 = r5.f36114j
            r0.mo34425A(r1)
        L_0x0071:
            com.google.android.gms.internal.ads.qx3 r0 = r5.f36114j
            r0.mo34434u(r5)
            r5.f36118n = r1
            r2 = 0
            r5.f36120p = r2
            r5.f36119o = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f36124t = r0
            r5.f36125u = r4
            if (r8 == 0) goto L_0x0094
            java.lang.String r0 = r8.zzt()
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = r8.zzt()
            goto L_0x0096
        L_0x0094:
            java.lang.String r0 = ""
        L_0x0096:
            r5.f36121q = r0
            if (r8 == 0) goto L_0x009f
            int r0 = r8.zzh()
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            r5.f36122r = r0
            com.google.android.gms.internal.ads.g64 r0 = new com.google.android.gms.internal.ads.g64
            com.google.android.gms.ads.internal.util.zzt r2 = com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.internal.ads.zzcjf r8 = r8.zzp()
            java.lang.String r8 = r8.f43036b
            java.lang.String r6 = r2.zzd(r6, r8)
            boolean r8 = r5.f36116l
            if (r8 == 0) goto L_0x00d1
            java.nio.ByteBuffer r8 = r5.f36115k
            int r8 = r8.limit()
            if (r8 <= 0) goto L_0x00d1
            java.nio.ByteBuffer r6 = r5.f36115k
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r7 = r5.f36115k
            r7.get(r6)
            com.google.android.gms.internal.ads.gt0 r7 = new com.google.android.gms.internal.ads.gt0
            r7.<init>(r6)
            goto L_0x0133
        L_0x00d1:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.p00.f37235w1
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r8 = r2.mo18570b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 1
            if (r8 == 0) goto L_0x00f6
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.p00.f37194r1
            com.google.android.gms.internal.ads.n00 r3 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r8 = r3.mo18570b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x00fa
        L_0x00f6:
            boolean r8 = r7.f35193j
            if (r8 != 0) goto L_0x00fb
        L_0x00fa:
            r1 = 1
        L_0x00fb:
            int r8 = r7.f35192i
            if (r8 <= 0) goto L_0x0105
            com.google.android.gms.internal.ads.et0 r8 = new com.google.android.gms.internal.ads.et0
            r8.<init>(r5, r6, r1)
            goto L_0x010a
        L_0x0105:
            com.google.android.gms.internal.ads.ft0 r8 = new com.google.android.gms.internal.ads.ft0
            r8.<init>(r5, r6, r1)
        L_0x010a:
            boolean r6 = r7.f35193j
            if (r6 == 0) goto L_0x0115
            com.google.android.gms.internal.ads.dt0 r6 = new com.google.android.gms.internal.ads.dt0
            r6.<init>(r5, r8)
            r7 = r6
            goto L_0x0116
        L_0x0115:
            r7 = r8
        L_0x0116:
            java.nio.ByteBuffer r6 = r5.f36115k
            if (r6 == 0) goto L_0x0133
            int r6 = r6.limit()
            if (r6 <= 0) goto L_0x0133
            java.nio.ByteBuffer r6 = r5.f36115k
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r8 = r5.f36115k
            r8.get(r6)
            com.google.android.gms.internal.ads.ct0 r8 = new com.google.android.gms.internal.ads.ct0
            r8.<init>(r7, r6)
            r7 = r8
        L_0x0133:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.p00.f37147m
            com.google.android.gms.internal.ads.n00 r8 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r6 = r8.mo18570b(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0148
            com.google.android.gms.internal.ads.jt0 r6 = com.google.android.gms.internal.ads.jt0.f34038b
            goto L_0x014a
        L_0x0148:
            com.google.android.gms.internal.ads.kt0 r6 = com.google.android.gms.internal.ads.kt0.f34472b
        L_0x014a:
            r0.<init>(r7, r6)
            r5.f36113i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt0.<init>(android.content.Context, com.google.android.gms.internal.ads.lq0, com.google.android.gms.internal.ads.mq0):void");
    }

    /* renamed from: e0 */
    private final boolean m35300e0() {
        return this.f36125u != null && this.f36125u.mo30485t();
    }

    /* renamed from: A */
    public final void mo30982A(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        f54 f54;
        if (this.f36114j != null) {
            this.f36115k = byteBuffer;
            this.f36116l = z;
            int length = uriArr.length;
            if (length == 1) {
                f54 = mo33747b0(uriArr[0]);
            } else {
                f54[] f54Arr = new f54[length];
                for (int i = 0; i < uriArr.length; i++) {
                    f54Arr[i] = mo33747b0(uriArr[i]);
                }
                f54 = new t54(false, false, f54Arr);
            }
            this.f36114j.mo34438y(f54);
            this.f36114j.mo34435v();
            cq0.f30461c.incrementAndGet();
        }
    }

    /* renamed from: B */
    public final void mo30983B() {
        qx3 qx3 = this.f36114j;
        if (qx3 != null) {
            qx3.mo34437x(this);
            this.f36114j.mo34436w();
            this.f36114j = null;
            cq0.f30461c.decrementAndGet();
        }
    }

    /* renamed from: C */
    public final void mo30984C(long j) {
        qx3 qx3 = this.f36114j;
        qx3.mo30523a(qx3.zzg(), j);
    }

    /* renamed from: D */
    public final void mo30985D(int i) {
        this.f36109e.mo35967e(i);
    }

    /* renamed from: E */
    public final void mo30986E(int i) {
        this.f36109e.mo35968f(i);
    }

    /* renamed from: F */
    public final void mo30987F(bq0 bq0) {
        this.f36117m = bq0;
    }

    /* renamed from: G */
    public final void mo30988G(int i) {
        this.f36109e.mo35969g(i);
    }

    /* renamed from: H */
    public final void mo30989H(int i) {
        this.f36109e.mo35970h(i);
    }

    /* renamed from: I */
    public final void mo30990I(boolean z) {
        this.f36114j.mo34439z(z);
    }

    /* renamed from: J */
    public final void mo30991J(boolean z) {
        if (this.f36114j != null) {
            int i = 0;
            while (true) {
                this.f36114j.mo34431Q();
                if (i < 2) {
                    s74 s74 = this.f36110f;
                    n74 d = s74.mo34678h().mo33286d();
                    d.mo33666o(i, !z);
                    s74.mo34679l(d);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: K */
    public final void mo30992K(int i) {
        for (WeakReference<xs0> weakReference : this.f36126v) {
            xs0 xs0 = (xs0) weakReference.get();
            if (xs0 != null) {
                xs0.mo35793p(i);
            }
        }
    }

    /* renamed from: L */
    public final void mo30993L(Surface surface, boolean z) {
        qx3 qx3 = this.f36114j;
        if (qx3 != null) {
            qx3.mo34426B(surface);
        }
    }

    /* renamed from: M */
    public final void mo30994M(float f, boolean z) {
        qx3 qx3 = this.f36114j;
        if (qx3 != null) {
            qx3.mo34427C(f);
        }
    }

    /* renamed from: N */
    public final void mo30995N() {
        this.f36114j.mo34428D(false);
    }

    /* renamed from: O */
    public final boolean mo30996O() {
        return this.f36114j != null;
    }

    /* renamed from: P */
    public final boolean mo30997P() {
        return this.f36114j.mo34429F();
    }

    /* renamed from: Q */
    public final int mo30998Q() {
        return this.f36119o;
    }

    /* renamed from: S */
    public final int mo30999S() {
        return this.f36114j.mo34430P();
    }

    /* renamed from: U */
    public final long mo31000U() {
        return this.f36114j.mo34432R();
    }

    /* renamed from: V */
    public final long mo31001V() {
        return (long) this.f36118n;
    }

    /* renamed from: W */
    public final long mo31002W() {
        if (m35300e0() && this.f36125u.mo30484s()) {
            return Math.min((long) this.f36118n, this.f36125u.mo30479n());
        }
        return 0;
    }

    /* renamed from: X */
    public final long mo31003X() {
        return this.f36114j.zzk();
    }

    /* renamed from: Y */
    public final long mo31004Y() {
        return this.f36114j.mo34433S();
    }

    /* renamed from: Z */
    public final long mo31005Z() {
        if (!m35300e0()) {
            return (long) this.f36118n;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo30833a(b04 b04, C8281w wVar, nd3 nd3) {
        mq0 mq0 = (mq0) this.f36112h.get();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue() && mq0 != null && wVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", wVar.f40618k);
            hashMap.put("audioSampleMime", wVar.f40619l);
            hashMap.put("audioCodec", wVar.f40616i);
            mq0.mo18321Z("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: a0 */
    public final long mo31006a0() {
        if (m35300e0()) {
            return this.f36125u.mo30480o();
        }
        synchronized (this.f36123s) {
            while (!this.f36124t.isEmpty()) {
                long j = this.f36120p;
                Map<String, List<String>> zza = this.f36124t.remove(0).zza();
                long j2 = 0;
                if (zza != null) {
                    Iterator<Map.Entry<String, List<String>>> it = zza.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry next = it.next();
                        if (next != null) {
                            try {
                                if (!(next.getKey() == null || !h33.m32794c("content-length", (CharSequence) next.getKey()) || next.getValue() == null || ((List) next.getValue()).get(0) == null)) {
                                    j2 = Long.parseLong((String) ((List) next.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f36120p = j + j2;
            }
        }
        return this.f36120p;
    }

    /* renamed from: b */
    public final void mo33586b(yd1 yd1, ci1 ci1, boolean z, int i) {
        this.f36118n += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final f54 mo33747b0(Uri uri) {
        C7490a4 a4Var = new C7490a4();
        a4Var.mo30302b(uri);
        C7764ho c = a4Var.mo30303c();
        g64 g64 = this.f36113i;
        g64.mo32023a(this.f36111g.f35190g);
        return g64.mo32024b(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final /* synthetic */ void mo33748c0(boolean z, long j) {
        bq0 bq0 = this.f36117m;
        if (bq0 != null) {
            bq0.mo30769c(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final /* synthetic */ hx3[] mo33749d0(Handler handler, ua4 ua4, s04 s04, y64 y64, e44 e44) {
        Context context = this.f36108d;
        n34 n34 = n34.f35891a;
        r14 r14 = new r14((d04) null, new g04[0], false);
        g34 g34 = g34.f32134a;
        return new hx3[]{new v14(context, g34, n34, false, handler, s04, r14), new z94(this.f36108d, g34, n34, 0, false, handler, ua4, -1)};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final /* synthetic */ yd1 mo33750f0(String str, boolean z) {
        nt0 nt0 = true != z ? null : this;
        lq0 lq0 = this.f36111g;
        xs0 xs0 = new xs0(str, nt0, lq0.f35187d, lq0.f35189f, lq0.f35192i);
        this.f36126v.add(new WeakReference(xs0));
        return xs0;
    }

    public final void finalize() {
        cq0.f30460b.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final /* synthetic */ yd1 mo33752g0(String str, boolean z) {
        dj1 dj1 = new dj1();
        dj1.mo31263e(str);
        dj1.mo31262d(true != z ? null : this);
        dj1.mo31260b(this.f36111g.f35187d);
        dj1.mo31261c(this.f36111g.f35189f);
        dj1.mo31259a(true);
        return dj1.zza();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final /* synthetic */ yd1 mo33753h0(xc1 xc1) {
        return new at0(this.f36108d, xc1.zza(), this.f36121q, this.f36122r, this, new lt0(this), (byte[]) null);
    }

    /* renamed from: i */
    public final void mo30834i(b04 b04, f00 f00) {
        bq0 bq0 = this.f36117m;
        if (bq0 != null) {
            bq0.mo30770d("onPlayerError", f00);
        }
    }

    /* renamed from: j */
    public final void mo30835j(b04 b04, ky0 ky0) {
        bq0 bq0 = this.f36117m;
        if (bq0 != null) {
            bq0.mo30771e(ky0.f34738a, ky0.f34739b);
        }
    }

    /* renamed from: k */
    public final void mo30836k(b04 b04, Object obj, long j) {
        bq0 bq0 = this.f36117m;
        if (bq0 != null) {
            bq0.zzv();
        }
    }

    /* renamed from: m */
    public final void mo30837m(b04 b04, u44 u44, z44 z44, IOException iOException, boolean z) {
        bq0 bq0 = this.f36117m;
        if (bq0 == null) {
            return;
        }
        if (this.f36111g.f35195l) {
            bq0.mo30768b("onLoadException", iOException);
        } else {
            bq0.mo30770d("onLoadError", iOException);
        }
    }

    /* renamed from: n */
    public final void mo30838n(b04 b04, int i) {
        bq0 bq0 = this.f36117m;
        if (bq0 != null) {
            bq0.mo30767a(i);
        }
    }

    /* renamed from: o */
    public final void mo33587o(yd1 yd1, ci1 ci1, boolean z) {
    }

    /* renamed from: p */
    public final void mo33588p(yd1 yd1, ci1 ci1, boolean z) {
    }

    /* renamed from: t */
    public final void mo30839t(b04 b04, C8281w wVar, nd3 nd3) {
        mq0 mq0 = (mq0) this.f36112h.get();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue() && mq0 != null && wVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(wVar.f40626s));
            hashMap.put("bitRate", String.valueOf(wVar.f40615h));
            int i = wVar.f40624q;
            int i2 = wVar.f40625r;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            hashMap.put("resolution", sb.toString());
            hashMap.put("videoMime", wVar.f40618k);
            hashMap.put("videoSampleMime", wVar.f40619l);
            hashMap.put("videoCodec", wVar.f40616i);
            mq0.mo18321Z("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: u */
    public final void mo30840u(b04 b04, int i, long j) {
        this.f36119o += i;
    }

    /* renamed from: x */
    public final void mo33589x(yd1 yd1, ci1 ci1, boolean z) {
        if (yd1 instanceof kr1) {
            synchronized (this.f36123s) {
                this.f36124t.add((kr1) yd1);
            }
        } else if (yd1 instanceof at0) {
            this.f36125u = (at0) yd1;
            mq0 mq0 = (mq0) this.f36112h.get();
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue() && mq0 != null && this.f36125u.mo30482q()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f36125u.mo30484s()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f36125u.mo30483r()));
                zzt.zza.post(new mt0(mq0, hashMap));
            }
        }
    }

    /* renamed from: z */
    public final void mo31007z(Uri[] uriArr, String str) {
        mo30982A(uriArr, str, ByteBuffer.allocate(0), false);
    }
}
