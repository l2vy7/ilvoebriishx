package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d22 extends mi0 {

    /* renamed from: b */
    private final Context f30607b;

    /* renamed from: c */
    private final Executor f30608c;

    /* renamed from: d */
    private final fj0 f30609d;

    /* renamed from: e */
    private final b11 f30610e;
    @GuardedBy("this")

    /* renamed from: f */
    private final ArrayDeque<a22> f30611f;

    /* renamed from: g */
    private final gj0 f30612g;

    /* renamed from: h */
    private final i22 f30613h;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, java.util.concurrent.Executor] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.concurrent.Executor, com.google.android.gms.internal.ads.gj0] */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.b11, com.google.android.gms.internal.ads.gj0] */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.b11, com.google.android.gms.internal.ads.fj0] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.ArrayDeque<com.google.android.gms.internal.ads.a22>, com.google.android.gms.internal.ads.fj0] */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.util.ArrayDeque<com.google.android.gms.internal.ads.a22>, com.google.android.gms.internal.ads.i22] */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d22(android.content.Context r1, android.content.Context r2, java.util.concurrent.Executor r3, com.google.android.gms.internal.ads.gj0 r4, com.google.android.gms.internal.ads.b11 r5, com.google.android.gms.internal.ads.fj0 r6, java.util.ArrayDeque<com.google.android.gms.internal.ads.a22> r7, com.google.android.gms.internal.ads.i22 r8) {
        /*
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.ads.p00.m35913c(r1)
            r0.f30607b = r1
            r0.f30608c = r2
            r0.f30612g = r3
            r0.f30609d = r5
            r0.f30610e = r4
            r0.f30611f = r6
            r0.f30613h = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d22.<init>(android.content.Context, java.util.concurrent.Executor, com.google.android.gms.internal.ads.gj0, com.google.android.gms.internal.ads.b11, com.google.android.gms.internal.ads.fj0, java.util.ArrayDeque, com.google.android.gms.internal.ads.i22, byte[]):void");
    }

    /* renamed from: s6 */
    private final synchronized a22 m31205s6(String str) {
        Iterator<a22> it = this.f30611f.iterator();
        while (it.hasNext()) {
            a22 next = it.next();
            if (next.f29510d.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    /* renamed from: t6 */
    private final synchronized a22 m31206t6(String str) {
        Iterator<a22> it = this.f30611f.iterator();
        while (it.hasNext()) {
            a22 next = it.next();
            if (next.f29509c.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    /* renamed from: u6 */
    private static mb3<wi0> m31207u6(mb3<JSONObject> mb3, dw2 dw2, sb0 sb0) {
        return dw2.mo35307b(wv2.BUILD_URL, mb3).mo35047f(sb0.mo18829a("AFMA_getAdDictionary", pb0.f37568b, n12.f35868a)).mo35042a();
    }

    /* renamed from: v6 */
    private static mb3<JSONObject> m31208v6(zzcdq zzcdq, dw2 dw2, sj2 sj2) {
        r12 r12 = new r12(sj2);
        return dw2.mo35307b(wv2.GMS_SIGNALS, bb3.m30649i(zzcdq.f21150b)).mo35047f(r12).mo35046e(o12.f36232a).mo35042a();
    }

    /* renamed from: w6 */
    private final synchronized void m31209w6(a22 a22) {
        zzq();
        this.f30611f.addLast(a22);
    }

    /* renamed from: x6 */
    private final void m31210x6(mb3<InputStream> mb3, ri0 ri0) {
        bb3.m30658r(bb3.m30654n(mb3, new p12(this), po0.f37722a), new z12(this, ri0), po0.f37727f);
    }

    private final synchronized void zzq() {
        int intValue = k20.f34126c.mo34648e().intValue();
        while (this.f30611f.size() >= intValue) {
            this.f30611f.removeFirst();
        }
    }

    /* renamed from: X2 */
    public final void mo31078X2(zzcdq zzcdq, ri0 ri0) {
        mb3<InputStream> o6 = mo31083o6(zzcdq, Binder.getCallingUid());
        m31210x6(o6, ri0);
        o6.zzc(new s12(this), this.f30608c);
    }

    /* renamed from: d1 */
    public final void mo31079d1(zzcdq zzcdq, ri0 ri0) {
        m31210x6(mo31082n6(zzcdq, Binder.getCallingUid()), ri0);
    }

    /* renamed from: h0 */
    public final void mo31080h0(zzcdq zzcdq, ri0 ri0) {
        m31210x6(mo31084p6(zzcdq, Binder.getCallingUid()), ri0);
    }

    /* renamed from: n0 */
    public final void mo31081n0(String str, ri0 ri0) {
        m31210x6(mo31085q6(str), ri0);
    }

    /* renamed from: n6 */
    public final mb3<InputStream> mo31082n6(zzcdq zzcdq, int i) {
        if (!k20.f34124a.mo34648e().booleanValue()) {
            return bb3.m30648h(new Exception("Split request is disabled."));
        }
        zzffu zzffu = zzcdq.f21158j;
        if (zzffu == null) {
            return bb3.m30648h(new Exception("Pool configuration missing from request."));
        }
        if (zzffu.f21170f == 0 || zzffu.f21171g == 0) {
            return bb3.m30648h(new Exception("Caching is disabled."));
        }
        sb0 b = zzt.zzf().mo18421b(this.f30607b, zzcjf.m40656C0());
        sj2 a = this.f30610e.mo30589a(zzcdq, i);
        dw2 c = a.mo30810c();
        mb3<JSONObject> v6 = m31208v6(zzcdq, c, a);
        mb3<wi0> u6 = m31207u6(v6, c, b);
        return c.mo35306a(wv2.GET_URL_AND_CACHE_KEY, v6, u6).mo33189a(new t12(this, u6, v6, zzcdq)).mo35042a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007f  */
    /* renamed from: o6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.mb3<java.io.InputStream> mo31083o6(com.google.android.gms.internal.ads.zzcdq r12, int r13) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.ib0 r0 = com.google.android.gms.ads.internal.zzt.zzf()
            android.content.Context r1 = r11.f30607b
            com.google.android.gms.internal.ads.zzcjf r2 = com.google.android.gms.internal.ads.zzcjf.m40656C0()
            com.google.android.gms.internal.ads.sb0 r0 = r0.mo18421b(r1, r2)
            com.google.android.gms.internal.ads.b11 r1 = r11.f30610e
            com.google.android.gms.internal.ads.sj2 r1 = r1.mo30589a(r12, r13)
            com.google.android.gms.internal.ads.lb0<com.google.android.gms.internal.ads.c22> r2 = com.google.android.gms.internal.ads.c22.f30220d
            com.google.android.gms.internal.ads.jb0<java.io.InputStream> r3 = com.google.android.gms.internal.ads.pb0.f37569c
            java.lang.String r4 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.hb0 r2 = r0.mo18829a(r4, r2, r3)
            com.google.android.gms.internal.ads.k22 r3 = new com.google.android.gms.internal.ads.k22
            java.lang.String r4 = r12.f21156h
            r3.<init>(r4)
            android.content.Context r6 = r11.f30607b
            com.google.android.gms.internal.ads.zzcjf r4 = r12.f21151c
            java.lang.String r7 = r4.f43036b
            com.google.android.gms.internal.ads.gj0 r8 = r11.f30612g
            com.google.android.gms.internal.ads.h22 r4 = new com.google.android.gms.internal.ads.h22
            r10 = 0
            r5 = r4
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            com.google.android.gms.internal.ads.dw2 r13 = r1.mo30810c()
            com.google.android.gms.internal.ads.s10<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.k20.f34124a
            java.lang.Object r5 = r5.mo34648e()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6 = 0
            if (r5 != 0) goto L_0x0058
            java.lang.String r5 = r12.f21159k
            if (r5 == 0) goto L_0x0084
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0084
            java.lang.String r5 = "Request contained a PoolKey but split request is disabled."
            com.google.android.gms.ads.internal.util.zze.zza(r5)
            goto L_0x0084
        L_0x0058:
            com.google.android.gms.internal.ads.s10<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.k20.f34127d
            java.lang.Object r5 = r5.mo34648e()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x006e
            java.lang.String r5 = r12.f21157i
            com.google.android.gms.internal.ads.a22 r5 = r11.m31206t6(r5)
        L_0x006c:
            r6 = r5
            goto L_0x007d
        L_0x006e:
            java.lang.String r5 = r12.f21159k
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x007d
            java.lang.String r5 = r12.f21159k
            com.google.android.gms.internal.ads.a22 r5 = r11.m31205s6(r5)
            goto L_0x006c
        L_0x007d:
            if (r6 != 0) goto L_0x0084
            java.lang.String r5 = "Request contained a PoolKey but no matching parameters were found."
            com.google.android.gms.ads.internal.util.zze.zza(r5)
        L_0x0084:
            r5 = 1
            r7 = 0
            r8 = 2
            if (r6 != 0) goto L_0x00d3
            com.google.android.gms.internal.ads.mb3 r12 = m31208v6(r12, r13, r1)
            com.google.android.gms.internal.ads.mb3 r0 = m31207u6(r12, r13, r0)
            com.google.android.gms.internal.ads.wv2 r1 = com.google.android.gms.internal.ads.wv2.HTTP
            com.google.android.gms.internal.ads.mb3[] r6 = new com.google.android.gms.internal.ads.mb3[r8]
            r6[r7] = r0
            r6[r5] = r12
            com.google.android.gms.internal.ads.kv2 r1 = r13.mo35306a(r1, r6)
            com.google.android.gms.internal.ads.u12 r6 = new com.google.android.gms.internal.ads.u12
            r6.<init>(r12, r0)
            com.google.android.gms.internal.ads.tv2 r1 = r1.mo33189a(r6)
            com.google.android.gms.internal.ads.tv2 r1 = r1.mo35046e(r3)
            com.google.android.gms.internal.ads.tv2 r1 = r1.mo35046e(r4)
            com.google.android.gms.internal.ads.hv2 r1 = r1.mo35042a()
            com.google.android.gms.internal.ads.wv2 r3 = com.google.android.gms.internal.ads.wv2.PRE_PROCESS
            r4 = 3
            com.google.android.gms.internal.ads.mb3[] r4 = new com.google.android.gms.internal.ads.mb3[r4]
            r4[r7] = r12
            r4[r5] = r0
            r4[r8] = r1
            com.google.android.gms.internal.ads.kv2 r13 = r13.mo35306a(r3, r4)
            com.google.android.gms.internal.ads.x12 r3 = new com.google.android.gms.internal.ads.x12
            r3.<init>(r1, r12, r0)
            com.google.android.gms.internal.ads.tv2 r12 = r13.mo33189a(r3)
            com.google.android.gms.internal.ads.tv2 r12 = r12.mo35047f(r2)
            com.google.android.gms.internal.ads.hv2 r12 = r12.mo35042a()
            return r12
        L_0x00d3:
            com.google.android.gms.internal.ads.j22 r12 = new com.google.android.gms.internal.ads.j22
            org.json.JSONObject r0 = r6.f29508b
            com.google.android.gms.internal.ads.wi0 r1 = r6.f29507a
            r12.<init>(r0, r1)
            com.google.android.gms.internal.ads.wv2 r0 = com.google.android.gms.internal.ads.wv2.HTTP
            com.google.android.gms.internal.ads.mb3 r12 = com.google.android.gms.internal.ads.bb3.m30649i(r12)
            com.google.android.gms.internal.ads.tv2 r12 = r13.mo35307b(r0, r12)
            com.google.android.gms.internal.ads.tv2 r12 = r12.mo35046e(r3)
            com.google.android.gms.internal.ads.tv2 r12 = r12.mo35046e(r4)
            com.google.android.gms.internal.ads.hv2 r12 = r12.mo35042a()
            com.google.android.gms.internal.ads.mb3 r0 = com.google.android.gms.internal.ads.bb3.m30649i(r6)
            com.google.android.gms.internal.ads.wv2 r1 = com.google.android.gms.internal.ads.wv2.PRE_PROCESS
            com.google.android.gms.internal.ads.mb3[] r3 = new com.google.android.gms.internal.ads.mb3[r8]
            r3[r7] = r12
            r3[r5] = r0
            com.google.android.gms.internal.ads.kv2 r13 = r13.mo35306a(r1, r3)
            com.google.android.gms.internal.ads.w12 r1 = new com.google.android.gms.internal.ads.w12
            r1.<init>(r12, r0)
            com.google.android.gms.internal.ads.tv2 r12 = r13.mo33189a(r1)
            com.google.android.gms.internal.ads.tv2 r12 = r12.mo35047f(r2)
            com.google.android.gms.internal.ads.hv2 r12 = r12.mo35042a()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d22.mo31083o6(com.google.android.gms.internal.ads.zzcdq, int):com.google.android.gms.internal.ads.mb3");
    }

    /* renamed from: p6 */
    public final mb3<InputStream> mo31084p6(zzcdq zzcdq, int i) {
        sb0 b = zzt.zzf().mo18421b(this.f30607b, zzcjf.m40656C0());
        if (!p20.f37290a.mo34648e().booleanValue()) {
            return bb3.m30648h(new Exception("Signal collection disabled."));
        }
        sj2 a = this.f30610e.mo30589a(zzcdq, i);
        cj2<JSONObject> a2 = a.mo30808a();
        return a.mo30810c().mo35307b(wv2.GET_SIGNALS, bb3.m30649i(zzcdq.f21150b)).mo35047f(new q12(a2)).mo35043b(wv2.JS_SIGNALS).mo35047f(b.mo18829a("google.afma.request.getSignals", pb0.f37568b, pb0.f37569c)).mo35042a();
    }

    /* renamed from: q6 */
    public final mb3<InputStream> mo31085q6(String str) {
        a22 a22;
        if (!k20.f34124a.mo34648e().booleanValue()) {
            return bb3.m30648h(new Exception("Split request is disabled."));
        }
        y12 y12 = new y12(this);
        if (k20.f34127d.mo34648e().booleanValue()) {
            a22 = m31206t6(str);
        } else {
            a22 = m31205s6(str);
        }
        if (a22 != null) {
            return bb3.m30649i(y12);
        }
        String valueOf = String.valueOf(str);
        return bb3.m30648h(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r6 */
    public final /* synthetic */ InputStream mo31086r6(mb3 mb3, mb3 mb32, zzcdq zzcdq) throws Exception {
        String c = ((wi0) mb3.get()).mo35625c();
        String str = zzcdq.f21157i;
        m31209w6(new a22((wi0) mb3.get(), (JSONObject) mb32.get(), str, c));
        return new ByteArrayInputStream(c.getBytes(n33.f35887c));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        so0.m37458a(this.f30609d.mo31584a(), "persistFlags");
    }
}
