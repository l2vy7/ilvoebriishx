package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbnw;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {

    /* renamed from: k */
    private final zzbnw f19901k;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, Location location, int i, int i2, String str2, String str3, zzbnw zzbnw) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.f19901k = zzbnw;
    }

    @RecentlyNonNull
    public NativeAdOptions getNativeAdOptions() {
        return zzbnw.m40650C0(this.f19901k);
    }
}
