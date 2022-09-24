package com.ironsource.mediationsdk.p276a;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.p286c.C11361b;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.c */
public class C11291c {

    /* renamed from: a */
    private String f50712a;

    /* renamed from: b */
    private String f50713b;

    /* renamed from: c */
    private String f50714c;

    /* renamed from: d */
    private List<String> f50715d;

    /* renamed from: e */
    private List<String> f50716e;

    /* renamed from: f */
    private List<String> f50717f;

    /* renamed from: g */
    private boolean f50718g;

    /* renamed from: h */
    private ImpressionData f50719h;

    public C11291c(String str) {
        this.f50712a = str;
        this.f50713b = "";
        this.f50714c = "";
        this.f50715d = new ArrayList();
        this.f50716e = new ArrayList();
        this.f50717f = new ArrayList();
        this.f50718g = true;
        this.f50719h = null;
    }

    public C11291c(JSONObject jSONObject) {
        this(jSONObject, (JSONObject) null);
    }

    public C11291c(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f50718g = false;
        try {
            if (jSONObject.has("instance")) {
                this.f50712a = jSONObject.getString("instance");
            }
            this.f50713b = jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : jSONObject.has("serverData") ? jSONObject.getString("serverData") : "";
            this.f50714c = jSONObject.has(InAppPurchaseMetaData.KEY_PRICE) ? jSONObject.getString(InAppPurchaseMetaData.KEY_PRICE) : SessionDescription.SUPPORTED_SDP_VERSION;
            this.f50715d = new ArrayList();
            this.f50716e = new ArrayList();
            this.f50717f = new ArrayList();
            if (jSONObject.has("notifications")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("notifications");
                if (optJSONObject.has("burl")) {
                    JSONArray jSONArray = optJSONObject.getJSONArray("burl");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.f50715d.add(jSONArray.getString(i));
                    }
                }
                if (optJSONObject.has("lurl")) {
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("lurl");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        this.f50716e.add(jSONArray2.getString(i2));
                    }
                }
                if (optJSONObject.has("nurl")) {
                    JSONArray jSONArray3 = optJSONObject.getJSONArray("nurl");
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        this.f50717f.add(jSONArray3.getString(i3));
                    }
                }
            }
            this.f50719h = new ImpressionData(C11361b.m50769a(jSONObject2, jSONObject.has("armData") ? jSONObject.optJSONObject("armData") : null));
            this.f50718g = true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static C11283a m50437a(String str, int i) {
        if ("ironbeast".equals(str)) {
            return new C11293e(i);
        }
        if ("outcome".equals(str)) {
            return new C11294f(i);
        }
        if (i == 2) {
            return new C11293e(i);
        }
        if (i == 3) {
            return new C11294f(i);
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        logger.log(ironSourceTag, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }

    /* renamed from: a */
    public ImpressionData mo44003a(String str) {
        ImpressionData impressionData = this.f50719h;
        if (impressionData != null) {
            impressionData.replaceMacroForPlacementWithValue("${PLACEMENT_NAME}", str);
        }
        return this.f50719h;
    }

    /* renamed from: a */
    public String mo44004a() {
        return this.f50712a;
    }

    /* renamed from: b */
    public String mo44005b() {
        return this.f50713b;
    }

    /* renamed from: c */
    public String mo44006c() {
        return this.f50714c;
    }

    /* renamed from: d */
    public List<String> mo44007d() {
        return this.f50715d;
    }

    /* renamed from: e */
    public List<String> mo44008e() {
        return this.f50716e;
    }

    /* renamed from: f */
    public List<String> mo44009f() {
        return this.f50717f;
    }

    /* renamed from: g */
    public boolean mo44010g() {
        return this.f50718g;
    }
}
