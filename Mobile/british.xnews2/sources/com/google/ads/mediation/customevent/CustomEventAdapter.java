package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.C4547a;
import com.google.ads.mediation.C4549c;
import com.google.ads.mediation.C4552d;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.co0;
import p130p3.C5902a;
import p130p3.C5904c;
import p137q3.C5942c;

@KeepName
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, C5942c>, MediationInterstitialAdapter<CustomEventExtras, C5942c> {

    /* renamed from: a */
    private View f19799a;

    /* renamed from: b */
    CustomEventBanner f19800b;

    /* renamed from: c */
    CustomEventInterstitial f19801c;

    /* renamed from: a */
    private static <T> T m19670a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            co0.zzj(sb.toString());
            return null;
        }
    }

    public void destroy() {
        CustomEventBanner customEventBanner = this.f19800b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f19801c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @RecentlyNonNull
    public Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    @RecentlyNonNull
    public View getBannerView() {
        return this.f19799a;
    }

    @RecentlyNonNull
    public Class<C5942c> getServerParametersType() {
        return C5942c.class;
    }

    public void showInterstitial() {
        this.f19801c.showInterstitial();
    }

    public void requestBannerAd(@RecentlyNonNull C4549c cVar, @RecentlyNonNull Activity activity, @RecentlyNonNull C5942c cVar2, @RecentlyNonNull C5904c cVar3, @RecentlyNonNull C4547a aVar, @RecentlyNonNull CustomEventExtras customEventExtras) {
        Object obj;
        CustomEventBanner customEventBanner = (CustomEventBanner) m19670a(cVar2.f24862b);
        this.f19800b = customEventBanner;
        if (customEventBanner == null) {
            cVar.mo16967b(this, C5902a.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            obj = null;
        } else {
            obj = customEventExtras.getExtra(cVar2.f24861a);
        }
        Activity activity2 = activity;
        this.f19800b.requestBannerAd(new C4550a(this, cVar), activity2, cVar2.f24861a, cVar2.f24863c, cVar3, aVar, obj);
    }

    public void requestInterstitialAd(@RecentlyNonNull C4552d dVar, @RecentlyNonNull Activity activity, @RecentlyNonNull C5942c cVar, @RecentlyNonNull C4547a aVar, @RecentlyNonNull CustomEventExtras customEventExtras) {
        Object obj;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m19670a(cVar.f24862b);
        this.f19801c = customEventInterstitial;
        if (customEventInterstitial == null) {
            dVar.mo16975a(this, C5902a.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            obj = null;
        } else {
            obj = customEventExtras.getExtra(cVar.f24861a);
        }
        Activity activity2 = activity;
        this.f19801c.requestInterstitialAd(new C4551b(this, this, dVar), activity2, cVar.f24861a, cVar.f24863c, aVar, obj);
    }
}
