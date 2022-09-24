package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
import p199d5.C10487a;
import p199d5.C10489b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class go1 implements qm1 {

    /* renamed from: a */
    private final id0 f20361a;

    /* renamed from: b */
    private final fb1 f20362b;

    /* renamed from: c */
    private final ka1 f20363c;

    /* renamed from: d */
    private final ei1 f20364d;

    /* renamed from: e */
    private final Context f20365e;

    /* renamed from: f */
    private final ir2 f20366f;

    /* renamed from: g */
    private final zzcjf f20367g;

    /* renamed from: h */
    private final bs2 f20368h;

    /* renamed from: i */
    private boolean f20369i = false;

    /* renamed from: j */
    private boolean f20370j = false;

    /* renamed from: k */
    private boolean f20371k = true;

    /* renamed from: l */
    private final ed0 f20372l;

    /* renamed from: m */
    private final fd0 f20373m;

    public go1(ed0 ed0, fd0 fd0, id0 id0, fb1 fb1, ka1 ka1, ei1 ei1, Context context, ir2 ir2, zzcjf zzcjf, bs2 bs2, byte[] bArr) {
        this.f20372l = ed0;
        this.f20373m = fd0;
        this.f20361a = id0;
        this.f20362b = fb1;
        this.f20363c = ka1;
        this.f20364d = ei1;
        this.f20365e = context;
        this.f20366f = ir2;
        this.f20367g = zzcjf;
        this.f20368h = bs2;
    }

    /* renamed from: q */
    private final void m20499q(View view) {
        try {
            id0 id0 = this.f20361a;
            if (id0 == null || id0.zzA()) {
                ed0 ed0 = this.f20372l;
                if (ed0 == null || ed0.mo31531v6()) {
                    fd0 fd0 = this.f20373m;
                    if (fd0 != null && !fd0.mo31812w6()) {
                        this.f20373m.mo31808s6(C10489b.m48195m6(view));
                        this.f20363c.onAdClicked();
                        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37155m7)).booleanValue()) {
                            this.f20364d.zzq();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f20372l.mo31528s6(C10489b.m48195m6(view));
                this.f20363c.onAdClicked();
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37155m7)).booleanValue()) {
                    this.f20364d.zzq();
                    return;
                }
                return;
            }
            this.f20361a.mo31203J5(C10489b.m48195m6(view));
            this.f20363c.onAdClicked();
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37155m7)).booleanValue()) {
                this.f20364d.zzq();
            }
        } catch (RemoteException e) {
            co0.zzk("Failed to call handleClick", e);
        }
    }

    /* renamed from: r */
    private static final HashMap<String, View> m20500r(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view = (View) ((WeakReference) next.getValue()).get();
                if (view != null) {
                    hashMap.put((String) next.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: T */
    public final void mo18359T(Bundle bundle) {
    }

    /* renamed from: a */
    public final JSONObject mo18360a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    /* renamed from: b */
    public final void mo18361b(View view, MotionEvent motionEvent, View view2) {
    }

    /* renamed from: c */
    public final void mo18362c(String str) {
    }

    /* renamed from: d */
    public final void mo18363d(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f20370j || !this.f20366f.f33446I) {
            m20499q(view);
        }
    }

    /* renamed from: e */
    public final void mo18364e(View view) {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18365f(android.view.View r9, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r10, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            r8 = this;
            d5.a r9 = p199d5.C10489b.m48195m6(r9)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.ir2 r12 = r8.f20366f     // Catch:{ RemoteException -> 0x0124 }
            org.json.JSONObject r12 = r12.f33479h0     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r13 = com.google.android.gms.internal.ads.p00.f37104h1     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.n00 r0 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Object r13 = r0.mo18570b(r13)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ RemoteException -> 0x0124 }
            boolean r13 = r13.booleanValue()     // Catch:{ RemoteException -> 0x0124 }
            r0 = 1
            r1 = 0
            if (r13 == 0) goto L_0x00e0
            int r13 = r12.length()     // Catch:{ RemoteException -> 0x0124 }
            if (r13 != 0) goto L_0x0024
            goto L_0x00e0
        L_0x0024:
            if (r10 != 0) goto L_0x002c
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r13.<init>()     // Catch:{ RemoteException -> 0x0124 }
            goto L_0x002d
        L_0x002c:
            r13 = r10
        L_0x002d:
            if (r11 != 0) goto L_0x0035
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0124 }
            goto L_0x0036
        L_0x0035:
            r2 = r11
        L_0x0036:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0124 }
            r3.putAll(r13)     // Catch:{ RemoteException -> 0x0124 }
            r3.putAll(r2)     // Catch:{ RemoteException -> 0x0124 }
            java.util.Iterator r13 = r12.keys()     // Catch:{ RemoteException -> 0x0124 }
        L_0x0045:
            boolean r2 = r13.hasNext()     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r13.next()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ RemoteException -> 0x0124 }
            org.json.JSONArray r4 = r12.optJSONArray(r2)     // Catch:{ RemoteException -> 0x0124 }
            if (r4 == 0) goto L_0x0045
            java.lang.Object r5 = r3.get(r2)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ RemoteException -> 0x0124 }
            if (r5 != 0) goto L_0x0062
        L_0x005f:
            r0 = 0
            goto L_0x00e0
        L_0x0062:
            java.lang.Object r5 = r5.get()     // Catch:{ RemoteException -> 0x0124 }
            if (r5 != 0) goto L_0x0069
            goto L_0x005f
        L_0x0069:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.p00.f37113i1     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.n00 r7 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Object r6 = r7.mo18570b(r6)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ RemoteException -> 0x0124 }
            boolean r6 = r6.booleanValue()     // Catch:{ RemoteException -> 0x0124 }
            if (r6 == 0) goto L_0x00b3
            java.lang.String r6 = "3010"
            boolean r2 = r2.equals(r6)     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00b3
            com.google.android.gms.internal.ads.id0 r2 = r8.f20361a     // Catch:{ RemoteException -> 0x0124 }
            r5 = 0
            if (r2 == 0) goto L_0x0093
            d5.a r2 = r2.zzn()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x0091:
            goto L_0x00ac
        L_0x0093:
            com.google.android.gms.internal.ads.ed0 r2 = r8.f20372l     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x009c
            d5.a r2 = r2.zzk()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x009c:
            com.google.android.gms.internal.ads.fd0 r2 = r8.f20373m     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00a5
            d5.a r2 = r2.mo31806q6()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x00a5:
            r2 = r5
        L_0x00a6:
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r5 = p199d5.C10489b.m48194f3(r2)     // Catch:{  }
        L_0x00ac:
            if (r5 != 0) goto L_0x00af
            goto L_0x005f
        L_0x00af:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0124 }
        L_0x00b3:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0045 }
            r2.<init>()     // Catch:{ JSONException -> 0x0045 }
            com.google.android.gms.ads.internal.util.zzby.zzc(r4, r2)     // Catch:{ JSONException -> 0x0045 }
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch:{ JSONException -> 0x0045 }
            android.content.Context r4 = r8.f20365e     // Catch:{ JSONException -> 0x0045 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ JSONException -> 0x0045 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x0045 }
        L_0x00c8:
            boolean r6 = r2.hasNext()     // Catch:{ JSONException -> 0x0045 }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r2.next()     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0045 }
            java.lang.Class r6 = java.lang.Class.forName(r6, r1, r4)     // Catch:{ all -> 0x00c8 }
            boolean r6 = r6.isAssignableFrom(r5)     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x00c8
            goto L_0x0045
        L_0x00e0:
            r8.f20371k = r0     // Catch:{ RemoteException -> 0x0124 }
            java.util.HashMap r10 = m20500r(r10)     // Catch:{ RemoteException -> 0x0124 }
            java.util.HashMap r11 = m20500r(r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.id0 r12 = r8.f20361a     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x00fa
            d5.a r10 = p199d5.C10489b.m48195m6(r10)     // Catch:{ RemoteException -> 0x0124 }
            d5.a r11 = p199d5.C10489b.m48195m6(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.mo31205m0(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            return
        L_0x00fa:
            com.google.android.gms.internal.ads.ed0 r12 = r8.f20372l     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x010f
            d5.a r10 = p199d5.C10489b.m48195m6(r10)     // Catch:{ RemoteException -> 0x0124 }
            d5.a r11 = p199d5.C10489b.m48195m6(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.mo31530u6(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.ed0 r10 = r8.f20372l     // Catch:{ RemoteException -> 0x0124 }
            r10.mo31529t6(r9)     // Catch:{ RemoteException -> 0x0124 }
            return
        L_0x010f:
            com.google.android.gms.internal.ads.fd0 r12 = r8.f20373m     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x0123
            d5.a r10 = p199d5.C10489b.m48195m6(r10)     // Catch:{ RemoteException -> 0x0124 }
            d5.a r11 = p199d5.C10489b.m48195m6(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.mo31810u6(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.fd0 r10 = r8.f20373m     // Catch:{ RemoteException -> 0x0124 }
            r10.mo31809t6(r9)     // Catch:{ RemoteException -> 0x0124 }
        L_0x0123:
            return
        L_0x0124:
            r9 = move-exception
            java.lang.String r10 = "Failed to call trackView"
            com.google.android.gms.internal.ads.co0.zzk(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.go1.mo18365f(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    /* renamed from: g */
    public final boolean mo18366g(Bundle bundle) {
        return false;
    }

    /* renamed from: h */
    public final void mo18367h(Bundle bundle) {
    }

    /* renamed from: i */
    public final void mo18368i(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.f20369i) {
                this.f20369i = zzt.zzs().zzn(this.f20365e, this.f20367g.f43036b, this.f20366f.f33441D.toString(), this.f20368h.f30089f);
            }
            if (this.f20371k) {
                id0 id0 = this.f20361a;
                if (id0 != null) {
                    if (!id0.zzB()) {
                        this.f20361a.zzx();
                        this.f20362b.zza();
                        return;
                    }
                }
                ed0 ed0 = this.f20372l;
                if (ed0 != null) {
                    if (!ed0.mo31532w6()) {
                        this.f20372l.zzt();
                        this.f20362b.zza();
                        return;
                    }
                }
                fd0 fd0 = this.f20373m;
                if (fd0 != null && !fd0.mo31813x6()) {
                    this.f20373m.zzr();
                    this.f20362b.zza();
                }
            }
        } catch (RemoteException e) {
            co0.zzk("Failed to call recordImpression", e);
        }
    }

    /* renamed from: j */
    public final void mo18369j(C7994nx nxVar) {
        co0.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    /* renamed from: k */
    public final void mo18370k(C8137rx rxVar) {
        co0.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    /* renamed from: l */
    public final void mo18371l(m50 m50) {
    }

    /* renamed from: m */
    public final void mo18372m(View view, Map<String, WeakReference<View>> map) {
        try {
            C10487a m6 = C10489b.m48195m6(view);
            id0 id0 = this.f20361a;
            if (id0 != null) {
                id0.mo31204O3(m6);
                return;
            }
            ed0 ed0 = this.f20372l;
            if (ed0 != null) {
                ed0.mo31522J5(m6);
                return;
            }
            fd0 fd0 = this.f20373m;
            if (fd0 != null) {
                fd0.mo31811v6(m6);
            }
        } catch (RemoteException e) {
            co0.zzk("Failed to call untrackView", e);
        }
    }

    /* renamed from: n */
    public final void mo18373n() {
        this.f20370j = true;
    }

    /* renamed from: o */
    public final void mo18374o(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f20370j) {
            co0.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.f20366f.f33446I) {
            co0.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            m20499q(view);
        }
    }

    /* renamed from: p */
    public final JSONObject mo18375p(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    public final void zzf() {
        throw null;
    }

    public final void zzg() {
    }

    public final void zzh() {
    }

    public final void zzo() {
    }

    public final void zzq() {
    }

    public final boolean zzz() {
        return this.f20366f.f33446I;
    }
}
