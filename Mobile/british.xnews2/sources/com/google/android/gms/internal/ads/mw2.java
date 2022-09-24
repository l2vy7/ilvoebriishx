package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.interactivemedia.p038v3.impl.data.C3791bd;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zze;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mw2 {

    /* renamed from: a */
    private final HashMap<String, String> f35634a;

    /* renamed from: b */
    private final tw2 f35635b = new tw2(zzt.zzA());

    private mw2() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.f35634a = hashMap;
        hashMap.put("new_csi", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    /* renamed from: b */
    public static mw2 m34936b(String str) {
        mw2 mw2 = new mw2();
        mw2.f35634a.put("action", str);
        return mw2;
    }

    /* renamed from: c */
    public static mw2 m34937c(String str) {
        mw2 mw2 = new mw2();
        mw2.f35634a.put("request_id", str);
        return mw2;
    }

    /* renamed from: a */
    public final mw2 mo33603a(String str, String str2) {
        this.f35634a.put(str, str2);
        return this;
    }

    /* renamed from: d */
    public final mw2 mo33604d(String str) {
        this.f35635b.mo35053b(str);
        return this;
    }

    /* renamed from: e */
    public final mw2 mo33605e(String str, String str2) {
        this.f35635b.mo35054c(str, str2);
        return this;
    }

    /* renamed from: f */
    public final mw2 mo33606f(ir2 ir2) {
        this.f35634a.put("aai", ir2.f33498x);
        return this;
    }

    /* renamed from: g */
    public final mw2 mo33607g(lr2 lr2) {
        if (!TextUtils.isEmpty(lr2.f35215b)) {
            this.f35634a.put("gqi", lr2.f35215b);
        }
        return this;
    }

    /* renamed from: h */
    public final mw2 mo33608h(ur2 ur2, rn0 rn0) {
        tr2 tr2 = ur2.f39937b;
        mo33607g(tr2.f39519b);
        if (!tr2.f39518a.isEmpty()) {
            switch (tr2.f39518a.get(0).f33466b) {
                case 1:
                    this.f35634a.put("ad_format", "banner");
                    break;
                case 2:
                    this.f35634a.put("ad_format", IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
                    break;
                case 3:
                    this.f35634a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f35634a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f35634a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f35634a.put("ad_format", "app_open_ad");
                    if (rn0 != null) {
                        this.f35634a.put("as", true != rn0.mo34573i() ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        break;
                    }
                    break;
                default:
                    this.f35634a.put("ad_format", C3791bd.UNKNOWN_CONTENT_TYPE);
                    break;
            }
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37207s5)).booleanValue()) {
            boolean zzd = zze.zzd(ur2);
            this.f35634a.put("scar", String.valueOf(zzd));
            if (zzd) {
                String zzb = zze.zzb(ur2);
                if (!TextUtils.isEmpty(zzb)) {
                    this.f35634a.put("ragent", zzb);
                }
                String zza = zze.zza(ur2);
                if (!TextUtils.isEmpty(zza)) {
                    this.f35634a.put("rtype", zza);
                }
            }
        }
        return this;
    }

    /* renamed from: i */
    public final mw2 mo33609i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f35634a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f35634a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    /* renamed from: j */
    public final Map<String, String> mo33610j() {
        HashMap hashMap = new HashMap(this.f35634a);
        for (sw2 next : this.f35635b.mo35052a()) {
            hashMap.put(next.f39084a, next.f39085b);
        }
        return hashMap;
    }
}
