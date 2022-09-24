package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import p149t.C6077a;
import p198d5.C10487a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hk1 implements cc1, zzo {

    /* renamed from: b */
    private final Context f32750b;

    /* renamed from: c */
    private final xt0 f32751c;

    /* renamed from: d */
    private final ir2 f32752d;

    /* renamed from: e */
    private final zzcjf f32753e;

    /* renamed from: f */
    private final C8059pq f32754f;

    /* renamed from: g */
    C10487a f32755g;

    public hk1(Context context, xt0 xt0, ir2 ir2, zzcjf zzcjf, C8059pq pqVar) {
        this.f32750b = context;
        this.f32751c = xt0;
        this.f32752d = ir2;
        this.f32753e = zzcjf;
        this.f32754f = pqVar;
    }

    public final void zzb() {
        xt0 xt0;
        if (this.f32755g != null && (xt0 = this.f32751c) != null) {
            xt0.mo18321Z("onSdkImpression", new C6077a());
        }
    }

    public final void zzbK() {
    }

    public final void zzbS() {
    }

    public final void zzbz() {
    }

    public final void zze() {
    }

    public final void zzf(int i) {
        this.f32755g = null;
    }

    public final void zzn() {
        tg0 tg0;
        ug0 ug0;
        ug0 ug02;
        C8059pq pqVar = this.f32754f;
        if ((pqVar == C8059pq.REWARD_BASED_VIDEO_AD || pqVar == C8059pq.INTERSTITIAL || pqVar == C8059pq.APP_OPEN) && this.f32752d.f33454Q && this.f32751c != null && zzt.zzh().mo34049f(this.f32750b)) {
            zzcjf zzcjf = this.f32753e;
            int i = zzcjf.f43037c;
            int i2 = zzcjf.f43038d;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String sb2 = sb.toString();
            String a = this.f32752d.f33456S.mo31662a();
            if (this.f32752d.f33456S.mo31663b() == 1) {
                tg0 = tg0.VIDEO;
                ug0 = ug0.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.f32752d.f33459V == 2) {
                    ug02 = ug0.UNSPECIFIED;
                } else {
                    ug02 = ug0.BEGIN_TO_RENDER;
                }
                ug0 = ug02;
                tg0 = tg0.HTML_DISPLAY;
            }
            C10487a d = zzt.zzh().mo34047d(sb2, this.f32751c.zzI(), "", "javascript", a, ug0, tg0, this.f32752d.f33483j0);
            this.f32755g = d;
            if (d != null) {
                zzt.zzh().mo34046c(this.f32755g, (View) this.f32751c);
                this.f32751c.mo18741b0(this.f32755g);
                zzt.zzh().zzh(this.f32755g);
                this.f32751c.mo18321Z("onSdkLoaded", new C6077a());
            }
        }
    }
}
