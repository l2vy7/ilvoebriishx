package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zzce;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zza;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class db0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f20262a = new Object();

    /* renamed from: b */
    private final Context f20263b;

    /* renamed from: c */
    private final String f20264c;

    /* renamed from: d */
    private final zzcjf f20265d;

    /* renamed from: e */
    private final zzbf<x90> f20266e;

    /* renamed from: f */
    private final zzbf<x90> f20267f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public cb0 f20268g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f20269h = 1;

    public db0(Context context, zzcjf zzcjf, String str, zzbf<x90> zzbf, zzbf<x90> zzbf2) {
        this.f20264c = str;
        this.f20263b = context.getApplicationContext();
        this.f20265d = zzcjf;
        this.f20266e = zzbf;
        this.f20267f = zzbf2;
    }

    /* renamed from: b */
    public final xa0 mo18234b(C7497ab abVar) {
        synchronized (this.f20262a) {
            synchronized (this.f20262a) {
                cb0 cb0 = this.f20268g;
                if (cb0 != null && this.f20269h == 0) {
                    cb0.mo30763e(new ka0(this), ia0.f33160a);
                }
            }
            cb0 cb02 = this.f20268g;
            if (cb02 != null) {
                if (cb02.mo30760a() != -1) {
                    int i = this.f20269h;
                    if (i == 0) {
                        xa0 f = this.f20268g.mo30873f();
                        return f;
                    } else if (i == 1) {
                        this.f20269h = 2;
                        mo18235d((C7497ab) null);
                        xa0 f2 = this.f20268g.mo30873f();
                        return f2;
                    } else {
                        xa0 f3 = this.f20268g.mo30873f();
                        return f3;
                    }
                }
            }
            this.f20269h = 2;
            cb0 d = mo18235d((C7497ab) null);
            this.f20268g = d;
            xa0 f4 = d.mo30873f();
            return f4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final cb0 mo18235d(C7497ab abVar) {
        cb0 cb0 = new cb0(this.f20267f);
        po0.f37726e.execute(new ma0(this, (C7497ab) null, cb0));
        cb0.mo30763e(new sa0(this, cb0), new ta0(this, cb0));
        return cb0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo18236h(com.google.android.gms.internal.ads.cb0 r4, com.google.android.gms.internal.ads.x90 r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f20262a
            monitor-enter(r0)
            int r1 = r4.mo30760a()     // Catch:{ all -> 0x0028 }
            r2 = -1
            if (r1 == r2) goto L_0x0026
            int r1 = r4.mo30760a()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            r4.mo30761c()     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.nb3 r4 = com.google.android.gms.internal.ads.po0.f37726e     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.la0 r1 = new com.google.android.gms.internal.ads.la0     // Catch:{ all -> 0x0028 }
            r1.<init>(r5)     // Catch:{ all -> 0x0028 }
            r4.execute(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.db0.mo18236h(com.google.android.gms.internal.ads.cb0, com.google.android.gms.internal.ads.x90):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo18237i(C7497ab abVar, cb0 cb0) {
        try {
            fa0 fa0 = new fa0(this.f20263b, this.f20265d, (C7497ab) null, (zza) null);
            fa0.mo18318G(new ha0(this, cb0, fa0));
            fa0.mo18328z("/jsLoaded", new oa0(this, cb0, fa0));
            zzce zzce = new zzce();
            pa0 pa0 = new pa0(this, (C7497ab) null, fa0, zzce);
            zzce.zzb(pa0);
            fa0.mo18328z("/requestReload", pa0);
            if (this.f20264c.endsWith(".js")) {
                fa0.mo18326w(this.f20264c);
            } else if (this.f20264c.startsWith("<html>")) {
                fa0.mo18323c(this.f20264c);
            } else {
                fa0.mo18327x(this.f20264c);
            }
            zzt.zza.postDelayed(new ra0(this, cb0, fa0), 60000);
        } catch (Throwable th) {
            co0.zzh("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzt.zzo().mo18592s(th, "SdkJavascriptFactory.loadJavascriptEngine");
            cb0.mo30761c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo18238j(x90 x90) {
        if (x90.zzi()) {
            this.f20269h = 1;
        }
    }
}
