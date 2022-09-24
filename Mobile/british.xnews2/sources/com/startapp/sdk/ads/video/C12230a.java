package com.startapp.sdk.ads.video;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.startapp.C11924g8;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.video.VideoUtil;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.common.SDKException;
import java.util.Map;

/* renamed from: com.startapp.sdk.ads.video.a */
/* compiled from: Sta */
public class C12230a extends GetAdRequest {

    /* renamed from: S0 */
    public GetAdRequest.VideoRequestType f54383S0;

    /* renamed from: T0 */
    public GetAdRequest.VideoRequestMode f54384T0 = GetAdRequest.VideoRequestMode.INTERSTITIAL;

    /* renamed from: a */
    public void mo46028a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair<String, String> pair) {
        super.mo46028a(context, adPreferences, placement, pair);
        C5041Ad.AdType adType = this.f54610R0;
        if (adType != null) {
            if (adType == C5041Ad.AdType.NON_VIDEO) {
                this.f54383S0 = GetAdRequest.VideoRequestType.DISABLED;
            } else if (adType == C5041Ad.AdType.VIDEO_NO_VAST) {
                this.f54383S0 = GetAdRequest.VideoRequestType.FORCED_NONVAST;
            } else if (mo46276b()) {
                this.f54383S0 = GetAdRequest.VideoRequestType.FORCED;
            }
        } else if (VideoUtil.m53049a(context) == VideoUtil.VideoEligibility.ELIGIBLE) {
            Map<Activity, Integer> map = C5015nb.f22145a;
            this.f54383S0 = GetAdRequest.VideoRequestType.ENABLED;
        } else {
            this.f54383S0 = GetAdRequest.VideoRequestType.DISABLED;
        }
        C5041Ad.AdType adType2 = this.f54610R0;
        if (adType2 == C5041Ad.AdType.REWARDED_VIDEO) {
            this.f54384T0 = GetAdRequest.VideoRequestMode.REWARDED;
        }
        if (adType2 == C5041Ad.AdType.VIDEO) {
            this.f54384T0 = GetAdRequest.VideoRequestMode.INTERSTITIAL;
        }
    }

    /* renamed from: a */
    public void mo45384a(C11924g8 g8Var) throws SDKException {
        super.mo45384a(g8Var);
        g8Var.mo45382a("video", (Object) this.f54383S0, false, true);
        g8Var.mo45382a("videoMode", (Object) this.f54384T0, false, true);
    }
}
