package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import javax.annotation.concurrent.GuardedBy;
import p149t.C6077a;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e61 implements cc1, hb1 {

    /* renamed from: b */
    private final Context f31232b;

    /* renamed from: c */
    private final xt0 f31233c;

    /* renamed from: d */
    private final ir2 f31234d;

    /* renamed from: e */
    private final zzcjf f31235e;
    @GuardedBy("this")

    /* renamed from: f */
    private C10487a f31236f;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f31237g;

    public e61(Context context, xt0 xt0, ir2 ir2, zzcjf zzcjf) {
        this.f31232b = context;
        this.f31233c = xt0;
        this.f31234d = ir2;
        this.f31235e = zzcjf;
    }

    /* renamed from: a */
    private final synchronized void m31714a() {
        tg0 tg0;
        ug0 ug0;
        if (this.f31234d.f33454Q) {
            if (this.f31233c != null) {
                if (zzt.zzh().mo34049f(this.f31232b)) {
                    zzcjf zzcjf = this.f31235e;
                    int i = zzcjf.f43037c;
                    int i2 = zzcjf.f43038d;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    String sb2 = sb.toString();
                    String a = this.f31234d.f33456S.mo31662a();
                    if (this.f31234d.f33456S.mo31663b() == 1) {
                        tg0 = tg0.VIDEO;
                        ug0 = ug0.DEFINED_BY_JAVASCRIPT;
                    } else {
                        tg0 = tg0.HTML_DISPLAY;
                        if (this.f31234d.f33474f == 1) {
                            ug0 = ug0.ONE_PIXEL;
                        } else {
                            ug0 = ug0.BEGIN_TO_RENDER;
                        }
                    }
                    C10487a d = zzt.zzh().mo34047d(sb2, this.f31233c.zzI(), "", "javascript", a, ug0, tg0, this.f31234d.f33483j0);
                    this.f31236f = d;
                    xt0 xt0 = this.f31233c;
                    if (d != null) {
                        zzt.zzh().mo34046c(this.f31236f, (View) xt0);
                        this.f31233c.mo18741b0(this.f31236f);
                        zzt.zzh().zzh(this.f31236f);
                        this.f31237g = true;
                        this.f31233c.mo18321Z("onSdkLoaded", new C6077a());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzl() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f31237g     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0008
            r3.m31714a()     // Catch:{ all -> 0x0024 }
        L_0x0008:
            com.google.android.gms.internal.ads.ir2 r0 = r3.f31234d     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.f33454Q     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            d5.a r0 = r3.f31236f     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.xt0 r0 = r3.f31233c     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            t.a r1 = new t.a     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "onSdkImpression"
            r0.mo18321Z(r2, r1)     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)
            return
        L_0x0022:
            monitor-exit(r3)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e61.zzl():void");
    }

    public final synchronized void zzn() {
        if (!this.f31237g) {
            m31714a();
        }
    }
}
