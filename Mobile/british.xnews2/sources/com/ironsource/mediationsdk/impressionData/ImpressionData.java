package com.ironsource.mediationsdk.impressionData;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

public class ImpressionData {

    /* renamed from: A */
    private String f51224A = null;

    /* renamed from: B */
    private DecimalFormat f51225B;

    /* renamed from: a */
    private final String f51226a = IronSourceConstants.EVENTS_AUCTION_ID;

    /* renamed from: b */
    private final String f51227b = IronSourceConstants.EVENTS_AD_UNIT;

    /* renamed from: c */
    private final String f51228c = "country";

    /* renamed from: d */
    private final String f51229d = "ab";

    /* renamed from: e */
    private final String f51230e = "segmentName";

    /* renamed from: f */
    private final String f51231f = IronSourceConstants.EVENTS_PLACEMENT_NAME;

    /* renamed from: g */
    private final String f51232g = "adNetwork";

    /* renamed from: h */
    private final String f51233h = "instanceName";

    /* renamed from: i */
    private final String f51234i = "instanceId";

    /* renamed from: j */
    private final String f51235j = "revenue";

    /* renamed from: k */
    private final String f51236k = "precision";

    /* renamed from: l */
    private final String f51237l = "lifetimeRevenue";

    /* renamed from: m */
    private final String f51238m = "encryptedCPM";

    /* renamed from: n */
    private JSONObject f51239n;

    /* renamed from: o */
    private String f51240o = null;

    /* renamed from: p */
    private String f51241p = null;

    /* renamed from: q */
    private String f51242q = null;

    /* renamed from: r */
    private String f51243r = null;

    /* renamed from: s */
    private String f51244s = null;

    /* renamed from: t */
    private String f51245t = null;

    /* renamed from: u */
    private String f51246u = null;

    /* renamed from: v */
    private String f51247v = null;

    /* renamed from: w */
    private String f51248w = null;

    /* renamed from: x */
    private Double f51249x = null;

    /* renamed from: y */
    private String f51250y = null;

    /* renamed from: z */
    private Double f51251z = null;

    public ImpressionData(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str = "revenue";
        this.f51225B = new DecimalFormat("#.#####");
        if (jSONObject2 != null) {
            try {
                this.f51239n = jSONObject2;
                this.f51240o = jSONObject2.optString(IronSourceConstants.EVENTS_AUCTION_ID, (String) null);
                this.f51241p = jSONObject2.optString(IronSourceConstants.EVENTS_AD_UNIT, (String) null);
                this.f51242q = jSONObject2.optString("country", (String) null);
                this.f51243r = jSONObject2.optString("ab", (String) null);
                this.f51244s = jSONObject2.optString("segmentName", (String) null);
                this.f51245t = jSONObject2.optString(IronSourceConstants.EVENTS_PLACEMENT_NAME, (String) null);
                this.f51246u = jSONObject2.optString("adNetwork", (String) null);
                this.f51247v = jSONObject2.optString("instanceName", (String) null);
                this.f51248w = jSONObject2.optString("instanceId", (String) null);
                this.f51250y = jSONObject2.optString("precision", (String) null);
                this.f51224A = jSONObject2.optString("encryptedCPM", (String) null);
                double optDouble = jSONObject2.optDouble("lifetimeRevenue");
                this.f51251z = Double.isNaN(optDouble) ? null : Double.valueOf(optDouble);
                double optDouble2 = jSONObject2.optDouble(str);
                this.f51249x = Double.isNaN(optDouble2) ? null : Double.valueOf(optDouble2);
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("error parsing impression " + e.getMessage());
            }
        }
    }

    public String getAb() {
        return this.f51243r;
    }

    public String getAdNetwork() {
        return this.f51246u;
    }

    public String getAdUnit() {
        return this.f51241p;
    }

    public JSONObject getAllData() {
        return this.f51239n;
    }

    public String getAuctionId() {
        return this.f51240o;
    }

    public String getCountry() {
        return this.f51242q;
    }

    public String getEncryptedCPM() {
        return this.f51224A;
    }

    public String getInstanceId() {
        return this.f51248w;
    }

    public String getInstanceName() {
        return this.f51247v;
    }

    public Double getLifetimeRevenue() {
        return this.f51251z;
    }

    public String getPlacement() {
        return this.f51245t;
    }

    public String getPrecision() {
        return this.f51250y;
    }

    public Double getRevenue() {
        return this.f51249x;
    }

    public String getSegmentName() {
        return this.f51244s;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.f51245t;
        if (str3 != null) {
            String replace = str3.replace(str, str2);
            this.f51245t = replace;
            JSONObject jSONObject = this.f51239n;
            if (jSONObject != null) {
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, replace);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImpressionData{auctionId='");
        sb.append(this.f51240o);
        sb.append('\'');
        sb.append(", adUnit='");
        sb.append(this.f51241p);
        sb.append('\'');
        sb.append(", country='");
        sb.append(this.f51242q);
        sb.append('\'');
        sb.append(", ab='");
        sb.append(this.f51243r);
        sb.append('\'');
        sb.append(", segmentName='");
        sb.append(this.f51244s);
        sb.append('\'');
        sb.append(", placement='");
        sb.append(this.f51245t);
        sb.append('\'');
        sb.append(", adNetwork='");
        sb.append(this.f51246u);
        sb.append('\'');
        sb.append(", instanceName='");
        sb.append(this.f51247v);
        sb.append('\'');
        sb.append(", instanceId='");
        sb.append(this.f51248w);
        sb.append('\'');
        sb.append(", revenue=");
        Double d = this.f51249x;
        String str = null;
        sb.append(d == null ? null : this.f51225B.format(d));
        sb.append(", precision='");
        sb.append(this.f51250y);
        sb.append('\'');
        sb.append(", lifetimeRevenue=");
        Double d2 = this.f51251z;
        if (d2 != null) {
            str = this.f51225B.format(d2);
        }
        sb.append(str);
        sb.append(", encryptedCPM='");
        sb.append(this.f51224A);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
