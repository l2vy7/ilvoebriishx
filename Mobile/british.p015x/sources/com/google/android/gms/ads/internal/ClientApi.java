package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.internal.ads.C7519ax;
import com.google.android.gms.internal.ads.C7846jx;
import com.google.android.gms.internal.ads.C7993nw;
import com.google.android.gms.internal.ads.C8136rw;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.a40;
import com.google.android.gms.internal.ads.a80;
import com.google.android.gms.internal.ads.am2;
import com.google.android.gms.internal.ads.bk0;
import com.google.android.gms.internal.ads.bm2;
import com.google.android.gms.internal.ads.bn1;
import com.google.android.gms.internal.ads.br2;
import com.google.android.gms.internal.ads.d80;
import com.google.android.gms.internal.ads.dn1;
import com.google.android.gms.internal.ads.gb2;
import com.google.android.gms.internal.ads.lp2;
import com.google.android.gms.internal.ads.mg0;
import com.google.android.gms.internal.ads.nj0;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.pn2;
import com.google.android.gms.internal.ads.tc0;
import com.google.android.gms.internal.ads.u30;
import com.google.android.gms.internal.ads.uv0;
import com.google.android.gms.internal.ads.wm0;
import com.google.android.gms.internal.ads.yg0;
import com.google.android.gms.internal.ads.yw1;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzcjf;
import java.util.HashMap;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class ClientApi extends C7519ax {
    public final C7993nw zzb(C10487a aVar, String str, tc0 tc0, int i) {
        Context context = (Context) C10489b.m48194f3(aVar);
        return new gb2(uv0.m38469h(context, tc0, i), context, str);
    }

    public final C8136rw zzc(C10487a aVar, zzbfi zzbfi, String str, tc0 tc0, int i) {
        Context context = (Context) C10489b.m48194f3(aVar);
        am2 y = uv0.m38469h(context, tc0, i).mo35303y();
        y.zza(str);
        y.mo30423a(context);
        bm2 zzc = y.zzc();
        if (i >= ((Integer) C8311wv.m39277c().mo18570b(p00.f36907J3)).intValue()) {
            return zzc.zzb();
        }
        return zzc.zza();
    }

    public final C8136rw zzd(C10487a aVar, zzbfi zzbfi, String str, tc0 tc0, int i) {
        Context context = (Context) C10489b.m48194f3(aVar);
        pn2 z = uv0.m38469h(context, tc0, i).mo35304z();
        z.mo30569b(context);
        z.mo30570c(zzbfi);
        z.mo30568a(str);
        return z.zzd().zza();
    }

    public final C8136rw zze(C10487a aVar, zzbfi zzbfi, String str, tc0 tc0, int i) {
        Context context = (Context) C10489b.m48194f3(aVar);
        lp2 A = uv0.m38469h(context, tc0, i).mo35279A();
        A.mo33373b(context);
        A.mo33374c(zzbfi);
        A.mo33372a(str);
        return A.zzd().zza();
    }

    public final C8136rw zzf(C10487a aVar, zzbfi zzbfi, String str, int i) {
        return new zzs((Context) C10489b.m48194f3(aVar), zzbfi, str, new zzcjf(214106000, i, true, false));
    }

    public final C7846jx zzg(C10487a aVar, int i) {
        return uv0.m38468g((Context) C10489b.m48194f3(aVar), i).mo35287i();
    }

    public final u30 zzh(C10487a aVar, C10487a aVar2) {
        return new dn1((FrameLayout) C10489b.m48194f3(aVar), (FrameLayout) C10489b.m48194f3(aVar2), 214106000);
    }

    public final a40 zzi(C10487a aVar, C10487a aVar2, C10487a aVar3) {
        return new bn1((View) C10489b.m48194f3(aVar), (HashMap) C10489b.m48194f3(aVar2), (HashMap) C10489b.m48194f3(aVar3));
    }

    public final d80 zzj(C10487a aVar, tc0 tc0, int i, a80 a80) {
        Context context = (Context) C10489b.m48194f3(aVar);
        yw1 r = uv0.m38469h(context, tc0, i).mo35296r();
        r.mo34218a(context);
        r.mo34219b(a80);
        return r.zzc().zzd();
    }

    public final mg0 zzk(C10487a aVar, tc0 tc0, int i) {
        return uv0.m38469h((Context) C10489b.m48194f3(aVar), tc0, i).mo35298t();
    }

    public final yg0 zzl(C10487a aVar) {
        Activity activity = (Activity) C10489b.m48194f3(aVar);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzt(activity);
        }
        int i = zza.zzk;
        if (i == 1) {
            return new zzs(activity);
        }
        if (i == 2) {
            return new zzab(activity);
        }
        if (i == 3) {
            return new zzac(activity);
        }
        if (i == 4) {
            return new zzv(activity, zza);
        }
        if (i != 5) {
            return new zzt(activity);
        }
        return new zzz(activity);
    }

    public final nj0 zzm(C10487a aVar, tc0 tc0, int i) {
        Context context = (Context) C10489b.m48194f3(aVar);
        br2 B = uv0.m38469h(context, tc0, i).mo35280B();
        B.mo30791a(context);
        return B.zzc().zzb();
    }

    public final bk0 zzn(C10487a aVar, String str, tc0 tc0, int i) {
        Context context = (Context) C10489b.m48194f3(aVar);
        br2 B = uv0.m38469h(context, tc0, i).mo35280B();
        B.mo30791a(context);
        B.zza(str);
        return B.zzc().zza();
    }

    public final wm0 zzo(C10487a aVar, tc0 tc0, int i) {
        return uv0.m38469h((Context) C10489b.m48194f3(aVar), tc0, i).mo35301w();
    }
}
