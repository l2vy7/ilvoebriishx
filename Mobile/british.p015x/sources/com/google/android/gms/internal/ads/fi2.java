package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.ads.nonagon.signalgeneration.zzx;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fi2 implements zi2<gi2> {

    /* renamed from: a */
    private final String f31768a;

    /* renamed from: b */
    private final nb3 f31769b;

    /* renamed from: c */
    private final ScheduledExecutorService f31770c;

    /* renamed from: d */
    private final Context f31771d;

    /* renamed from: e */
    private final bs2 f31772e;

    /* renamed from: f */
    private final uv0 f31773f;

    fi2(nb3 nb3, ScheduledExecutorService scheduledExecutorService, String str, Context context, bs2 bs2, uv0 uv0) {
        this.f31769b = nb3;
        this.f31770c = scheduledExecutorService;
        this.f31768a = str;
        this.f31771d = context;
        this.f31772e = bs2;
        this.f31773f = uv0;
    }

    /* renamed from: a */
    public static /* synthetic */ mb3 m32178a(fi2 fi2) {
        String str = fi2.f31768a;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37223u5)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        zzf v = fi2.f31773f.mo35300v();
        w91 w91 = new w91();
        w91.mo35591c(fi2.f31771d);
        zr2 zr2 = new zr2();
        zr2.mo36103H("adUnitId");
        zr2.mo36114d(fi2.f31772e.f30087d);
        zr2.mo36102G(new zzbfi());
        w91.mo35594f(zr2.mo36116f());
        v.zza(w91.mo35595g());
        zzx zzx = new zzx();
        zzx.zza(str);
        v.zzb(zzx.zzb());
        new dg1();
        return bb3.m30646f(bb3.m30653m((sa3) bb3.m30655o(sa3.m37369D(v.zzc().zza()), ((Long) C8311wv.m39277c().mo18570b(p00.f37231v5)).longValue(), TimeUnit.MILLISECONDS, fi2.f31770c), bi2.f30017a, fi2.f31769b), Exception.class, ci2.f30399a, fi2.f31769b);
    }

    public final mb3<gi2> zzb() {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37215t5)).booleanValue() || "adUnitId".equals(this.f31772e.f30089f)) {
            return this.f31769b.mo33675b(ei2.f31389a);
        }
        return bb3.m30652l(new di2(this), this.f31769b);
    }
}
