package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l22 implements mf1, C7659eu, hb1, qa1 {

    /* renamed from: b */
    private final Context f34803b;

    /* renamed from: c */
    private final ns2 f34804c;

    /* renamed from: d */
    private final ur2 f34805d;

    /* renamed from: e */
    private final ir2 f34806e;

    /* renamed from: f */
    private final f42 f34807f;

    /* renamed from: g */
    private Boolean f34808g;

    /* renamed from: h */
    private final boolean f34809h = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37126j5)).booleanValue();

    /* renamed from: i */
    private final nw2 f34810i;

    /* renamed from: j */
    private final String f34811j;

    public l22(Context context, ns2 ns2, ur2 ur2, ir2 ir2, f42 f42, nw2 nw2, String str) {
        this.f34803b = context;
        this.f34804c = ns2;
        this.f34805d = ur2;
        this.f34806e = ir2;
        this.f34807f = f42;
        this.f34810i = nw2;
        this.f34811j = str;
    }

    /* renamed from: a */
    private final mw2 m34272a(String str) {
        mw2 b = mw2.m34936b(str);
        b.mo33608h(this.f34805d, (rn0) null);
        b.mo33606f(this.f34806e);
        b.mo33603a("request_id", this.f34811j);
        if (!this.f34806e.f33495u.isEmpty()) {
            b.mo33603a("ancn", this.f34806e.f33495u.get(0));
        }
        if (this.f34806e.f33477g0) {
            zzt.zzp();
            b.mo33603a("device_connectivity", true != com.google.android.gms.ads.internal.util.zzt.zzJ(this.f34803b) ? "offline" : "online");
            b.mo33603a("event_timestamp", String.valueOf(zzt.zzA().currentTimeMillis()));
            b.mo33603a("offline_ad", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        return b;
    }

    /* renamed from: c */
    private final void m34273c(mw2 mw2) {
        if (this.f34806e.f33477g0) {
            this.f34807f.mo31747f(new h42(zzt.zzA().currentTimeMillis(), this.f34805d.f39937b.f39519b.f35215b, this.f34810i.mo31049b(mw2), 2));
            return;
        }
        this.f34810i.mo31048a(mw2);
    }

    /* renamed from: g */
    private final boolean m34274g() {
        if (this.f34808g == null) {
            synchronized (this) {
                if (this.f34808g == null) {
                    String str = (String) C8311wv.m39277c().mo18570b(p00.f37077e1);
                    zzt.zzp();
                    String zzv = com.google.android.gms.ads.internal.util.zzt.zzv(this.f34803b);
                    boolean z = false;
                    if (!(str == null || zzv == null)) {
                        try {
                            z = Pattern.matches(str, zzv);
                        } catch (RuntimeException e) {
                            zzt.zzo().mo18592s(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f34808g = Boolean.valueOf(z);
                }
            }
        }
        return this.f34808g.booleanValue();
    }

    /* renamed from: d */
    public final void mo30337d(zzbew zzbew) {
        zzbew zzbew2;
        if (this.f34809h) {
            int i = zzbew.f42935b;
            String str = zzbew.f42936c;
            if (zzbew.f42937d.equals(MobileAds.ERROR_DOMAIN) && (zzbew2 = zzbew.f42938e) != null && !zzbew2.f42937d.equals(MobileAds.ERROR_DOMAIN)) {
                zzbew zzbew3 = zzbew.f42938e;
                i = zzbew3.f42935b;
                str = zzbew3.f42936c;
            }
            String a = this.f34804c.mo33737a(str);
            mw2 a2 = m34272a("ifts");
            a2.mo33603a(IronSourceConstants.EVENTS_ERROR_REASON, "adapter");
            if (i >= 0) {
                a2.mo33603a("arec", String.valueOf(i));
            }
            if (a != null) {
                a2.mo33603a("areec", a);
            }
            this.f34810i.mo31048a(a2);
        }
    }

    /* renamed from: j0 */
    public final void mo30338j0(fk1 fk1) {
        if (this.f34809h) {
            mw2 a = m34272a("ifts");
            a.mo33603a(IronSourceConstants.EVENTS_ERROR_REASON, "exception");
            if (!TextUtils.isEmpty(fk1.getMessage())) {
                a.mo33603a("msg", fk1.getMessage());
            }
            this.f34810i.mo31048a(a);
        }
    }

    public final void onAdClicked() {
        if (this.f34806e.f33477g0) {
            m34273c(m34272a("click"));
        }
    }

    public final void zzb() {
        if (this.f34809h) {
            nw2 nw2 = this.f34810i;
            mw2 a = m34272a("ifts");
            a.mo33603a(IronSourceConstants.EVENTS_ERROR_REASON, "blocked");
            nw2.mo31048a(a);
        }
    }

    public final void zzc() {
        if (m34274g()) {
            this.f34810i.mo31048a(m34272a("adapter_shown"));
        }
    }

    public final void zzd() {
        if (m34274g()) {
            this.f34810i.mo31048a(m34272a("adapter_impression"));
        }
    }

    public final void zzl() {
        if (m34274g() || this.f34806e.f33477g0) {
            m34273c(m34272a(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
