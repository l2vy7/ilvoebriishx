package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.C4620qy;
import com.google.android.gms.internal.ads.co0;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class SearchAdView extends ViewGroup {
    @NotOnlyInitialized

    /* renamed from: b */
    private final C4620qy f19912b;

    public SearchAdView(@RecentlyNonNull Context context) {
        super(context);
        this.f19912b = new C4620qy(this);
    }

    public void destroy() {
        this.f19912b.mo18681n();
    }

    @RecentlyNonNull
    public AdListener getAdListener() {
        return this.f19912b.mo18672d();
    }

    @RecentlyNullable
    public AdSize getAdSize() {
        return this.f19912b.mo18673e();
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        return this.f19912b.mo18680m();
    }

    public void loadAd(@RecentlyNonNull DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (AdSize.SEARCH.equals(getAdSize())) {
            this.f19912b.mo18682o(dynamicHeightSearchAdRequest.mo28946a());
            return;
        }
        throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        AdSize adSize;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                co0.zzh("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        this.f19912b.mo18683p();
    }

    public void resume() {
        this.f19912b.mo18685r();
    }

    public void setAdListener(@RecentlyNonNull AdListener adListener) {
        this.f19912b.mo18687t(adListener);
    }

    public void setAdSize(@RecentlyNonNull AdSize adSize) {
        this.f19912b.mo18688u(adSize);
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        this.f19912b.mo18690w(str);
    }

    public SearchAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19912b = new C4620qy(this, attributeSet, false);
    }

    public SearchAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19912b = new C4620qy(this, attributeSet, false);
    }

    public void loadAd(@RecentlyNonNull SearchAdRequest searchAdRequest) {
        this.f19912b.mo18682o(searchAdRequest.mo17770a());
    }
}