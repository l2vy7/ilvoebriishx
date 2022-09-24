package com.ironsource.sdk;

import com.ironsource.sdk.p297j.C11720a;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c */
public final class C11531c {

    /* renamed from: a */
    public boolean f51850a = false;

    /* renamed from: b */
    public boolean f51851b = false;

    /* renamed from: c */
    public C11515a f51852c = null;

    /* renamed from: d */
    public Map<String, String> f51853d;

    /* renamed from: e */
    private String f51854e;

    /* renamed from: f */
    private final C11720a f51855f;

    public C11531c(String str, C11720a aVar) {
        this.f51854e = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f51855f = (C11720a) SDKUtils.requireNonNull(aVar, "AdListener name can't be null");
    }

    /* renamed from: a */
    public final C11524b mo44620a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MediationMetaData.KEY_NAME, this.f51854e);
            jSONObject.put("rewarded", this.f51850a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new C11524b(this.f51851b ? C11673d.m51706a() : C11673d.m51708a(jSONObject), this.f51854e, this.f51850a, this.f51851b, this.f51853d, this.f51855f, this.f51852c);
    }
}
