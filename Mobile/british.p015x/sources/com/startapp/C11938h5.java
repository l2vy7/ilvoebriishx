package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.h5 */
/* compiled from: Sta */
public class C11938h5 {

    /* renamed from: a */
    public boolean f53034a;

    /* renamed from: b */
    public boolean f53035b;

    /* renamed from: c */
    public Runnable f53036c;

    /* renamed from: d */
    public Runnable f53037d;

    /* renamed from: e */
    public Runnable f53038e;

    /* renamed from: f */
    public Context f53039f;

    /* renamed from: g */
    public TrackingParams f53040g;

    public C11938h5(Context context, Runnable runnable, TrackingParams trackingParams, boolean z) {
        this(context, runnable, trackingParams);
        this.f53035b = z;
    }

    @JavascriptInterface
    public void closeAd() {
        if (!this.f53034a) {
            this.f53034a = true;
            this.f53036c.run();
        }
    }

    @JavascriptInterface
    public void enableScroll(String str) {
        Runnable runnable = this.f53038e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @JavascriptInterface
    public void externalLinks(String str) {
        if (this.f53035b) {
            Map<Activity, Integer> map = C5015nb.f22145a;
            C5055a.m23147a(this.f53039f, str, (String) null);
            return;
        }
        C5055a.m23164b(this.f53039f, str, (String) null);
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str)) {
            C5055a.m23146a(this.f53039f, str, this.f53040g);
        }
        Intent a = C5015nb.m22901a(this.f53039f, str2);
        if (!(a == null || str3 == null)) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    a.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (a != null) {
            try {
                this.f53039f.startActivity(a);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
        Runnable runnable = this.f53037d;
        if (runnable != null) {
            runnable.run();
        }
    }

    public C11938h5(Context context, Runnable runnable, TrackingParams trackingParams) {
        this.f53034a = false;
        this.f53035b = true;
        this.f53036c = null;
        this.f53037d = null;
        this.f53038e = null;
        this.f53036c = runnable;
        this.f53039f = context;
        this.f53040g = trackingParams;
    }

    public C11938h5(Context context, Runnable runnable, Runnable runnable2, TrackingParams trackingParams) {
        this(context, runnable, trackingParams);
        this.f53037d = runnable2;
    }
}
