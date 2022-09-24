package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.ads.C8136rw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(@RecentlyNonNull Context context) {
        super(context, 0);
        C4604n.m20099l(context, "Context cannot be null");
    }

    @RecentlyNullable
    public AdSize[] getAdSizes() {
        return this.f19853b.mo18671a();
    }

    @RecentlyNullable
    public AppEventListener getAppEventListener() {
        return this.f19853b.mo18678k();
    }

    @RecentlyNonNull
    public VideoController getVideoController() {
        return this.f19853b.mo18676i();
    }

    @RecentlyNullable
    public VideoOptions getVideoOptions() {
        return this.f19853b.mo18677j();
    }

    public void loadAd(@RecentlyNonNull AdManagerAdRequest adManagerAdRequest) {
        this.f19853b.mo18682o(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.f19853b.mo18684q();
    }

    public void setAdSizes(@RecentlyNonNull AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f19853b.mo18689v(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.f19853b.mo18691x(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.f19853b.mo18692y(z);
    }

    public void setVideoOptions(@RecentlyNonNull VideoOptions videoOptions) {
        this.f19853b.mo18668A(videoOptions);
    }

    public final boolean zza(C8136rw rwVar) {
        return this.f19853b.mo18669B(rwVar);
    }

    public AdManagerAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet, true);
        C4604n.m20099l(context, "Context cannot be null");
    }

    public AdManagerAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        C4604n.m20099l(context, "Context cannot be null");
    }
}
