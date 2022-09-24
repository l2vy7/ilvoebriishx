package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.C11883e5;
import com.startapp.C12132pb;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class VideoEnabledAd extends InterstitialAd {
    private static final long serialVersionUID = 1;
    private VideoAdDetails videoAdDetails = null;

    public VideoEnabledAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    /* renamed from: a */
    public void mo20839a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C12231b(this.f22229a, this, adPreferences, adEventListener, this.placement).mo46157c();
    }

    /* renamed from: c */
    public void mo20925c(String str) {
        super.mo20925c(str);
        String a = C5015nb.m22910a(str, "@videoJson@", "@videoJson@");
        if (a != null) {
            VideoAdDetails videoAdDetails2 = (VideoAdDetails) C11883e5.m52269a(a, VideoAdDetails.class);
            this.videoAdDetails = videoAdDetails2;
            if (videoAdDetails2 != null) {
                videoAdDetails2.mo45983o();
            }
        }
    }

    /* renamed from: u */
    public boolean mo45868u() {
        return this.videoAdDetails != null;
    }

    /* renamed from: v */
    public void mo45986v() {
        this.videoAdDetails = null;
    }

    /* renamed from: w */
    public VideoAdDetails mo45987w() {
        return this.videoAdDetails;
    }

    /* renamed from: a */
    public void mo45985a(C12132pb pbVar, VideoConfig videoConfig, boolean z) {
        this.videoAdDetails = new VideoAdDetails(pbVar, videoConfig, z);
        Integer num = pbVar.f54032q;
        if (num != null && pbVar.f54033r != null) {
            if (num.intValue() > pbVar.f54033r.intValue()) {
                mo20920a(SplashConfig.Orientation.LANDSCAPE);
            } else {
                mo20920a(SplashConfig.Orientation.PORTRAIT);
            }
        }
    }
}
