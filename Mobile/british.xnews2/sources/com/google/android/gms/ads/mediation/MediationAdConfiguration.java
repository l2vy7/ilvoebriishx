package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    /* renamed from: a */
    private final String f19890a;

    /* renamed from: b */
    private final Bundle f19891b;

    /* renamed from: c */
    private final Bundle f19892c;

    /* renamed from: d */
    private final Context f19893d;

    /* renamed from: e */
    private final boolean f19894e;

    /* renamed from: f */
    private final Location f19895f;

    /* renamed from: g */
    private final int f19896g;

    /* renamed from: h */
    private final int f19897h;

    /* renamed from: i */
    private final String f19898i;

    /* renamed from: j */
    private final String f19899j;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2, boolean z, Location location, int i, int i2, String str2, @RecentlyNonNull String str3) {
        this.f19890a = str;
        this.f19891b = bundle;
        this.f19892c = bundle2;
        this.f19893d = context;
        this.f19894e = z;
        this.f19895f = location;
        this.f19896g = i;
        this.f19897h = i2;
        this.f19898i = str2;
        this.f19899j = str3;
    }

    @RecentlyNonNull
    public String getBidResponse() {
        return this.f19890a;
    }

    @RecentlyNonNull
    public Context getContext() {
        return this.f19893d;
    }

    @RecentlyNullable
    public Location getLocation() {
        return this.f19895f;
    }

    @RecentlyNullable
    public String getMaxAdContentRating() {
        return this.f19898i;
    }

    @RecentlyNonNull
    public Bundle getMediationExtras() {
        return this.f19892c;
    }

    @RecentlyNonNull
    public Bundle getServerParameters() {
        return this.f19891b;
    }

    @RecentlyNonNull
    public String getWatermark() {
        return this.f19899j;
    }

    public boolean isTestRequest() {
        return this.f19894e;
    }

    public int taggedForChildDirectedTreatment() {
        return this.f19896g;
    }

    public int taggedForUnderAgeTreatment() {
        return this.f19897h;
    }
}
