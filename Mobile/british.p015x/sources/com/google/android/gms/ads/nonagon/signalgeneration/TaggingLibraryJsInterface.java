package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.internal.ads.C7497ab;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.p00;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class TaggingLibraryJsInterface {

    /* renamed from: a */
    private final Context f28062a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final WebView f28063b;

    /* renamed from: c */
    private final C7497ab f28064c;

    TaggingLibraryJsInterface(WebView webView, C7497ab abVar) {
        this.f28063b = webView;
        this.f28062a = webView.getContext();
        this.f28064c = abVar;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        p00.m35913c(this.f28062a);
        try {
            return this.f28064c.mo30331c().zze(this.f28062a, str, this.f28063b);
        } catch (RuntimeException e) {
            co0.zzh("Exception getting click signals. ", e);
            zzt.zzo().mo18592s(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        Context context = this.f28062a;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), new zzai(this, uuid));
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        p00.m35913c(this.f28062a);
        try {
            return this.f28064c.mo30331c().zzh(this.f28062a, this.f28063b, (Activity) null);
        } catch (RuntimeException e) {
            co0.zzh("Exception getting view signals. ", e);
            zzt.zzo().mo18592s(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        p00.m35913c(this.f28062a);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("x");
            int i2 = jSONObject.getInt("y");
            int i3 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i4 = jSONObject.getInt(SessionDescription.ATTR_TYPE);
            this.f28064c.mo30332d(MotionEvent.obtain(0, (long) i3, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? -1 : 3 : 2 : 1 : 0, (float) i, (float) i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e) {
            co0.zzh("Failed to parse the touch string. ", e);
            zzt.zzo().mo18592s(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
