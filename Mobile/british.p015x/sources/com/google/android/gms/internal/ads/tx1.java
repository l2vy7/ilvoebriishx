package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tx1 {

    /* renamed from: a */
    private boolean f39562a = false;

    /* renamed from: b */
    private boolean f39563b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f39564c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final long f39565d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final uo0<Boolean> f39566e = new uo0<>();

    /* renamed from: f */
    private final Context f39567f;

    /* renamed from: g */
    private final WeakReference<Context> f39568g;

    /* renamed from: h */
    private final it1 f39569h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Executor f39570i;

    /* renamed from: j */
    private final Executor f39571j;

    /* renamed from: k */
    private final ScheduledExecutorService f39572k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final xv1 f39573l;

    /* renamed from: m */
    private final zzcjf f39574m;

    /* renamed from: n */
    private final Map<String, zzbtn> f39575n = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final kh1 f39576o;

    /* renamed from: p */
    private boolean f39577p = true;

    public tx1(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, it1 it1, ScheduledExecutorService scheduledExecutorService, xv1 xv1, zzcjf zzcjf, kh1 kh1) {
        this.f39569h = it1;
        this.f39567f = context;
        this.f39568g = weakReference;
        this.f39570i = executor2;
        this.f39572k = scheduledExecutorService;
        this.f39571j = executor;
        this.f39573l = xv1;
        this.f39574m = zzcjf;
        this.f39576o = kh1;
        this.f39565d = zzt.zzA().elapsedRealtime();
        m38055u("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* renamed from: i */
    static /* bridge */ /* synthetic */ void m38052i(tx1 tx1, String str) {
        tx1 tx12 = tx1;
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = new Object();
                uo0 uo0 = new uo0();
                mb3 o = bb3.m30655o(uo0, ((Long) C8311wv.m39277c().mo18570b(p00.f37176p1)).longValue(), TimeUnit.SECONDS, tx12.f39572k);
                tx12.f39573l.mo35810b(next);
                tx12.f39576o.mo33087a(next);
                long elapsedRealtime = zzt.zzA().elapsedRealtime();
                Iterator<String> it = keys;
                nx1 nx1 = r1;
                nx1 nx12 = new nx1(tx1, obj, uo0, next, elapsedRealtime);
                o.zzc(nx1, tx12.f39570i);
                arrayList.add(o);
                sx1 sx1 = new sx1(tx1, obj, next, elapsedRealtime, uo0);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new zzbtx(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                tx12.m38055u(next, false, "", 0);
                try {
                    tx12.f39571j.execute(new mx1(tx1, tx12.f39569h.mo32764b(next, new JSONObject()), sx1, arrayList2, next));
                } catch (gs2 unused2) {
                    try {
                        sx1.mo30639b("Failed to create Adapter.");
                    } catch (RemoteException e) {
                        co0.zzh("", e);
                    }
                }
                keys = it;
            }
            bb3.m30641a(arrayList).mo30342a(new ox1(tx12), tx12.f39570i);
        } catch (JSONException e2) {
            zze.zzb("Malformed CLD response", e2);
        }
    }

    /* renamed from: t */
    private final synchronized mb3<String> m38054t() {
        String c = zzt.zzo().mo18583h().zzg().mo32721c();
        if (!TextUtils.isEmpty(c)) {
            return bb3.m30649i(c);
        }
        uo0 uo0 = new uo0();
        zzt.zzo().mo18583h().zzo(new lx1(this, uo0));
        return uo0;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m38055u(String str, boolean z, String str2, int i) {
        this.f39575n.put(str, new zzbtn(str, z, i, str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ Object mo35057e() throws Exception {
        this.f39566e.zzd(Boolean.TRUE);
        return null;
    }

    /* renamed from: f */
    public final List<zzbtn> mo35058f() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f39575n.keySet()) {
            zzbtn zzbtn = this.f39575n.get(next);
            arrayList.add(new zzbtn(next, zzbtn.f43013c, zzbtn.f43014d, zzbtn.f43015e));
        }
        return arrayList;
    }

    /* renamed from: k */
    public final void mo35059k() {
        this.f39577p = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo35060l() {
        synchronized (this) {
            if (!this.f39564c) {
                m38055u("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzt.zzA().elapsedRealtime() - this.f39565d));
                this.f39566e.zze(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        com.google.android.gms.internal.ads.co0.zzh("", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 74);
        r4.append("Failed to initialize adapter. ");
        r4.append(r5);
        r4.append(" does not implement the initialize() method.");
        r3.mo30639b(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo35061m(com.google.android.gms.internal.ads.rs2 r2, com.google.android.gms.internal.ads.b90 r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.f39568g     // Catch:{ gs2 -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ gs2 -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ gs2 -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.f39567f     // Catch:{ gs2 -> 0x0011 }
        L_0x000d:
            r2.mo34608l(r0, r3, r4)     // Catch:{ gs2 -> 0x0011 }
            return
        L_0x0011:
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2.length()     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2 + 74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0035 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = "Failed to initialize adapter. "
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            r4.append(r5)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = " does not implement the initialize() method."
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = r4.toString()     // Catch:{ RemoteException -> 0x0035 }
            r3.mo30639b(r2)     // Catch:{ RemoteException -> 0x0035 }
            return
        L_0x0035:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.co0.zzh(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tx1.mo35061m(com.google.android.gms.internal.ads.rs2, com.google.android.gms.internal.ads.b90, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo35062n(uo0 uo0) {
        this.f39570i.execute(new kx1(this, uo0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo35063o() {
        this.f39573l.mo35812d();
        this.f39576o.zzd();
        this.f39563b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo35064p(Object obj, uo0 uo0, String str, long j) {
        synchronized (obj) {
            if (!uo0.isDone()) {
                m38055u(str, false, "Timeout.", (int) (zzt.zzA().elapsedRealtime() - j));
                this.f39573l.mo35809a(str, "timeout");
                this.f39576o.mo33088c(str, "timeout");
                uo0.zzd(Boolean.FALSE);
            }
        }
    }

    /* renamed from: q */
    public final void mo35065q() {
        if (!j20.f33712a.mo34648e().booleanValue()) {
            if (this.f39574m.f43038d >= ((Integer) C8311wv.m39277c().mo18570b(p00.f37167o1)).intValue() && this.f39577p) {
                if (!this.f39562a) {
                    synchronized (this) {
                        if (!this.f39562a) {
                            this.f39573l.mo35813e();
                            this.f39576o.zze();
                            this.f39566e.zzc(new ix1(this), this.f39570i);
                            this.f39562a = true;
                            mb3<String> t = m38054t();
                            this.f39572k.schedule(new hx1(this), ((Long) C8311wv.m39277c().mo18570b(p00.f37185q1)).longValue(), TimeUnit.SECONDS);
                            bb3.m30658r(t, new qx1(this), this.f39570i);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.f39562a) {
            m38055u("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.f39566e.zzd(Boolean.FALSE);
            this.f39562a = true;
            this.f39563b = true;
        }
    }

    /* renamed from: r */
    public final void mo35066r(e90 e90) {
        this.f39566e.zzc(new jx1(this, e90), this.f39571j);
    }

    /* renamed from: s */
    public final boolean mo35067s() {
        return this.f39563b;
    }
}
