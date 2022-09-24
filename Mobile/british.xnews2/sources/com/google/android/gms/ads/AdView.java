package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C4604n;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdView extends BaseAdView {
    public AdView(@RecentlyNonNull Context context) {
        super(context, 0);
        C4604n.m20099l(context, "Context cannot be null");
    }

    @RecentlyNonNull
    public final VideoController zza() {
        return this.f19853b.mo18676i();
    }

    public AdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
