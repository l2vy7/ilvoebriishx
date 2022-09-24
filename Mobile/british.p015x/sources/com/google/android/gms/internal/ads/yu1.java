package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zze;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yu1 implements mf1, C7659eu, hb1, qa1 {

    /* renamed from: b */
    private final Context f41999b;

    /* renamed from: c */
    private final ns2 f42000c;

    /* renamed from: d */
    private final nv1 f42001d;

    /* renamed from: e */
    private final ur2 f42002e;

    /* renamed from: f */
    private final ir2 f42003f;

    /* renamed from: g */
    private final f42 f42004g;

    /* renamed from: h */
    private Boolean f42005h;

    /* renamed from: i */
    private final boolean f42006i = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37126j5)).booleanValue();

    public yu1(Context context, ns2 ns2, nv1 nv1, ur2 ur2, ir2 ir2, f42 f42) {
        this.f41999b = context;
        this.f42000c = ns2;
        this.f42001d = nv1;
        this.f42002e = ur2;
        this.f42003f = ir2;
        this.f42004g = f42;
    }

    /* renamed from: a */
    private final mv1 m40022a(String str) {
        mv1 a = this.f42001d.mo33772a();
        a.mo33599d(this.f42002e.f39937b.f39519b);
        a.mo33598c(this.f42003f);
        a.mo33597b("action", str);
        if (!this.f42003f.f33495u.isEmpty()) {
            a.mo33597b("ancn", this.f42003f.f33495u.get(0));
        }
        if (this.f42003f.f33477g0) {
            zzt.zzp();
            a.mo33597b("device_connectivity", true != com.google.android.gms.ads.internal.util.zzt.zzJ(this.f41999b) ? "offline" : "online");
            a.mo33597b("event_timestamp", String.valueOf(zzt.zzA().currentTimeMillis()));
            a.mo33597b("offline_ad", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37207s5)).booleanValue()) {
            boolean zzd = zze.zzd(this.f42002e);
            a.mo33597b("scar", String.valueOf(zzd));
            if (zzd) {
                String zzb = zze.zzb(this.f42002e);
                if (!TextUtils.isEmpty(zzb)) {
                    a.mo33597b("ragent", zzb);
                }
                String zza = zze.zza(this.f42002e);
                if (!TextUtils.isEmpty(zza)) {
                    a.mo33597b("rtype", zza);
                }
            }
        }
        return a;
    }

    /* renamed from: c */
    private final void m40023c(mv1 mv1) {
        if (this.f42003f.f33477g0) {
            this.f42004g.mo31747f(new h42(zzt.zzA().currentTimeMillis(), this.f42002e.f39937b.f39519b.f35215b, mv1.mo33600e(), 2));
            return;
        }
        mv1.mo33601f();
    }

    /* renamed from: g */
    private final boolean m40024g() {
        if (this.f42005h == null) {
            synchronized (this) {
                if (this.f42005h == null) {
                    String str = (String) C8311wv.m39277c().mo18570b(p00.f37077e1);
                    zzt.zzp();
                    String zzv = com.google.android.gms.ads.internal.util.zzt.zzv(this.f41999b);
                    boolean z = false;
                    if (!(str == null || zzv == null)) {
                        try {
                            z = Pattern.matches(str, zzv);
                        } catch (RuntimeException e) {
                            zzt.zzo().mo18592s(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f42005h = Boolean.valueOf(z);
                }
            }
        }
        return this.f42005h.booleanValue();
    }

    /* renamed from: d */
    public final void mo30337d(zzbew zzbew) {
        zzbew zzbew2;
        if (this.f42006i) {
            mv1 a = m40022a("ifts");
            a.mo33597b(IronSourceConstants.EVENTS_ERROR_REASON, "adapter");
            int i = zzbew.f42935b;
            String str = zzbew.f42936c;
            if (zzbew.f42937d.equals(MobileAds.ERROR_DOMAIN) && (zzbew2 = zzbew.f42938e) != null && !zzbew2.f42937d.equals(MobileAds.ERROR_DOMAIN)) {
                zzbew zzbew3 = zzbew.f42938e;
                i = zzbew3.f42935b;
                str = zzbew3.f42936c;
            }
            if (i >= 0) {
                a.mo33597b("arec", String.valueOf(i));
            }
            String a2 = this.f42000c.mo33737a(str);
            if (a2 != null) {
                a.mo33597b("areec", a2);
            }
            a.mo33601f();
        }
    }

    /* renamed from: j0 */
    public final void mo30338j0(fk1 fk1) {
        if (this.f42006i) {
            mv1 a = m40022a("ifts");
            a.mo33597b(IronSourceConstants.EVENTS_ERROR_REASON, "exception");
            if (!TextUtils.isEmpty(fk1.getMessage())) {
                a.mo33597b("msg", fk1.getMessage());
            }
            a.mo33601f();
        }
    }

    public final void onAdClicked() {
        if (this.f42003f.f33477g0) {
            m40023c(m40022a("click"));
        }
    }

    public final void zzb() {
        if (this.f42006i) {
            mv1 a = m40022a("ifts");
            a.mo33597b(IronSourceConstants.EVENTS_ERROR_REASON, "blocked");
            a.mo33601f();
        }
    }

    public final void zzc() {
        if (m40024g()) {
            m40022a("adapter_shown").mo33601f();
        }
    }

    public final void zzd() {
        if (m40024g()) {
            m40022a("adapter_impression").mo33601f();
        }
    }

    public final void zzl() {
        if (m40024g() || this.f42003f.f33477g0) {
            m40023c(m40022a(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
