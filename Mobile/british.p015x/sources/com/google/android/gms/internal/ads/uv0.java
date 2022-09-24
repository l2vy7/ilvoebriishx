package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzb;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class uv0 implements b11 {
    @GuardedBy("AppComponent.class")

    /* renamed from: a */
    private static uv0 f39994a;

    @Deprecated
    /* renamed from: f */
    public static synchronized uv0 m38467f(zzcjf zzcjf, Context context, vz0 vz0) {
        uv0 uv0;
        synchronized (uv0.class) {
            if (f39994a == null) {
                ey0 ey0 = new ey0((dy0) null);
                vv0 vv0 = new vv0();
                vv0.mo35502d(zzcjf);
                vv0.mo35501c(context);
                ey0.mo31691b(new xv0(vv0, (wv0) null));
                ey0.mo31692c(new wz0(vz0));
                f39994a = ey0.mo31690a();
                p00.m35913c(context);
                zzt.zzo().mo18590q(context, zzcjf);
                zzt.zzc().mo34377i(context);
                zzt.zzp().zzr(context);
                zzt.zzp().zzq(context);
                zzt.zzp().zzl(context);
                zzd.zza(context);
                zzt.zzb().mo18171d(context);
                zzt.zzv().zzb(context);
                lm0.m34501d(context);
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36868E4)).booleanValue()) {
                    if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37175p0)).booleanValue()) {
                        C7728gq gqVar = new C7728gq(new C7913lq(context));
                        e32 e32 = new e32(new a32(context), f39994a.mo35284c());
                        zzt.zzp();
                        new w32(context, zzcjf, gqVar, e32, UUID.randomUUID().toString(), f39994a.mo35282D()).mo35550b(zzt.zzo().mo18583h().zzL());
                    }
                }
            }
            uv0 = f39994a;
        }
        return uv0;
    }

    @Deprecated
    /* renamed from: g */
    public static uv0 m38468g(Context context, int i) {
        synchronized (uv0.class) {
            uv0 uv0 = f39994a;
            if (uv0 != null) {
                return uv0;
            }
            return m38467f(new zzcjf(214106000, i, true, false), context, new vw0());
        }
    }

    /* renamed from: h */
    public static uv0 m38469h(Context context, tc0 tc0, int i) {
        uv0 g = m38468g(context, i);
        g.mo35295q().mo32765c(tc0);
        return g;
    }

    /* renamed from: A */
    public abstract lp2 mo35279A();

    /* renamed from: B */
    public abstract br2 mo35280B();

    /* renamed from: C */
    public abstract ss2<ir1> mo35281C();

    /* renamed from: D */
    public abstract nw2 mo35282D();

    /* renamed from: a */
    public final sj2 mo30589a(zzcdq zzcdq, int i) {
        return mo35302x(new al2(zzcdq, i));
    }

    /* renamed from: b */
    public abstract gx2 mo35283b();

    /* renamed from: c */
    public abstract nb3 mo35284c();

    /* renamed from: d */
    public abstract Executor mo35285d();

    /* renamed from: e */
    public abstract ScheduledExecutorService mo35286e();

    /* renamed from: i */
    public abstract g01 mo35287i();

    /* renamed from: j */
    public abstract n31 mo35288j();

    /* renamed from: k */
    public abstract z31 mo35289k();

    /* renamed from: l */
    public abstract j51 mo35290l();

    /* renamed from: m */
    public abstract ed1 mo35291m();

    /* renamed from: n */
    public abstract wj1 mo35292n();

    /* renamed from: o */
    public abstract tk1 mo35293o();

    /* renamed from: p */
    public abstract cs1 mo35294p();

    /* renamed from: q */
    public abstract it1 mo35295q();

    /* renamed from: r */
    public abstract yw1 mo35296r();

    /* renamed from: s */
    public abstract ly1 mo35297s();

    /* renamed from: t */
    public abstract n42 mo35298t();

    /* renamed from: u */
    public abstract zzb mo35299u();

    /* renamed from: v */
    public abstract zzf mo35300v();

    /* renamed from: w */
    public abstract zzv mo35301w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract sj2 mo35302x(al2 al2);

    /* renamed from: y */
    public abstract am2 mo35303y();

    /* renamed from: z */
    public abstract pn2 mo35304z();
}
