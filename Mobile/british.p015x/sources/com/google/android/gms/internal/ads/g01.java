package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.C4604n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g01 extends C7810ix {

    /* renamed from: b */
    private final Context f32069b;

    /* renamed from: c */
    private final zzcjf f32070c;

    /* renamed from: d */
    private final it1 f32071d;

    /* renamed from: e */
    private final t42<rs2, q62> f32072e;

    /* renamed from: f */
    private final ya2 f32073f;

    /* renamed from: g */
    private final tx1 f32074g;

    /* renamed from: h */
    private final km0 f32075h;

    /* renamed from: i */
    private final ot1 f32076i;

    /* renamed from: j */
    private final ly1 f32077j;

    /* renamed from: k */
    private final x20 f32078k;
    @GuardedBy("this")

    /* renamed from: l */
    private boolean f32079l = false;

    g01(Context context, zzcjf zzcjf, it1 it1, t42<rs2, q62> t42, ya2 ya2, tx1 tx1, km0 km0, ot1 ot1, ly1 ly1, x20 x20) {
        this.f32069b = context;
        this.f32070c = zzcjf;
        this.f32071d = it1;
        this.f32072e = t42;
        this.f32073f = ya2;
        this.f32074g = tx1;
        this.f32075h = km0;
        this.f32076i = ot1;
        this.f32077j = ly1;
        this.f32078k = x20;
    }

    /* renamed from: M3 */
    public final void mo31973M3(String str, C10487a aVar) {
        String str2;
        f01 f01;
        p00.m35913c(this.f32069b);
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36858D2)).booleanValue()) {
            zzt.zzp();
            str2 = com.google.android.gms.ads.internal.util.zzt.zzv(this.f32069b);
        } else {
            str2 = "";
        }
        boolean z = true;
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean booleanValue = ((Boolean) C8311wv.m39277c().mo18570b(p00.f36834A2)).booleanValue();
            h00 h00 = p00.f36864E0;
            boolean booleanValue2 = booleanValue | ((Boolean) C8311wv.m39277c().mo18570b(h00)).booleanValue();
            if (((Boolean) C8311wv.m39277c().mo18570b(h00)).booleanValue()) {
                f01 = new f01(this, (Runnable) C10489b.m48194f3(aVar));
            } else {
                z = booleanValue2;
                f01 = null;
            }
            if (z) {
                zzt.zza().zza(this.f32069b, this.f32070c, str, f01);
            }
        }
    }

    /* renamed from: R1 */
    public final void mo31974R1(C10487a aVar, String str) {
        if (aVar == null) {
            co0.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) C10489b.m48194f3(aVar);
        if (context == null) {
            co0.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzaw zzaw = new zzaw(context);
        zzaw.zzn(str);
        zzaw.zzo(this.f32070c.f43036b);
        zzaw.zzr();
    }

    /* renamed from: a0 */
    public final synchronized void mo31975a0(boolean z) {
        zzt.zzr().zzc(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        return;
     */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31976c0(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.Context r0 = r4.f32069b     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.p00.m35913c(r0)     // Catch:{ all -> 0x002e }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p00.f36834A2     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r1.mo18570b(r0)     // Catch:{ all -> 0x002e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002c
            com.google.android.gms.ads.internal.zze r0 = com.google.android.gms.ads.internal.zzt.zza()     // Catch:{ all -> 0x002e }
            android.content.Context r1 = r4.f32069b     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.zzcjf r2 = r4.f32070c     // Catch:{ all -> 0x002e }
            r3 = 0
            r0.zza(r1, r2, r5, r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r4)
            return
        L_0x002c:
            monitor-exit(r4)
            return
        L_0x002e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g01.mo31976c0(java.lang.String):void");
    }

    /* renamed from: c2 */
    public final void mo31977c2(e90 e90) throws RemoteException {
        this.f32074g.mo35066r(e90);
    }

    /* renamed from: g5 */
    public final void mo31978g5(C4627vx vxVar) throws RemoteException {
        this.f32077j.mo33427g(vxVar, ky1.API);
    }

    /* renamed from: j5 */
    public final void mo31979j5(tc0 tc0) throws RemoteException {
        this.f32071d.mo32765c(tc0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n6 */
    public final void mo31980n6(Runnable runnable) {
        C4604n.m20093f("Adapters must be initialized on the main thread.");
        Map<String, oc0> e = zzt.zzo().mo18583h().zzg().mo32723e();
        if (!e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    co0.zzk("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.f32071d.mo32766d()) {
                HashMap hashMap = new HashMap();
                for (oc0 oc0 : e.values()) {
                    for (nc0 next : oc0.f36372a) {
                        String str = next.f20571k;
                        for (String next2 : next.f20563c) {
                            if (!hashMap.containsKey(next2)) {
                                hashMap.put(next2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(next2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    try {
                        u42<rs2, q62> a = this.f32072e.mo32361a(str2, jSONObject);
                        if (a != null) {
                            rs2 rs2 = (rs2) a.f39763b;
                            if (!rs2.mo34597a() && rs2.mo34596C()) {
                                rs2.mo34609m(this.f32069b, (q62) a.f39764c, (List) entry.getValue());
                                String valueOf = String.valueOf(str2);
                                co0.zze(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                            }
                        }
                    } catch (gs2 e2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str2);
                        sb.append("\"");
                        co0.zzk(sb.toString(), e2);
                    }
                }
            }
        }
    }

    /* renamed from: t0 */
    public final void mo31981t0(zzbkk zzbkk) throws RemoteException {
        this.f32075h.mo18497v(this.f32069b, zzbkk);
    }

    /* renamed from: w */
    public final void mo31982w(String str) {
        this.f32073f.mo35905f(str);
    }

    /* renamed from: w5 */
    public final synchronized void mo31983w5(float f) {
        zzt.zzr().zzd(f);
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        if (zzt.zzo().mo18583h().zzK()) {
            if (!zzt.zzs().zzj(this.f32069b, zzt.zzo().mo18583h().zzk(), this.f32070c.f43036b)) {
                zzt.zzo().mo18583h().zzz(false);
                zzt.zzo().mo18583h().zzy("");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.f32078k.mo35709a(new ei0());
    }

    public final synchronized float zze() {
        return zzt.zzr().zza();
    }

    public final String zzf() {
        return this.f32070c.f43036b;
    }

    public final List<zzbtn> zzg() throws RemoteException {
        return this.f32074g.mo35058f();
    }

    public final void zzi() {
        this.f32074g.mo35059k();
    }

    public final synchronized void zzj() {
        if (this.f32079l) {
            co0.zzj("Mobile ads is initialized already.");
            return;
        }
        p00.m35913c(this.f32069b);
        zzt.zzo().mo18590q(this.f32069b, this.f32070c);
        zzt.zzc().mo34377i(this.f32069b);
        this.f32079l = true;
        this.f32074g.mo35065q();
        this.f32073f.mo35903d();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36842B2)).booleanValue()) {
            this.f32076i.mo18608c();
        }
        this.f32077j.mo33426f();
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36958P6)).booleanValue()) {
            po0.f37722a.execute(new c01(this));
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37200r7)).booleanValue()) {
            po0.f37722a.execute(new d01(this));
        }
    }

    public final synchronized boolean zzt() {
        return zzt.zzr().zze();
    }
}
