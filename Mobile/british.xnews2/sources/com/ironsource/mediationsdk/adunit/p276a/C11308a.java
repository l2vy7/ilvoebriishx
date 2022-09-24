package com.ironsource.mediationsdk.adunit.p276a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.a.a */
public class C11308a {

    /* renamed from: a */
    private int f50754a = -1;

    /* renamed from: b */
    private long f50755b = -1;

    /* renamed from: c */
    private JSONObject f50756c;

    public C11308a(int i, long j, JSONObject jSONObject) {
        this.f50754a = i;
        this.f50755b = j;
        this.f50756c = jSONObject;
    }

    public C11308a(int i, JSONObject jSONObject) {
        this.f50754a = i;
        this.f50755b = System.currentTimeMillis();
        if (jSONObject == null) {
            this.f50756c = new JSONObject();
        } else {
            this.f50756c = jSONObject;
        }
    }

    /* renamed from: a */
    public static int m50513a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_INIT_EXCEPTION;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_INIT_EXCEPTION;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    /* renamed from: b */
    public static int m50514b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return 1037;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1027;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    /* renamed from: a */
    public int mo44037a() {
        return this.f50754a;
    }

    /* renamed from: a */
    public void mo44038a(int i) {
        this.f50754a = i;
    }

    /* renamed from: a */
    public void mo44039a(String str, Object obj) {
        try {
            this.f50756c.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public long mo44040b() {
        return this.f50755b;
    }

    /* renamed from: c */
    public String mo44041c() {
        return this.f50756c.toString();
    }

    /* renamed from: d */
    public JSONObject mo44042d() {
        return this.f50756c;
    }
}
