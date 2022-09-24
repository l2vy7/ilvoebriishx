package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.C12458z0;
import com.startapp.C5001b2;
import com.startapp.C5004d4;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.C5068d;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.Map;

/* compiled from: Sta */
public abstract class InterstitialAd extends HtmlAd implements C5068d {
    private static final long serialVersionUID = -8158520010577551438L;

    public InterstitialAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [java.lang.Boolean[], java.io.Serializable] */
    /* renamed from: a */
    public boolean mo21075a(String str) {
        String a = C5055a.m23140a();
        if (!mo45868u() || !AdsCommonMetaData.f22242h.mo20877G().mo20992a().equals(VideoConfig.BackMode.DISABLED) || !a.equals("back")) {
            if (!AdsConstants.f54495f.booleanValue()) {
                setState(C5041Ad.AdState.UN_INITIALIZED);
            }
            if (mo20929j() == null) {
                mo20838a(NotDisplayedReason.INTERNAL_ERROR);
                return false;
            } else if (super.mo20844d()) {
                mo20838a(NotDisplayedReason.AD_EXPIRED);
                return false;
            } else {
                ActivityExtra activityExtra = this.activityExtra;
                boolean z = activityExtra != null && activityExtra.mo20837a();
                Intent intent = new Intent(this.f22229a, OverlayActivity.class);
                intent.putExtra("fileUrl", "exit.html");
                String[] strArr = this.trackingUrls;
                StringBuilder a2 = C12458z0.m53804a("&position=");
                a2.append(C5055a.m23140a());
                String sb = a2.toString();
                for (int i = 0; i < strArr.length; i++) {
                    if (strArr[i] != null && !"".equals(strArr[i])) {
                        strArr[i] = strArr[i] + sb;
                    }
                }
                intent.putExtra("tracking", strArr);
                intent.putExtra("trackingClickUrl", mo20934o());
                intent.putExtra("packageNames", mo20932m());
                intent.putExtra("htmlUuid", mo20930k());
                intent.putExtra("smartRedirect", this.smartRedirect);
                intent.putExtra("browserEnabled", this.inAppBrowserEnabled);
                intent.putExtra(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.placement.mo21158a());
                intent.putExtra("adInfoOverride", getAdInfoOverride());
                intent.putExtra("ad", this);
                intent.putExtra("videoAd", mo45868u());
                intent.putExtra("fullscreen", z);
                intent.putExtra(AdUnitActivity.EXTRA_ORIENTATION, mo20931l() == 0 ? this.f22229a.getResources().getConfiguration().orientation : mo20931l());
                intent.putExtra("adTag", str);
                intent.putExtra("lastLoadTime", super.mo20842b());
                intent.putExtra("adCacheTtl", super.mo20843c());
                intent.putExtra("closingUrl", mo20926g());
                intent.putExtra("rewardDuration", mo20933n());
                intent.putExtra("rewardedHideTimer", mo20938s());
                if (mo20927h() != null) {
                    intent.putExtra("delayImpressionSeconds", mo20927h());
                }
                intent.putExtra("sendRedirectHops", mo20939t());
                intent.putExtra("mraidAd", mo20937r());
                if (mo20937r()) {
                    intent.putExtra("activityShouldLockOrientation", false);
                }
                Map<Activity, Integer> map = C5015nb.f22145a;
                if (this instanceof SplashAd) {
                    intent.putExtra("isSplash", true);
                }
                intent.putExtra("position", a);
                intent.addFlags(343932928);
                C5001b2 f = ComponentLocator.m23305a(this.f22229a).mo21219f();
                if (f.f22114d) {
                    f.f22113c = intent;
                } else {
                    try {
                        this.f22229a.startActivity(intent);
                    } catch (Throwable th) {
                        C5004d4.m22887a(th);
                        return false;
                    }
                }
                return true;
            }
        } else {
            mo20838a(NotDisplayedReason.VIDEO_BACK);
            return false;
        }
    }

    /* renamed from: b */
    public Long mo20842b() {
        return super.mo20842b();
    }

    /* renamed from: c */
    public Long mo20843c() {
        return super.mo20843c();
    }

    /* renamed from: d */
    public boolean mo20844d() {
        return super.mo20844d();
    }

    /* renamed from: u */
    public boolean mo45868u() {
        return false;
    }

    /* renamed from: a */
    public boolean mo20841a() {
        return super.mo20841a();
    }

    /* renamed from: a */
    public void mo20840a(boolean z) {
        super.mo20840a(z);
    }
}
