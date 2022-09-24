package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.interactivemedia.p038v3.impl.data.C3791bd;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.nonagon.signalgeneration.zze;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jv1 {

    /* renamed from: a */
    private final ConcurrentHashMap<String, String> f34057a;

    /* renamed from: b */
    private final rn0 f34058b;

    public jv1(tv1 tv1, rn0 rn0) {
        this.f34057a = new ConcurrentHashMap<>(tv1.f40564b);
        this.f34058b = rn0;
    }

    /* renamed from: a */
    public final Map<String, String> mo32989a() {
        return this.f34057a;
    }

    /* renamed from: b */
    public final void mo32990b(ur2 ur2) {
        if (ur2.f39937b.f39518a.size() > 0) {
            switch (ur2.f39937b.f39518a.get(0).f33466b) {
                case 1:
                    this.f34057a.put("ad_format", "banner");
                    break;
                case 2:
                    this.f34057a.put("ad_format", IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
                    break;
                case 3:
                    this.f34057a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f34057a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f34057a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f34057a.put("ad_format", "app_open_ad");
                    this.f34057a.put("as", true != this.f34058b.mo34573i() ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    break;
                default:
                    this.f34057a.put("ad_format", C3791bd.UNKNOWN_CONTENT_TYPE);
                    break;
            }
        }
        if (!TextUtils.isEmpty(ur2.f39937b.f39519b.f35215b)) {
            this.f34057a.put("gqi", ur2.f39937b.f39519b.f35215b);
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37207s5)).booleanValue()) {
            boolean zzd = zze.zzd(ur2);
            this.f34057a.put("scar", String.valueOf(zzd));
            if (zzd) {
                String zzb = zze.zzb(ur2);
                if (!TextUtils.isEmpty(zzb)) {
                    this.f34057a.put("ragent", zzb);
                }
                String zza = zze.zza(ur2);
                if (!TextUtils.isEmpty(zza)) {
                    this.f34057a.put("rtype", zza);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo32991c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f34057a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f34057a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
