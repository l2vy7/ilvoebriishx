package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
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
public final class tr0 extends cq0 implements C8160sl, C8052pj, C7545bn, C7977nf, C7571ce {

    /* renamed from: x */
    public static final /* synthetic */ int f39496x = 0;

    /* renamed from: d */
    private final Context f39497d;

    /* renamed from: e */
    private final jr0 f39498e;

    /* renamed from: f */
    private final C8224ue f39499f;

    /* renamed from: g */
    private final C8224ue f39500g;

    /* renamed from: h */
    private final C8230uk f39501h;

    /* renamed from: i */
    private final lq0 f39502i;

    /* renamed from: j */
    private C7680fe f39503j;

    /* renamed from: k */
    private ByteBuffer f39504k;

    /* renamed from: l */
    private boolean f39505l;

    /* renamed from: m */
    private final WeakReference<mq0> f39506m;

    /* renamed from: n */
    private bq0 f39507n;

    /* renamed from: o */
    private int f39508o;

    /* renamed from: p */
    private int f39509p;

    /* renamed from: q */
    private long f39510q;

    /* renamed from: r */
    private final String f39511r;

    /* renamed from: s */
    private final int f39512s;

    /* renamed from: t */
    private final Object f39513t = new Object();
    @GuardedBy("httpDataSourcesLock")

    /* renamed from: u */
    private final ArrayList<C7945ml> f39514u;

    /* renamed from: v */
    private volatile ir0 f39515v;

    /* renamed from: w */
    private final Set<WeakReference<gr0>> f39516w = new HashSet();

