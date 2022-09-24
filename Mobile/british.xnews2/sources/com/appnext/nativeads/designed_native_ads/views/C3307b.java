package com.appnext.nativeads.designed_native_ads.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C3198g;
import com.appnext.core.C3202i;
import com.appnext.core.SettingsManager;
import com.appnext.nativeads.C3285R;
import com.appnext.nativeads.designed_native_ads.AppnextDesignedNativeAdData;
import com.appnext.nativeads.designed_native_ads.C3291a;
import com.appnext.nativeads.designed_native_ads.C3296c;
import com.appnext.nativeads.designed_native_ads.C3297d;
import com.appnext.nativeads.designed_native_ads.DesignNativeAd;
import com.appnext.nativeads.designed_native_ads.DesignNativeAdsRequest;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.appnext.nativeads.designed_native_ads.views.b */
public abstract class C3307b extends LinearLayout implements C3291a.C3294a {

    /* renamed from: aM */
    private Context f12579aM;

    /* renamed from: gR */
    private C3291a f12580gR;
    /* access modifiers changed from: private */

    /* renamed from: gS */
    public C3297d f12581gS;

    /* renamed from: gT */
    private ImageView f12582gT;

    /* renamed from: gU */
    private int f12583gU;
    /* access modifiers changed from: private */

    /* renamed from: gV */
    public C3312a f12584gV;

    /* renamed from: gp */
    private String f12585gp;

    /* renamed from: com.appnext.nativeads.designed_native_ads.views.b$a */
    public interface C3312a {
        void onAdClicked(AppnextDesignedNativeAdData appnextDesignedNativeAdData);

        void onAdsLoadedSuccessfully();

        void onError(AppnextError appnextError);
    }

    /* renamed from: com.appnext.nativeads.designed_native_ads.views.b$b */
    public interface C3313b {
        /* renamed from: bm */
        void mo11055bm();
    }

