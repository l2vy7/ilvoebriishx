package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.IronSource;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.model.a */
public final class C11415a {

    /* renamed from: a */
    public NetworkSettings f51346a;

    /* renamed from: b */
    public JSONObject f51347b;

    /* renamed from: c */
    public boolean f51348c;

    /* renamed from: d */
    public int f51349d;

    /* renamed from: e */
    public int f51350e;

    /* renamed from: f */
    public IronSource.AD_UNIT f51351f;

    public C11415a(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f51346a = networkSettings;
        this.f51347b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f51349d = optInt;
        this.f51348c = optInt == 2;
        this.f51350e = jSONObject.optInt("maxAdsPerSession", 99);
        this.f51351f = ad_unit;
    }
}
