package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ly1 implements uy1, wx1 {

    /* renamed from: a */
    private final ty1 f35296a;

    /* renamed from: b */
    private final vy1 f35297b;

    /* renamed from: c */
    private final xx1 f35298c;

    /* renamed from: d */
    private final gy1 f35299d;

    /* renamed from: e */
    private final vx1 f35300e;

    /* renamed from: f */
    private final String f35301f;

    /* renamed from: g */
    private final Map<String, List<zx1>> f35302g;

    /* renamed from: h */
    private String f35303h = "{}";

    /* renamed from: i */
    private String f35304i = "";

    /* renamed from: j */
    private long f35305j = Long.MAX_VALUE;

    /* renamed from: k */
    private hy1 f35306k = hy1.NONE;

    /* renamed from: l */
    private boolean f35307l;

    /* renamed from: m */
    private int f35308m;

    /* renamed from: n */
    private boolean f35309n;

    /* renamed from: o */
    private ky1 f35310o = ky1.UNKNOWN;

    ly1(ty1 ty1, vy1 vy1, xx1 xx1, Context context, zzcjf zzcjf, gy1 gy1) {
        this.f35296a = ty1;
        this.f35297b = vy1;
        this.f35298c = xx1;
        this.f35302g = new HashMap();
        this.f35300e = new vx1(context);
        this.f35301f = zzcjf.f43036b;
        this.f35299d = gy1;
        zzt.zzs().zzg(this);
    }

    /* renamed from: o */
    private final synchronized JSONObject m34585o() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry next : this.f35302g.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zx1 zx1 : (List) next.getValue()) {
                if (zx1.mo36143b()) {
                    jSONArray.put(zx1.mo36142a());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) next.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    /* renamed from: p */
    private final void m34586p() {
        this.f35309n = true;
        this.f35299d.mo32306c();
        this.f35296a.mo35069a(this);
        this.f35297b.mo18918c(this);
        this.f35298c.mo18971c(this);
        m34592v(zzt.zzo().mo18583h().zzm());
    }

    /* renamed from: q */
    private final void m34587q() {
        zzt.zzo().mo18583h().zzC(mo33423c());
    }

    /* renamed from: r */
    private final synchronized void m34588r(hy1 hy1, boolean z) {
        if (this.f35306k != hy1) {
            if (mo33433m()) {
                m34590t();
            }
            this.f35306k = hy1;
            if (mo33433m()) {
                m34591u();
            }
            if (z) {
                m34587q();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m34589s(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f35307l     // Catch:{ all -> 0x003d }
            if (r0 != r2) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r1.f35307l = r2     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.p00.f36958P6     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.ads.n00 r0 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x003d }
            java.lang.Object r2 = r0.mo18570b(r2)     // Catch:{ all -> 0x003d }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x003d }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0027
            com.google.android.gms.ads.internal.util.zzba r2 = com.google.android.gms.ads.internal.zzt.zzs()     // Catch:{ all -> 0x003d }
            boolean r2 = r2.zzl()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x002b
        L_0x0027:
            r1.m34591u()     // Catch:{ all -> 0x003d }
            goto L_0x0034
        L_0x002b:
            boolean r2 = r1.mo33433m()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x0034
            r1.m34590t()     // Catch:{ all -> 0x003d }
        L_0x0034:
            if (r3 == 0) goto L_0x003b
            r1.m34587q()     // Catch:{ all -> 0x003d }
            monitor-exit(r1)
            return
        L_0x003b:
            monitor-exit(r1)
            return
        L_0x003d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ly1.m34589s(boolean, boolean):void");
    }

    /* renamed from: t */
    private final synchronized void m34590t() {
        hy1 hy1 = hy1.NONE;
        int ordinal = this.f35306k.ordinal();
        if (ordinal == 1) {
            this.f35297b.mo18916a();
        } else if (ordinal == 2) {
            this.f35298c.mo18969a();
        }
    }

    /* renamed from: u */
    private final synchronized void m34591u() {
        hy1 hy1 = hy1.NONE;
        int ordinal = this.f35306k.ordinal();
        if (ordinal == 1) {
            this.f35297b.mo18917b();
        } else if (ordinal == 2) {
            this.f35298c.mo18970b();
        }
    }

    /* renamed from: v */
    private final synchronized void m34592v(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                m34589s(jSONObject.optBoolean("isTestMode", false), false);
                m34588r(hy1.m32986a(jSONObject.optString("gesture", "NONE")), false);
                this.f35303h = jSONObject.optString("networkExtras", "{}");
                this.f35305j = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final hy1 mo33421a() {
        return this.f35306k;
    }

    /* renamed from: b */
    public final synchronized String mo33422b() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36838A6)).booleanValue()) {
            if (mo33433m()) {
                if (this.f35305j < zzt.zzA().currentTimeMillis() / 1000) {
                    this.f35303h = "{}";
                    this.f35305j = Long.MAX_VALUE;
                    return "";
                } else if (this.f35303h.equals("{}")) {
                    return "";
                } else {
                    return this.f35303h;
                }
            }
        }
        return "";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|(1:7)|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0033 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo33423c() {
        /*
            r7 = this;
            monitor-enter(r7)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0039 }
            r0.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "isTestMode"
            boolean r2 = r7.f35307l     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "gesture"
            com.google.android.gms.internal.ads.hy1 r2 = r7.f35306k     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            long r1 = r7.f35305j     // Catch:{ JSONException -> 0x0033 }
            a5.e r3 = com.google.android.gms.ads.internal.zzt.zzA()     // Catch:{ JSONException -> 0x0033 }
            long r3 = r3.currentTimeMillis()     // Catch:{ JSONException -> 0x0033 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            java.lang.String r1 = "networkExtras"
            java.lang.String r2 = r7.f35303h     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "networkExtrasExpirationSecs"
            long r2 = r7.f35305j     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
        L_0x0033:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0039 }
            monitor-exit(r7)
            return r0
        L_0x0039:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ly1.mo33423c():java.lang.String");
    }

    /* renamed from: d */
    public final synchronized JSONObject mo33424d() {
        JSONObject jSONObject;
        String str;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("internalSdkVersion", this.f35301f);
            jSONObject.put("adapters", this.f35299d.mo32305a());
            if (this.f35305j < zzt.zzA().currentTimeMillis() / 1000) {
                this.f35303h = "{}";
            }
            jSONObject.put("networkExtras", this.f35303h);
            jSONObject.put("adSlots", m34585o());
            jSONObject.put("appInfo", this.f35300e.mo35510a());
            String c = zzt.zzo().mo18583h().zzg().mo32721c();
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("cld", new JSONObject(c));
            }
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36966Q6)).booleanValue() && !TextUtils.isEmpty(this.f35304i)) {
                String valueOf = String.valueOf(this.f35304i);
                if (valueOf.length() != 0) {
                    str = "Policy violation data: ".concat(valueOf);
                } else {
                    str = new String("Policy violation data: ");
                }
                co0.zze(str);
                jSONObject.put("policyViolations", new JSONObject(this.f35304i));
            }
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36958P6)).booleanValue()) {
                jSONObject.put("openAction", this.f35310o);
                jSONObject.put("gesture", this.f35306k);
            }
        } catch (JSONException e) {
            zzt.zzo().mo18591r(e, "Inspector.toJson");
            co0.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33425e(java.lang.String r4, com.google.android.gms.internal.ads.zx1 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f36838A6     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r1.mo18570b(r0)     // Catch:{ all -> 0x005c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x005a
            boolean r0 = r3.mo33433m()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x001a
            goto L_0x005a
        L_0x001a:
            int r0 = r3.f35308m     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.h00<java.lang.Integer> r1 = com.google.android.gms.internal.ads.p00.f36854C6     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r2.mo18570b(r1)     // Catch:{ all -> 0x005c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x005c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x005c }
            if (r0 < r1) goto L_0x0035
            java.lang.String r4 = "Maximum number of ad requests stored reached. Dropping the current request."
            com.google.android.gms.internal.ads.co0.zzj(r4)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x0035:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zx1>> r0 = r3.f35302g     // Catch:{ all -> 0x005c }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zx1>> r0 = r3.f35302g     // Catch:{ all -> 0x005c }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            r1.<init>()     // Catch:{ all -> 0x005c }
            r0.put(r4, r1)     // Catch:{ all -> 0x005c }
        L_0x0047:
            int r0 = r3.f35308m     // Catch:{ all -> 0x005c }
            int r0 = r0 + 1
            r3.f35308m = r0     // Catch:{ all -> 0x005c }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zx1>> r0 = r3.f35302g     // Catch:{ all -> 0x005c }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x005c }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x005c }
            r4.add(r5)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x005a:
            monitor-exit(r3)
            return
        L_0x005c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ly1.mo33425e(java.lang.String, com.google.android.gms.internal.ads.zx1):void");
    }

    /* renamed from: f */
    public final void mo33426f() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36838A6)).booleanValue()) {
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36958P6)).booleanValue() || !zzt.zzo().mo18583h().zzK()) {
                String zzm = zzt.zzo().mo18583h().zzm();
                if (!TextUtils.isEmpty(zzm)) {
                    try {
                        if (new JSONObject(zzm).optBoolean("isTestMode", false)) {
                            m34586p();
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else {
                m34586p();
            }
        }
    }

    /* renamed from: g */
    public final synchronized void mo33427g(C4627vx vxVar, ky1 ky1) {
        if (!mo33433m()) {
            try {
                vxVar.zze(us2.m38446d(18, (String) null, (zzbew) null));
            } catch (RemoteException unused) {
                co0.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
            }
        } else {
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36838A6)).booleanValue()) {
                try {
                    vxVar.zze(us2.m38446d(1, (String) null, (zzbew) null));
                } catch (RemoteException unused2) {
                    co0.zzj("Ad inspector had an internal error.");
                }
            } else {
                this.f35310o = ky1;
                this.f35296a.mo35071c(vxVar, new f70(this));
            }
        }
    }

    /* renamed from: h */
    public final synchronized void mo33428h(String str, long j) {
        this.f35303h = str;
        this.f35305j = j;
        m34587q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r2 != false) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33429i(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f35309n
            if (r0 != 0) goto L_0x000a
            if (r2 == 0) goto L_0x0015
            r1.m34586p()
            goto L_0x000c
        L_0x000a:
            if (r2 == 0) goto L_0x0015
        L_0x000c:
            boolean r2 = r1.f35307l
            if (r2 == 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            r1.m34591u()
            return
        L_0x0015:
            boolean r2 = r1.mo33433m()
            if (r2 != 0) goto L_0x001e
            r1.m34590t()
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ly1.mo33429i(boolean):void");
    }

    /* renamed from: j */
    public final void mo33430j(hy1 hy1) {
        m34588r(hy1, true);
    }

    /* renamed from: k */
    public final synchronized void mo33431k(String str) {
        this.f35304i = str;
    }

    /* renamed from: l */
    public final void mo33432l(boolean z) {
        if (!this.f35309n && z) {
            m34586p();
        }
        m34589s(z, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return r2.f35307l || com.google.android.gms.ads.internal.zzt.zzs().zzl();
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo33433m() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f36958P6     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r1.mo18570b(r0)     // Catch:{ all -> 0x002b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0027
            boolean r0 = r2.f35307l     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0025
            com.google.android.gms.ads.internal.util.zzba r0 = com.google.android.gms.ads.internal.zzt.zzs()     // Catch:{ all -> 0x002b }
            boolean r0 = r0.zzl()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            r0 = 0
        L_0x0023:
            monitor-exit(r2)
            return r0
        L_0x0025:
            r0 = 1
            goto L_0x0023
        L_0x0027:
            boolean r0 = r2.f35307l     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return r0
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x002f
        L_0x002e:
            throw r0
        L_0x002f:
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ly1.mo33433m():boolean");
    }

    /* renamed from: n */
    public final synchronized boolean mo33434n() {
        return this.f35307l;
    }
}
