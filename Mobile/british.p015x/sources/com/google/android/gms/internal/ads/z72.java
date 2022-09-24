package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class z72<AdT> implements r42<AdT> {
    /* renamed from: d */
    private static Bundle m40191d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    /* renamed from: a */
    public final boolean mo31509a(ur2 ur2, ir2 ir2) {
        return !TextUtils.isEmpty(ir2.f33497w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    /* renamed from: b */
    public final mb3<AdT> mo31510b(ur2 ur2, ir2 ir2) {
        ir2 ir22 = ir2;
        String optString = ir22.f33497w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        bs2 bs2 = ur2.f39936a.f38765a;
        zr2 zr2 = new zr2();
        zr2.mo36100E(bs2);
        zr2.mo36103H(optString);
        Bundle d = m40191d(bs2.f30087d.f42952n);
        Bundle d2 = m40191d(d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d2.putInt("gw", 1);
        String optString2 = ir22.f33497w.optString("mad_hac", (String) null);
        if (optString2 != null) {
            d2.putString("mad_hac", optString2);
        }
        String optString3 = ir22.f33497w.optString("adJson", (String) null);
        if (optString3 != null) {
            d2.putString("_ad", optString3);
        }
        d2.putBoolean("_noRefresh", true);
        Iterator<String> keys = ir22.f33442E.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = ir22.f33442E.optString(next, (String) null);
            if (next != null) {
                d2.putString(next, optString4);
            }
        }
        d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d2);
        zzbfd zzbfd = bs2.f30087d;
        zzbfd zzbfd2 = r5;
        zzbfd zzbfd3 = new zzbfd(zzbfd.f42940b, zzbfd.f42941c, d2, zzbfd.f42943e, zzbfd.f42944f, zzbfd.f42945g, zzbfd.f42946h, zzbfd.f42947i, zzbfd.f42948j, zzbfd.f42949k, zzbfd.f42950l, zzbfd.f42951m, d, zzbfd.f42953o, zzbfd.f42954p, zzbfd.f42955q, zzbfd.f42956r, zzbfd.f42957s, zzbfd.f42958t, zzbfd.f42959u, zzbfd.f42960v, zzbfd.f42961w, zzbfd.f42962x, zzbfd.f42963y);
        zr2.mo36114d(zzbfd2);
        bs2 f = zr2.mo36116f();
        Bundle bundle = new Bundle();
        ur2 ur22 = ur2;
        lr2 lr2 = ur22.f39937b.f39519b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(lr2.f35214a));
        bundle2.putInt("refresh_interval", lr2.f35216c);
        bundle2.putString("gws_query_id", lr2.f35215b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = ur22.f39936a.f38765a.f30089f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        ir2 ir23 = ir2;
        bundle3.putString("allocation_id", ir23.f33498x);
        bundle3.putStringArrayList("click_urls", new ArrayList(ir23.f33468c));
        bundle3.putStringArrayList("imp_urls", new ArrayList(ir23.f33470d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(ir23.f33491q));
        bundle3.putStringArrayList("fill_urls", new ArrayList(ir23.f33488n));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(ir23.f33478h));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(ir23.f33480i));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(ir23.f33482j));
        bundle3.putString("transaction_id", ir23.f33484k);
        bundle3.putString("valid_from_timestamp", ir23.f33486l);
        bundle3.putBoolean("is_closable_area_disabled", ir23.f33450M);
        if (ir23.f33487m != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", ir23.f33487m.f43027c);
            bundle4.putString("rb_type", ir23.f33487m.f43026b);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return mo30323c(f, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract mb3<AdT> mo30323c(bs2 bs2, Bundle bundle);
}
