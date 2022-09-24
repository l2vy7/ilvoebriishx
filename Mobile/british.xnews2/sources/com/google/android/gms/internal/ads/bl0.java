package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.internal.C4604n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6492o;
import p192c5.C6520c;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bl0 implements hl0 {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final List<Future<Void>> f20133m = Collections.synchronizedList(new ArrayList());

    /* renamed from: n */
    public static final /* synthetic */ int f20134n = 0;
    @GuardedBy("lock")

    /* renamed from: a */
    private final at3 f20135a;
    @GuardedBy("lock")

    /* renamed from: b */
    private final LinkedHashMap<String, vt3> f20136b;
    @GuardedBy("lock")

    /* renamed from: c */
    private final List<String> f20137c = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: d */
    private final List<String> f20138d = new ArrayList();

    /* renamed from: e */
    private final Context f20139e;

    /* renamed from: f */
    boolean f20140f;

    /* renamed from: g */
    private final zzcgc f20141g;

    /* renamed from: h */
    private final Object f20142h = new Object();

    /* renamed from: i */
    private HashSet<String> f20143i = new HashSet<>();

    /* renamed from: j */
    private boolean f20144j = false;

    /* renamed from: k */
    private boolean f20145k = false;

    /* renamed from: l */
    private final el0 f20146l;

    public bl0(Context context, zzcjf zzcjf, zzcgc zzcgc, String str, el0 el0, byte[] bArr) {
        C4604n.m20099l(zzcgc, "SafeBrowsing config is not present.");
        this.f20139e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f20136b = new LinkedHashMap<>();
        this.f20146l = el0;
        this.f20141g = zzcgc;
        for (String lowerCase : zzcgc.f43032f) {
            this.f20143i.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f20143i.remove("cookie".toLowerCase(Locale.ENGLISH));
        at3 E = zt3.m40497E();
        E.mo30502R(9);
        E.mo30498N(str);
        E.mo30496L(str);
        ct3 E2 = dt3.m31612E();
        String str2 = this.f20141g.f43028b;
        if (str2 != null) {
            E2.mo31038y(str2);
        }
        E.mo30495K((dt3) E2.mo32424p());
        xt3 E3 = yt3.m40015E();
        E3.mo35795C(C6520c.m28321a(this.f20139e).mo24356g());
        String str3 = zzcjf.f43036b;
        if (str3 != null) {
            E3.mo35796y(str3);
        }
        long b = (long) C7353b.m29920h().mo29973b(this.f20139e);
        if (b > 0) {
            E3.mo35794B(b);
        }
        E.mo30494J((yt3) E3.mo32424p());
        this.f20135a = E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18141a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f20142h
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.f20145k = r2     // Catch:{ all -> 0x00b7 }
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.vt3> r2 = r6.f20136b     // Catch:{ all -> 0x00b7 }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0024
            if (r9 != r1) goto L_0x0022
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.vt3> r8 = r6.f20136b     // Catch:{ all -> 0x00b7 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.vt3 r7 = (com.google.android.gms.internal.ads.vt3) r7     // Catch:{ all -> 0x00b7 }
            int r8 = com.google.android.gms.internal.ads.ut3.m38448a(r1)     // Catch:{ all -> 0x00b7 }
            r7.mo35496I(r8)     // Catch:{ all -> 0x00b7 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x0024:
            com.google.android.gms.internal.ads.vt3 r1 = com.google.android.gms.internal.ads.wt3.m39260F()     // Catch:{ all -> 0x00b7 }
            int r9 = com.google.android.gms.internal.ads.ut3.m38448a(r9)     // Catch:{ all -> 0x00b7 }
            if (r9 == 0) goto L_0x0031
            r1.mo35496I(r9)     // Catch:{ all -> 0x00b7 }
        L_0x0031:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.vt3> r9 = r6.f20136b     // Catch:{ all -> 0x00b7 }
            int r9 = r9.size()     // Catch:{ all -> 0x00b7 }
            r1.mo35493B(r9)     // Catch:{ all -> 0x00b7 }
            r1.mo35495H(r7)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.gt3 r9 = com.google.android.gms.internal.ads.jt3.m33755E()     // Catch:{ all -> 0x00b7 }
            java.util.HashSet<java.lang.String> r2 = r6.f20143i     // Catch:{ all -> 0x00b7 }
            int r2 = r2.size()     // Catch:{ all -> 0x00b7 }
            if (r2 <= 0) goto L_0x00a7
            if (r8 == 0) goto L_0x00a7
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00b7 }
        L_0x0053:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00b7 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00b7 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b7 }
            goto L_0x006e
        L_0x006c:
            java.lang.String r3 = ""
        L_0x006e:
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x007b
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b7 }
            goto L_0x007d
        L_0x007b:
            java.lang.String r2 = ""
        L_0x007d:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x00b7 }
            java.util.HashSet<java.lang.String> r5 = r6.f20143i     // Catch:{ all -> 0x00b7 }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.et3 r4 = com.google.android.gms.internal.ads.ft3.m32249E()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.eo3 r3 = com.google.android.gms.internal.ads.eo3.m31875N(r3)     // Catch:{ all -> 0x00b7 }
            r4.mo31666y(r3)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.eo3 r2 = com.google.android.gms.internal.ads.eo3.m31875N(r2)     // Catch:{ all -> 0x00b7 }
            r4.mo31665B(r2)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.kp3 r2 = r4.mo32424p()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.ft3 r2 = (com.google.android.gms.internal.ads.ft3) r2     // Catch:{ all -> 0x00b7 }
            r9.mo32288y(r2)     // Catch:{ all -> 0x00b7 }
            goto L_0x0053
        L_0x00a7:
            com.google.android.gms.internal.ads.kp3 r8 = r9.mo32424p()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.jt3 r8 = (com.google.android.gms.internal.ads.jt3) r8     // Catch:{ all -> 0x00b7 }
            r1.mo35494C(r8)     // Catch:{ all -> 0x00b7 }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.vt3> r8 = r6.f20136b     // Catch:{ all -> 0x00b7 }
            r8.put(r7, r1)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x00b7:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            goto L_0x00bb
        L_0x00ba:
            throw r7
        L_0x00bb:
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bl0.mo18141a(java.lang.String, java.util.Map, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC, Splitter:B:20:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18142b(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcgc r0 = r7.f20141g
            boolean r0 = r0.f43030d
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r7.f20144j
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            com.google.android.gms.ads.internal.zzt.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x0014
            goto L_0x006d
        L_0x0014:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch:{ RuntimeException -> 0x002d }
            r8.setDrawingCacheEnabled(r0)     // Catch:{ RuntimeException -> 0x002d }
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch:{ RuntimeException -> 0x002d }
            if (r3 == 0) goto L_0x0026
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch:{ RuntimeException -> 0x002d }
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r8.setDrawingCacheEnabled(r2)     // Catch:{ RuntimeException -> 0x002b }
            goto L_0x0034
        L_0x002b:
            r2 = move-exception
            goto L_0x002f
        L_0x002d:
            r2 = move-exception
            r3 = r1
        L_0x002f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.co0.zzh(r4, r2)
        L_0x0034:
            if (r3 != 0) goto L_0x006c
            int r2 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r3 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            if (r2 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x0043
            goto L_0x005f
        L_0x0043:
            int r4 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r5 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x0065 }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0065 }
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch:{ RuntimeException -> 0x0065 }
            r8.draw(r5)     // Catch:{ RuntimeException -> 0x0065 }
            r1 = r4
            goto L_0x006d
        L_0x005f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.co0.zzj(r8)     // Catch:{ RuntimeException -> 0x0065 }
            goto L_0x006d
        L_0x0065:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.co0.zzh(r2, r8)
            goto L_0x006d
        L_0x006c:
            r1 = r3
        L_0x006d:
            if (r1 != 0) goto L_0x0075
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.gl0.m32580a(r8)
            return
        L_0x0075:
            r7.f20144j = r0
            com.google.android.gms.internal.ads.yk0 r8 = new com.google.android.gms.internal.ads.yk0
            r8.<init>(r7, r1)
            com.google.android.gms.ads.internal.util.zzt.zzm(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bl0.mo18142b(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo18143c(Map map) throws Exception {
        mb3<O> m;
        vt3 vt3;
        String str;
        if (map != null) {
            try {
                for (String str2 : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str2)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f20142h) {
                            int length = optJSONArray.length();
                            synchronized (this.f20142h) {
                                vt3 = this.f20136b.get(str2);
                            }
                            if (vt3 == null) {
                                String valueOf = String.valueOf(str2);
                                if (valueOf.length() != 0) {
                                    str = "Cannot find the corresponding resource object for ".concat(valueOf);
                                } else {
                                    str = new String("Cannot find the corresponding resource object for ");
                                }
                                gl0.m32580a(str);
                            } else {
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    vt3.mo35497y(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                boolean z2 = this.f20140f;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f20140f = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (l20.f34801b.mo34648e().booleanValue()) {
                    co0.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return bb3.m30648h(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f20140f) {
            synchronized (this.f20142h) {
                this.f20135a.mo30502R(10);
            }
        }
        boolean z3 = this.f20140f;
        if ((!z3 || !this.f20141g.f43034h) && ((!this.f20145k || !this.f20141g.f43033g) && (z3 || !this.f20141g.f43031e))) {
            return bb3.m30649i(null);
        }
        synchronized (this.f20142h) {
            for (vt3 p : this.f20136b.values()) {
                this.f20135a.mo30491C((wt3) p.mo32424p());
            }
            this.f20135a.mo30503y(this.f20137c);
            this.f20135a.mo30490B(this.f20138d);
            if (gl0.m32581b()) {
                String P = this.f20135a.mo30500P();
                String O = this.f20135a.mo30499O();
                StringBuilder sb = new StringBuilder(String.valueOf(P).length() + 53 + String.valueOf(O).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(P);
                sb.append("\n  clickUrl: ");
                sb.append(O);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (wt3 next : this.f20135a.mo30501Q()) {
                    sb2.append("    [");
                    sb2.append(next.mo35685E());
                    sb2.append("] ");
                    sb2.append(next.mo35686I());
                }
                gl0.m32580a(sb2.toString());
            }
            byte[] g = ((zt3) this.f20135a.mo32424p()).mo33365g();
            mb3<String> zzb = new zzbs(this.f20139e).zzb(1, this.f20141g.f43029c, (Map<String, String>) null, g);
            if (gl0.m32581b()) {
                zzb.zzc(zk0.f42490b, po0.f37722a);
            }
            m = bb3.m30653m(zzb, wk0.f40814a, po0.f37727f);
        }
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo18144e(Bitmap bitmap) {
        bo3 J = eo3.m31871J();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, J);
        synchronized (this.f20142h) {
            at3 at3 = this.f20135a;
            ot3 E = qt3.m36738E();
            E.mo34009y(J.mo30750d());
            E.mo34007B("image/png");
            E.mo34008C(2);
            at3.mo30497M((qt3) E.mo32424p());
        }
    }

    /* renamed from: w */
    public final void mo18145w(String str) {
        synchronized (this.f20142h) {
            if (str == null) {
                this.f20135a.mo30492H();
            } else {
                this.f20135a.mo30493I(str);
            }
        }
    }

    public final zzcgc zza() {
        return this.f20141g;
    }

    public final void zze() {
        synchronized (this.f20142h) {
            this.f20136b.keySet();
            mb3 i = bb3.m30649i(Collections.emptyMap());
            xk0 xk0 = new xk0(this);
            nb3 nb3 = po0.f37727f;
            mb3 n = bb3.m30654n(i, xk0, nb3);
            mb3 o = bb3.m30655o(n, 10, TimeUnit.SECONDS, po0.f37725d);
            bb3.m30658r(n, new al0(this, o), nb3);
            f20133m.add(o);
        }
    }

    public final boolean zzi() {
        return C6492o.m28283f() && this.f20141g.f43030d && !this.f20144j;
    }
}
