package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.az */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7521az {

    /* renamed from: a */
    private final String f29831a;

    /* renamed from: b */
    private final Bundle f29832b;

    /* renamed from: c */
    private final String f29833c;

    public C7521az(String str, Bundle bundle, String str2) {
        this.f29831a = str;
        this.f29832b = bundle;
        this.f29833c = str2;
    }

    /* renamed from: a */
    public final Bundle mo30578a() {
        return this.f29832b;
    }

    /* renamed from: b */
    public final String mo30579b() {
        return this.f29831a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo30580c() {
        return this.f29833c;
    }

    /* renamed from: d */
    public final String mo30581d() {
        if (TextUtils.isEmpty(this.f29833c)) {
            return "";
        }
        try {
            return new JSONObject(this.f29833c).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }
}
