package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ty1 implements zzo, kv0 {

    /* renamed from: b */
    private final Context f39687b;

    /* renamed from: c */
    private final zzcjf f39688c;

    /* renamed from: d */
    private ly1 f39689d;

    /* renamed from: e */
    private xt0 f39690e;

    /* renamed from: f */
    private boolean f39691f;

    /* renamed from: g */
    private boolean f39692g;

    /* renamed from: h */
    private long f39693h;

    /* renamed from: i */
    private C4627vx f39694i;

    /* renamed from: j */
    private boolean f39695j;

    ty1(Context context, zzcjf zzcjf) {
        this.f39687b = context;
        this.f39688c = zzcjf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m38077d() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f39691f     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r2.f39692g     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            com.google.android.gms.internal.ads.nb3 r0 = com.google.android.gms.internal.ads.po0.f37726e     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.ads.ry1 r1 = new com.google.android.gms.internal.ads.ry1     // Catch:{ all -> 0x0018 }
            r1.<init>(r2)     // Catch:{ all -> 0x0018 }
            r0.execute(r1)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0016:
            monitor-exit(r2)
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ty1.m38077d():void");
    }

    /* renamed from: e */
    private final synchronized boolean m38078e(C4627vx vxVar) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36838A6)).booleanValue()) {
            co0.zzj("Ad inspector had an internal error.");
            try {
                vxVar.zze(us2.m38446d(16, (String) null, (zzbew) null));
            } catch (RemoteException unused) {
            }
        } else if (this.f39689d == null) {
            co0.zzj("Ad inspector had an internal error.");
            try {
                vxVar.zze(us2.m38446d(16, (String) null, (zzbew) null));
            } catch (RemoteException unused2) {
            }
        } else {
            if (!this.f39691f && !this.f39692g) {
                if (zzt.zzA().currentTimeMillis() >= this.f39693h + ((long) ((Integer) C8311wv.m39277c().mo18570b(p00.f36862D6)).intValue())) {
                    return true;
                }
            }
            co0.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                vxVar.zze(us2.m38446d(19, (String) null, (zzbew) null));
            } catch (RemoteException unused3) {
            }
        }
        return false;
        return false;
        return false;
    }

    /* renamed from: a */
    public final void mo35069a(ly1 ly1) {
        this.f39689d = ly1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo35070b() {
        this.f39690e.mo18325g("window.inspectorInfo", this.f39689d.mo33424d().toString());
    }

    /* renamed from: c */
    public final synchronized void mo35071c(C4627vx vxVar, f70 f70) {
        C4627vx vxVar2 = vxVar;
        synchronized (this) {
            if (m38078e(vxVar)) {
                try {
                    zzt.zzz();
                    xt0 a = ku0.m20660a(this.f39687b, ov0.m35840a(), "", false, false, (C7497ab) null, (p10) null, this.f39688c, (e10) null, (zzl) null, (zza) null, C7728gq.m32636a(), (ir2) null, (lr2) null);
                    this.f39690e = a;
                    mv0 u0 = a.mo18793u0();
                    if (u0 == null) {
                        co0.zzj("Failed to obtain a web view for the ad inspector");
                        try {
                            vxVar2.zze(us2.m38446d(17, "Failed to obtain a web view for the ad inspector", (zzbew) null));
                        } catch (RemoteException unused) {
                        }
                    } else {
                        this.f39694i = vxVar2;
                        u0.mo18249E((C7659eu) null, (d60) null, (zzo) null, (f60) null, (zzw) null, false, (h70) null, (zzb) null, (wf0) null, (hl0) null, (f42) null, (sx2) null, (nv1) null, (nw2) null, f70, (gi1) null);
                        u0.mo18251F0(this);
                        this.f39690e.loadUrl((String) C8311wv.m39277c().mo18570b(p00.f36846B6));
                        zzt.zzj();
                        zzm.zza(this.f39687b, new AdOverlayInfoParcel(this, this.f39690e, 1, this.f39688c), true);
                        this.f39693h = zzt.zzA().currentTimeMillis();
                    }
                } catch (ju0 e) {
                    co0.zzk("Failed to obtain a web view for the ad inspector", e);
                    try {
                        vxVar2.zze(us2.m38446d(17, "Failed to obtain a web view for the ad inspector", (zzbew) null));
                    } catch (RemoteException unused2) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:8|9|10|11|12|(1:14)|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            if (r4 == 0) goto L_0x0010
            java.lang.String r4 = "Ad inspector loaded."
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch:{ all -> 0x002c }
            r3.f39691f = r0     // Catch:{ all -> 0x002c }
            r3.m38077d()     // Catch:{ all -> 0x002c }
            monitor-exit(r3)
            return
        L_0x0010:
            java.lang.String r4 = "Ad inspector failed to load."
            com.google.android.gms.internal.ads.co0.zzj(r4)     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.vx r4 = r3.f39694i     // Catch:{ RemoteException -> 0x0023 }
            if (r4 == 0) goto L_0x0023
            r1 = 17
            r2 = 0
            com.google.android.gms.internal.ads.zzbew r1 = com.google.android.gms.internal.ads.us2.m38446d(r1, r2, r2)     // Catch:{ RemoteException -> 0x0023 }
            r4.zze(r1)     // Catch:{ RemoteException -> 0x0023 }
        L_0x0023:
            r3.f39695j = r0     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.xt0 r4 = r3.f39690e     // Catch:{ all -> 0x002c }
            r4.destroy()     // Catch:{ all -> 0x002c }
            monitor-exit(r3)
            return
        L_0x002c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ty1.zza(boolean):void");
    }

    public final synchronized void zzb() {
        this.f39692g = true;
        m38077d();
    }

    public final void zzbK() {
    }

    public final void zzbS() {
    }

    public final void zzbz() {
    }

    public final void zze() {
    }

    public final synchronized void zzf(int i) {
        this.f39690e.destroy();
        if (!this.f39695j) {
            zze.zza("Inspector closed.");
            C4627vx vxVar = this.f39694i;
            if (vxVar != null) {
                try {
                    vxVar.zze((zzbew) null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f39692g = false;
        this.f39691f = false;
        this.f39693h = 0;
        this.f39695j = false;
        this.f39694i = null;
    }
}
