package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class vf0 {

    /* renamed from: a */
    private final xt0 f40409a;

    /* renamed from: b */
    private final String f40410b;

    public vf0(xt0 xt0, String str) {
        this.f40409a = xt0;
        this.f40410b = str;
    }

    /* renamed from: b */
    public final void mo35418b(int i, int i2, int i3, int i4) {
        try {
            this.f40409a.mo18322a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            co0.zzh("Error occurred while dispatching default position.", e);
        }
    }

    /* renamed from: c */
    public final void mo35419c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f40410b);
            xt0 xt0 = this.f40409a;
            if (xt0 != null) {
                xt0.mo18322a("onError", put);
            }
        } catch (JSONException e) {
            co0.zzh("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: d */
    public final void mo35420d(String str) {
        try {
            this.f40409a.mo18322a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            co0.zzh("Error occurred while dispatching ready Event.", e);
        }
    }

    /* renamed from: e */
    public final void mo35421e(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f40409a.mo18322a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            co0.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    /* renamed from: f */
    public final void mo35422f(int i, int i2, int i3, int i4) {
        try {
            this.f40409a.mo18322a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            co0.zzh("Error occurred while dispatching size change.", e);
        }
    }

    /* renamed from: g */
    public final void mo35423g(String str) {
        try {
            this.f40409a.mo18322a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            co0.zzh("Error occurred while dispatching state change.", e);
        }
    }
}
