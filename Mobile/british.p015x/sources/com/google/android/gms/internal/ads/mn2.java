package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class mn2 implements xa3<m41> {

    /* renamed from: a */
    final /* synthetic */ sc2 f35581a;

    /* renamed from: b */
    final /* synthetic */ ex2 f35582b;

    /* renamed from: c */
    final /* synthetic */ k51 f35583c;

    /* renamed from: d */
    final /* synthetic */ nn2 f35584d;

    mn2(nn2 nn2, sc2 sc2, ex2 ex2, k51 k51) {
        this.f35584d = nn2;
        this.f35581a = sc2;
        this.f35582b = ex2;
        this.f35583c = k51;
    }

    public final void zza(Throwable th) {
        zzbew a = this.f35583c.mo33034d().mo34667a(th);
        synchronized (this.f35584d) {
            this.f35584d.f36060k = null;
            this.f35583c.mo33035e().mo18436d(a);
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37005V5)).booleanValue()) {
                this.f35584d.f36051b.execute(new ln2(this, a));
            }
            this.f35584d.f36057h.mo31543E0(60);
            qs2.m36700b(a.f42935b, th, "BannerAdLoader.onFailure");
            this.f35581a.zza();
            if (this.f35582b != null) {
                gx2 h = this.f35584d.f36058i;
                ex2 ex2 = this.f35582b;
                ex2.mo31672c(a);
                ex2.mo31676g(false);
                h.mo32302a(ex2.mo31678i());
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        m41 m41 = (m41) obj;
        synchronized (this.f35584d) {
            this.f35584d.f36060k = null;
            this.f35584d.f36055f.removeAllViews();
            if (m41.mo33469i() != null) {
                ViewParent parent = m41.mo33469i().getParent();
                if (parent instanceof ViewGroup) {
                    String str = "";
                    if (m41.mo33838c() != null) {
                        str = m41.mo33838c().zze();
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(str);
                    sb.append(" already has a parent view. Removing its old parent.");
                    co0.zzj(sb.toString());
                    ((ViewGroup) parent).removeView(m41.mo33469i());
                }
            }
            h00 h00 = p00.f37005V5;
            if (((Boolean) C8311wv.m39277c().mo18570b(h00)).booleanValue()) {
                ye1 e = m41.mo33840e();
                e.mo35914a(this.f35584d.f36053d);
                e.mo35916c(this.f35584d.f36054e);
            }
            this.f35584d.f36055f.addView(m41.mo33469i());
            this.f35581a.zzb(m41);
            if (((Boolean) C8311wv.m39277c().mo18570b(h00)).booleanValue()) {
                Executor i = this.f35584d.f36051b;
                cc2 e2 = this.f35584d.f36053d;
                e2.getClass();
                i.execute(new kn2(e2));
            }
            this.f35584d.f36057h.mo31543E0(m41.mo33468h());
            if (this.f35582b != null) {
                gx2 h = this.f35584d.f36058i;
                ex2 ex2 = this.f35582b;
                ex2.mo31673d(m41.mo33842g().f39937b);
                ex2.mo31674e(m41.mo33838c().zze());
                ex2.mo31676g(true);
                h.mo32302a(ex2.mo31678i());
            }
        }
    }
}
