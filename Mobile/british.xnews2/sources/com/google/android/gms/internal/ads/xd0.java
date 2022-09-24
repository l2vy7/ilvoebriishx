package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class xd0 implements NativeMediationAdRequest {

    /* renamed from: a */
    private final Date f41133a;

    /* renamed from: b */
    private final int f41134b;

    /* renamed from: c */
    private final Set<String> f41135c;

    /* renamed from: d */
    private final boolean f41136d;

    /* renamed from: e */
    private final Location f41137e;

    /* renamed from: f */
    private final int f41138f;

    /* renamed from: g */
    private final zzbnw f41139g;

    /* renamed from: h */
    private final List<String> f41140h = new ArrayList();

    /* renamed from: i */
    private final boolean f41141i;

    /* renamed from: j */
    private final Map<String, Boolean> f41142j = new HashMap();

    /* renamed from: k */
    private final String f41143k;

    public xd0(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzbnw zzbnw, List<String> list, boolean z2, int i3, String str) {
        this.f41133a = date;
        this.f41134b = i;
        this.f41135c = set;
        this.f41137e = location;
        this.f41136d = z;
        this.f41138f = i2;
        this.f41139g = zzbnw;
        this.f41141i = z2;
        this.f41143k = str;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f41142j.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.f41142j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f41140h.add(next);
                }
            }
        }
    }

    public final float getAdVolume() {
        return C4632yy.m21230f().mo19012a();
    }

    @Deprecated
    public final Date getBirthday() {
        return this.f41133a;
    }

    @Deprecated
    public final int getGender() {
        return this.f41134b;
    }

    public final Set<String> getKeywords() {
        return this.f41135c;
    }

    public final Location getLocation() {
        return this.f41137e;
    }

    public final NativeAdOptions getNativeAdOptions() {
        zzbnw zzbnw = this.f41139g;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbnw == null) {
            return builder.build();
        }
        int i = zzbnw.f42993b;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbnw.f42999h);
                    builder.setMediaAspectRatio(zzbnw.f43000i);
                }
                builder.setReturnUrlsForImageAssets(zzbnw.f42994c);
                builder.setImageOrientation(zzbnw.f42995d);
                builder.setRequestMultipleImages(zzbnw.f42996e);
                return builder.build();
            }
            zzbkq zzbkq = zzbnw.f42998g;
            if (zzbkq != null) {
                builder.setVideoOptions(new VideoOptions(zzbkq));
            }
        }
        builder.setAdChoicesPlacement(zzbnw.f42997f);
        builder.setReturnUrlsForImageAssets(zzbnw.f42994c);
        builder.setImageOrientation(zzbnw.f42995d);
        builder.setRequestMultipleImages(zzbnw.f42996e);
        return builder.build();
    }

    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbnw.m40650C0(this.f41139g);
    }

    public final boolean isAdMuted() {
        return C4632yy.m21230f().mo19026u();
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f41141i;
    }

    public final boolean isTesting() {
        return this.f41136d;
    }

    public final boolean isUnifiedNativeAdRequested() {
        return this.f41140h.contains("6");
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f41138f;
    }

    public final Map<String, Boolean> zza() {
        return this.f41142j;
    }

    public final boolean zzb() {
        return this.f41140h.contains("3");
    }
}
