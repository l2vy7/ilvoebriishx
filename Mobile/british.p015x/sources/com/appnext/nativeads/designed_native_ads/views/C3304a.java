package com.appnext.nativeads.designed_native_ads.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.appnext.base.Appnext;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextError;
import com.appnext.core.C3198g;
import com.appnext.nativeads.C3285R;
import com.appnext.nativeads.designed_native_ads.AppnextDesignedNativeAdData;
import com.appnext.nativeads.designed_native_ads.DesignNativeAdsRequest;
import com.appnext.nativeads.designed_native_ads.interfaces.AppnextDesignedNativeAdViewCallbacks;
import com.appnext.nativeads.designed_native_ads.views.C3307b;
import java.lang.ref.WeakReference;

/* renamed from: com.appnext.nativeads.designed_native_ads.views.a */
public class C3304a extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: gA */
    public String f12561gA;
    /* access modifiers changed from: private */

    /* renamed from: gB */
    public int f12562gB;
    /* access modifiers changed from: private */

    /* renamed from: gC */
    public int f12563gC;
    /* access modifiers changed from: private */

    /* renamed from: gD */
    public boolean f12564gD;
    /* access modifiers changed from: private */

    /* renamed from: gE */
    public boolean f12565gE;
    /* access modifiers changed from: private */

    /* renamed from: gF */
    public boolean f12566gF;
    /* access modifiers changed from: private */

    /* renamed from: gG */
    public boolean f12567gG;
    /* access modifiers changed from: private */

    /* renamed from: gH */
    public int f12568gH;
    /* access modifiers changed from: private */

    /* renamed from: gI */
    public int f12569gI;
    /* access modifiers changed from: private */

    /* renamed from: gJ */
    public int f12570gJ;
    /* access modifiers changed from: private */

    /* renamed from: gK */
    public boolean f12571gK;
    /* access modifiers changed from: private */

    /* renamed from: gL */
    public AppnextDesignedNativeAdViewCallbacks f12572gL;
    /* access modifiers changed from: private */

    /* renamed from: gz */
    public C3307b f12573gz;

    /* renamed from: com.appnext.nativeads.designed_native_ads.views.a$a */
    private static class C3306a implements C3307b.C3312a {

        /* renamed from: gQ */
        private WeakReference<AppnextDesignedNativeAdViewCallbacks> f12578gQ;

        public C3306a(AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
            this.f12578gQ = new WeakReference<>(appnextDesignedNativeAdViewCallbacks);
        }

        public final void onAdClicked(AppnextDesignedNativeAdData appnextDesignedNativeAdData) {
            AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks;
            WeakReference<AppnextDesignedNativeAdViewCallbacks> weakReference = this.f12578gQ;
            if (weakReference != null && (appnextDesignedNativeAdViewCallbacks = (AppnextDesignedNativeAdViewCallbacks) weakReference.get()) != null) {
                appnextDesignedNativeAdViewCallbacks.onAdClicked(appnextDesignedNativeAdData);
            }
        }

        public final void onAdsLoadedSuccessfully() {
            AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks;
            WeakReference<AppnextDesignedNativeAdViewCallbacks> weakReference = this.f12578gQ;
            if (weakReference != null && (appnextDesignedNativeAdViewCallbacks = (AppnextDesignedNativeAdViewCallbacks) weakReference.get()) != null) {
                appnextDesignedNativeAdViewCallbacks.onAppnextAdsLoadedSuccessfully();
            }
        }

        public final void onError(AppnextError appnextError) {
            AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks;
            WeakReference<AppnextDesignedNativeAdViewCallbacks> weakReference = this.f12578gQ;
            if (weakReference != null && (appnextDesignedNativeAdViewCallbacks = (AppnextDesignedNativeAdViewCallbacks) weakReference.get()) != null) {
                appnextDesignedNativeAdViewCallbacks.onAppnextAdsError(appnextError);
            }
        }
    }

    public C3304a(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* access modifiers changed from: protected */
    public void load(final String str, final DesignNativeAdsRequest designNativeAdsRequest, int i, final AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        try {
            if (C3198g.m10800k(getContext())) {
                if (i > 0) {
                    this.f12563gC = i;
                }
                this.f12572gL = appnextDesignedNativeAdViewCallbacks;
                C3317d dVar = new C3317d(getContext());
                this.f12573gz = dVar;
                dVar.mo11060a(str, new C3307b.C3313b() {
                    /* renamed from: bm */
                    public final void mo11055bm() {
                        try {
                            boolean unused = C3304a.this.f12571gK = true;
                            if (C3304a.this.f12561gA != null) {
                                C3304a.this.f12573gz.setTitle(C3304a.this.f12561gA);
                            }
                            if (C3304a.this.f12568gH != 0) {
                                C3304a.this.f12573gz.setTitleTextColorForAdUnit(C3304a.this.f12568gH);
                            }
                            if (C3304a.this.f12563gC > 0 && C3304a.this.f12563gC <= 5) {
                                C3304a.this.f12573gz.setAmountOfApps(C3304a.this.f12563gC);
                            }
                            if (C3304a.this.f12565gE) {
                                C3304a.this.f12573gz.setPresentTitles(C3304a.this.f12564gD);
                            }
                            if (C3304a.this.f12567gG) {
                                C3304a.this.f12573gz.setLocalDirection(C3304a.this.f12566gF);
                            }
                            if (C3304a.this.f12562gB != 0) {
                                C3304a.this.f12573gz.setIconAppTitleTextColor(C3304a.this.f12562gB);
                            }
                            if (C3304a.this.f12569gI != 0) {
                                C3304a.this.f12573gz.setSuggestedBackgroundColor(C3304a.this.f12569gI);
                            }
                            if (C3304a.this.f12570gJ >= 0) {
                                C3304a.this.f12573gz.setTransparency(C3304a.this.f12570gJ);
                            }
                            C3304a.this.removeAllViews();
                            C3304a aVar = C3304a.this;
                            aVar.addView(aVar.f12573gz);
                            C3304a.this.f12573gz.mo11059a(str, designNativeAdsRequest, new C3306a(C3304a.this.f12572gL));
                        } catch (Throwable th) {
                            C3117a.m10553a("AppnextDesignedNativeAdViewProxy$load", th);
                            AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks = appnextDesignedNativeAdViewCallbacks;
                            if (appnextDesignedNativeAdViewCallbacks != null) {
                                appnextDesignedNativeAdViewCallbacks.onAppnextAdsError(new AppnextError(AppnextError.INTERNAL_ERROR));
                            }
                        }
                    }
                });
            } else if (appnextDesignedNativeAdViewCallbacks != null) {
                appnextDesignedNativeAdViewCallbacks.onAppnextAdsError(new AppnextError(AppnextError.CONNECTION_ERROR));
            }
        } catch (Throwable th) {
            C3117a.m10553a("AppnextDesignedNativeAdViewProxy$load", th);
            if (appnextDesignedNativeAdViewCallbacks != null) {
                appnextDesignedNativeAdViewCallbacks.onAppnextAdsError(new AppnextError(AppnextError.INTERNAL_ERROR));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setAppTitleColor(int i) {
        try {
            this.f12562gB = i;
            C3307b bVar = this.f12573gz;
            if (bVar != null && this.f12571gK) {
                bVar.setIconAppTitleTextColor(i);
            }
        } catch (Throwable th) {
            C3117a.m10553a("AppnextDesignedNativeAdViewProxy$setAppTitleColor", th);
        }
    }

    public void setBackgroundColor(int i) {
        try {
            this.f12569gI = i;
            C3307b bVar = this.f12573gz;
            if (bVar != null && this.f12571gK) {
                bVar.setSuggestedBackgroundColor(i);
            }
        } catch (Throwable th) {
            C3117a.m10553a("AppnextDesignedNativeAdViewProxy$setBackgroundColor", th);
        }
    }

    /* access modifiers changed from: protected */
    public void setLocalDirection(boolean z) {
        try {
            this.f12566gF = z;
            this.f12567gG = true;
            C3307b bVar = this.f12573gz;
            if (bVar != null && this.f12571gK) {
                bVar.setLocalDirection(z);
            }
        } catch (Throwable th) {
            C3117a.m10553a("AppnextDesignedNativeAdViewProxy$setLocalDirection", th);
        }
    }

    /* access modifiers changed from: protected */
    public void setPresentAppTitles(boolean z) {
        try {
            this.f12564gD = z;
            this.f12565gE = true;
            C3307b bVar = this.f12573gz;
            if (bVar != null && this.f12571gK) {
                bVar.setPresentTitles(z);
            }
        } catch (Throwable th) {
            C3117a.m10553a("AppnextDesignedNativeAdViewProxy$setPresentAppTitles", th);
        }
    }

    /* access modifiers changed from: protected */
    public void setTitle(String str) {
        this.f12561gA = str;
        if (str != null && this.f12571gK) {
            this.f12573gz.setTitle(str);
        }
    }

    /* access modifiers changed from: protected */
    public void setTitleColor(int i) {
        try {
            this.f12568gH = i;
            C3307b bVar = this.f12573gz;
            if (bVar != null && this.f12571gK) {
                bVar.setTitleTextColorForAdUnit(i);
            }
        } catch (Throwable th) {
            C3117a.m10553a("AppnextDesignedNativeAdViewProxy$setTitleColor", th);
        }
    }

    /* access modifiers changed from: protected */
    public void setTransparency(int i) {
        try {
            this.f12570gJ = i;
            C3307b bVar = this.f12573gz;
            if (bVar != null && this.f12571gK) {
                bVar.setTransparency(i);
            }
        } catch (Throwable th) {
            C3117a.m10553a("AppnextDesignedNativeAdViewProxy$setTransparency", th);
        }
    }

    public C3304a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3304a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12565gE = false;
        this.f12567gG = false;
        Appnext.init(context);
        m11063a(context, attributeSet);
    }

    /* renamed from: a */
    private void m11063a(Context context, AttributeSet attributeSet) {
        setBackgroundColor(0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3285R.styleable.AppnextDesignedNativeAdView, 0, 0);
            try {
                this.f12561gA = obtainStyledAttributes.getString(C3285R.styleable.AppnextDesignedNativeAdView_title);
                this.f12568gH = obtainStyledAttributes.getInteger(C3285R.styleable.AppnextDesignedNativeAdView_titleColor, 0);
                this.f12563gC = obtainStyledAttributes.getInteger(C3285R.styleable.AppnextDesignedNativeAdView_amountOfApps, 0);
                String string = obtainStyledAttributes.getString(C3285R.styleable.AppnextDesignedNativeAdView_presentAppTitles);
                boolean z = true;
                boolean z2 = !TextUtils.isEmpty(string);
                this.f12565gE = z2;
                if (z2) {
                    this.f12564gD = Boolean.parseBoolean(string);
                }
                String string2 = obtainStyledAttributes.getString(C3285R.styleable.AppnextDesignedNativeAdView_localDirection);
                if (TextUtils.isEmpty(string2)) {
                    z = false;
                }
                this.f12567gG = z;
                if (z) {
                    this.f12566gF = Boolean.parseBoolean(string2);
                }
                this.f12562gB = obtainStyledAttributes.getColor(C3285R.styleable.AppnextDesignedNativeAdView_appTitletColor, 0);
                this.f12569gI = obtainStyledAttributes.getColor(C3285R.styleable.AppnextDesignedNativeAdView_backgroundColor, 0);
                this.f12570gJ = obtainStyledAttributes.getInteger(C3285R.styleable.AppnextDesignedNativeAdView_transparency, -1);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
            obtainStyledAttributes.recycle();
        }
        this.f12571gK = false;
    }

    public C3304a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12565gE = false;
        this.f12567gG = false;
        try {
            Appnext.init(context);
            m11063a(context, attributeSet);
        } catch (Throwable th) {
            C3117a.m10553a("AppnextDesignedNativeAdViewProxy$AppnextDesignedNativeAdViewProxy", th);
        }
    }

    /* access modifiers changed from: protected */
    public void load(String str, DesignNativeAdsRequest designNativeAdsRequest, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        load(str, designNativeAdsRequest, 0, appnextDesignedNativeAdViewCallbacks);
    }
}
