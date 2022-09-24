package com.google.android.gms.ads.p195h5;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.h80;

/* renamed from: com.google.android.gms.ads.h5.H5AdsRequestHandler */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class H5AdsRequestHandler {

    /* renamed from: a */
    private final h80 f27773a;

    public H5AdsRequestHandler(@RecentlyNonNull Context context, @RecentlyNonNull OnH5AdsEventListener onH5AdsEventListener) {
        this.f27773a = new h80(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.f27773a.mo32367a();
    }

    public boolean handleH5AdsRequest(@RecentlyNonNull String str) {
        return this.f27773a.mo32368b(str);
    }

    public boolean shouldInterceptRequest(@RecentlyNonNull String str) {
        return h80.m32834c(str);
    }
}