    public tr0(Context context, lq0 lq0, mq0 mq0) {
        this.f39497d = context;
        this.f39502i = lq0;
        this.f39506m = new WeakReference<>(mq0);
        jr0 jr0 = new jr0();
        this.f39498e = jr0;
        C8123ri riVar = C8123ri.f38689a;
        d33 d33 = zzt.zza;
        C8091qm qmVar = new C8091qm(context, riVar, 0, d33, this, -1);
        this.f39499f = qmVar;
        C7573cg cgVar = new C7573cg(riVar, (C8049pg) null, true, d33, this);
        this.f39500g = cgVar;
        C8089qk qkVar = new C8089qk((C8267vk) null);
        this.f39501h = qkVar;
        if (zze.zzc()) {
            zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        cq0.f30460b.incrementAndGet();
        int i = 0;
        C7680fe a = C7717ge.m32427a(new C8224ue[]{cgVar, qmVar}, qkVar, jr0);
        this.f39503j = a;
        a.mo31834h0(this);
        this.f39508o = 0;
        this.f39510q = 0;
        this.f39509p = 0;
        this.f39514u = new ArrayList<>();
        this.f39515v = null;
        this.f39511r = (mq0 == null || mq0.zzt() == null) ? "" : mq0.zzt();
        this.f39512s = mq0 != null ? mq0.zzh() : i;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37156n)).booleanValue()) {
            this.f39503j.zzg();
        }
        if (mq0 != null && mq0.zzg() > 0) {
            this.f39503j.mo31828b0(mq0.zzg());
        }
        if (mq0 != null && mq0.zzf() > 0) {
            this.f39503j.mo31826a(mq0.zzf());
        }
    }

    /* renamed from: i0 */
    private final boolean m37959i0() {
        return this.f39515v != null && this.f39515v.mo32750i();
    }

    /* renamed from: A */
    public final void mo30982A(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        C8229uj ujVar;
        if (this.f39503j != null) {
            this.f39504k = byteBuffer;
            this.f39505l = z;
            int length = uriArr.length;
            if (length == 1) {
                ujVar = mo35020b0(uriArr[0], str);
            } else {
                C8229uj[] ujVarArr = new C8229uj[length];
                for (int i = 0; i < uriArr.length; i++) {
                    ujVarArr[i] = mo35020b0(uriArr[i], str);
                }
                ujVar = new C8372yj(ujVarArr);
            }
            this.f39503j.mo31832f0(ujVar);
            cq0.f30461c.incrementAndGet();
        }
    }

    /* renamed from: B */
    public final void mo30983B() {
        C7680fe feVar = this.f39503j;
        if (feVar != null) {
            feVar.mo31830d0(this);
            this.f39503j.zzi();
            this.f39503j = null;
            cq0.f30461c.decrementAndGet();
        }
    }

    /* renamed from: C */
    public final void mo30984C(long j) {
        this.f39503j.mo31831e0(j);
    }

    /* renamed from: D */
    public final void mo30985D(int i) {
        this.f39498e.mo32962f(i);
    }

    /* renamed from: E */
    public final void mo30986E(int i) {
        this.f39498e.mo32963g(i);
    }

    /* renamed from: F */
    public final void mo30987F(bq0 bq0) {
        this.f39507n = bq0;
    }

    /* renamed from: G */
    public final void mo30988G(int i) {
        this.f39498e.mo32964h(i);
    }

    /* renamed from: H */
    public final void mo30989H(int i) {
        this.f39498e.mo32965i(i);
    }

    /* renamed from: I */
    public final void mo30990I(boolean z) {
        this.f39503j.mo31827a0(z);
    }

    /* renamed from: J */
    public final void mo30991J(boolean z) {
        if (this.f39503j != null) {
            for (int i = 0; i < 2; i++) {
                this.f39501h.mo35197f(i, !z);
            }
        }
    }

    /* renamed from: K */
    public final void mo30992K(int i) {
        for (WeakReference<gr0> weakReference : this.f39516w) {
            gr0 gr0 = (gr0) weakReference.get();
            if (gr0 != null) {
                gr0.mo32222e(i);
            }
        }
    }

    /* renamed from: L */
    public final void mo30993L(Surface surface, boolean z) {
        if (this.f39503j != null) {
            C7643ee eeVar = new C7643ee(this.f39499f, 1, surface);
            if (z) {
                this.f39503j.mo31833g0(eeVar);
                return;
            }
            this.f39503j.mo31829c0(eeVar);
        }
    }

    /* renamed from: M */
    public final void mo30994M(float f, boolean z) {
        if (this.f39503j != null) {
            C7643ee eeVar = new C7643ee(this.f39500g, 2, Float.valueOf(f));
            if (z) {
                this.f39503j.mo31833g0(eeVar);
                return;
            }
            this.f39503j.mo31829c0(eeVar);
        }
    }

    /* renamed from: N */
    public final void mo30995N() {
        this.f39503j.zzp();
    }

    /* renamed from: O */
    public final boolean mo30996O() {
        return this.f39503j != null;
    }

    /* renamed from: P */
    public final boolean mo30997P() {
        return this.f39503j.zzq();
    }

    /* renamed from: Q */
    public final int mo30998Q() {
        return this.f39509p;
    }

    /* renamed from: S */
    public final int mo30999S() {
        return this.f39503j.zza();
    }

    /* renamed from: U */
    public final long mo31000U() {
        return this.f39503j.zzb();
    }

    /* renamed from: V */
    public final long mo31001V() {
        return (long) this.f39508o;
    }

    /* renamed from: W */
    public final long mo31002W() {
        if (m37959i0() && this.f39515v.mo32749h()) {
            return Math.min((long) this.f39508o, this.f39515v.mo32744c());
        }
        return 0;
    }

    /* renamed from: X */
    public final long mo31003X() {
        return this.f39503j.zzc();
    }

    /* renamed from: Y */
    public final long mo31004Y() {
        return this.f39503j.zzd();
    }

    /* renamed from: Z */
    public final long mo31005Z() {
        if (!m37959i0()) {
            return (long) this.f39508o;
        }
        return 0;
    }

    /* renamed from: a0 */
    public final long mo31006a0() {
        if (m37959i0()) {
            return this.f39515v.mo32745d();
        }
        synchronized (this.f39513t) {
            while (!this.f39514u.isEmpty()) {
                long j = this.f39510q;
                Map<String, List<String>> zze = this.f39514u.remove(0).zze();
                long j2 = 0;
                if (zze != null) {
                    Iterator<Map.Entry<String, List<String>>> it = zze.entrySet().iterator();
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
                this.f39510q = j + j2;
            }
        }
        return this.f39510q;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.C8311wv.m39277c().mo18570b(com.google.android.gms.internal.ads.p00.f37194r1)).booleanValue() == false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C8229uj mo35020b0(android.net.Uri r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.qj r9 = new com.google.android.gms.internal.ads.qj
            boolean r0 = r10.f39505l
            if (r0 == 0) goto L_0x0022
            java.nio.ByteBuffer r0 = r10.f39504k
            int r0 = r0.limit()
            if (r0 <= 0) goto L_0x0022
            java.nio.ByteBuffer r12 = r10.f39504k
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.f39504k
            r0.get(r12)
            com.google.android.gms.internal.ads.qr0 r0 = new com.google.android.gms.internal.ads.qr0
            r0.<init>(r12)
        L_0x0020:
            r2 = r0
            goto L_0x0089
        L_0x0022:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f37235w1
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r1.mo18570b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f37194r1
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r2.mo18570b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x004f
        L_0x0047:
            com.google.android.gms.internal.ads.lq0 r0 = r10.f39502i
            boolean r0 = r0.f35193j
            if (r0 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            com.google.android.gms.internal.ads.lq0 r0 = r10.f39502i
            int r0 = r0.f35192i
            if (r0 <= 0) goto L_0x005b
            com.google.android.gms.internal.ads.or0 r0 = new com.google.android.gms.internal.ads.or0
            r0.<init>(r10, r12, r1)
            goto L_0x0060
        L_0x005b:
            com.google.android.gms.internal.ads.pr0 r0 = new com.google.android.gms.internal.ads.pr0
            r0.<init>(r10, r12, r1)
        L_0x0060:
            com.google.android.gms.internal.ads.lq0 r12 = r10.f39502i
            boolean r12 = r12.f35193j
            if (r12 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.nr0 r12 = new com.google.android.gms.internal.ads.nr0
            r12.<init>(r10, r0)
            r0 = r12
        L_0x006c:
            java.nio.ByteBuffer r12 = r10.f39504k
            if (r12 == 0) goto L_0x0020
            int r12 = r12.limit()
            if (r12 <= 0) goto L_0x0020
            java.nio.ByteBuffer r12 = r10.f39504k
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.f39504k
            r1.get(r12)
            com.google.android.gms.internal.ads.mr0 r1 = new com.google.android.gms.internal.ads.mr0
            r1.<init>(r0, r12)
            r2 = r1
        L_0x0089:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.p00.f37147m
            com.google.android.gms.internal.ads.n00 r0 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r12 = r0.mo18570b(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.kr0 r12 = com.google.android.gms.internal.ads.kr0.f34459a
            goto L_0x00a0
        L_0x009e:
            com.google.android.gms.internal.ads.lr0 r12 = com.google.android.gms.internal.ads.lr0.f35203a
        L_0x00a0:
            r3 = r12
            com.google.android.gms.internal.ads.lq0 r12 = r10.f39502i
            int r4 = r12.f35194k
            com.google.android.gms.internal.ads.d33 r5 = com.google.android.gms.ads.internal.util.zzt.zza
            r7 = 0
            int r8 = r12.f35190g
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tr0.mo35020b0(android.net.Uri, java.lang.String):com.google.android.gms.internal.ads.uj");
    }

    /* renamed from: c */
    public final void mo30885c(C7870kk kkVar, C8301wk wkVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final /* synthetic */ C7613dl mo35021c0(String str, boolean z) {
        tr0 tr0 = true != z ? null : this;
        lq0 lq0 = this.f39502i;
        gr0 gr0 = new gr0(str, tr0, lq0.f35187d, lq0.f35189f, lq0.f35192i);
        this.f39516w.add(new WeakReference(gr0));
        return gr0;
    }

    /* renamed from: d */
    public final void mo34137d(IOException iOException) {
        bq0 bq0 = this.f39507n;
        if (bq0 == null) {
            return;
        }
        if (this.f39502i.f35195l) {
            bq0.mo30768b("onLoadException", iOException);
        } else {
            bq0.mo30770d("onLoadError", iOException);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final /* synthetic */ C7613dl mo35022d0(String str, boolean z) {
        tr0 tr0 = true != z ? null : this;
        lq0 lq0 = this.f39502i;
        return new C7799il(str, (C7614dm<String>) null, tr0, lq0.f35187d, lq0.f35189f, true, (C7908ll) null);
    }

    /* renamed from: e */
    public final void mo30886e(C7501af afVar, Object obj) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final /* synthetic */ C7613dl mo35023e0(C7578cl clVar) {
        return new ir0(this.f39497d, clVar.zza(), this.f39511r, this.f39512s, this, new rr0(this), (rr0) null);
    }

    /* renamed from: f */
    public final void mo30887f(C7536be beVar) {
        bq0 bq0 = this.f39507n;
        if (bq0 != null) {
            bq0.mo30770d("onPlayerError", beVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final /* synthetic */ void mo35024f0(boolean z, long j) {
        bq0 bq0 = this.f39507n;
        if (bq0 != null) {
            bq0.mo30769c(z, j);
        }
    }

    public final void finalize() throws Throwable {
        cq0.f30460b.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* renamed from: g */
    public final void mo30733g(int i, int i2, int i3, float f) {
        bq0 bq0 = this.f39507n;
        if (bq0 != null) {
            bq0.mo30771e(i, i2);
        }
    }

    /* renamed from: g0 */
    public final void mo35026g0(C7613dl dlVar, int i) {
        this.f39508o += i;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo34720h(Object obj, int i) {
        this.f39508o += i;
    }

    /* renamed from: h0 */
    public final void mo34721r(C7613dl dlVar, C7687fl flVar) {
        if (dlVar instanceof C7945ml) {
            synchronized (this.f39513t) {
                this.f39514u.add((C7945ml) dlVar);
            }
        } else if (dlVar instanceof ir0) {
            this.f39515v = (ir0) dlVar;
            mq0 mq0 = (mq0) this.f39506m.get();
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue() && mq0 != null && this.f39515v.mo32747f()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f39515v.mo32749h()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f39515v.mo32748g()));
                zzt.zza.post(new sr0(mq0, hashMap));
            }
        }
    }

    /* renamed from: l */
    public final void mo33688l(zzapg zzapg) {
        mq0 mq0 = (mq0) this.f39506m.get();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue() && mq0 != null && zzapg != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", zzapg.f42869f);
            hashMap.put("audioSampleMime", zzapg.f42870g);
            hashMap.put("audioCodec", zzapg.f42867d);
            mq0.mo18321Z("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: q */
    public final void mo30734q(zzapg zzapg) {
        mq0 mq0 = (mq0) this.f39506m.get();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37194r1)).booleanValue() && mq0 != null && zzapg != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzapg.f42876m));
            hashMap.put("bitRate", String.valueOf(zzapg.f42866c));
            int i = zzapg.f42874k;
            int i2 = zzapg.f42875l;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            hashMap.put("resolution", sb.toString());
            hashMap.put("videoMime", zzapg.f42869f);
            hashMap.put("videoSampleMime", zzapg.f42870g);
            hashMap.put("videoCodec", zzapg.f42867d);
            mq0.mo18321Z("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: s */
    public final void mo30888s(C8188te teVar) {
    }

    /* renamed from: v */
    public final void mo30735v(int i, long j) {
        this.f39509p += i;
    }

    /* renamed from: w */
    public final void mo30889w(boolean z, int i) {
        bq0 bq0 = this.f39507n;
        if (bq0 != null) {
            bq0.mo30767a(i);
        }
    }

    /* renamed from: y */
    public final void mo30736y(Surface surface) {
        bq0 bq0 = this.f39507n;
        if (bq0 != null) {
            bq0.zzv();
        }
    }

    /* renamed from: z */
    public final void mo31007z(Uri[] uriArr, String str) {
        mo30982A(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zza(boolean z) {
    }

    public final void zze() {
    }
}
