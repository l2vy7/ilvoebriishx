package com.appnext.banners;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.AppnextError;
import com.appnext.core.SettingsManager;
import com.appnext.core.callbacks.OnECPMLoaded;
import com.startapp.sdk.adsbase.model.AdPreferences;

public abstract class BaseBannerView extends ViewGroup {
    protected C3104e bannerAdapter;
    private BannerListener bannerListener;
    private String language;
    ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() {
        public final void onScrollChanged() {
            BaseBannerView.this.impression();
            BaseBannerView.this.onScrollChanged();
        }
    };

    public BaseBannerView(Context context) {
        super(context);
        if (context != null) {
            parseAttributeSet((AttributeSet) null);
            return;
        }
        throw new IllegalArgumentException("The context cannot be null.");
    }

    /* access modifiers changed from: private */
    public void impression() {
        try {
            getBannerAdapter().impression();
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$impression", th);
        }
    }

    private boolean isViewPartiallyVisible(View view) {
        try {
            if (getParent() == null) {
                return false;
            }
            Rect rect = new Rect();
            ((ViewGroup) getParent()).getHitRect(rect);
            return view.getLocalVisibleRect(rect);
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$isViewPartiallyVisible", th);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public void onScrollChanged() {
        try {
            getBannerAdapter().onScrollChanged(getVisiblePercent(this));
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$onScrollChanged", th);
        }
    }

    private void parseAttributeSet(AttributeSet attributeSet) {
        try {
            if (!isInEditMode()) {
                getBannerAdapter().init(this);
                C3103d.m10544I().mo10730i("tid", "301");
                getViewTreeObserver().addOnScrollChangedListener(this.onScrollChangedListener);
                if (attributeSet != null) {
                    TypedArray obtainAttributes = getResources().obtainAttributes(attributeSet, C3073R.styleable.BannersAttrs);
                    String string = obtainAttributes.getString(C3073R.styleable.BannersAttrs_bannerSize);
                    if (string != null) {
                        char c = 65535;
                        int hashCode = string.hashCode();
                        if (hashCode != -1966536496) {
                            if (hashCode != -96588539) {
                                if (hashCode == 1951953708) {
                                    if (string.equals(AdPreferences.TYPE_BANNER)) {
                                        c = 0;
                                    }
                                }
                            } else if (string.equals("MEDIUM_RECTANGLE")) {
                                c = 2;
                            }
                        } else if (string.equals("LARGE_BANNER")) {
                            c = 1;
                        }
                        if (c == 0) {
                            setBannerSize(BannerSize.BANNER);
                        } else if (c == 1) {
                            setBannerSize(BannerSize.LARGE_BANNER);
                        } else if (c == 2) {
                            setBannerSize(BannerSize.MEDIUM_RECTANGLE);
                        } else {
                            throw new IllegalArgumentException("Wrong banner size " + string);
                        }
                    }
                    String string2 = obtainAttributes.getString(C3073R.styleable.BannersAttrs_placementId);
                    if (string2 != null) {
                        setPlacementId(string2);
                    }
                    obtainAttributes.recycle();
                    C3103d.m10544I().mo10728a(getContext(), getPlacementId(), (SettingsManager.ConfigCallback) null);
                    getBannerAdapter().setBannerListener(new BannerListener() {
                        public final void adImpression() {
                            if (BaseBannerView.this.getBannerListener() != null) {
                                BaseBannerView.this.getBannerListener().adImpression();
                            }
                        }

                        public final void onAdClicked() {
                            if (BaseBannerView.this.getBannerListener() != null) {
                                BaseBannerView.this.getBannerListener().onAdClicked();
                            }
                        }

                        public final void onAdLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
                            if (BaseBannerView.this.getBannerListener() != null) {
                                BaseBannerView.this.getBannerListener().onAdLoaded(str, appnextAdCreativeType);
                            }
                            BaseBannerView.this.impression();
                        }

                        public final void onError(AppnextError appnextError) {
                            if (BaseBannerView.this.getBannerListener() != null) {
                                BaseBannerView.this.getBannerListener().onError(appnextError);
                            }
                        }
                    });
                    getBannerAdapter().parseAttributeSet(attributeSet);
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$parseAttributeSet", th);
        }
    }

    private void pause() {
        try {
            getBannerAdapter().pause();
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$pause", th);
        }
    }

    private void play() {
        try {
            getBannerAdapter().play();
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$destroy", th);
        }
    }

    public void destroy() {
        getBannerAdapter().destroy();
        this.bannerAdapter = null;
        try {
            getViewTreeObserver().removeOnScrollChangedListener(this.onScrollChangedListener);
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$destroy", th);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        impression();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        destroy();
    }

    /* access modifiers changed from: protected */
    public abstract C3104e getBannerAdapter();

    /* access modifiers changed from: package-private */
    public BannerListener getBannerListener() {
        return this.bannerListener;
    }

    /* access modifiers changed from: protected */
    public void getECPM(BannerAdRequest bannerAdRequest, OnECPMLoaded onECPMLoaded) {
        try {
            getBannerAdapter().getECPM(bannerAdRequest, onECPMLoaded);
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$getECPM", th);
        }
    }

    public String getLanguage() {
        return this.language;
    }

    /* access modifiers changed from: package-private */
    public String getPlacementId() {
        return getBannerAdapter().getPlacementId();
    }

    public int getVisiblePercent(View view) {
        try {
            if (isViewPartiallyVisible(this) && getWindowVisibility() != 8) {
                if (getWindowVisibility() != 4) {
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    double width = (double) (rect.width() * rect.height());
                    double width2 = (double) (view.getWidth() * view.getHeight());
                    Double.isNaN(width);
                    Double.isNaN(width2);
                    return (int) ((width * 100.0d) / width2);
                }
            }
            return 0;
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$getVisiblePercent", th);
            return 0;
        }
    }

    public boolean isClickEnabled() {
        try {
            return getBannerAdapter().isClickEnabled();
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$isClickEnabled", th);
            return false;
        }
    }

    public void loadAd(BannerAdRequest bannerAdRequest) {
        getBannerAdapter().loadAd(bannerAdRequest);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            impression();
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$onDraw", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            View childAt = getChildAt(0);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i5 = ((i3 - i) - measuredWidth) / 2;
                int i6 = ((i4 - i2) - measuredHeight) / 2;
                childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
            }
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$onLayout", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        try {
            View childAt = getChildAt(0);
            if (childAt != null) {
                if (childAt.getVisibility() != 8) {
                    measureChild(childAt, i, i2);
                    i4 = childAt.getMeasuredWidth();
                    i3 = childAt.getMeasuredHeight();
                    setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
                }
            }
            if (getBannerAdapter().getBannerSize() != null) {
                Context context = getContext();
                int J = (int) (((float) getBannerAdapter().getBannerSize().mo10435J()) * context.getResources().getDisplayMetrics().scaledDensity);
                i3 = (int) (((float) getBannerAdapter().getBannerSize().mo10436K()) * context.getResources().getDisplayMetrics().scaledDensity);
                i4 = J;
            } else {
                i3 = 0;
            }
            setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$onMeasure", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        try {
            getBannerAdapter().onWindowVisibilityChanged(i);
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$onWindowVisibilityChanged", th);
        }
    }

    public void setBannerListener(BannerListener bannerListener2) {
        try {
            getBannerAdapter().setBannerListener(bannerListener2);
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$setBannerListener", th);
        }
    }

    public void setBannerSize(BannerSize bannerSize) {
        try {
            getBannerAdapter().setBannerSize(bannerSize);
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$setBannerSize", th);
        }
    }

    public void setClickEnabled(boolean z) {
        try {
            getBannerAdapter().setClickEnabled(z);
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$setClickEnabled", th);
        }
    }

    public void setLanguage(String str) {
        try {
            this.language = str;
            this.bannerAdapter.setLanguage(str);
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$setLanguage", th);
        }
    }

    public void setParams(String str, String str2) {
        try {
            C3103d.m10544I().mo10731j(str, str2);
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$setParams", th);
        }
    }

    public void setPlacementId(String str) {
        try {
            getBannerAdapter().setPlacementId(str);
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerView$setPlacementId", th);
        }
    }

    public BaseBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        parseAttributeSet(attributeSet);
    }

    public BaseBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        parseAttributeSet(attributeSet);
    }

    public BaseBannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        parseAttributeSet(attributeSet);
    }
}
