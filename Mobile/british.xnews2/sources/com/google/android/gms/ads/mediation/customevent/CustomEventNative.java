package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface CustomEventNative extends CustomEvent {
    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull CustomEventNativeListener customEventNativeListener, String str, @RecentlyNonNull NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle);
}
