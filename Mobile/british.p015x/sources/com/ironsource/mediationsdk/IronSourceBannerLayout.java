package com.ironsource.mediationsdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;

public class IronSourceBannerLayout extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public View f22095b;

    /* renamed from: c */
    private ISBannerSize f22096c;

    /* renamed from: d */
    private String f22097d;

    /* renamed from: e */
    private Activity f22098e;

    /* renamed from: f */
    private boolean f22099f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f22100g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public BannerListener f22101h;

    /* renamed from: com.ironsource.mediationsdk.IronSourceBannerLayout$a */
    class C4998a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ IronSourceError f22102b;

        C4998a(IronSourceError ironSourceError) {
            this.f22102b = ironSourceError;
        }

        public final void run() {
            if (IronSourceBannerLayout.this.f22100g) {
                IronSourceBannerLayout.this.f22101h.onBannerAdLoadFailed(this.f22102b);
                return;
            }
            try {
                if (IronSourceBannerLayout.this.f22095b != null) {
                    IronSourceBannerLayout ironSourceBannerLayout = IronSourceBannerLayout.this;
                    ironSourceBannerLayout.removeView(ironSourceBannerLayout.f22095b);
                    View unused = IronSourceBannerLayout.this.f22095b = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (IronSourceBannerLayout.this.f22101h != null) {
                IronSourceBannerLayout.this.f22101h.onBannerAdLoadFailed(this.f22102b);
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.IronSourceBannerLayout$b */
    class C4999b implements Runnable {

        /* renamed from: b */
        private /* synthetic */ View f22104b;

        /* renamed from: c */
        private /* synthetic */ FrameLayout.LayoutParams f22105c;

        C4999b(View view, FrameLayout.LayoutParams layoutParams) {
            this.f22104b = view;
            this.f22105c = layoutParams;
        }

        public final void run() {
            IronSourceBannerLayout.this.removeAllViews();
            ViewParent parent = this.f22104b.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f22104b);
            }
            View unused = IronSourceBannerLayout.this.f22095b = this.f22104b;
            IronSourceBannerLayout.this.addView(this.f22104b, 0, this.f22105c);
        }
    }

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f22098e = activity;
        this.f22096c = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final IronSourceBannerLayout mo20628b() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.f22098e, this.f22096c);
        ironSourceBannerLayout.setBannerListener(this.f22101h);
        ironSourceBannerLayout.setPlacementName(this.f22097d);
        return ironSourceBannerLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo20629c(View view, FrameLayout.LayoutParams layoutParams) {
        new Handler(Looper.getMainLooper()).post(new C4999b(view, layoutParams));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo20630d(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.CALLBACK;
        ironLog.info("error=" + ironSourceError);
        new Handler(Looper.getMainLooper()).post(new C4998a(ironSourceError));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo20631e(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + str);
        if (this.f22101h != null && !this.f22100g) {
            IronLog.CALLBACK.info("");
            this.f22101h.onBannerAdLoaded();
        }
        this.f22100g = true;
    }

    public Activity getActivity() {
        return this.f22098e;
    }

    public BannerListener getBannerListener() {
        return this.f22101h;
    }

    public View getBannerView() {
        return this.f22095b;
    }

    public String getPlacementName() {
        return this.f22097d;
    }

    public ISBannerSize getSize() {
        return this.f22096c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo20637h() {
        this.f22099f = true;
        this.f22101h = null;
        this.f22098e = null;
        this.f22096c = null;
        this.f22097d = null;
        this.f22095b = null;
    }

    public boolean isDestroyed() {
        return this.f22099f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo20639j() {
        if (this.f22101h != null) {
            IronLog.CALLBACK.info("");
            this.f22101h.onBannerAdClicked();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo20640k() {
        if (this.f22101h != null) {
            IronLog.CALLBACK.info("");
            this.f22101h.onBannerAdScreenPresented();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo20641l() {
        if (this.f22101h != null) {
            IronLog.CALLBACK.info("");
            this.f22101h.onBannerAdScreenDismissed();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo20642m() {
        if (this.f22101h != null) {
            IronLog.CALLBACK.info("");
            this.f22101h.onBannerAdLeftApplication();
        }
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        this.f22101h = null;
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info("");
        this.f22101h = bannerListener;
    }

    public void setPlacementName(String str) {
        this.f22097d = str;
    }
}