    public C3307b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12579aM = context;
        try {
            setVisibility(8);
            LinearLayout.inflate(this.f12579aM, C3285R.layout.design_native_ads_layout, this);
            setLayoutParams(new LinearLayout.LayoutParams(-1, (int) (((float) mo11062bn()) * getResources().getDisplayMetrics().density)));
            setSuggestedAppsBackgroundColor(-1);
            this.f12582gT = (ImageView) findViewById(C3285R.C3287id.privacy_icon);
            ((FrameLayout) findViewById(C3285R.C3287id.design_native_ads_container)).addView(((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(getContentResource(), (ViewGroup) null), new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdView$buildView", th);
        }
    }

    private void setPrivacyIcon(final AppnextAd appnextAd) {
        findViewById(C3285R.C3287id.privacy_icon_container).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C3198g.m10793e(appnextAd)));
                    intent.setFlags(268435456);
                    C3307b.this.getContext().startActivity(intent);
                } catch (Throwable th) {
                    C3117a.m10553a("DesignedNativeAdView$buildView", th);
                }
            }
        });
        if (C3202i.m10805a(appnextAd, (SettingsManager) C3296c.m11038bg())) {
            C3202i.m10804a(getContext(), this.f12582gT);
        } else {
            this.f12582gT.setImageResource(C3285R.C3286drawable.apnxt_na_i_icon_dark);
        }
    }

    private void setSuggestedAppsBackgroundColor(int i) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(i);
            gradientDrawable.setCornerRadius(30.0f);
            setBackground(gradientDrawable);
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdView$setSuggestedAppsBackgroundColor", th);
        }
    }

    /* renamed from: a */
    public final void mo11060a(String str, final C3313b bVar) {
        C3291a aVar = new C3291a();
        this.f12580gR = aVar;
        aVar.mo11024a((C3291a.C3294a) this);
        C3296c.m11038bg().mo10728a(getContext().getApplicationContext(), str, new SettingsManager.ConfigCallback() {
            public final void error(String str) {
                try {
                    C3307b.m11077a(C3307b.this);
                    C3313b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo11055bm();
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("DesignedNativeAdView$init", th);
                }
            }

            public final void loaded(HashMap<String, Object> hashMap) {
                try {
                    C3307b.m11077a(C3307b.this);
                    C3313b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo11055bm();
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("DesignedNativeAdView$init", th);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11061a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: bn */
    public abstract int mo11062bn();

    /* renamed from: e */
    public final void mo11026e(List<DesignNativeAd> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    setVisibility(0);
                    setPrivacyIcon(list.get(0));
                    this.f12581gS = new C3297d(this.f12579aM, list, this.f12585gp);
                    mo11063g(list);
                    C3312a aVar = this.f12584gV;
                    if (aVar != null) {
                        aVar.onAdsLoadedSuccessfully();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                C3117a.m10553a("DesignedNativeAdView$onLoaded", th);
                return;
            }
        }
        setVisibility(8);
        C3312a aVar2 = this.f12584gV;
        if (aVar2 != null) {
            aVar2.onError(new AppnextError(AppnextError.INTERNAL_ERROR));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo11063g(List<DesignNativeAd> list);

    /* access modifiers changed from: protected */
    public abstract int getContentResource();

    public final void onError(AppnextError appnextError) {
        try {
            setVisibility(8);
            C3312a aVar = this.f12584gV;
            if (aVar != null) {
                aVar.onError(appnextError);
            }
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdView$onError", th);
        }
    }

    public void setAmountOfApps(int i) {
        this.f12583gU = i;
    }

    public void setIconAppTitleTextColor(int i) {
        setIconTitleTextColor(i);
    }

    /* access modifiers changed from: protected */
    public abstract void setIconTitleTextColor(int i);

    public void setLocalDirection(boolean z) {
        try {
            if (Build.VERSION.SDK_INT < 17) {
                return;
            }
            if (z) {
                setLayoutDirection(3);
            } else {
                setLayoutDirection(0);
            }
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdView$setLocalDirection", th);
        }
    }

    public void setPresentTitles(boolean z) {
        mo11061a(z);
    }

    public void setSuggestedBackgroundColor(int i) {
        setSuggestedAppsBackgroundColor(i);
    }

    public void setTitle(String str) {
        setTitleText(str);
    }

    /* access modifiers changed from: protected */
    public abstract void setTitleText(String str);

    public void setTitleTextColor(int i) {
        setTitleTextColorForAdUnit(i);
    }

    /* access modifiers changed from: protected */
    public abstract void setTitleTextColorForAdUnit(int i);

    public void setTransparency(int i) {
        try {
            float min = (float) Math.min(100, i);
            if (min < 0.0f) {
                min = 0.0f;
            }
            setAlpha(min / 100.0f);
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdView$setTransparency", th);
        }
    }

    /* renamed from: a */
    public final void mo11059a(String str, DesignNativeAdsRequest designNativeAdsRequest, C3312a aVar) {
        try {
            this.f12584gV = aVar;
            this.f12585gp = str;
            this.f12580gR.mo11023a(this.f12579aM, str, designNativeAdsRequest, this.f12583gU);
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdView$load", th);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m11077a(C3307b bVar) {
        try {
            bVar.setTitle(C3296c.m11038bg().mo10732y("title"));
            bVar.setTitleTextColor(Color.parseColor(C3296c.m11038bg().mo10732y("title_text_color")));
            bVar.setAmountOfApps(Integer.parseInt(C3296c.m11038bg().mo10732y("amount_of_icons")));
            bVar.mo11061a(Boolean.parseBoolean(C3296c.m11038bg().mo10732y("present_titles")));
            bVar.setIconAppTitleTextColor(Color.parseColor(C3296c.m11038bg().mo10732y("app_title_text_color")));
            bVar.setLocalDirection(Boolean.parseBoolean(C3296c.m11038bg().mo10732y("local_direction")));
            bVar.setSuggestedBackgroundColor(Color.parseColor(C3296c.m11038bg().mo10732y("background_color")));
            bVar.setTransparency(Integer.parseInt(C3296c.m11038bg().mo10732y("transparency")));
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdView$initParameters", th);
        }
    }
}
