package com.appnext.banners;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.appnext.base.C3117a;
import com.appnext.core.callbacks.OnECPMLoaded;

/* renamed from: com.appnext.banners.e */
public abstract class C3104e {
    private BannerListener bannerListener;
    private BannerSize bannerSize;
    protected Context context;
    private String language;
    private String placementId;
    protected ViewGroup rootView;

    private boolean isViewPartiallyVisible(View view) {
        try {
            ViewGroup viewGroup = this.rootView;
            if (viewGroup != null) {
                if (viewGroup.getParent() != null) {
                    Rect rect = new Rect();
                    ((ViewGroup) this.rootView.getParent()).getHitRect(rect);
                    return view.getLocalVisibleRect(rect);
                }
            }
            return false;
        } catch (Throwable th) {
            C3117a.m10553a("BaseBannerAdapter$isViewPartiallyVisible", th);
            return false;
        }
    }

    public abstract void click();

    public void destroy() {
        this.context = null;
    }

    public BannerListener getBannerListener() {
        return this.bannerListener;
    }

    public BannerSize getBannerSize() {
        return this.bannerSize;
    }

    public abstract void getECPM(BannerAdRequest bannerAdRequest, OnECPMLoaded onECPMLoaded);

    public String getLanguage() {
        return this.language;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public int getVisiblePercent(View view) {
        if (!isViewPartiallyVisible(this.rootView) || this.rootView.getWindowVisibility() == 8 || this.rootView.getWindowVisibility() == 4) {
            return 0;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        double width = (double) (rect.width() * rect.height());
        double width2 = (double) (view.getWidth() * view.getHeight());
        Double.isNaN(width);
        Double.isNaN(width2);
        return (int) ((width * 100.0d) / width2);
    }

    public abstract void impression();

    public void init(ViewGroup viewGroup) {
        this.rootView = viewGroup;
        this.context = viewGroup.getContext();
    }

    public boolean isClickEnabled() {
        return false;
    }

    public abstract void loadAd(BannerAdRequest bannerAdRequest);

    public void onScrollChanged(int i) {
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
    }

    /* access modifiers changed from: protected */
    public void openLink(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        this.context.startActivity(intent);
    }

    public void parseAttributeSet(AttributeSet attributeSet) {
    }

    public void pause() {
    }

    public void play() {
    }

    public void setBannerListener(BannerListener bannerListener2) {
        this.bannerListener = bannerListener2;
    }

    public void setBannerSize(BannerSize bannerSize2) {
        this.bannerSize = bannerSize2;
    }

    public void setClickEnabled(boolean z) {
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }
}
