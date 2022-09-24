package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4604n;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hd2 implements yi2<Bundle> {

    /* renamed from: a */
    final bs2 f32711a;

    /* renamed from: b */
    private final long f32712b;

    public hd2(bs2 bs2, long j) {
        C4604n.m20099l(bs2, "the targeting must not be null");
        this.f32711a = bs2;
        this.f32712b = j;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzbfd zzbfd = this.f32711a.f30087d;
        bundle.putInt("http_timeout_millis", zzbfd.f42962x);
        bundle.putString("slotname", this.f32711a.f30089f);
        int i = this.f32711a.f30098o.f38265a;
        int i2 = i - 1;
        if (i != 0) {
            boolean z = true;
            if (i2 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i2 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.f32712b);
            ms2.m34893g(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzbfd.f42941c)), zzbfd.f42941c != -1);
            ms2.m34888b(bundle, "extras", zzbfd.f42942d);
            ms2.m34892f(bundle, "cust_gender", Integer.valueOf(zzbfd.f42943e), zzbfd.f42943e != -1);
            ms2.m34890d(bundle, "kw", zzbfd.f42944f);
            ms2.m34892f(bundle, "tag_for_child_directed_treatment", Integer.valueOf(zzbfd.f42946h), zzbfd.f42946h != -1);
            if (zzbfd.f42945g) {
                bundle.putBoolean("test_request", true);
            }
            ms2.m34892f(bundle, "d_imp_hdr", 1, zzbfd.f42940b >= 2 && zzbfd.f42947i);
            String str = zzbfd.f42948j;
            ms2.m34893g(bundle, "ppid", str, zzbfd.f42940b >= 2 && !TextUtils.isEmpty(str));
            Location location = zzbfd.f42950l;
            if (location != null) {
                Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", valueOf.floatValue());
                bundle2.putLong("lat", valueOf3.longValue());
                bundle2.putLong("long", valueOf4.longValue());
                bundle2.putLong("time", valueOf2.longValue());
                bundle.putBundle("uule", bundle2);
            }
            ms2.m34889c(bundle, "url", zzbfd.f42951m);
            ms2.m34890d(bundle, "neighboring_content_urls", zzbfd.f42961w);
            ms2.m34888b(bundle, "custom_targeting", zzbfd.f42953o);
            ms2.m34890d(bundle, "category_exclusions", zzbfd.f42954p);
            ms2.m34889c(bundle, "request_agent", zzbfd.f42955q);
            ms2.m34889c(bundle, "request_pkg", zzbfd.f42956r);
            ms2.m34891e(bundle, "is_designed_for_families", Boolean.valueOf(zzbfd.f42957s), zzbfd.f42940b >= 7);
            if (zzbfd.f42940b >= 8) {
                Integer valueOf5 = Integer.valueOf(zzbfd.f42959u);
                if (zzbfd.f42959u == -1) {
                    z = false;
                }
                ms2.m34892f(bundle, "tag_for_under_age_of_consent", valueOf5, z);
                ms2.m34889c(bundle, "max_ad_content_rating", zzbfd.f42960v);
                return;
            }
            return;
        }
        throw null;
    }
}
