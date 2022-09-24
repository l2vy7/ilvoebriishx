package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.C4620qy;
import com.google.android.gms.internal.ads.C7659eu;
import com.google.android.gms.internal.ads.co0;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class BaseAdView extends ViewGroup {
    @NotOnlyInitialized

    /* renamed from: b */
    protected final C4620qy f19853b;

    protected BaseAdView(@RecentlyNonNull Context context, int i) {
        super(context);
        this.f19853b = new C4620qy(this, i);
    }

    public void destroy() {
        this.f19853b.mo18681n();
    }

    @RecentlyNonNull
    public AdListener getAdListener() {
        return this.f19853b.mo18672d();
    }

    @RecentlyNullable
    public AdSize getAdSize() {
        return this.f19853b.mo18673e();
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        return this.f19853b.mo18680m();
    }

    @RecentlyNullable
    public OnPaidEventListener getOnPaidEventListener() {
        return this.f19853b.mo18674f();
    }

    @RecentlyNullable
    public ResponseInfo getResponseInfo() {
        return this.f19853b.mo18675g();
    }

    public boolean isLoading() {
        return this.f19853b.mo18670C();
    }

    public void loadAd(@RecentlyNonNull AdRequest adRequest) {
        this.f19853b.mo18682o(adRequest.zza());
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
        this.f19853b.mo18683p();
    }

    public void resume() {
        this.f19853b.mo18685r();
    }

    public void setAdListener(@RecentlyNonNull AdListener adListener) {
        this.f19853b.mo18687t(adListener);
        if (adListener == null) {
            this.f19853b.mo18686s((C7659eu) null);
            return;
        }
        if (adListener instanceof C7659eu) {
            this.f19853b.mo18686s((C7659eu) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.f19853b.mo18691x((AppEventListener) adListener);
        }
    }

    public void setAdSize(@RecentlyNonNull AdSize adSize) {
        this.f19853b.mo18688u(adSize);
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        this.f19853b.mo18690w(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f19853b.mo18693z(onPaidEventListener);
    }

    protected BaseAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f19853b = new C4620qy(this, attributeSet, false, i);
    }

    protected BaseAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f19853b = new C4620qy(this, attributeSet, false, i2);
    }

    protected BaseAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.f19853b = new C4620qy(this, attributeSet, z, i2);
    }

    protected BaseAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f19853b = new C4620qy(this, attributeSet, z);
    }
}
